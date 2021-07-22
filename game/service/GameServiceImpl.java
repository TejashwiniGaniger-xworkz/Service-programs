package com.xworkz.game.service;

import com.xworkz.game.dto.GameDTO;

public class GameServiceImpl implements GameService{

	@Override
	public String validateAndSave(GameDTO dto) {
		
		boolean nameValid = false;
		boolean versionValid = false;
		boolean developedBy = false;
		boolean maxPlayer = false;
		
		if(dto !=null) {
			System.out.println("DTO is not null , will start validation");
			nameValid = true;
			} else {
				System.out.println("Name is notValid");
				nameValid = false;
				
			}
		String version = dto.getVersion();
		if(version != null && version.length() > 1 && version.length() < 50) {
			System.out.println("version is valid");
			versionValid = true;
		}else {
			System.out.println("version is not valid");
			versionValid = false;
		}
		String developeBy = dto.getDevelopedBy();
		if(developeBy != null && developeBy.length() >= 3 && developeBy.length() <=15) {
			System.out.println("developed by is valid");
			developedBy = true;
		} else {
			System.out.println("developedBy is not valid");
			developedBy = false;
		}
		int maxplayer = dto.getMaxPlayers();
		if(maxplayer !=0 && maxplayer >= 1 && maxplayer <=8) {
			System.out.println("MaxPlayer is valid");
			maxPlayer = true;
		} else {
			System.out.println("maxplayer is not valid");
			maxPlayer = false;
		}
		if(nameValid && versionValid && maxPlayer) {
			System.out.println("data is valid");
			return "SUCCESS";
		}
		return "FAILURE";
	}

}
