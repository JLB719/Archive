package patient;
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
	public abstract boolean givePainKiller(float Dosage);

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
}
