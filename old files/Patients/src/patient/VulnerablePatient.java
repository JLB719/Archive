package patient;

public class VulnerablePatient extends Patient {
	private static final int painkillerLimit = 500;
	private String GP;
	public VulnerablePatient(String patientName, String surgeonName, String GP, float bloodPressure) {
        super(patientName, surgeonName, bloodPressure);
		this.GP = GP;
	}
	public void setGP(String GP) {
		this.GP = GP;
	}
	public String getGP() {
		return GP;
	}
	@Override
	public void alertDoctor() {
		System.out.println("Alert surgeon");
		System.out.println("Alert gp");
    }
	@Override
	public boolean givePainKiller(float dosage) {
		if (dosage <= painkillerLimit) {
			System.out.println("Administered painkiller");
			return true;
		} else {
			alertDoctor();
			return false;
		}
    }
	@Override
	public void setBloodPressure(float bloodPressure) {
		if (bloodPressure > super.getBloodPressure()) {
			alertDoctor();
		} else {
			super.setBloodPressure(bloodPressure);
		}
    }
	@Override
	public String toString() {
		return super.toString() + "GP + "  + GP;
    }
}
