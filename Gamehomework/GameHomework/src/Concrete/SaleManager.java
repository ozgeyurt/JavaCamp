package Concrete;

import Abstract.SaleService;
import Entity.Campaign;
import Entity.Game;
import Entity.User;

public class SaleManager implements SaleService {

	@Override
	public void sale(User user, Game game) {
		System.out.println(user.playerNumber + "kullanýcýsý" + game.gameName +" oyununu satýn aldý");
		
	}

	@Override
	public void campaignSale(Campaign campaign, Game game, User user) {
		System.out.println(user.getFirstName()+ campaign.campaignName+ " kampanyasýný %"+ campaign.getDiscountRate()+" indirimle"+campaign.getUnitPrice()+ "fiyata" +game.gameName+"oyununu satýn aldý");
		
	}

}
