import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		
		
		KPSPublicSoapProxy kpsPublic= new KPSPublicSoapProxy();
		
		try {
            return kpsPublic.TCKimlikNoDogrula(Long.parseLong(customer.nationalityId),
                    customer.firstName.toUpperCase(), customer.lastName.toUpperCase(),
                    customer.dateOfBrith);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  false;

	}

}
