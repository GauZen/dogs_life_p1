package com.db.grad.javaapi.service;

import com.db.grad.javaapi.model.Dog;
import com.db.grad.javaapi.repository.DogsRepository;

import com.db.grad.javaapi.repository.DogsRepositoryStub;
import org.junit.jupiter.api.*;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
public class DogsHandlerTest {

    private DogsRepository itsDogRepo = new DogsRepositoryStub();
    @BeforeEach
    public void makeSureRepoIsEmpty(){
        itsDogRepo.deleteAll();
    }
    @Test
    public void add_a_dog_return_number_of_dogs_in_repo_is_one(){
        // arrange
        DogHandler cut = new DogHandler(itsDogRepo);
        Dog theDog = new Dog();
        theDog.setName("Bruno");
        cut.addDog(theDog);

        int expectedResult = 1;

        // act
        long actualResult = cut.getNoOfDogs();

        // assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public  void    add_several_dogs_return_number_of_dogs_match_number_added(){
        // arrange
        DogHandler cut = new DogHandler(itsDogRepo);
        Dog theDog = new Dog();
        theDog.setName("Bruno");
        cut.addDog(theDog);
        Dog dog1 = new Dog();
        dog1.setName("Wang Cai");
        cut.addDog(dog1);
        Dog dog2 = new Dog();
        dog2.setName("Hu Zi");
        cut.addDog(dog2);


        int expectedResult = 3;

        // act
        long actualResult = cut.getNoOfDogs();

        // assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void test_getDogsByName_if_valid(){
        DogHandler dhl = new DogHandler(itsDogRepo);
        Dog theDog = new Dog();
        theDog.setName("Bruno");
        dhl.addDog(theDog);
        Dog dog1 = new Dog();
        dog1.setName("Wang Cai");
        dhl.addDog(dog1);
        Dog dog2 = new Dog();
        dog2.setName("Hu Zi");
        dhl.addDog(dog2);

        ArrayList<Dog> expected = new ArrayList<>();
        Mockito.when(itsDogRepo.findByName(Mockito.any())).thenReturn(expected);
        // act

        Dog actDog = dhl.getDogByName("Hua Zi");

        // assert
        assertNull(actDog);
    }

    public void find_dog_by_name_returns_null_because_many_dogs_with_same_name() {
        DogHandler cut = new DogHandler(itsDogRepo);
        // arrange
        Dog theDog = new Dog();
        theDog.setName("Bruno");
        cut.addDog(theDog);
        theDog = new Dog();
        theDog.setName("Bruno");
        cut.addDog(theDog);
        Dog expectedDog = theDog;
        String dogToFind = "Bruno";
        theDog = new Dog();
        theDog.setName("Penny");
        cut.addDog(theDog);
        ArrayList<Dog> expectedList = new ArrayList<>();
        Mockito.when(itsDogRepo.findByName(Mockito.any())).thenReturn(expectedList);

        // act
        Dog actualResult = cut.getDogByName(dogToFind);

        // assert
        assertNull(actualResult);
    }
    }

}
