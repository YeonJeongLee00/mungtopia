package com.d209.mungtopia.dto.applicant;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ProcessDetailDto {
    private String dogName;
    private String dogImg;
    private Long boardId;
    private Long chatRoomId;
    private int applicationStatus;
    private Long meetingRoomId;
    private Boolean meetingActive;
}
