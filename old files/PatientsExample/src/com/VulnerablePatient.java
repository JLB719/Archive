package com;

public class VulnerablePatient extends Patient {

    private String familyDoctor;
    private static float MAX_PAINKILLER_DOSAGE = 500;
 
    public VulnerablePatient(String name, String id, String surgeon, String familyDoctor) {
        super(name, id, surgeon);
        setFamilyDoctor(familyDoctor);
    }

    @Override
    public boolean administerPainkillerDose(float dosage) {
        if (dosage <= MAX_PAINKILLER_DOSAGE) {
            System.out.println(dosage + " painkiller dose administered.");
            return true;
        }
        else  {
            alertDoctor();
            return false;
        }
    }

    public String getFamilyDoctor() {
        return familyDoctor;
    }

    public void setFamilyDoctor(String familyDoctor) {
        this.familyDoctor = familyDoctor;
    }
    
    @Override
    public void alertDoctor() {
        super.alertDoctor();
        System.out.println("Please contact: " + getFamilyDoctor());
    }

    @Override
    public void setBloodPressure(float bp) {
        if (bp > getBloodPressure()) {
            alertDoctor();
        }
        super.setBloodPressure(bp);
    }

    @Override
    public String toString() {
        return super.toString() + "VulnerablePatient [familyDoctor=" + familyDoctor + "]";
    }    
}
