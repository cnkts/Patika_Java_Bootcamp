package com.cn.paysys.service;

import com.cn.paysys.api.dto.MemberAccountRequest;
import com.cn.paysys.api.dto.MemberAccountResponse;
import com.cn.paysys.db.MemberAccount;
import com.cn.paysys.exception.MemberAccountException;
import com.cn.paysys.repository.MemberAccountRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
public class MemberAccountImplTest {
    private MemberAccountServiceImpl memberAccountService;
    private MemberAccountRepository memberAccountRepository;

    @BeforeEach
    public void setUp() {
        memberAccountRepository = mock(MemberAccountRepository.class);
        memberAccountService = new MemberAccountServiceImpl(memberAccountRepository);
    }
    private static final Long memberID = 1L;
    @Test
    void getMemberAccount() throws Exception {
        when(memberAccountRepository.findById(memberID)).thenReturn(java.util.Optional.of(new MemberAccount(memberID,"Can", "Aktas", 100.0)));
        MemberAccountResponse response = memberAccountService.getMemberAccountById(memberID);
        assertAll(
                () -> assertEquals("Can", response.getName()),
                () -> assertEquals("Aktas", response.getSurname()),
                () -> assertEquals(100.0, response.getBalance()));
    }

    @Test
    void getNotFoundMemberAccount() throws Exception {
        when(memberAccountRepository.findById(memberID)).thenReturn(Optional.empty());

        Exception e = assertThrows(MemberAccountException.class, () -> {
            memberAccountService.findMemberAccount(memberID);
        });

        assertEquals("MemberAccount id:" + memberID + " not found", e.getMessage());
    }

    @Test
    void createMemberAccount() throws Exception {
        MemberAccountRequest request = MemberAccountRequest.builder()
                .name("Can")
                .surname("aktas")
                .balance(100.0)
                .build();

        MemberAccount memberAccount = MemberAccount.builder()
                .name(request.getName())
                .surname(request.getSurname())
                .balance(request.getBalance())
                .build();
        when(memberAccountRepository.save(memberAccount)).thenReturn(memberAccount);
        MemberAccount response = memberAccountService.createMemberAccount(request);
        assertAll(
                () -> assertEquals("Can", response.getName()),
                () -> assertEquals("Aktas", response.getSurname()),
                () -> assertEquals(100.0, response.getBalance()));
    }

    @Test
    void updateMemberAccount() throws MemberAccountException{
        MemberAccountRequest request = MemberAccountRequest.builder()
                .name("Can")
                .surname("Aktas")
                .balance(100.0)
                .build();

        MemberAccount memberAccount = MemberAccount.builder()
                .name("Can")
                .surname("Aktas")
                .balance(100.0)
                .build();

        Optional<MemberAccount>  optional = Optional.of(memberAccount);
        when(memberAccountRepository.findById(memberID)).thenReturn(optional);
        MemberAccountResponse response = memberAccountService.updateMemberAccount(memberID, request);

        assertAll(
                () -> assertEquals("Can", response.getName()),
                () -> assertEquals("Aktas", response.getSurname()),
                () -> assertEquals(100.0, response.getBalance()));
    }

    @Test()
    void updateMemberAccountNotFound() {
        MemberAccountRequest userRequest = MemberAccountRequest.builder().name("Can").surname("Aktas").balance(100.0).build();


        when(memberAccountRepository.findById(memberID)).thenReturn(Optional.empty());

        Exception e = assertThrows(MemberAccountException.class, () -> memberAccountService.updateMemberAccount(memberID, userRequest));
        assertEquals("MemberAccount id:" + memberID + " not found", e.getMessage());
    }

    @Test
    void deleteMemberAccount() throws MemberAccountException{
        MemberAccount memberAccount = MemberAccount.builder()
                .name("Can")
                .surname("Aktas")
                .balance(100.0)
                .id(memberID)
                .build();



        memberAccountService = spy(memberAccountService);

        doReturn(memberAccount).when(memberAccountService).findMemberAccount(memberID);
        doReturn(Optional.of(memberAccount)).when(memberAccountRepository).findById(memberID);
        memberAccountService.deleteMemberAccount(memberID);
        verify(memberAccountRepository, times(1)).delete(memberAccount);
    }

    @Test
    void getAllMemberAccount(){
        MemberAccount memberAccount = MemberAccount.builder()
                .name("Can")
                .surname("Aktas")
                .balance(100.0)
                .id(memberID)
                .build();
        when(memberAccountRepository.findAll()).thenReturn(java.util.List.of(memberAccount));
        List<MemberAccountResponse> response = memberAccountService.getAllMemberAccounts();
        assertAll(
                () -> assertEquals("Can", response.get(0).getName()),
                () -> assertEquals("Aktas", response.get(0).getSurname()),
                () -> assertEquals(100.0, response.get(0).getBalance()));
    }

    @Test
    void getMemberAccountByCode() throws Exception {
        String code = "1Me";
        when(memberAccountRepository.findByCode(code)).thenReturn(java.util.Optional.of(new MemberAccount(memberID,"Can", "Aktas", 100.0)));
        MemberAccountResponse response = memberAccountService.getMemberCode(code);
        assertAll(
                () -> assertEquals("Can", response.getName()),
                () -> assertEquals("Aktas", response.getSurname()),
                () -> assertEquals(100.0, response.getBalance()));
    }
}
