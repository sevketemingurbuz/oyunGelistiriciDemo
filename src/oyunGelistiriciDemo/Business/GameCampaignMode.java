package oyunGelistiriciDemo.Business;

import oyunGelistiriciDemo.Abstract.BaseGameMode;
import oyunGelistiriciDemo.Abstract.IGameCustomerCheckService;
import oyunGelistiriciDemo.Entities.Gamer;

public class GameCampaignMode extends BaseGameMode{

	IGameCustomerCheckService gameCustomerCheckService;
	
	
	public GameCampaignMode(IGameCustomerCheckService gameCustomerCheckService) {
		this.gameCustomerCheckService= gameCustomerCheckService;
	}
	@Override
	public void buy(Gamer gamer) {

		if (gameCustomerCheckService.ChekIfRealPerson(gamer)) {
			System.out.println("Satýn alma iþlemi gerçekleþti");
		}
		
	}
	
	
}
