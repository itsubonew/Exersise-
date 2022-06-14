package Inheritance.Animal;

import Inheritance.parent.Animal;

public class Reptile extends Animal {
    
    private String skinType;
    private String bone;
    private String eggType;

    public Reptile(){
        super();
        skinType = "Dry Skin";
        bone = "Backbone";
        eggType = "Soft-shelled eggs";
    }

    public Reptile(float height, float weight, String animalType, String bloodType, String skinType, String bone, String eggType){
        super(height, weight, animalType, bloodType);
        this.skinType = skinType;
        this.bone = bone;
        this.eggType = eggType;
    }

    public String getSkinType() {
        return skinType;
    }

    public void setSkinType(String skinType) {
        this.skinType = skinType;
    }

    public String getBone() {
        return bone;
    }

    public void setBone(String bone) {
        this.bone = bone;
    }

    public String getEggType() {
        return eggType;
    }

    public void setEggType(String eggType) {
        this.eggType = eggType;
    }

    @Override
    public String showInfo() {
        return "Reptile [ Height = " + getHeight() + ", Weight = " + getWeight() + ", AnimalType = " + getAnimalType() + ", BloodType = " + getBloodType() + ",Skin Type = " + getSkinType() + ", Bone = " + getBone() + ", Egg Type = " + getEggType() + "]";
    }
    
}


