package com.xworkz.game.service;

import com.xworkz.game.dto.GameDTO;

public interface GameService {
  String validateAndSave(GameDTO dto);
}
