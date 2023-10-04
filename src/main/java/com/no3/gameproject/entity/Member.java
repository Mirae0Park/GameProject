package com.no3.gameproject.entity;

import com.no3.gameproject.constant.Role;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name="member")
@Getter @Setter
@ToString
public class Member extends BaseEntity {

    @Id
    @Column(name="member_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @Column(unique = true) // 이메일을 유일하게 구분(동일값이 db에 들어올 수 없음)
    private String email;

    private String password;

    private String address;

    @Enumerated(EnumType.STRING) // enum 타입은 순서로 저장되는데 String으로 저장하기 권장함
    private Role role; // Enum에 등록되어 있는 role을 사용함


}
