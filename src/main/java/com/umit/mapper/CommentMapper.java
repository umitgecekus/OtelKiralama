package com.umit.mapper;

import com.umit.domain.Comment;
import com.umit.dto.request.SaveCommentRequestDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CommentMapper {
    CommentMapper INSTANCE = Mappers.getMapper(CommentMapper.class);

    Comment fromSaveCommentRequestDtoToComment(final SaveCommentRequestDto dto);

}
