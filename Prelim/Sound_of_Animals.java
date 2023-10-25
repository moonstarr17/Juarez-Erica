import java.util.Scanner;

class Sound_of_Animals{
    public static void main(String args[]) {
        System.out.println("========== Activity One: What does the animal say? ===========");
        Selections choose = new Selections();
        choose.choices();
    }
}

class Cat {
    public void makeSound() {
        System.out.println("meow meow meow");
    }
}

class Duck extends Cat {
    
    public void makeSound() {
        System.out.println("quack quack quack");
    }
}

class Bird extends Cat {
   
    public void makeSound() {
        System.out.println("chirp chirp chirp");
    }
}

class Snake extends Cat {
    
    public void makeSound() {
        System.out.println("hiss hiss hiss");
    }
}

class Selections {
    private Scanner scan = new Scanner(System.in);

    public void choices() {
        String continueChoice = "";
        
        do {
            int number;
            System.out.println("Select an animal: ");
            System.out.println("1. Cat");
            System.out.println("2. Duck");
            System.out.println("3. Bird");
            System.out.println("4. Snake");
            System.out.print("\nEnter a number: ");
            number = scan.nextInt();
            scan.nextLine();  

            switch (number) {
                case 1:
                    System.out.println("Animal: Cat");
                    Cat cat = new Cat();
                    cat.makeSound();
                    break;
                case 2:
                    System.out.println("Animal: Duck");
                    Duck duck = new Duck();
                    duck.makeSound();
                    break;
                case 3:
                    System.out.println("Animal: Bird");
                    Bird bird = new Bird();
                    bird.makeSound();
                    break;
                case 4:
                    System.out.println("Animal: Snake");
                    Snake snake = new Snake();
                    snake.makeSound();
                    break;
                default:
                    System.out.println("Out of the choices");
            }
            
            
            System.out.print("\nDo you want to continue? (yes or no): ");
            continueChoice = scan.nextLine().trim().toLowerCase();

        } while ("yes".equals(continueChoice) || "y".equals(continueChoice));
    }
  }  
