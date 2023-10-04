package com.no3.gameproject.repository;

import com.no3.gameproject.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

    Member findByEmail(String email); //회원가입시 중복된 회원이 있는지 검사

}
