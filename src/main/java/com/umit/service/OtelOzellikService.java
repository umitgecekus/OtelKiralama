package com.umit.service;

import com.umit.domain.OtelOzellik;
import com.umit.repository.OtelOzellikRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OtelOzellikService {
    private final OtelOzellikRepository otelOzellikRepository;


    public OtelOzellik saveOtelOzellik(String id, String otelId) {
        OtelOzellik otelOzellik = OtelOzellik.builder()
                .otelId(otelId)
                .ozellikId(id)
                .build();
        return otelOzellikRepository.save(otelOzellik);
    }
}