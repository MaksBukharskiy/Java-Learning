package AgeCheckingProgramWithExceptions;

import AgeCheckingProgramWithExceptions.InvalidPasswordException;
import AgeCheckingProgramWithExceptions.InvalidAgeException;

import javax.xml.namespace.QName;

public class AgeChecking {
    private int age;
    private int password;
    private int correctPassword = 123;

    public AgeChecking(int age, int password) {
        this.age = age;
        this.password = password;
    }

    public void CheckThisAge(int age)
            throws InvalidAgeException{
        if(age < 18){
            throw new InvalidAgeException(age);
        }
        else {
            System.out.println("You are an adult, you are " + age + " years old");
        }
    }

    public void CheckThisPassword(int password)
            throws InvalidPasswordException{
        if(password != correctPassword){
            throw new InvalidPasswordException(password);
        }
        else{
            System.out.println("Your password is correct: " + password);
        }
    }
}
