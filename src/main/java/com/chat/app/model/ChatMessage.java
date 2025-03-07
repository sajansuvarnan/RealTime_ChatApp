package com.chat.app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Lombok annotations to generate getters, setters, and constructor automatically
@Data
@AllArgsConstructor
public class ChatMessage {
    private Long id;       // Unique identifier for the message
    private String sender; // Sender's name
    private String content; // Message content


}