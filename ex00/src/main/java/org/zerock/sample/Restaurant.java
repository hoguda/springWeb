package org.zerock.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Setter;

//@Data
//setter를 생성하는 기능과 toString()등을 자동으로 생성
//@Component
//스프링에게 해당 클래스가 스프링에서 관리해야 하는 대상임을 표시
@Component
@Data
public class Restaurant {

	//@Setter
	//자동으로 setChef()를 컴파일 시 생성
	
	@Setter(onMethod = @__({@Autowired}))
	private Chef chef;
	
}
