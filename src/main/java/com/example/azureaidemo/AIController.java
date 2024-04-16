package com.example.azureaidemo;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/ai")
public class AIController {

    private final AIService aiService;

    @PostMapping
    public void useAi(@RequestBody String prompt) {
        aiService.useAi(prompt);
    }
}
