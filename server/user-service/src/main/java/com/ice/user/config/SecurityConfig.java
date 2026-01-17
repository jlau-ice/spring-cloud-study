package com.ice.user.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.rsa.crypto.KeyStoreKeyFactory;

import java.security.KeyPair;

@Configuration
@EnableConfigurationProperties(JwtProperties.class)
public class SecurityConfig {

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    public KeyPair keyPair(JwtProperties properties){
        // 获取秘钥工厂
        KeyStoreKeyFactory keyStoreKeyFactory =
                new KeyStoreKeyFactory(
                        properties.getLocation(),
                        properties.getPassword().toCharArray());
        //读取钥匙对
        return keyStoreKeyFactory.getKeyPair(
                properties.getAlias(),
                properties.getPassword().toCharArray());
    }
    public int trailingZeroes(int n) {
        if (n == 0) {
            return 0;
        }
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        String a = String.valueOf(res);
        char[] arr = a.toCharArray();
        int resu = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == '0') {
                resu++;
            } else {
                break;
            }
        }
        return resu;
    }
}