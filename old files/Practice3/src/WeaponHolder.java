import java.util.ArrayList;
public class WeaponHolder {
    private ArrayList<Weapon> weapons;
    private int maxWeapons;
    public WeaponHolder(int maxWeapons) {
	this.maxWeapons = maxWeapons;
	weapons = new ArrayList<Weapon>();
	// TODO Auto-generated constructor stube
    }
    public void addWeapon(Weapon w) {
	if (weapons.size() < maxWeapons) {
	    weapons.add(w);
	}
    }
}
