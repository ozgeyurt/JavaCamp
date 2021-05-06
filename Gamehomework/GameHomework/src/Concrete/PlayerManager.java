package Concrete;

import Abstract.PlayerService;
import Entity.Player;

public class PlayerManager implements PlayerService {

	@Override
	public void add(Player player) {
		System.out.println(player.playerNumber+"numaral� kullan�c� eklendi");
		
	}

	@Override
	public void delete(Player player) {
		System.out.println(player.playerNumber+"numaral� kullan�c� silindi");
		
	}

}
