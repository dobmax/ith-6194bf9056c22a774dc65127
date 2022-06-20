package ua.ithillel.chat.application.security;

public interface Authenticator {
    void attemptAuthenticate(AuthenticationRequest request);
}
