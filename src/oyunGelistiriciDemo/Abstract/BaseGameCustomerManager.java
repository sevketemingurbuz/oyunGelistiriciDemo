package oyunGelistiriciDemo.Abstract;

import oyunGelistiriciDemo.Entities.Gamer;

public abstract class BaseGameCustomerManager implements IGameCustomerService{
	public void login(Gamer gamer) {
		System.out.println("Giri� ba�ar�yla tamamland�: " + gamer.getName() + " " + gamer.getLastName());
	}
}
