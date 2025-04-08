package com.ETBlacklist;



import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/webhook")
public class DialogflowWebhookController {

    @PostMapping
    public ResponseEntity<Map<String, String>> handleWebhook(@RequestBody Map<String, Object> request) {
        System.out.println("Received Request: " + request);

        Map<String, String> response = new HashMap<>();
        response.put("fulfillmentText", "Hello from Spring Boot Webhook!");

        return ResponseEntity.ok(response);
    }
}
