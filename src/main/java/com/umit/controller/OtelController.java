package com.umit.controller;

import com.umit.domain.Otel;
import com.umit.dto.request.SaveOtelRequestDto;
import com.umit.dto.response.OtelFindByIdResponseDto;
import com.umit.service.OtelService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.umit.constants.RestApiUrls.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(OTEL)
public class OtelController {
    private final OtelService otelService;

    @PostMapping(SAVE)
    @CrossOrigin("*")
    public ResponseEntity<String> saveOtel(@RequestBody SaveOtelRequestDto dto) {
        return ResponseEntity.ok(otelService.saveOtel(dto));
    }


    @GetMapping(FIND_BY_ID)
    public ResponseEntity<OtelFindByIdResponseDto> findById(String id) {
        return ResponseEntity.ok(otelService.findById(id));
    }

    @GetMapping(FIND_ALL)
    public ResponseEntity<List<Otel>> findAll() {
        return ResponseEntity.ok(otelService.findAll());
    }

    @GetMapping(FIND_SEARCH)
    public ResponseEntity<List<Otel>> findBySearch(String search) {
        return ResponseEntity.ok(otelService.findBySearch(search));
    }





}
