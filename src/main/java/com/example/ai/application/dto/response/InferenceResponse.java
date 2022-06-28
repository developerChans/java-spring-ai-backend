package com.example.ai.application.dto.response;

import com.example.ai.application.domain.Inference;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class InferenceResponse {

    private String name;

    private double inferenceFigure;

    private byte inferenceImage;

    public InferenceResponse(Inference inference) {
        this.inferenceFigure = inference.getInferenceFigure();
        this.inferenceImage = inference.getInferenceImage();
    }
}
