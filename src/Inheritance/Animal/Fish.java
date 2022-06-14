package Inheritance.Animal;

import Inheritance.parent.Animal;

public class Fish extends Animal{

        private boolean liveInWater;
        private boolean hasGills;
    
    public Fish(){
        super();
        liveInWater = true;
        hasGills = true;
    }

    
    public Fish(float height, float weight, String animalType, String bloodType, boolean liveInWater, boolean hasGills) {
        super(height, weight, animalType, bloodType);
        this.liveInWater = liveInWater;
        this.hasGills = hasGills;
    }

    

    public boolean isLiveInWater() {
        return liveInWater;
    }

    public void setLiveInWater(boolean liveInWater) {
        this.liveInWater = liveInWater;
    }

    public boolean isHasGills() {
        return hasGills;
    }

    public void setHasGills(boolean hasGills) {
        this.hasGills = hasGills;
    }

    @Override
    public String showInfo() {
        return "Fish [ Height = " + getHeight() + ", Weight = " + getWeight() + ", AnimalType = " + getAnimalType() + ", BloodType = " + getBloodType() + ", Live In Water = " + isLiveInWater() + ", Has Gills = " + isHasGills()+"]";
    }


    
}

    