package com.umit.controller;

import com.umit.dto.request.SaveCommentRequestDto;
import com.umit.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.umit.constants.RestApiUrls.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(COMMENT)
public class CommentController {
    private final CommentService commentService;


    @PostMapping(SAVE)
    @CrossOrigin("*")
    public ResponseEntity<Boolean> saveComment(@RequestBody SaveCommentRequestDto dto){
        return ResponseEntity.ok(commentService.saveComment(dto));
    }
}
