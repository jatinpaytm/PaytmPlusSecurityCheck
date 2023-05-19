package com.panel.admin.lup.auth;

import com.panel.admin.lup.user.Role;
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