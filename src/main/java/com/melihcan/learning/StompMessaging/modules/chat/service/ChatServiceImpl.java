package com.melihcan.learning.StompMessaging.modules.chat.service;

import com.melihcan.learning.StompMessaging.core.utility.mappers.IModelMapperService;
import com.melihcan.learning.StompMessaging.modules.chat.request.SendMessageRequest;
import com.melihcan.learning.StompMessaging.modules.chat.response.GetMessageResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ChatServiceImpl implements ChatService {
    private IModelMapperService modelMapperService;

    @Override
    public GetMessageResponse sendMessage(SendMessageRequest sendMessageRequest) {
        // other businesses
        // example: repository works
        GetMessageResponse getMessageResponse = this.modelMapperService
                .forResponse().map(sendMessageRequest, GetMessageResponse.class);
        System.out.println(getMessageResponse);
        return getMessageResponse;
    }
}
