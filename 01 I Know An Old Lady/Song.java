/*
 * CS312 Assignment 1
 * On my honor, Andrew Lin, this programming assignment is my own work.
 *
 * A program to print out the lyrics to the
 * children's song, "There was an old woman".
 *
 *  Name: Andrew Lin
 *  email address: alin257274@gmail.com
 *  UTEID: al58444
 *  
 */

public class Song {

    // Print out the lyrics of "There was an old woman ... "
    public static void main(String[] args)
    {
        // Add your code here.
    	verse1("fly");
    	verse2("spider");
    	verse3("bird");
    	verse4("cat");
    	verse5("dog");
    	verse6("goat");
    	verse7("cow");
    	verse8("horse");
    }
    
    // Add your methods here.
    public static void oldWoman(String newAnimal)
    {
    	System.out.println("There was an old woman who swallowed a " + newAnimal + ",");
    }
    
    public static void swallowFly()
    {
    	System.out.println("I don't know why she swallowed that fly,");
    	System.out.println("Perhaps she'll die.");
    	System.out.println("");
    }
    
    public static void toCatchCow()
    {
    	System.out.println("She swallowed the cow to catch the goat,");
    	toCatchGoat();
    }
    
    public static void toCatchGoat()
    {
    	System.out.println("She swallowed the goat to catch the dog,");
    	toCatchDog();
    }
    
    public static void toCatchDog()
    {
    	System.out.println("She swallowed the dog to catch the cat,");
    	toCatchCat();
    }
    
    public static void toCatchCat()
    {
    	System.out.println("She swallowed the cat to catch the bird,");
    	toCatchBird();
    }
    public static void toCatchBird()
    {
    	System.out.println("She swallowed the bird to catch the spider,");
    	toCatchSpider();
    }
    
    public static void toCatchSpider()
    {
    	System.out.println("She swallowed the spider to catch the fly,");
    }
    
    
    public static void verse1(String firstAnimal)
    {
    	System.out.println("There was an old woman who swallowed a fly.");
    	swallowFly();
    }
    
    public static void verse2(String secondAnimal)
    {
    	oldWoman(secondAnimal);
    	System.out.println("That wriggled and iggled and jiggled inside her.");
    	toCatchSpider();
    	swallowFly();
    }
    
    public static void verse3(String thirdAnimal)
    {
    	oldWoman(thirdAnimal);
    	System.out.println("How absurd to swallow a bird.");
    	toCatchBird();
    	swallowFly();
    }
    
    public static void verse4(String fourthAnimal)
    {
    	oldWoman(fourthAnimal);
    	System.out.println("Imagine that to swallow a cat.");
    	toCatchCat();
    	swallowFly();
    }
    
    public static void verse5(String fifthAnimal)
    {
    	oldWoman(fifthAnimal);
    	System.out.println("What a hog to swallow a dog.");
    	toCatchDog();
    	swallowFly();
    }
    
    public static void verse6(String sixthAnimal)
    {
    	oldWoman(sixthAnimal);
    	System.out.println("She just opened her throat to swallow a goat.");
    	toCatchGoat();
    	swallowFly();
    }
    
    public static void verse7(String seventhAnimal)
    {
    	oldWoman(seventhAnimal);
    	System.out.println("I don't know how she swallowed a cow.");
    	toCatchCow();
    	swallowFly();
    }
    
    public static void verse8(String eighthAnimal)
    {
    	oldWoman(eighthAnimal);
    	System.out.println("She died of course.");
    }
}