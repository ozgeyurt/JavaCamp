import Adaptors.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.SaleManager;
import Concrete.UserManager;
import Entity.User;
import Entity.Campaign;
import Entity.Game;

public class Main {

	public static void main(String[] args) {
		User user1=new User();
		user1.id=1;
		user1.playerNumber="478965";
		user1.setIdentityNumber("17839649928");
		user1.setFirstName("?ZGE");
		user1.setLastName("?NAN");
		user1.setBirthYear(1993);
		
		UserManager userManager=new UserManager(new MernisServiceAdapter());
		userManager.add(user1);
		
		System.out.println("------------------------------------");
		
		Game game1= new Game();
		game1.id=1;
		game1.gameName="Zula";
		game1.price=1000;
		
		Game game2= new Game();
		game2.id=2;
		game2.gameName="Fifa";
		game2.price=1750;
		
		GameManager gameManager=new GameManager();
		gameManager.add(game1);
		gameManager.update(game2);
		
		System.out.println("------------------------------------");
		
		Campaign campaign1=new Campaign(1, "?ubat indirimi", 25, 1000);
		CampaignManager campaignManager= new CampaignManager();
		campaignManager.add(campaign1);
		
		System.out.println("------------------------------------");
		
		SaleManager saleManager=new SaleManager();
		saleManager.campaignSale(campaign1, game1, user1);
		
		
		
		
		
		
		
		
		

	}

}
