package oyunGelistiriciDemo.Abstract;

import oyunGelistiriciDemo.Entities.Gamer;

public abstract class BaseGameCustomerManager implements IGameCustomerService{
	public void login(Gamer gamer) {
		System.out.println("Giriþ baþarýyla tamamlandý: " + gamer.getName() + " " + gamer.getLastName());
	}
}
