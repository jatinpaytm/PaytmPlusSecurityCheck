package com.alibou.security.auth;

import com.alibou.security.user.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PairUtil {
    public Role role;
    public AuthenticationResponse authenticationResponse;
}