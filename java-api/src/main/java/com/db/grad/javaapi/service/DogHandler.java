package com.db.grad.javaapi.service;

import com.db.grad.javaapi.model.Dog;
import com.db.grad.javaapi.repository.DogsRepository;

import java.util.List;

public class DogHandler {
    private DogsRepository itsDogsRepo;

    public DogHandler(DogsRepository repo) {
        itsDogsRepo = repo;
    }



    public long addDog(Dog theDog) {
        return itsDogsRepo.save(theDog);
    }


    public long getNoOfDogs() {
        return itsDogsRepo.count();
    }


    public Dog getDogByName(String dogName) {
        Dog targetDog = new Dog();
        targetDog.setName(dogName);
        List<Dog> dogs = itsDogsRepo.findByName(targetDog);
        Dog result = null;

        if (dogs.size() == 1)
            result = dogs.get(0);

        return result;

    }
}
