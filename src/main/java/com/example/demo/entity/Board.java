package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="tbl_board") // 실제 테이블 이름
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Board extends BaseEntity {
	
    @Id // PK + Auto Increment
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int no; //글번호

    @Column(length = 100, nullable = false)
    String title; //제목

    @Column(length = 1500, nullable = false)
    String content; //내용

    // 작성자 필드를 외래키로 설정하여 Member 테이블의 PK를 참조
    @ManyToOne // 관계차수는 1:N로 설정
    Member writer; //작성자

}
