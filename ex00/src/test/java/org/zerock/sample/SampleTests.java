package org.zerock.sample;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;


//@RunWith
//현재 테스트 코드가 스프링을 실행하는 역할을 할 것이라는것을 표시
//@ContextConfiguration
//지정된 클래스나 문자열을 이용해서 필요한 객체들을 스프링 내에 객체로 등록 = 스프링 빈으로 등록
//'classpath:' or 'file:'을 이용할 수 있음
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class SampleTests {
	
	//@Autowired
	//해당 인스턴스 변수가 스프링으로부터 자동으로 주입해 달라는 표시
	@Setter(onMethod_ = { @Autowired })
	private Restaurant restaurant;

	//@Test
	//JUnit에서 테스트 대상을 표시
	@Test
	public void testExist() {
		
		//restaurant 변수가 null이 아니어야만 테스트가 성공
		assertNotNull(restaurant);
		
		log.info(restaurant);
		log.info("---------------------------------------------");
		log.info(restaurant.getChef());
		
	}
}
