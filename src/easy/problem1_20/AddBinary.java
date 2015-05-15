package easy.problem1_20;

/**
 * Created by Adam on 2015/5/15.
 */
public class AddBinary {
    public String addBinary(String a, String b) {
        if(a==null){
            return b;
        }
        if(b==null){
            return a;
        }

        StringBuilder result = new StringBuilder();
        int i = a.length()-1;
        int j = b.length()-1;
        int carry = 0;
        int aBit = 0;
        int bBit = 0;
        int current = 0;

        while(i>=0 || j>=0 ||carry==1){
            aBit = i>=0 ? Character.getNumericValue(a.charAt(i--)) : 0;
            bBit = j>=0 ? Character.getNumericValue(b.charAt(j--)) : 0;
            current = (aBit ^ bBit) ^ carry;
            carry = (aBit+bBit+carry) >= 2 ? 1 : 0;
            result.append(current);
        }
        return result.reverse().toString();
    }
}
