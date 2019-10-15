
public class Weapon {
	private String weaponType;
	public Weapon(String weaponType) {
		this.weaponType = weaponType;
	}
	public void setWeaponType(String weaponType) {
		this.weaponType = weaponType;
	}
	public String getWeaponType() {
		return weaponType;
	}
	@Override
	public String toString() {
		return "The weapon type is " + weaponType;
	}
	
}
