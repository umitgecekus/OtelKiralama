package com.umit.dto.request;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LoginRequestDto {
    @Size(min = 3, max = 64)
    String username;
    @Size(min = 3, max = 32)
    String password;
}
