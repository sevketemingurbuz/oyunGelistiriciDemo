package oyunGelistiriciDemo.Business;

import oyunGelistiriciDemo.Abstract.BaseGameMode;
import oyunGelistiriciDemo.Entities.Gamer;

public class GameSale extends BaseGameMode{

	@Override
	public void buy(Gamer gamer) {

		System.out.println("Sat�n alma i�lemi ger�ekle�ti");
	}

}
