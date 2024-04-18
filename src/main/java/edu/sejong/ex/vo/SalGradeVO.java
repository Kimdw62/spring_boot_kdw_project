package edu.sejong.ex.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*
이름    널? 유형     
----- -- ------ 
GRADE    NUMBER 
LOSAL    NUMBER 
HISAL    NUMBER 
*/

@AllArgsConstructor
@Getter
@NoArgsConstructor
@Setter
@ToString
public class SalGradeVO {
	private int grade;
	private int losal;
	private int hisal;
}
