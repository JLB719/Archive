
public class IntelligentEnemy extends BaseEnemy {
    private static final float MAX_INTELLIGENCE = 50;
    private static final float INITIAL_INTELLIGENCE = 25;
    private static final int HEALTH_D = 1;
    private float intelligence;
    protected int healthD;
    public IntelligentEnemy(String name) {
	super(name);
	this.intelligence = INITIAL_INTELLIGENCE;
	this.healthD = HEALTH_D;
	// TODO Auto-generated constructor stub
    }
    public void setIntelligence(float intelligence) {
	if (intelligence <= MAX_INTELLIGENCE  && intelligence >= 0) {
	    this.intelligence = intelligence;
	}
    }
    public float getIntelligence() {
	return this.intelligence;
    }
    
    @Override 
    public void setHealth(float health) {
	if (health > this.healthValue) {
	    setIntelligence(getIntelligence() + healthD);
	} else if (health < this.healthValue) {
	    setIntelligence(getIntelligence() - healthD);
	}
	super.setHealth(health);
    }
    @Override
    public String toString() {
	return super.toString() + "Intelligence [" + intelligence + "] Max Intelligence[" + MAX_INTELLIGENCE + "]"; 
    }

}
