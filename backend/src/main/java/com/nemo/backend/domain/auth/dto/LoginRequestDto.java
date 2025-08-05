package com.nemo.backend.domain.auth.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

// 로그인 요청 DTO
public class LoginRequestDto {
    private String userId;      // 실제 구현시 email or username으로 변경 가능
    private String password;    // 지금은 테스트용
}
