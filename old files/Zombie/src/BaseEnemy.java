
public abstract class BaseEnemy {
	public class IntelligentEnemy
	{

	}
	protected String name;
	private float currentHealth;
	private final float maxHealthFinal = 100.0f;
	private float maxHealth = maxHealthFinal;
	public BaseEnemy(String name) {
		this.name = name;
		currentHealth = maxHealthFinal;
		maxHealth = maxHealthFinal;
	}
	public void setEnemyName(String name) {
		this.name = name;
	}
	public String getEnemyName() {
		return name;
	}
	public void setHealth(float health) {
		this.currentHealth = health;
	}
	public float getHeatlh() {
		return currentHealth;
	}
	public void changeHealth(float healthChange) {
		this.currentHealth += healthChange;
	}
	public boolean isDead() {
		return currentHealth == 0;
	}
	@Override 
	public String toString() {
		return "The name of the enemy is " + name + " the max health of the enemy is " + maxHealth + " the current health of the enemy is " + currentHealth;
		
	}

}
