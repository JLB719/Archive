
public class Ghoul extends IntelligentEnemy {
    private static final float MAX_PUTRIDITY = 1;
    private static final float BASE_PUTRIDITY = 0;
    private static final float MAX_GHOUL_HEALTH = 150;
    private static final float PUTRID_INCREMENT = 0.1f;
    protected float maxPutridity;
    protected float basePutridity;
    protected float putridIncrement;
    protected float currentPutridity;
    public Ghoul(String name) {
	super(name);
	this.maxHealth = MAX_GHOUL_HEALTH;
	this.maxPutridity = MAX_PUTRIDITY;
	this.basePutridity = BASE_PUTRIDITY;
	this.putridIncrement = PUTRID_INCREMENT;
	this.currentPutridity = BASE_PUTRIDITY;
    }
    
    public void increasePutridity() {
	
	if (currentPutridity < MAX_PUTRIDITY && (currentPutridity + putridIncrement >= maxPutridity)) {
	    setHealth(MAX_GHOUL_HEALTH);
	    currentPutridity = maxPutridity;
	} else {
	    currentPutridity += putridIncrement;
	}
    }
    
    @Override
    public String toString() {
	return "Ghoul [putridity=" + currentPutridity + " , toString() =" + super.toString() + "]";
    }
    

}
