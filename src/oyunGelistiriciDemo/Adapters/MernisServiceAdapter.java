package oyunGelistiriciDemo.Adapters;

import java.rmi.RemoteException;

import oyunGelistiriciDemo.Abstract.IGameCustomerCheckService;
import oyunGelistiriciDemo.Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements IGameCustomerCheckService{

	@Override
	public boolean ChekIfRealPerson(Gamer gamer) {
		
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		
		try {
			return kpsPublicSoapProxy.TCKimlikNoDogrula(
					gamer.getNationalityId(), gamer.getName(), gamer.getLastName(), gamer.getDateOfBirth());
			
		} catch (RemoteException e) {
			e.printStackTrace();
			return false;
		}
	}

	
}
