package mypack;

public class CurrConvertor{	
	float INR,dol,euro,f,yen;

	public float dol_INR(String dollar) {
		try {
			f=Float.parseFloat(dollar);
			INR = f * 72.37f;
		}
		catch(NumberFormatException e) {
			System.out.println("\n\tException caught");
			throw e;
		}
		return INR;
	}
	
	public float euro_INR(String EURO) {
		try {
			f=Float.parseFloat(EURO);
			INR = f * 79.13f;
		}catch(NumberFormatException e) {
			System.out.println("\n\tException caught");
			throw e;
		}
		return INR;
	}
	
	public float yen_INR(String YEN) {
		try {
			f=Float.parseFloat(YEN);
			INR =f * 0.68f;
		}catch(NumberFormatException e) {
			System.out.println("\n\tException caught");
			throw e;
		}
			return INR;
	}
	
	public float INR_dol(String inr) {	
		try {
			f=Float.parseFloat(inr);
			dol =f * 0.01381788f;
		}catch(NumberFormatException e) {
			System.out.println("\n\tException caught");
			throw e;
		}
		return dol;
	}

	public float INR_euro(String inr) {
		try {
			f=Float.parseFloat(inr);
			euro = f * 0.01263743f;
		}catch(NumberFormatException e) {
			System.out.println("\n\tException caught");
			throw e;
		}
		return euro;
	}
	
	public float INR_yen(String inr) {
		try {
			f=Float.parseFloat(inr);
			yen = f * 1.47059f;
		}catch(NumberFormatException e) {
			System.out.println("\n\tException caught");
			throw e;
		}
		return yen;
	}
}
