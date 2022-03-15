package oyunGelistiriciDemo;

import oyunGelistiriciDemo.Abstract.BaseGameCustomerManager;
import oyunGelistiriciDemo.Abstract.IGameMode;
import oyunGelistiriciDemo.Adapters.MernisServiceAdapter;
import oyunGelistiriciDemo.Business.*;
import oyunGelistiriciDemo.Entities.Gamer;

public class Main {

	public static void main(String[] args) {

		BaseGameCustomerManager gameCustomerManager = new CustomerCheckManager(new MernisServiceAdapter());
		gameCustomerManager.login(new Gamer("isim", "soyisim", 12345678901L, 2000)); // isim, soyisim, tc, doðum yýlý
		
		IGameMode gameMode = new GameCampaignMode(new MernisServiceAdapter());
		gameMode.buy(new Gamer("isim", "soyisim", 12345678901L, 2000)); // isim, soyisim, tc, doðum yýlý
		
		
	}

}
