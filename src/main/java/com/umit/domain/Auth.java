package com.umit.domain;

import com.umit.utility.enums.ERole;
import com.umit.utility.enums.EState;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Auth implements Serializable {
    @Id
    private String id;
    private String username;
    private String password;
    private String email;
    private Long createAt;
    private Long updateAt;
    private EState state;
    private String activationCode;
    @Builder.Default
    private ERole role= ERole.USER;


}
