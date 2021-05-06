package Adaptors;



import java.rmi.RemoteException;


import Abstract.UserCheckService;

import Entity.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;



public class MernisServiceAdapter implements UserCheckService{
	@Override
	public boolean CheckIfRealPerson(User user) {
	
		KPSPublicSoap soapClient = new KPSPublicSoapProxy();
		boolean result = false;
		try {
			
		result = soapClient.TCKimlikNoDogrula(Long.parseLong(user.getIdentityNumber()),
				user.getFirstName().toUpperCase(), user.getLastName().toUpperCase(), user.getBirthYear());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return result;
	

	
		
		
		
		
	}

}
