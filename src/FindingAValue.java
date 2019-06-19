import java.util.Scanner;
import java.util.ArrayList;

public class FindingAValue {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(50);
        list.add(25);
        list.add(25);
        list.add(16);
        list.add(5);
        list.add(25);
        list.add(26);
        list.add(43);

        int count = 0;

        System.out.println("ArrayList: " + list);
        System.out.println("Enter a value. I will let you know if it is in the array or not.");
        int value = scanner.nextInt();
        System.out.println("The value to find is: " + value);

        for(int i = 0; i < list.size(); i++){
            if(value == list.get(i)){

                count++;

            }
        }

        if(count == 1){
            System.out.println(value + " was found " + count + " time.");
        }else if(count > 1){
            System.out.println(value + " was found " + count + " times.");
        }else{
            System.out.println(value + " was NOT found.");
        }

    }
}
