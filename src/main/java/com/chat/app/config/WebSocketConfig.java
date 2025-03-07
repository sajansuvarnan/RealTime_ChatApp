package com.chat.app.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

// Marks this class as a configuration class for WebSockets
@Configuration
// Enables WebSocket message handling with STOMP protocol
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        // Registers /chat as a WebSocket endpoint and allows SockJS fallback
        registry.addEndpoint("/chat")
                .setAllowedOrigins("http://localhost:8080")
                .withSockJS();
    }

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        // Enables a simple in-memory message broker with /topic as the prefix
        registry.enableSimpleBroker("/topic"); // Clients will subscribe to /topic/messages

        // Sets application-level message prefix to /app
        registry.setApplicationDestinationPrefixes("/app");
    }
}
