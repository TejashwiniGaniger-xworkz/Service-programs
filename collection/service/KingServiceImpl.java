package com.xworkz.collection.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;
import java.util.function.Predicate;

import com.xworkz.collection.dao.KingDAO;
import com.xworkz.collection.dao.KingDAOImpl;
import com.xworkz.collection.dto.KingDTO;

public class KingServiceImpl implements KingService {

	private KingDAO dao = new KingDAOImpl();

	@Override
	public String validateAndSave(KingDTO dto) {
		boolean nameValidate = false;
		boolean regionValidate = false;
		boolean dynastyValidate = false;
		boolean totalYearsRuledValidate = false;
		boolean currentQueenNameValidate = false;
		boolean totalQueensValidate = false;
		System.out.println(dto);
		if (dto != null) {
			System.out.println("dto is not null,can validating");

			String name = dto.getName();
			if (name != null && !name.isEmpty() && name.length() > 5 && name.length() < 25) {
				System.out.println("name is valid");
				nameValidate = true;
			} else {
				System.out.println("name is not valid");
				nameValidate = false;
			}

			String region = dto.getRegion();
			if (region != null && !region.isEmpty() && region.length() > 5 && region.length() < 10) {
				System.out.println("region is valid");
				regionValidate = true;
			} else {
				System.out.println("region is not valid");
				regionValidate = false;
			}
			String dynasty = dto.getDynasty();
			if (dynasty != null && !dynasty.isEmpty() && dynasty.length() > 5 && dynasty.length() < 30) {
				System.out.println("dynasty is valid");
				dynastyValidate = true;
			} else {
				System.out.println("dynasty is not valid");
				dynastyValidate = false;
			}

			Integer totalYearsRuled = dto.getTotalYearsRuled();
			if (totalYearsRuled > 30 && totalYearsRuled <= 50) {
				System.out.println("totalYearsRuled is valid");
				totalYearsRuledValidate = true;
			} else {
				System.out.println("totalYearsRuled is not valid");
				totalYearsRuledValidate = false;
			}
			String currentQueenName = dto.getCurrentQueenName();
			if (currentQueenName != null && !currentQueenName.isEmpty() && currentQueenName.length() >= 10
					&& currentQueenName.length() < 30) {
				System.out.println("currentQueenName is valid");
				currentQueenNameValidate = true;
			} else {
				System.out.println("currentQueenName is not valid");
				currentQueenNameValidate = false;
			}
			Integer totalQueens = dto.getTotalQueens();
			if (totalQueens >= 5 && totalQueens < 10) {
				System.out.println("totalQueens is valid");
				totalQueensValidate = true;
			} else {
				System.out.println("totalQueens is not valid");
				totalQueensValidate = false;
			}
			if (nameValidate && regionValidate && dynastyValidate && totalYearsRuledValidate && currentQueenNameValidate
					&& totalQueensValidate) {
				dao.save(dto);
				System.out.println("data is valid returning success");
				return "SUCCESS";
			} else {
				System.out.println("data is valid returning failure");
				return "FAILED";
			}

		}
		return "FAILED";
	}

	@Override
	public Collection<KingDTO> validateAndFindByRegion(Predicate<KingDTO> search) {

		return dao.findByRegion(search);
	}

	@Override
	public Optional<KingDTO> validateAndfindOneByName(Predicate<KingDTO> search) {

		return dao.findOneByName(search);
	}

	@Override
	public Collection<KingDTO> validateAndfindByNameLike(Predicate<KingDTO> search) {

		return dao.findByNameLike(search);
	}
}