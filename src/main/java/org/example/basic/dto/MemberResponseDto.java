package org.example.basic.dto;


import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Getter
@RequiredArgsConstructor
public class MemberResponseDto {

    private final Long id;
    private final String name;
    private final LocalDateTime createdAt;
    private final LocalDateTime modifiedAt;

    public MemberResponseDto(long id, String name, LocalDateTime createAt, LocalDateTime modifiedAt) {
        this.id = id;
        this.name = name;
        this.createdAt = createAt;
        this.modifiedAt = modifiedAt;
    }
}
