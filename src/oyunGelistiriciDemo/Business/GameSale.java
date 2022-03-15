package oyunGelistiriciDemo.Business;

import oyunGelistiriciDemo.Abstract.BaseGameMode;
import oyunGelistiriciDemo.Entities.Gamer;

public class GameSale extends BaseGameMode{

	@Override
	public void buy(Gamer gamer) {

		System.out.println("Satýn alma iþlemi gerçekleþti");
	}

}
