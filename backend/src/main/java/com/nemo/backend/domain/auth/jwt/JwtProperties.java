package com.nemo.backend.domain.auth.jwt;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ConfigurationProperties(prefix = "jwt")

//토큰 관련 설정값
public class JwtProperties {
    private String secret;                 // 시크릿 키
    private long accessTokenExpiration;    // Access Token 유효기간(ms)
    private long refreshTokenExpiration;   // Refresh Token 유효기간(ms)
}
