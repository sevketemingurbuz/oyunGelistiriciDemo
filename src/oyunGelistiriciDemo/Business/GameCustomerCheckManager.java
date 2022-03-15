package oyunGelistiriciDemo.Business;

import oyunGelistiriciDemo.Abstract.IGameCustomerCheckService;
import oyunGelistiriciDemo.Entities.Gamer;

public class GameCustomerCheckManager implements IGameCustomerCheckService {

	@Override
	public boolean ChekIfRealPerson(Gamer gamer) {
		return true;
	}

}
