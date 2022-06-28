package com.example.ai.application.service;

import com.example.ai.application.service.ai.OnnxruntimeInference;
import com.example.ai.application.service.ai.PytorchInference;
import com.example.ai.application.service.ai.TensorflowInference;
import com.example.ai.application.repository.InferenceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class InferenceService {
    private final InferenceRepository inferenceRepository;

}
