package com.xworkz.collection.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import com.xworkz.collection.dto.KingDTO;

public class KingDAOImpl implements KingDAO {

	 private List<KingDTO> collection = new ArrayList<KingDTO>();
	 
	@Override
	public boolean save(KingDTO dto) {
		boolean save = collection.add(dto);
		System.out.println(dto);
		return false;
	}

	@Override
	public Collection<KingDTO> findByRegion(Predicate region) {
		Collection <KingDTO> temp = new ArrayList<KingDTO>();
		this.collection.forEach(t -> {
			if(region.test(t)) {
				temp.add(t);
			}
		});
		return temp;
	}

	@Override
	public Optional<KingDTO> findOneByName(Predicate name) {
		
		return this.collection.stream().takeWhile( dto -> dto.equals(name)).findFirst();
		}

	@Override
	public Collection<KingDTO> findByNameLike(Predicate search) {
     Collection <KingDTO> temp = new ArrayList<KingDTO>();
   this.collection.forEach(s ->{
	   if(search.test(s)) {
		   temp.add(s);
	   }
   }
   );
return temp;

	}

}
