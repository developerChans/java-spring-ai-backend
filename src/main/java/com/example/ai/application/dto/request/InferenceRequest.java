package com.example.ai.application.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class InferenceRequest {

    private byte inputImage;

    private InferenceRequest() {
    }
}
