package com.cn.paysys.service;

import com.cn.paysys.api.dto.InvoiceRequest;
import com.cn.paysys.api.dto.InvoiceResponse;
import com.cn.paysys.db.Invoice;
import com.cn.paysys.db.MemberAccount;
import com.cn.paysys.exception.InvoiceException;
import com.cn.paysys.repository.InvoiceRepository;
import com.cn.paysys.repository.MemberAccountRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class ClientImplTest {
    private ClientImpl client;
    private InvoiceRepository invoiceRepository;
    private MemberAccountServiceImpl memberAccountService;
    private MemberAccountRepository memberAccountRepository;

    @BeforeEach
    public void setUp() {
        invoiceRepository = mock(InvoiceRepository.class);
        memberAccountRepository = mock(MemberAccountRepository.class);
        memberAccountService = mock(MemberAccountServiceImpl.class);
        client = new ClientImpl(invoiceRepository, memberAccountService);

    }

    private static final Long invoiceID = 1L;

    @Test
    void createInvoice() throws Exception {
        InvoiceRequest request = InvoiceRequest.builder()
                .billType(1)
                .amount(100.0)
                .build();
        Invoice invoice = Invoice.builder()
                .billType(request.getBillType())
                .amount(request.getAmount())
                .build();
        when(invoiceRepository.save(invoice)).thenReturn(invoice);
        Invoice response = client.createInvoice(request);
        assertAll(
                () -> assertEquals(1, response.getBillType()),
                () -> assertEquals(100.0, response.getAmount()));
    }

    @Test
    void findInvoice() {
        when(invoiceRepository.findById(invoiceID)).thenReturn(java.util.Optional.of(new Invoice(invoiceID, 100.0, 1)));
        Invoice response = client.findInvoice(invoiceID);
        assertAll(
                () -> assertEquals(1, response.getBillType()),
                () -> assertEquals(100.0, response.getAmount()));
    }

    @Test
    void getNotFoundInvoice() throws Exception {
        when(invoiceRepository.findById(invoiceID)).thenReturn(java.util.Optional.empty());

        Exception e = assertThrows(InvoiceException.class, () -> {
            client.findInvoice(invoiceID);
        });

        assertEquals("Invoice id:" + invoiceID + " not found", e.getMessage());
    }

    @Test
    void getInvoiceById() throws Exception {
        when(invoiceRepository.findById(invoiceID)).thenReturn(java.util.Optional.of(new Invoice(invoiceID, 100.0, 1)));
        InvoiceResponse response = client.getInvoiceById(invoiceID);
        assertAll(
                () -> assertEquals(1, response.getBillType()),
                () -> assertEquals(100.0, response.getAmount()));
    }

    @Test
    void updateInvoice() throws Exception {
        InvoiceRequest request = InvoiceRequest.builder()
                .billType(1)
                .amount(100.0)
                .build();
        Invoice invoice = Invoice.builder()
                .billType(request.getBillType())
                .amount(request.getAmount())
                .build();
        when(invoiceRepository.findById(invoiceID)).thenReturn(java.util.Optional.of(new Invoice(invoiceID, 100.0, 1)));
        when(invoiceRepository.save(invoice)).thenReturn(invoice);
        InvoiceResponse response = client.updateInvoice(invoiceID, request);
        assertAll(
                () -> assertEquals(1, response.getBillType()),
                () -> assertEquals(100.0, response.getAmount()));
    }

    @Test
    void getAllInvoices() throws Exception {
        when(invoiceRepository.findAll()).thenReturn(java.util.List.of(new Invoice(invoiceID, 100.0, 1)));
        List<InvoiceResponse> response = client.getAllInvoices();
        assertAll(
                () -> assertEquals(1, response.get(0).getBillType()),
                () -> assertEquals(100.0, response.get(0).getAmount()));
    }

    @Test
    void deleteInvoice() throws Exception {
        Invoice invoice = Invoice.builder()
                .billType(1)
                .amount(100.0)
                .id(invoiceID)
                .build();
        client = spy(client);
        doReturn(invoice).when(client).findInvoice(invoiceID);
        doReturn(java.util.Optional.of(invoice)).when(invoiceRepository).findById(invoiceID);
        client.deleteInvoice(invoiceID);
        verify(invoiceRepository, times(1)).delete(invoice);
    }

    @Test
    void findByBillType() throws Exception {
        Invoice invoice = Invoice.builder()
                .billType(1)
                .amount(100.0)
                .id(invoiceID)
                .build();
        when(invoiceRepository.findByBillType(1)).thenReturn(invoice);
        Invoice response = client.findByBillType(1);
        assertAll(
                () -> assertEquals(1, response.getBillType()),
                () -> assertEquals(100.0, response.getAmount()));
    }

    private final String memberCode = "1Me";

    @Test
    void makePayment() throws Exception {
        Invoice invoice = Invoice.builder()
                .billType(1)
                .amount(100.0)
                .id(invoiceID)
                .build();
        MemberAccount memberAccount = MemberAccount.builder()
                .code(memberCode)
                .balance(100.0)
                .invoice(invoice)
                .build();
        when(invoiceRepository.findByBillType(1)).thenReturn(invoice);
        when(memberAccountService.findByCode(memberCode)).thenReturn(memberAccount);
        InvoiceResponse response = client.makePayment(1, memberCode, 100.0);
        assertAll(
                () -> assertEquals(1, response.getBillType()),
                () -> assertEquals(0.0, response.getAmount()));
    }

    @Test
    void inquirePayment() throws Exception {
        Invoice invoice = Invoice.builder()
                .billType(1)
                .amount(100.0)
                .id(invoiceID)
                .build();
        MemberAccount memberAccount = MemberAccount.builder()
                .code(memberCode)
                .balance(100.0)
                .invoice(invoice)
                .build();
        when(invoiceRepository.findByBillType(1)).thenReturn(invoice);
        when(memberAccountService.findByCode(memberCode)).thenReturn(memberAccount);
        InvoiceResponse response = client.inquirePayment(1, memberCode);
        assertAll(
                () -> assertEquals(1, response.getBillType()),
                () -> assertEquals(100.0, response.getAmount()));
    }

    @Test
    void cancelPayment() throws Exception {
        Invoice invoice = Invoice.builder()
                .billType(1)
                .amount(100.0)
                .id(invoiceID)
                .build();
        MemberAccount memberAccount = MemberAccount.builder()
                .code(memberCode)
                .balance(100.0)
                .invoice(invoice)
                .build();
        when(invoiceRepository.findByBillType(1)).thenReturn(invoice);
        when(memberAccountService.findByCode(memberCode)).thenReturn(memberAccount);
        when(invoiceRepository.save(invoice)).thenReturn(invoice);
        InvoiceResponse response = client.cancelPayment(1, memberCode, 100.0);
        assertAll(
                () -> assertEquals(1, response.getBillType()),
                () -> assertEquals(100.0, response.getAmount()));
    }
}
