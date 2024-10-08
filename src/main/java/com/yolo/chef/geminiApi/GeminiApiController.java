//package com.yolo.chef.geminiApi;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class GeminiApiController {
//
//    private final GeminiApiService geminiService;
//
//    public GeminiApiController(GeminiApiService geminiService) {
//        this.geminiService = geminiService;
//    }
//
//    @PostMapping("/generateContent")
//    public String generateContent(@RequestParam String text) {
//        String requestPayload = String.format("{\"contents\":[{\"parts\":[{\"text\":\"%s\"}]}]}", text);
//        return geminiService.generateContent(requestPayload);
//    }
//}