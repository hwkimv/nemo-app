package com.nemo.backend.domain.auth.service;

import com.nemo.backend.domain.auth.dto.LoginRequestDto;
import com.nemo.backend.domain.auth.dto.TokenResponseDto;
import com.nemo.backend.domain.auth.jwt.JwtTokenProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

// 로그인 서비스
public class AuthService {

    private final JwtTokenProvider jwtTokenProvider;

    public TokenResponseDto login(LoginRequestDto requestDto) {
        // TODO: 여기서 나중에 UserRepository 연동 및 비밀번호 검증 추가
        String userId = requestDto.getUserId();

        // 임시 로직: userId만 있으면 토큰 발급
        String accessToken = jwtTokenProvider.generateAccessToken(userId);
        String refreshToken = jwtTokenProvider.generateRefreshToken(userId);

        return new TokenResponseDto(accessToken, refreshToken);
    }
}
