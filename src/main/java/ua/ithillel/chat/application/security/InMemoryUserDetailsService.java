package ua.ithillel.chat.application.security;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import ua.ithillel.chat.application.domain.User;
import ua.ithillel.chat.application.storage.InMemoryUserRepository;

@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class InMemoryUserDetailsService implements UserDetailsService {

    InMemoryUserRepository repository;

    @Override
    public UserDetails findByUsername(String username) throws AuthenticationException {
        User user = repository.findByUsername(username)
                .orElseThrow(() -> new AuthenticationException("User not found."));
        return new UserDetails(user.getUsername(), user.getPassword());
    }

}
