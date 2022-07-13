package com.tn.permission.middle;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author tn
 * @date 2022/05/31 22:33
 */
@Data
public class Encrypt {
    private Integer a;
    private String b;
    private LocalDateTime c;

    public Encrypt() {
    }

    public Encrypt(Integer a, String b, LocalDateTime c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
