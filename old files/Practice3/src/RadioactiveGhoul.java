
public class RadioactiveGhoul extends Ghoul {
    private static final float MAX_RADIOACTIVITY = 100;
    private static final float MIN_RADIOACVIVITY = 0;
    private static final float INTIAL_RADIOACTIVITY = 50;
    protected float radioactivity;
    public RadioactiveGhoul(String name) {
	super(name);
	this.radioactivity = INTIAL_RADIOACTIVITY;
	// TODO Auto-generated constructor stub
    }
    
    public void setRadioactivity(float change) {
	if (change < 0) {
	    if (radioactivity + change <= MIN_RADIOACVIVITY) {
		this.radioactivity = MIN_RADIOACVIVITY;
	    } else {
		this.radioactivity += change;
	    }
	} else if (change > 0) {
	    if (radioactivity + change >= MAX_RADIOACTIVITY) {
		this.radioactivity = MAX_RADIOACTIVITY;
	    } else {
		this.radioactivity += change;
	    }
	}
    }
    public float getRadioactivity() {
	return this.radioactivity;
    }
    @Override
    public String toString() {
	return "RadioactiveGhoul [radoavtivity=" + radioactivity + ", toString() =" + super.toString() + "]";
    }

}
