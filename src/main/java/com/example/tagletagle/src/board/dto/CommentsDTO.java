package com.example.tagletagle.src.board.dto;

import java.util.List;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Schema(description = "댓글 리스트를 담은 DTO")
@AllArgsConstructor
@NoArgsConstructor
public class CommentsDTO {

	List<CommentInfoDTO> commentInfoDTOList;
}
