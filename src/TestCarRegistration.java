
import java.util.Scanner;

public class TestCarRegistration {

    public static void main(String[] args) {
        //todo:: By using array, create 3 CarType objects
        CarType[] types = {new CarType("Toyota", "Vios", 1.5),
            new CarType("Nissan", "Teana", 2.0),
            new CarType("Honda", "City", 1.6)};

        //todo:: create an array that will able to store 6 registrations
        Register[] reg = new Register[2];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < reg.length; ++i) {

            System.out.println("\nRegistration number: " + reg[i].getCount());
  		
                //todo:: request and read the owner detail
                System.out.print("Enter Owner Name: ");
                String name=scanner.nextLine();
                System.out.print("Enter IC Number: ");
                String ic=scanner.nextLine();
            
                //construct owner object
                Person person=new Person(name,ic);
                
  		//todo:: request and read car detail
                System.out.print("Enter Plate Nnumber: ");
                String plateNum=scanner.nextLine();
                System.out.print("Enter Color: ");
                String color=scanner.nextLine();
                System.out.print("Enter Year: ");
                int year=scanner.nextInt();
                
  		System.out.println("\nCar Types: ");
  		//todo:: display all available carType
               for (int j = 0; j < types.length; j++) {
                System.out.printf("%d %s\n",j+1,types[j].toString());
               }
                
  		
                System.out.print("\nSelect car type [1.." + types.length + "]: ");
  		int selection = scanner.nextInt();
  		
                Car car = new Car(plateNum, color, year, types[selection-1] );
                
                //todo:: get cartype from array (based on selection)
              		
  		//todo:: register the car
                reg[i]=new Register(person,car);
                
                         
  		scanner.nextLine();
        }
  
  	//todo:: display all registration detail
        displayListing(reg);
    }
  
  public static void displayListing(Register[] regArr) {
  	System.out.printf("\n\n%50s\n", "Car Registration Listing");
  	System.out.printf("%-8s %-12s %-12s %-10s %-8s %-6s %-10s %-10s %5s\n", 
  		"Reg No", "Name", "IC No.", "Plate No", "Color", "Year", "Make", "Model", "Capacity");
  	for (int i = 0; i < regArr.length; ++i) 
  		System.out.println(regArr[i]);
  }

}
