// Using java solve the problem below:

//Create your own array of integers
// Find the maximum and minimum of this array that you just created.
// create a variable to hod the maximum
// create a variable to hold the minimum
// take in the array of numbers
// begin to loop through them
// put the lowest in its array
// put the highest in its array
// output the highest then output the lowest

// Harrison's solution
public class MaxAndMin {

        /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
        int numArray[] = new int[]{-10, 11, 32,43,53,54,63,98,43,23};
        int maxNum = numArray[0];
        int minNum = numArray[0];
        for(int iterate=0; iterate<numArray.length; iterate++){
            if(numArray[iterate]> maxNum){
                maxNum = numArray[iterate];
            }
            else if(numArray[iterate]< minNum){
                minNum = numArray[iterate];
            }
        }
          System.out.println("Maximum Number is : " + maxNum);
          System.out.println("Minimum Number is : " + minNum);
    }

}
