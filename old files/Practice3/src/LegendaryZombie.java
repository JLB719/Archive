
public class LegendaryZombie extends Zombie {
    private static final float DECOMP_RATE = 0.05f;
    private static final float MAX_HEALTH = 500f;
    private static final float MAX_ANGER = 100f;
    private static final float INITIAL_ANGER = 50f;
    public LegendaryZombie(String name) {
	super(name);
	// TODO Auto-generated constructor stub
	this.decompositionRate = DECOMP_RATE;
	this.maxAnger = MAX_ANGER;
	this.maxHealth = MAX_HEALTH;
	this.angerLevel = INITIAL_ANGER;
	
    }
    @Override 
    public String toString() {
	return "LegendaryZombie [toString = " + super.toString() + "]";
    }
    
    public void mutate() {
	setHealth(MAX_HEALTH);
	setAnger(MAX_ANGER);
    }

}
