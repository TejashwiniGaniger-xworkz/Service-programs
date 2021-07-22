package com.xworkz.game;

import com.xworkz.game.dto.GameDTO;
import com.xworkz.game.service.GameService;
import com.xworkz.game.service.GameServiceImpl;

public class GameTester {

	public static void main(String[] args) {
		GameDTO dto = new GameDTO("NEED", "34", "EA Sports", 5,false);
		 GameService gameservice = new GameServiceImpl();
		 String saved = gameservice.validateAndSave(dto);
		 System.out.println(saved);

	}

}
