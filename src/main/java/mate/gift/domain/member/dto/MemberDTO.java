package mate.gift.domain.member.dto;

import mate.gift.common.enums.Role;

public class MemberDTO {

    Long memberId;

    String loginId;

    String password;

    String email;

    String name;

    Boolean isBanned;

    Boolean isDeleted;

    Role role;
}
