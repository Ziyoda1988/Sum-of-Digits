import java.util.*;
class Main {
  public static void main(String[] args) {
   
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number between 1-999:");
    int number = scan.nextInt();
  
    int last_digit = number % 10;
    number = number / 10;
    int second_digit = number % 10; 
    number = number / 10;
  
     
    System.out.println(number + second_digit + last_digit);  
  }}
    

    
    //DON'T CHANGE THE CODE ABOVE
    //Write your code below. 
    //Use the "number" variable that is declared above to calculate the sum of its digits.
    

    


    
  
