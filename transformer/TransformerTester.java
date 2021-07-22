package com.xworkz.transformer;

import com.xworkz.transformer.dto.TransformerDTO;
import com.xworkz.transformer.service.TransformerService;
import com.xworkz.transformer.service.TransformerServiceImpl;

public class TransformerTester {

	public static void main(String[] args) {
		TransformerDTO dto = new TransformerDTO("teju","Bangalore","violent","sometime","moody","depends","Travelling");
		TransformerService service = new TransformerServiceImpl();
		String save = service.validedAndSave(dto);
		System.out.println(save);
		

	}

}
