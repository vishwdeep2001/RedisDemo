package com.api.redis.model;

import lombok.*;
import org.springframework.core.serializer.Serializer;

import java.io.Serializable;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class User implements Serializable {
    private String userId;
    private String name;
    private String phone;
    private String email;
}
