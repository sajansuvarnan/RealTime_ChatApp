package com.chat.app.controller;

import com.chat.app.model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatController {

    // When a message is sent to /app/sendMessage, it will be broadcasted to /topic/messages
    @MessageMapping("/sendMessage")
    @SendTo("/topic/messages")
    public ChatMessage sendMessage(ChatMessage message) {
        // Prints the received message on the server console
        System.out.println("Received message: " + message); // Debugging
        return message; // Sends the message back to all subscribed clients
    }

    // Handles HTTP GET requests to /chat and returns chat.html
    @GetMapping("chat")
    public String chat() {
        return "chat";
    }
}