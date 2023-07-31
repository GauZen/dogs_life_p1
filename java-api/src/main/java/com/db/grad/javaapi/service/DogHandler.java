package com.db.grad.javaapi.service;

import com.db.grad.javaapi.model.Dog;
import com.db.grad.javaapi.repository.DogsRepository;
import org.springframework.stereotype.Service;



@Service
public class DogHandler{
        private DogsRepository itsDogsRepo;

            @InjectMocks
        private DogHandler cut;

                @Test
        public  void    add_a_dog_return_number_of_dogs_in_repo_is_one()
                {
                            // arrange
                            Dog theDog = new Dog();
                                    theDog.setName("Bruno");
                                            Mockito.when(itsDogsRepo.save(theDog)).thenReturn();
                }
}