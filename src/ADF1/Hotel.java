package ADF1;

import java.util.Scanner;

public class Hotel {
    public String name;
    public String location;
    public String ownerName;

    public Hotel(String name, String location, String ownerName) {
        this.name = name;
        this.location = location;
        this.ownerName = ownerName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    public void inputInfo(){
        System.out.println("Enter the name of the hotel: ");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        this.setName(scanner.nextLine());

        System.out.println("Enter address of the hotel: ");
        location = scanner.nextLine();
        this.setLocation(scanner.nextLine());

        System.out.println("Enter the hotel owner's name: ");
        ownerName = scanner.nextLine();
        this.setOwnerName(scanner.nextLine());

        public void printInfo(){
            System.out.println("Hotel information :");
            System.out.println(name+" - address "+location - ownerName+);
        }
    }
}
