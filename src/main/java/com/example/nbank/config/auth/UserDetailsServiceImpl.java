package com.example.nbank.config.auth;


import com.example.nbank.entities.Client;
import com.example.nbank.exceptions.NotFoundException;
import com.example.nbank.repositories.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {
    private final ClientRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws NotFoundException {
        Client user = userRepository.findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));
        if (user.getIsBlocked()) {
            throw new LockedException("User is blocked");
        }
        return new org.springframework.security.core.userdetails.User(
                user.getEmail(), user.getPassword(), user.getAuthorities());
    }
}
