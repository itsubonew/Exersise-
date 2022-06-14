package Inheritance.Animal;


public class Crocodile extends Reptile {
    
    private String eggType;

    public Crocodile(){
        this.eggType = "Hard-shelled eggs";
    }

    public Crocodile(float height, float weight, String animalType, String bloodType, String skinType, String bone,
            String eggType) {
        super(height, weight, animalType, bloodType, skinType, bone, eggType);
       this.eggType = eggType;
    }


    public String getEggType() {
        return eggType;
    }

    public void setEggType(String eggType) {
        this.eggType = eggType;
    }

    @Override
    public String showInfo() {
        return "Crocodile [ Height = " + getHeight() + ", Weight = " + getWeight() + ", AnimalType = " + getAnimalType() + ", BloodType = " + getBloodType() + ", Skin Type = " + getSkinType() +", Bone = " + getBone() +", EggType = " + getEggType() + "]";
    }

    

}
