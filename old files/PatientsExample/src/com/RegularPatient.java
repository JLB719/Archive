package com;

public class RegularPatient extends Patient {

    private static float BLOOD_PRESSURE_LIMIT = 100;
    
    public RegularPatient(String name, String id, String surgeon) {
        super(name, id, surgeon);
    }

    @Override
    public boolean administerPainkillerDose(float dosage) {
        System.out.println(dosage + " painkiller dose administered.");
        return true;
    }
    
    @Override
    public void setBloodPressure(float bp) {
        super.setBloodPressure(bp);
        if (getBloodPressure() > BLOOD_PRESSURE_LIMIT) {
            alertDoctor();
        }
    }
}
