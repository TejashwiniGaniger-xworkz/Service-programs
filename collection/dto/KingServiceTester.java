package com.xworkz.collection.dto;

import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;

import com.xworkz.collection.dao.KingDAO;
import com.xworkz.collection.dao.KingDAOImpl;
import com.xworkz.collection.service.KingService;
import com.xworkz.collection.service.KingServiceImpl;

public class KingServiceTester {

	public static void main(String[] args) {
		
		KingDTO king1 = new KingDTO("Vikramadithya", "Bagalkot", "Chalukyas of Kalyana", 32, "Kethaladevi", 5);
		KingDTO king2 = new KingDTO("Krishna Raja Wadiyar", "Mysore", "Mysore Wodeyars", 31, "Kumari Ammani", 6);
		KingDTO king3 = new KingDTO("Pulakeshi", "Bagalkot", "Chalukya", 33, "Kritivarma", 4);
		KingDTO king4 = new KingDTO("Yaduraya Wadiyar", "Mysore", "Mysore Wodeyars", 34, "Trishika Kumari Devi", 5);

		KingService service = new KingServiceImpl();
		service.validateAndSave(king4);
		service.validateAndSave(king2);
		service.validateAndSave(king3);
		service.validateAndSave(king1);

		Collection<KingDTO> collection = service.validateAndFindByRegion((s) -> s.getRegion().equals("Mysore"));
		for (KingDTO kingDTO : collection) {
			System.out.println("found by region:" + kingDTO);
		}

		Optional<KingDTO> optional = service.validateAndfindOneByName((b) -> b.getName().equals("Vikramadithya"));
		if (optional.isPresent()) {
			KingDTO dto = optional.get();
			System.out.println("found by name:" + dto);
		}

		Collection<KingDTO> collection1 = service.validateAndfindByNameLike((s) -> s.getName().contains("Wadiyar"));
		for (KingDTO kingDTO : collection1) {
			System.out.println("found by name like:" + kingDTO);
		}

	}

}