
public class Mutant extends IntelligentEnemy {
    private static final int MAX_WEAPONS = 4;
    private static final int HEALTH_D = 2;
    private WeaponHolder weaponHolder;
    public Mutant(String name) {
	super(name);
	healthD = HEALTH_D;
	weaponHolder = new WeaponHolder(MAX_WEAPONS);
    }
   public WeaponHolder getWeaponHolder() {
       return weaponHolder;
   }

}
