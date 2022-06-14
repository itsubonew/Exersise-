package Inheritance.Animal;

public class Eel extends Fish {
    
    private String speciality;

    public Eel(){
        super();
        this.speciality = "Release electric charge";
    }



    public Eel(float height, float weight, String animalType, String bloodType, boolean liveInWater, boolean hasGills,
            String speciality) {
        super(height, weight, animalType, bloodType, liveInWater, hasGills);
        this.speciality = speciality;
    }



    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String showInfo() {
        return "Eel[ Height = " + getHeight() + ", Weight = " + getWeight() + ", AnimalType = " + getAnimalType() + ", BloodType = " + getBloodType() + ", Speciality = " + getSpeciality() + "]";
    }
    
}
