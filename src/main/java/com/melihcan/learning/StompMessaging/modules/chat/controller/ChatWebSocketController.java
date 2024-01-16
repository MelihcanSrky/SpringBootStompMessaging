package com.melihcan.learning.StompMessaging.modules.chat.controller;

import com.melihcan.learning.StompMessaging.modules.chat.request.SendMessageRequest;
import com.melihcan.learning.StompMessaging.modules.chat.response.GetMessageResponse;
import com.melihcan.learning.StompMessaging.modules.chat.service.ChatService;
import lombok.AllArgsConstructor;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class ChatWebSocketController {
    private ChatService chatService;

    @MessageMapping("/chat/{chatUuid}")
    @SendTo("/topic/chat/{chatUuid}")
    public GetMessageResponse sendMessage(
            @DestinationVariable String chatUuid,
            @Payload SendMessageRequest sendMessageRequest
    ) throws Exception {
        return this.chatService.sendMessage(sendMessageRequest);
    }
}
