package com.xworkz.collection.service;

import java.util.Collection;
import java.util.Optional;
import java.util.function.Predicate;

import com.xworkz.collection.dto.KingDTO;

public interface KingService {

	String validateAndSave(KingDTO dto);

	Collection<KingDTO> validateAndFindByRegion(Predicate<KingDTO> search);
	
	Optional<KingDTO> validateAndfindOneByName(Predicate<KingDTO> search);
	
	Collection<KingDTO> validateAndfindByNameLike(Predicate<KingDTO> search);
}