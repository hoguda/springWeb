package org.zerock.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Setter;

//@Data
//setter�� �����ϴ� ��ɰ� toString()���� �ڵ����� ����
//@Component
//���������� �ش� Ŭ������ ���������� �����ؾ� �ϴ� ������� ǥ��
@Component
@Data
public class Restaurant {

	//@Setter
	//�ڵ����� setChef()�� ������ �� ����
	
	@Setter(onMethod = @__({@Autowired}))
	private Chef chef;
	
}
