package com.example.azureaidemo;

import com.azure.ai.openai.OpenAIClient;
import com.azure.ai.openai.OpenAIClientBuilder;
import com.azure.ai.openai.models.*;
import com.azure.core.credential.AzureKeyCredential;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AIService {

    @Value("${spring.ai.azure.openai.api.key}")
    private String apiKey;
    @Value("${spring.ai.azure.openai.endpoint}")
    private String endPoint;
    @Value("${spring.ai.azure.openai.model}")
    private String model;

    public void useAi(String prompt) {
        OpenAIClient client = new OpenAIClientBuilder()
                .credential(new AzureKeyCredential(apiKey))
                .endpoint(endPoint)
                .buildClient();

        List<ChatRequestMessage> chatMessages = new ArrayList<>();
        chatMessages.add(new ChatRequestUserMessage(prompt));

        ChatCompletions chatCompletions = client.getChatCompletions(model, new ChatCompletionsOptions(chatMessages));

        for(ChatChoice choice : chatCompletions.getChoices()) {
            ChatResponseMessage message = choice.getMessage();
            System.out.println("Index: " + choice.getIndex() + ", Chat Role: " + message.getRole());
            System.out.println("Message: ");
            System.out.println(message.getContent());
        }
    }

}
