package ua.ithillel.chat.application.security;

/**
 * 'S'OLID
 *  |
 * SRP - Single Responsibility Principle
 */
public interface AuthenticationContext {
    LoggedUser getUser();
    void addUser(LoggedUser user);
}
