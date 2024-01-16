package com.melihcan.learning.StompMessaging.modules.chat.request;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SendMessageRequest {
    private String content;
    private Long sendAt;
    private String sender;
}
