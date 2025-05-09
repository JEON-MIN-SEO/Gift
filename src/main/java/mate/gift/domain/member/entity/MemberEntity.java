package mate.gift.domain.member.entity;

import jakarta.persistence.*;
import mate.gift.common.enums.Role;

@Entity
@Table(name = "member")
public class MemberEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberId;

    private String loginId;

    private String password;

    private String email;

    private String name;

    private Boolean isBanned;

    private Boolean isDeleted;

    private Role role;
}
