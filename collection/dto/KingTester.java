package com.xworkz.collection.dto;

import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;

import com.xworkz.collection.dao.KingDAO;
import com.xworkz.collection.dao.KingDAOImpl;

public class KingTester {

	public static void main(String[] args) {
	KingDTO king = new KingDTO("Yaduvir","Mysore","Wodeyar",50,"Trishika",6);
	KingDTO king1 = new KingDTO("Akbar","Panjab","Tumurid",45,"Mariam-uz-Zamani",30);
	KingDTO king2 = new KingDTO("Yusuf-adil-khan","Bijapur","AdilShahi",50,"Taj jahan",7);
	KingDTO king3 = new KingDTO("Shahajahan","Agra","Mughal",60,"Mamataj",6);

	System.out.println("All dto");
	
	KingDAO dao = new KingDAOImpl();
	dao.save(king3);
	dao.save(king1);
	dao.save(king);
	dao.save(king2);

	Collection<KingDTO> list = Arrays.asList(king,king1,king2,king3);
	System.out.println("*********************************");
	
	System.out.println("find region");
	Collection<KingDTO> coll = dao.findByRegion(t ->t.equals(king2));
	for(KingDTO k : coll) {
		System.out.println(k);
	}
	System.out.println("************************");
	System.out.println("find by name");
	Optional<KingDTO> dto = list.stream().filter(s ->
	s.getName().equals("Shahajahan")).findAny();
	if(dto.isPresent()) {
		KingDTO dt = dto.get();
		System.out.println(dt);
	}else {
		System.out.println("King not found");
	}
	
	System.out.println("*****************************");
	System.out.println("find by name like");
	Collection<KingDTO> cl = dao.findByNameLike(s -> s.equals(king1));
	for(KingDTO d : cl) {
		System.out.println(d);
	}
	}

}
