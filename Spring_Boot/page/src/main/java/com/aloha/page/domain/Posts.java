package com.aloha.page.domain;

import java.sql.Date;
import java.util.UUID;

import lombok.*;

// @AllArgsConstructor
// @NoArgsConstructor
// @Getter
// @Setter
// @ToString

@Data
@AllArgsConstructor
@Builder
public class Posts {
    private Long no;
    private String id;
    private String title;
    private String writer;
    private String content;
    private Date createdAt;
    private Date updatedAt;

    public Posts() { 
        this.id = UUID.randomUUID().toString();
    }
}
