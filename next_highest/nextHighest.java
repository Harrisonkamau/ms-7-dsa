// Given a number, find the next higher number using only the digits in the given number.
//For example if the given number is 1508, the next higher number with same digits is 8510.
public class NextHigher{
  public void nextBig(int num){
    String numString = Integer.toString(num)
    Int length = numString.length()
    char[] a = String.valueOf(numString).toCharArray();
    for (int i = 0; i < a.length - 1; i += 2) {
        char tmp = a[i];
        a[i] = a[i + 1];
        a[i + 1] = tmp;
    }
    int number = Integer.parseInt(new String(a));
        System.out.println(number);
  }
}
