
public class Zombie extends BaseEnemy {
    private static final float RATE_OF_DECOMP= 0.5f;
    private static final float MAX_ANGER = 50;
    private static final int MAX_WEAPONS = 2;
    protected float decompositionRate;
    protected float angerLevel;
    
    protected float maxAnger;
    protected WeaponHolder weaponHolder;
    public Zombie(String name) {
	super(name);
	decompositionRate = RATE_OF_DECOMP;
	maxAnger = MAX_ANGER;
	angerLevel = 0;
	weaponHolder = new WeaponHolder(MAX_WEAPONS);
	// TODO Auto-generated constructor stub
    }
    
    public void decompose() {
	setHealth(getHealth() - this.decompositionRate);
    }
    @Override
    public String toString() {
	return "Zombie [anger =" + angerLevel + ",  toString()=" + super.toString() + "]";
    }
    public float getAnger() {
	return angerLevel;
    }
    public void setAnger(float anger) {
	if (anger >= 0 && anger <= this.maxAnger) {
	    this.angerLevel = anger;
	}
    }
    public WeaponHolder getWeaponHolder() {
	return weaponHolder;
    }

}
