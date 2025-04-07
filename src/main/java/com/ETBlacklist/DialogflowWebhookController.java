package com.ETBlacklist;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/webhook")
public class DialogflowWebhookController {



    @PostMapping
    public ResponseEntity<String> handleWebhook(@RequestBody Map<String, Object> request) {
        System.out.println("Received Request: " + request);
        return ResponseEntity.ok("Success");
    }
}
