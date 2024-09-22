interface Flyable
{
    //abstract method fly
    void fly();
}

interface Swimmable
{
    //abstract method swim
    void swim();
}

class Duck implements Flyable, Swimmable
{
    // this constructor is not necessary here as there is no initialization. so default constructor is only needed
    Duck()
    {
      //  this.fly();
      //  this.swim();
    }

    @Override
    public void fly() // overriding the method fly from the parent class flyable
    {
        System.out.println("the duck can fly");
    }
    @Override
    public void swim() // overriding the method from the parent class swimmable
    {
        System.out.println("the duck can also swim");
    }
}


public class MultipleInterfaceConcept {
    public static void main(String[] args) {

        Duck character = new Duck();
        character.fly();
        character.swim();

        
    }
}
