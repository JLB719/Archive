public abstract class Patient {
	private String patientName;
	private String surgeonName;
	private float bloodPressure;
	public Patient (String patientName, String surgeonName, float bloodPressure) {
		this.patientName = patientName;
		this.surgeonName = surgeonName;
		this.bloodPressure = bloodPressure;
	}
	public void alertDoctor() {
		System.out.println("Alert surgeon");
	}
	public abstract boolean givePainKiller(float Doseage);
	
	public void setPatientName(String name) {
		this.patientName = name;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setSurgeonName(String name) {
		this.surgeonName = name;
	}
	public String getSurgeonName() {
		return surgeonName;
	}
	public void setBloodPressure(float bloodPressure) {
		this.bloodPressure = bloodPressure;
	}
	public float getBloodPressure() {
		return bloodPressure;
	}
	@Override 
	public String toString() {
		return "Patient Name = " + patientName + " Surgeon Name = " + surgeonName + " blood pressure = " + bloodPressure;

}

public class RegularPatient extends Patient {
	private static int bloodPressureLimit = 100;
	public RegularPatient(String patientName, String surgeonName, float bloodPressure) {
		super(patientName, surgeonName, bloodPressure);
	}
	@Override
	public boolean givePainKiller(float dosage) {
		System.out.println("Administered painkiller");
		return true;
	}
	@Override 
	public void setBloodPressure(float bloodPressure) {
		super.setBloodPressure(bloodPressure);
		if (getBloodPressure > bloodPressureLimit) {
			alertDoctor();
		}
	}

public class VulnerablePatient extends Patient {
	private static final int painkillerLimit = 500;
	private String GP;
	public vulnerablePatient(String patientName, String surgeonName, String GP, float bloodPressure) {
		this.GP = GP;
		super(paitentName, surgeonName, bloodPressure);
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
	@Override
	public boolean givePainKiller(float dosage) {
		if (dosage <= painkillerLimit) {
			System.out.println("Administered painkiller");
			return true;
		} else {
			alertDoctor();
			return false;
		}
	@Override
	public void setBloodPressure(float bloodPressure) {
		if (bloodPressure > super.getBloodPressure) {
			alert();
		} else {
			super.setBloodPressure
		}
	@Override 
	public String toString() {
		return super.toString() + "GP + " GP;







