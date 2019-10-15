
public class InteligentEnemy extends BaseEnemy {
	public float intelligenceLevel;
	public static final float maxIntelligence = 50.0f;
	public float currentIntelligence;
	public InteligentEnemy (String name) {
		super(name);
		this.currentIntelligence = 25.0f;
	
	}
	public void changeInteligence(int changeInteligence) {
		
	}
	@Override
	public void changeHealth(float healthChange)
	{
		// TODO Auto-generated method stub
		
	}
	
}



