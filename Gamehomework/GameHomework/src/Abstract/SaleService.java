package Abstract;

import Entity.Campaign;
import Entity.Game;
import Entity.User;

public interface SaleService {
	void sale(User user, Game game);
	void campaignSale(Campaign campaign,Game game,User user);

}
