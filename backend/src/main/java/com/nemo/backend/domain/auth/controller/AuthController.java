package com.nemo.backend.domain.auth.controller;

import com.nemo.backend.domain.auth.dto.LoginRequestDto;
import com.nemo.backend.domain.auth.dto.TokenResponseDto;
import com.nemo.backend.domain.auth.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor

// 로그인 관련 API 컨트롤러
// 이 컨트롤러는 로그인 요청을 처리하고 JWT 토큰을 발급합니다
public class AuthController {

    private final AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<TokenResponseDto> login(@RequestBody LoginRequestDto requestDto) {
        TokenResponseDto tokens = authService.login(requestDto);
        return ResponseEntity.ok(tokens);
    }

    // 토큰 인증 테스트용 엔드포인트
    @GetMapping("/check")
    public ResponseEntity<String> check() {
        return ResponseEntity.ok("JWT 인증 성공!");
    }
}
