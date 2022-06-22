package ua.ithillel.chat.application.security;

import java.net.Socket;

public interface AuthenticationManager {
    void doFilter(Socket socket, AuthenticationRequest request);
}
