//package com.tus.farmservice.service;
//
//import io.jsonwebtoken.Jwts;
//import io.jsonwebtoken.SignatureAlgorithm;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.stereotype.Service;
//
//import java.util.Date;
//
//@Service
//public class JwtTokenProvider {
//    private static final String SECRET_KEY = "your_secret_key";
//    private static final long EXPIRATION_TIME = 864_000_000; // 10 days
//
//    public String generateToken(Authentication authentication) {
//        User principal = (User) authentication.getPrincipal();
//        Date now = new Date();
//        Date expiryDate = new Date(now.getTime() + EXPIRATION_TIME);
//
//        return Jwts.builder()
//                .setSubject(principal.getUsername())
//                .setIssuedAt(now)
//                .setExpiration(expiryDate)
//                .signWith(SignatureAlgorithm.HS512, SECRET_KEY)
//                .compact();
//    }
//}
