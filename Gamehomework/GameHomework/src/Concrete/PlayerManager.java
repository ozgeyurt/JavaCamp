package Concrete;

import Abstract.PlayerService;
import Entity.Player;

public class PlayerManager implements PlayerService {

	@Override
	public void add(Player player) {
		System.out.println(player.playerNumber+"numaralý kullanýcý eklendi");
		
	}

	@Override
	public void delete(Player player) {
		System.out.println(player.playerNumber+"numaralý kullanýcý silindi");
		
	}

}
