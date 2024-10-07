package com.example.demo.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// DTO: 컨트롤러에서 뷰단으로 데이터를 전달하는 용도
// 엔티티와 구조가 같을때도 있고 약간 다를 때도 있음

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BoardDTO {

    int no;
    String title;
    String content;
    String writer;
    LocalDateTime regDate;
    LocalDateTime modDate;
    
}
