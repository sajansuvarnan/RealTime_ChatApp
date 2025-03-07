# Real-Time Chat Application  

A simple real-time chat application built using Spring Boot and WebSockets.  

## Description  
This application enables users to send and receive messages instantly. It uses WebSockets with STOMP (Simple Text Oriented Messaging Protocol) for real-time communication. Messages are broadcasted using an in-memory message broker.  

## Features  
- Real-time messaging using WebSockets  
- Supports multiple users in a chat room  
- Uses STOMP protocol for message handling  
- Simple UI with Bootstrap  
- In-memory message broker for broadcasting  

## Technologies Used  
- Java 17  
- Spring Boot 3  
- Spring WebSockets (STOMP, SockJS)  
- Spring MVC  
- Bootstrap 5  
- Thymeleaf  

## Getting Started  

### Prerequisites  
- Java 17+  
- Maven  

### Clone the Repository  
```sh
git clone https://github.com/your-username/chat-app.git
cd chat-app
```

### Build and Run the Application  
```sh
mvn spring-boot:run
```

The application will be accessible at `http://localhost:8080/chat`  

## Project Structure  
```
├── src/main/java/com/chat/app
│   ├── controller/ChatController.java      # Handles incoming messages
│   ├── config/WebSocketConfig.java         # WebSocket configuration
│   ├── model/ChatMessage.java              # Message model
│
├── src/main/resources/templates/
│   ├── chat.html                           # Chat UI
│
├── src/main/resources/application.properties
│
└── README.md
```

## Screenshots  
Chat UI:  
![image](https://github.com/user-attachments/assets/f7230c70-b091-4f9a-9d08-e085e1e44c65)

## License  
This project is open-source and available under the MIT License.
