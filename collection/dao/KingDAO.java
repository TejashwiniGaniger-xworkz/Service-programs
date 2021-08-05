package com.xworkz.collection.dao;

import java.util.Collection;
import java.util.Optional;
import java.util.function.Predicate;

import com.xworkz.collection.dto.KingDTO;

public interface KingDAO {
   
	boolean save(KingDTO dto);
	Collection<KingDTO> findByRegion(Predicate search);
	Optional<KingDTO> findOneByName(Predicate search);
	Collection<KingDTO> findByNameLike(Predicate search);
	
}
