package oyunGelistiriciDemo.Abstract;

import oyunGelistiriciDemo.Entities.Gamer;

public abstract class BaseGameMode implements IGameMode {

	public void buy(Gamer gamer) {

		System.out.println("Satýn alma iþlemi gerçekleþti");
	}

	
}
