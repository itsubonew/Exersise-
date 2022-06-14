package Inheritance.Animal;

public class Eagle extends Birds {

    public Eagle() {
        super();
    }

    public Eagle(float height, float weight, String animalType, String bloodType, String features, boolean canFly) {
        super(height, weight, animalType, bloodType, features, canFly);
    }


@Override
    public String showInfo(){
        return "Eagle [ Height = " + getHeight() + ", Weight = " + getWeight() + ", AnimalType = " + getAnimalType() + ", BloodType = " + getBloodType() + ", Features = " + getFeatures() +", Can Fly = " + isCanFly() + "]";
    }
    }

    
    

    
