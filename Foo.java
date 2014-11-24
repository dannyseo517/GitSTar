package lab11;


public class Foo
{
    public static void main(String[] args)
    {   

        
        if (args.length == 0){
            System.out.println("No Arguement");
        }
        else{
            int sum;
            int strToInt;
            double average;
            int counter;

            // get three values from user
            counter = 0;
            sum = 0;
                    
            while (counter < args.length) {
                strToInt = Integer.parseInt(args[counter]);
                sum = sum + strToInt;
                counter++;
            }
            
            average = sum/counter;
            System.out.println("Average: " + average);
        }
                
    }
}