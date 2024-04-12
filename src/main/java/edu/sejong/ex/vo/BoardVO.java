package edu.sejong.ex.vo;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//이름       널?       유형            
//-------- -------- ------------- 
//1 BID      NOT NULL NUMBER(4)
//2 BNAME             VARCHAR2(20)
//3 BTITLE            VARCHAR2(200)
//4 BCONTENT          VARCHAR2(200)
//5 BDATE             DATE
//6 BHIT              NUMBER(4)	//조회수
//7 BGROUP            NUMBER(4)	//원본
//8 BSTEP             NUMBER(4)	//세로
//9 BINDENT           NUMBER(4)	//가로

@AllArgsConstructor
@Getter
@NoArgsConstructor
@Setter
public class BoardVO {
	private int bid;
	private String bname;
	private String btitle;
	private String bcontent;
	private Timestamp bdate;
	private int bhit;
	private int bgroup;
	private int bstep;
	private int bindent;
	
}
