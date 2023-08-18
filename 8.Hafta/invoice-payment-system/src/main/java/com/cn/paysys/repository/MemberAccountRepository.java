package com.cn.paysys.repository;

import com.cn.paysys.db.MemberAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MemberAccountRepository extends JpaRepository<MemberAccount,Long> {
    Optional<MemberAccount> findByCode(String code);
}
