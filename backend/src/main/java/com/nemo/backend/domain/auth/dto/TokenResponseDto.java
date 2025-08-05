package com.nemo.backend.domain.auth.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor

// 로그인 성공시 발급되는 토큰 응답 DTO
public class TokenResponseDto {
    private String accessToken;
    private String refreshToken;
}
