package Concrete;

import Abstract.GameService;
import Entity.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println(game.gameName+ "adlý oyun eklendi");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.gameName+ "adlý oyun silindi");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.gameName+ "adlý oyun bilgileri güncellendi");
		
	}

	
	

}
