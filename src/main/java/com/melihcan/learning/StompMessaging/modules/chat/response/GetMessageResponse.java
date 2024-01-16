package com.melihcan.learning.StompMessaging.modules.chat.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetMessageResponse {
    private String content;
    private Long sendAt;
    private String sender;
}
