package demo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class AnimalTest {

    @Test
    public void TestAge()
    {
        Animals testAni = new Animals();
       
        int age = testAni.getAge();

        assertTrue(age == 1);
    }

    @Test
    public void TestColour()
    {
        Dog testDog = new Dog(1);      
        String colour = testDog.getDogColour();

        assertTrue(colour.equals("gold"));
    }

    @Test
    public void TestIsBaby()
    {
        Animals testAni = new Animals();
        assertTrue(!testAni.isBaby());
    }

    @Test
    public void TestIsDogBaby()
    {
        Dog testDog = new Dog(1);      
        assertTrue(testDog.isBaby());
    }

   
    @Test
    public void TestAddingDogList_FilterPuppies()
    {
        List<Dog> DogList = new ArrayList<>();
        List<Dog> PuppiesList = new ArrayList<>();
        //adding dogs in the list
        for(int i =0; i<10; i++){
            Dog testDog = new Dog(i); 
            DogList.add(testDog);
        }
        
        //check each dog if it is a puppy
        for(Dog dog: DogList){
            if(dog.isBaby()){
                PuppiesList.add(dog);
            }
        }

        //checks if there are 10 dogs in the lists that I added
        assertTrue( DogList.size() == 10);
        //checks if the puppies are filtered properly
        assertTrue( PuppiesList.size() == 2);
        
       
    }


}
