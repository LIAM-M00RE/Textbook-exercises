import java.util.*;

public class MonthlyTemperatures {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        char choice;
        double [][] temperature = new double[4][7];//Create 2D Array
        //Offer menu
        do{
            System.out.println();
            System.out.println("[1] enter temperature");
            System.out.println("[2] Display all");
            System.out.println("[3] Display one week");
            System.out.println("[4] Display day of the week");
            System.out.println("[5] Exit");
            System.out.println("Enter Choice [1-5]: ");
            choice = keyboard.next().charAt(0);
            System.out.println();
            //process choice by calling additional methods
            switch(choice){
                case '1':enterTemps(temperature);
                        break;
                case '2':displayAllTemps(temperature);
                        break;
                case '3':displayWeekTemps(temperature);
                        break;
                case '4':displayDays(temperature);
                        break;
                case '5':System.out.println("Goodbye");
                     break;
                default: System.out.println("Error: options 1-5 only"); 
            }
        } while (choice !='5');
    }
    //method to enter temps in 2d array requires nested loop
    static void enterTemps(double [][] temperatureIn){
        Scanner keyboard = new Scanner(System.in);
        //outer loop controls week number
        for (int week =1; week <=temperatureIn.length; week++){
            //inner loop controls the day number
            for(int day =1; day<=temperatureIn[0].length; day++){
                System.out.println("Enter temperature for week " + week +" and day " + day);
                temperatureIn[week-1][day-1] = keyboard.nextDouble();
            }
        }
    }
    //method to display all temperatures in 2d array requires nested loop
    static void displayAllTemps(double [][] temperatureIn){
        System.out.println();

        System.out.println("***** TEMPERATURES ENTERED ********");
        //outer loop controls week number
        for (int week =1; week<= temperatureIn.length; week++)
        {
            //inner loop controls day number
        for (int day =1; day<= temperatureIn[0].length; day++){
            System.out.println("week " + week + "day :" + temperatureIn[week-1][day-1]);
            }
        }
    }
    //method to display a single weeks temperatures requires a single loop
    static void displayWeekTemps(double[][] temperatureIn){
        Scanner keyboard = new Scanner(System.in);
        int week;
        //Enter week number
        System.out.println("Enter week number (1-4) : ");
        week = keyboard.nextInt();
        //input validation
        while (week <1 || week>4) {
            System.out.println("Invalid week number");
            System.out.print("Enter a week number between 1-4 ");
            week = keyboard.nextInt();
        }
        //display temperatures for a given week
        System.out.println();
        System.out.println("*****TEMPERATURES ENTERED FOR WEEK " + week + " *********");
        System.out.println();
        //Week number is fixed so so loop required to process day numbers only
        for(int day =1; day<=temperatureIn[0].length; day++){
            System.out.println("week " + week + "day : " + temperatureIn[week-1][day-1]);
        }
    }
    //method to display temperatues for a single day of each week requires single loop
    static void displayDays(double[][] temperatureIn){
        Scanner keyboard = new Scanner(System.in);
        int day;
        //enter day number
        System.out.println("Enter day number (1-7) : ");
        day = keyboard.nextInt();
        //input validation
        while (day <1 || day>7) {
            System.out.println("Invalid day number");
            System.out.print("Enter a day number between 1-7 ");
            day = keyboard.nextInt();
        }
        //display temperatures for given day of the week
    System.out.println();
    System.out.println(("**** TEMPERATURES ENTERED FOR DAY " + day +" ********"));
    System.out.println();
    //day number is fixed loop so required to process week numbers only
    for (int week =1; week <=temperatureIn.length; week++){
    System.out.println("week " + week + " day :" + temperatureIn[week-1][day-1]);   
    }
 }
    
}