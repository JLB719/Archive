package patient;
public class RegularPatient extends Patient {
	private static int bloodPressureLimit = 100;
	public RegularPatient(String patientName, String surgeonName, float bloodPressure) {
		super(patientName, surgeonName, bloodPressure);
	}
	@Override
	public boolean givePainKiller(float Dosage) {
		System.out.println("Administered painkiller");
		return true;
	}
	@Override
	public void setBloodPressure(float bloodPressure) {
		super.setBloodPressure(bloodPressure);
		if (getBloodPressure() > bloodPressureLimit) {
			alertDoctor();
		}
	}

}
