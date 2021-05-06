package Concrete;

import Abstract.SaleService;
import Entity.Campaign;
import Entity.Game;
import Entity.User;

public class SaleManager implements SaleService {

	@Override
	public void sale(User user, Game game) {
		System.out.println(user.playerNumber + "kullan�c�s�" + game.gameName +" oyununu sat�n ald�");
		
	}

	@Override
	public void campaignSale(Campaign campaign, Game game, User user) {
		System.out.println(user.getFirstName()+ campaign.campaignName+ " kampanyas�n� %"+ campaign.getDiscountRate()+" indirimle"+campaign.getUnitPrice()+ "fiyata" +game.gameName+"oyununu sat�n ald�");
		
	}

}
