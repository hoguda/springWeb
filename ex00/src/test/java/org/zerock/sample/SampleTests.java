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
//���� �׽�Ʈ �ڵ尡 �������� �����ϴ� ������ �� ���̶�°��� ǥ��
//@ContextConfiguration
//������ Ŭ������ ���ڿ��� �̿��ؼ� �ʿ��� ��ü���� ������ ���� ��ü�� ��� = ������ ������ ���
//'classpath:' or 'file:'�� �̿��� �� ����
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class SampleTests {
	
	//@Autowired
	//�ش� �ν��Ͻ� ������ ���������κ��� �ڵ����� ������ �޶�� ǥ��
	@Setter(onMethod_ = { @Autowired })
	private Restaurant restaurant;

	//@Test
	//JUnit���� �׽�Ʈ ����� ǥ��
	@Test
	public void testExist() {
		
		//restaurant ������ null�� �ƴϾ�߸� �׽�Ʈ�� ����
		assertNotNull(restaurant);
		
		log.info(restaurant);
		log.info("---------------------------------------------");
		log.info(restaurant.getChef());
		
	}
}
