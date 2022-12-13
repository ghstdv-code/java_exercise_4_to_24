
public enum Currency {
	PENNY(0.01f), NICKLE(0.05f), DIME(0.1f), QUARTER(0.25f);
	
	float val;
	
	Currency(float value){
		this.val = value;
	}
}
