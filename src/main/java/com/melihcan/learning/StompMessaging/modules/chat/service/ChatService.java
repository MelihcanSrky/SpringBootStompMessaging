package com.melihcan.learning.StompMessaging.modules.chat.service;

import com.melihcan.learning.StompMessaging.modules.chat.request.SendMessageRequest;
import com.melihcan.learning.StompMessaging.modules.chat.response.GetMessageResponse;

public interface ChatService {
    GetMessageResponse sendMessage(SendMessageRequest sendMessageRequest);
}
