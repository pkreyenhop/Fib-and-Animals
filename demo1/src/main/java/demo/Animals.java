package demo;

public class Animals {
    
    protected int animalAge;

    public Animals(){
        this.animalAge = 1;
    }

    /**this constructor is for the map of dogs I have created to filter out puppies*/
    public Animals(int age){
        this.animalAge = age;
    }

 
    public boolean isBaby(){
        if(animalAge < 1){
            return true;
        }
        return false;
    }


    public Integer getAge(){
        return animalAge;
    }


}


