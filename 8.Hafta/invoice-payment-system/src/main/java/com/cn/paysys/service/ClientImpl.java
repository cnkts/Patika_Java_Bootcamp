package com.cn.paysys.service;

import com.cn.paysys.api.dto.InvoiceRequest;
import com.cn.paysys.api.dto.InvoiceResponse;
import com.cn.paysys.api.dto.MemberAccountRequest;
import com.cn.paysys.db.Invoice;
import com.cn.paysys.db.MemberAccount;
import com.cn.paysys.exception.InvoiceException;
import com.cn.paysys.repository.InvoiceRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


@Service
public class ClientImpl implements InvoiceService {
    private static final Logger logger = LoggerFactory.getLogger(MemberAccountServiceImpl.class);

    @Autowired
    private InvoiceRepository invoiceRepository;

    @Autowired
    MemberAccountServiceImpl memberAccountServiceImpl;

    public ClientImpl(InvoiceRepository invoiceRepository, MemberAccountServiceImpl memberAccountServiceImpl) {
        this.invoiceRepository = invoiceRepository;
        this.memberAccountServiceImpl = memberAccountServiceImpl;
    }

    @Override
    public Invoice createInvoice(InvoiceRequest invoiceRequest) {
        logger.info("Creating Invoice");
        Invoice invoice = Invoice.builder()
                .billType(invoiceRequest.getBillType())
                .amount(invoiceRequest.getAmount())
                .build();
        invoice = invoiceRepository.save(invoice);
        return Invoice.builder().billType(invoice.getBillType()).amount(invoice.getAmount()).build();
    }

    @Override
    public Invoice findInvoice(Long id) {
        logger.info("Fetching for Invoice :" + id);
        Optional<Invoice> invoiceOptional = invoiceRepository.findById(id);
        if (invoiceOptional.isEmpty()) {
            throw new InvoiceException("Invoice id:" + id + " not found");
        }
        return invoiceOptional.get();
    }

    @Override
    public InvoiceResponse getInvoiceById(Long id) {
        logger.info("Fetching for Invoice :" + id);
        Invoice find = findInvoice(id);
        return InvoiceResponse.builder().billType(find.getBillType()).amount(find.getAmount()).build();
    }

    @Override
    public InvoiceResponse updateInvoice(Long id, InvoiceRequest invoiceRequest) {
        logger.info("Updating Invoice :" + id);
        return invoiceRepository.findById(id)
                .map(invoice -> {
                    invoice.setBillType(invoiceRequest.getBillType());
                    invoice.setAmount(invoiceRequest.getAmount());
                    invoiceRepository.save(invoice);
                    return InvoiceResponse.builder().billType(invoice.getBillType()).amount(invoice.getAmount()).build();
                })
                .orElseThrow(() -> new InvoiceException("Invoice id:" + id + " not found"));
    }

    @Override
    public List<InvoiceResponse> getAllInvoices() {
        logger.info("Fetching all Invoices");
        List<InvoiceResponse> responses = new ArrayList<>();
        invoiceRepository.findAll().forEach(invoice -> {
            responses.add(InvoiceResponse.builder().billType(invoice.getBillType()).amount(invoice.getAmount()).build());
        });
        return responses;
    }

    @Override
    public void deleteInvoice(Long id) {
        logger.info("Deleting Invoice :" + id);
        Invoice invoice = findInvoice(id);
        invoiceRepository.delete(invoice);
    }

    @Override
    public Invoice findByBillType(int invoiceType) {
        logger.info("Fetching for Invoice :" + invoiceType);
        return invoiceRepository.findByBillType(invoiceType);
    }

    @Override
    public InvoiceResponse makePayment(int invoiceType, String memberCode, double amount) {
        logger.info("Making payment for Invoice :" + "Type :" + invoiceType + "Member Code :" + memberCode + "Amount :" + amount);
        Invoice invoice = findByBillType(invoiceType);
        MemberAccount response = memberAccountServiceImpl.findByCode(memberCode);
        if (Objects.equals(response.getInvoice().getBillType(), invoice.getBillType()) && response.getBalance() >= invoice.getAmount()) {
            switch (invoice.getBillType()) {
                case 1, 2, 3 -> {
                    response.setBalance(response.getBalance() - amount);
                    invoice.setAmount(0.0);
                }
                default -> throw new InvoiceException("Invoice :" + invoice + " not found");
            }
        }
        invoiceRepository.save(invoice);
        memberAccountServiceImpl.updateMemberAccount(response.getId(), MemberAccountRequest.builder().name(response.getName()).surname(response.getSurname()).balance(response.getBalance()).invoice(response.getInvoice()).build());
        return InvoiceResponse.builder().id(invoice.getId()).billType(invoice.getBillType()).amount(invoice.getAmount()).process_date(invoice.getProcess_date()).build();
    }

    @Override
    public InvoiceResponse inquirePayment(int invoiceType, String memberCode) {
        logger.info("Inquiring payment for Invoice :" + "Type :" +invoiceType + "Member Code :" + memberCode);
        Invoice invoice = findByBillType(invoiceType);
        MemberAccount response = memberAccountServiceImpl.findByCode(memberCode);
        if (Objects.equals(response.getInvoice().getId(), invoice.getId())) {
            switch (invoice.getBillType()) {
                case 1, 2, 3 -> {
                    return InvoiceResponse.builder().id(invoice.getId()).billType(invoice.getBillType()).amount(invoice.getAmount()).process_date(invoice.getProcess_date()).build();
                }
                default -> throw new InvoiceException("Invoice :" + invoice + " not found");
            }
        }
        return InvoiceResponse.builder().id(invoice.getId()).billType(invoice.getBillType()).amount(invoice.getAmount()).process_date(invoice.getProcess_date()).build();
    }

    @Override
    public InvoiceResponse cancelPayment(int invoiceType, String memberCode, double amount) {
        logger.info("Canceling payment for Invoice :" + "Type :" +invoiceType + "Member Code :" + memberCode + "Amount :" + amount);
        Invoice invoice = findByBillType(invoiceType);
        MemberAccount response = memberAccountServiceImpl.findByCode(memberCode);
        if (Objects.equals(response.getInvoice().getId(), invoice.getId())) {
            switch (invoice.getBillType()) {
                case 1, 2, 3 -> {
                    response.setBalance(response.getBalance() + amount);
                    invoice.setAmount(amount);
                }
                default -> throw new InvoiceException("Invoice :" + invoice + " not found");
            }
        }
        invoice = invoiceRepository.save(invoice);
        return InvoiceResponse.builder().id(invoice.getId()).billType(invoice.getBillType()).amount(invoice.getAmount()).process_date(invoice.getProcess_date()).build();
    }
}
