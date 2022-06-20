package ua.ithillel.chat.application.security;

/**
 * Potentially existing user and may not be existing.
 */
public record AuthenticationRequest(String username, String password) {
}
