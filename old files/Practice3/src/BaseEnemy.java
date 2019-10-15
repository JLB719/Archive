
public class BaseEnemy
{
	private static final float BASE_ENEMY_MAX_HEALTH = 100;
	private String name;
	protected float healthValue;
	protected float maxHealth;
	public BaseEnemy(String name) {
		this.name = name;
		this.maxHealth = BASE_ENEMY_MAX_HEALTH;
		this.healthValue = maxHealth;
		
	}
	
	public void setHealth(float health) {
		this.healthValue = health;
	}
	public float getHealth() {
		return healthValue;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public boolean isDead() {
		return healthValue == 0;
	}
	public float getMaxHealth() {
		return maxHealth;
	}
	@Override
	public String toString() {
	    return "BaseEnemy [name=" + name + ", health =" + healthValue + ", maxHealth=" + maxHealth + isDead() + "]";
	}
	

}
