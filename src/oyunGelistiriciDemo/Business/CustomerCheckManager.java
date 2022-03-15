package oyunGelistiriciDemo.Business;

import oyunGelistiriciDemo.Abstract.BaseGameCustomerManager;
import oyunGelistiriciDemo.Abstract.IGameCustomerCheckService;
import oyunGelistiriciDemo.Entities.Gamer;

public class CustomerCheckManager extends BaseGameCustomerManager{
	
	IGameCustomerCheckService customerCheckService; 
	
	public CustomerCheckManager(IGameCustomerCheckService customerCheckService) {
		this.customerCheckService= customerCheckService;
		}
	
	public void login(Gamer gamer) {
		if(customerCheckService.ChekIfRealPerson(gamer)) {
			super.login(gamer);
		}else {
			System.out.println("Giriþ baþarýsz");
		}
	}
	
}
