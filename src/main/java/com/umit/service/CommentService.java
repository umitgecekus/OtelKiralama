package com.umit.service;

import com.umit.domain.Comment;
import com.umit.domain.Otel;
import com.umit.domain.User;
import com.umit.dto.request.SaveCommentRequestDto;
import com.umit.exception.ErrorType;
import com.umit.exception.UserException;
import com.umit.mapper.CommentMapper;
import com.umit.repository.CommentRepository;
import com.umit.repository.OtelRepository;
import com.umit.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CommentService {
    private final CommentRepository commentRepository;
    private final UserRepository userRepository;
    private final OtelRepository otelRepository;

    public Boolean saveComment(SaveCommentRequestDto dto) {
        Optional<User> user = userRepository.findById(dto.getUserId());
        if (user.isEmpty()) {
            throw new UserException(ErrorType.USER_NOT_FOUND);
        }
        Optional<Otel> otel = otelRepository.findById(dto.getHotelId());
        if (otel.isEmpty()) {
            throw new UserException(ErrorType.OTEL_NOT_FOUND);
        }
        Comment comment = CommentMapper.INSTANCE.fromSaveCommentRequestDtoToComment(dto);
        comment.setActive(true);
        comment.setCreateAt(System.currentTimeMillis());
        comment.setUpdateAt(System.currentTimeMillis());
        commentRepository.save(comment);
        return true;

    }
}