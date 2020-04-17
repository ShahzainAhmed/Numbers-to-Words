import javax.swing.*;

public class NumToWords{
    public static void Method1(String input) {
        String n1[] = {"One", "Two", "Three", "Four", "Five", "Six",
                "Seven", "Eight", "Nine"};
        if (input.charAt(0) == '1') {
            System.out.print(n1[0]);
        } else if (input.charAt(0) == '2') {
            System.out.print(n1[1]);
        } else if (input.charAt(0) == '3') {
            System.out.print(n1[2]);
        } else if (input.charAt(0) == '4') {
            System.out.print(n1[3]);
        } else if (input.charAt(0) == '5') {
            System.out.print(n1[4]);
        } else if (input.charAt(0) == '6') {
            System.out.print(n1[5]);
        } else if (input.charAt(0) == '7') {
            System.out.print(n1[6]);
        } else if (input.charAt(0) == '8') {
            System.out.print(n1[7]);
        } else if (input.charAt(0) == '9') {
            System.out.print(n1[8]);
        } else {
            System.out.print("zero");
        }
    }
    public static void Method2(String input) {
        String n2[] = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
                "Eighteen", "Nineteen"};
        if (input.charAt(0) == '1' && input.charAt(1) == '0') {
            System.out.println(n2[0]);
        } else if (input.charAt(0) == '1' && input.charAt(1) == '1') {
            System.out.println(n2[1]);
        } else if (input.charAt(0) == '1' && input.charAt(1) == '2') {
            System.out.println(n2[2]);
        } else if (input.charAt(0) == '1' && input.charAt(1) == '3') {
            System.out.println(n2[3]);
        } else if (input.charAt(0) == '1' && input.charAt(1) == '4') {
            System.out.println(n2[4]);
        } else if (input.charAt(0) == '1' && input.charAt(1) == '5') {
            System.out.println(n2[5]);
        } else if (input.charAt(0) == '1' && input.charAt(1) == '6') {
            System.out.println(n2[6]);
        } else if (input.charAt(0) == '1' && input.charAt(1) == '7') {
            System.out.println(n2[7]);
        } else if (input.charAt(0) == '1' && input.charAt(1) == '8') {
            System.out.println(n2[8]);
        } else if (input.charAt(0) == '1' && input.charAt(1) == '9') {
            System.out.println(n2[9]);
        }
    }
    public static void Method3(String input) {
        String n3[] = {"Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        if (input.charAt(0) == '2' ) {
            System.out.print(n3[0]+" ");
        } else if (input.charAt(0) == '3' ) {
            System.out.print(n3[1]+" ");
        } else if (input.charAt(0) == '4' ) {
            System.out.print(n3[2]+" ");
        } else if (input.charAt(0) == '5' ) {
            System.out.print(n3[3]+" ");
        } else if (input.charAt(0) == '6' ) {
            System.out.print(n3[4]+" ");
        } else if (input.charAt(0) == '7' ) {
            System.out.print(n3[5]+" ");
        } else if (input.charAt(0) == '8' ) {
            System.out.print(n3[6]+" ");
        } else if (input.charAt(0) == '9' ) {
            System.out.print(n3[7]+" ");
        }
    }
    public static void Method4(String input) {
        String n1[] = {"One", "Two", "Three", "Four", "Five", "Six",
                "Seven", "Eight", "Nine"};
        if (input.charAt(1) == '1') {
            System.out.println(n1[0]);
        } else if (input.charAt(1) == '2') {
            System.out.print(n1[1]+" ");
        } else if (input.charAt(1) == '3') {
            System.out.print(n1[2]+" ");
        } else if (input.charAt(1) == '4') {
            System.out.print(n1[3]+" ");
        } else if (input.charAt(1) == '5') {
            System.out.print(n1[4]+" ");
        } else if (input.charAt(1) == '6') {
            System.out.print(n1[5]+" ");
        } else if (input.charAt(1) == '7') {
            System.out.print(n1[6]+" ");
        } else if (input.charAt(1) == '8') {
            System.out.print(n1[7]+" ");
        } else if (input.charAt(1) == '9') {
            System.out.print(n1[8]+" ");
        }
    }
    public static void Method6(String input){
        String n1[] = {"One", "Two", "Three", "Four", "Five", "Six",
                "Seven", "Eight", "Nine"};
        if (input.charAt(2) == '1') {
            System.out.print(n1[0]+" ");
        } else if (input.charAt(2) == '2') {
            System.out.print(n1[1]+" ");
        } else if (input.charAt(2) == '3') {
            System.out.print(n1[2]+" ");
        } else if (input.charAt(2) == '4') {
            System.out.print(n1[3]+" ");
        } else if (input.charAt(2) == '5') {
            System.out.print(n1[4]+" ");
        } else if (input.charAt(2) == '6') {
            System.out.print(n1[5]+" ");
        } else if (input.charAt(2) == '7') {
            System.out.print(n1[6]+" ");
        } else if (input.charAt(2) == '8') {
            System.out.print(n1[7]+" ");
        } else if (input.charAt(2) == '9') {
            System.out.print(n1[8]+" ");
        }
    }
    public static void Method7(String input){
        String n3[] = {"Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        if (input.charAt(1) == '2' ) {
            System.out.print(n3[0]+" ");
        } else if (input.charAt(1) == '3' ) {
            System.out.print(n3[1]+" ");
        } else if (input.charAt(1) == '4' ) {
            System.out.print(n3[2]+" ");
        } else if (input.charAt(1) == '5' ) {
            System.out.print(n3[3]+" ");
        } else if (input.charAt(1) == '6' ) {
            System.out.print(n3[4]+" ");
        } else if (input.charAt(1) == '7' ) {
            System.out.print(n3[5]+" ");
        } else if (input.charAt(1) == '8' ) {
            System.out.print(n3[6]+" ");
        } else if (input.charAt(1) == '9' ) {
            System.out.print(n3[7]+" ");
        }
    }
    public static void Method5(String input){
        Method1(input);
        System.out.print(" hundred ");
        if (input.charAt(1)=='1') {
            Method12(input);
        }
        else{
            Method7(input);
            Method6(input);
        }}

    public static void Method8(String input){
        Method1(input);
        System.out.print(" thousand ");
        if(input.charAt(1)>'0'){
            Method16(input);
            System.out.print(" hundred ");
            if(input.charAt(2)=='0'){
                Method17(input);
            }
            else if(input.charAt(2)=='1'){
                Method18(input);
            }
            else if(input.charAt(2)>'1'){
                Method19(input);
                if(input.charAt(3)>'0'){
                    Method20(input);
                }
            }
        }
        else if (input.charAt(1)=='0'){
            if(input.charAt(2)=='0'){
                Method20(input);
            }
            else if(input.charAt(2)=='1'){
                Method18(input);
            }
            else if(input.charAt(2)>'1'){
                Method19(input);
                if(input.charAt(3)>'0'){
                    Method20(input);
                }
            }
        }
    }
    public static void Method12(String input){
        String n2[] = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
                "Eighteen", "Nineteen"};
        if (input.charAt(1) == '1' && input.charAt(2) == '0') {
            System.out.print(n2[0]);
        } else if (input.charAt(1) == '1' && input.charAt(2) == '1') {
            System.out.print(n2[1]);
        } else if (input.charAt(1) == '1' && input.charAt(2) == '2') {
            System.out.print(n2[2]);
        } else if (input.charAt(1) == '1' && input.charAt(2) == '3') {
            System.out.print(n2[3]);
        } else if (input.charAt(1) == '1' && input.charAt(2) == '4') {
            System.out.print(n2[4]);
        } else if (input.charAt(1) == '1' && input.charAt(2) == '5') {
            System.out.print(n2[5]);
        } else if (input.charAt(1) == '1' && input.charAt(2) == '6') {
            System.out.print(n2[6]);
        } else if (input.charAt(1) == '1' && input.charAt(2) == '7') {
            System.out.print(n2[7]);
        } else if (input.charAt(1) == '1' && input.charAt(2) == '8') {
            System.out.print(n2[8]);
        } else if (input.charAt(1) == '1' && input.charAt(2) == '9') {
            System.out.println(n2[9]);
        }
    }
    public static void Method16(String input){
        String n1[] = {"One", "Two", "Three", "Four", "Five", "Six",
                "Seven", "Eight", "Nine"};
        if (input.charAt(1) == '1') {
            System.out.print(n1[0]);
        } else if (input.charAt(1) == '2') {
            System.out.print(n1[1]);
        } else if (input.charAt(1) == '3') {
            System.out.print(n1[2]);
        } else if (input.charAt(1) == '4') {
            System.out.print(n1[3]);
        } else if (input.charAt(1) == '5') {
            System.out.print(n1[4]);
        } else if (input.charAt(1) == '6') {
            System.out.print(n1[5]);
        } else if (input.charAt(1) == '7') {
            System.out.print(n1[6]);
        } else if (input.charAt(1) == '8') {
            System.out.print(n1[7]);
        } else if (input.charAt(1) == '9') {
            System.out.print(n1[8]);
        }
    }
    public static void Method17(String input){
        String n1[] = {"One", "Two", "Three", "Four", "Five", "Six",
                "Seven", "Eight", "Nine"};
        if (input.charAt(3) == '1') {
            System.out.print(n1[0]);
        } else if (input.charAt(3) == '2') {
            System.out.print(n1[1]);
        } else if (input.charAt(3) == '3') {
            System.out.print(n1[2]);
        } else if (input.charAt(3) == '4') {
            System.out.print(n1[3]);
        } else if (input.charAt(3) == '5') {
            System.out.print(n1[4]);
        } else if (input.charAt(3) == '6') {
            System.out.print(n1[5]);
        } else if (input.charAt(3) == '7') {
            System.out.print(n1[6]);
        } else if (input.charAt(3) == '8') {
            System.out.print(n1[7]);
        } else if (input.charAt(3) == '9') {
            System.out.print(n1[8]);
        }
    }
    public static void Method18(String input){
        String n2[] = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
                "Eighteen", "Nineteen"};
        if (input.charAt(2) == '1' && input.charAt(3) == '0') {
            System.out.print(n2[0]);
        } else if (input.charAt(2) == '1' && input.charAt(3) == '1') {
            System.out.print(n2[1]);
        } else if (input.charAt(2) == '1' && input.charAt(3) == '2') {
            System.out.print(n2[2]);
        } else if (input.charAt(2) == '1' && input.charAt(3) == '3') {
            System.out.print(n2[3]);
        } else if (input.charAt(2) == '1' && input.charAt(3) == '4') {
            System.out.print(n2[4]);
        } else if (input.charAt(2) == '1' && input.charAt(3) == '5') {
            System.out.print(n2[5]);
        } else if (input.charAt(2) == '1' && input.charAt(3) == '6') {
            System.out.print(n2[6]);
        } else if (input.charAt(2) == '1' && input.charAt(3) == '7') {
            System.out.print(n2[7]);
        } else if (input.charAt(2) == '1' && input.charAt(3) == '8') {
            System.out.print(n2[8]);
        } else if (input.charAt(2) == '1' && input.charAt(3) == '9') {
            System.out.println(n2[9]);
        }
    }
    public static void Method19(String input){
        String n3[] = {"Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        if (input.charAt(2) == '2' ) {
            System.out.print(n3[0]+" ");
        } else if (input.charAt(2) == '3' ) {
            System.out.print(n3[1]+" ");
        } else if (input.charAt(2) == '4' ) {
            System.out.print(n3[2]+" ");
        } else if (input.charAt(2) == '5' ) {
            System.out.print(n3[3]+" ");
        } else if (input.charAt(2) == '6' ) {
            System.out.print(n3[4]+" ");
        } else if (input.charAt(2) == '7' ) {
            System.out.print(n3[5]+" ");
        } else if (input.charAt(2) == '8' ) {
            System.out.print(n3[6]+" ");
        } else if (input.charAt(2) == '9' ) {
            System.out.print(n3[7]+" ");
        }
    }
    public static void Method20(String input){
        String n1[] = {"One", "Two", "Three", "Four", "Five", "Six",
                "Seven", "Eight", "Nine"};
        if (input.charAt(3) == '1') {
            System.out.print(n1[0]);
        } else if (input.charAt(3) == '2') {
            System.out.print(n1[1]);
        } else if (input.charAt(3) == '3') {
            System.out.print(n1[2]);
        } else if (input.charAt(3) == '4') {
            System.out.print(n1[3]);
        } else if (input.charAt(3) == '5') {
            System.out.print(n1[4]);
        } else if (input.charAt(3) == '6') {
            System.out.print(n1[5]);
        } else if (input.charAt(3) == '7') {
            System.out.print(n1[6]);
        } else if (input.charAt(3) == '8') {
            System.out.print(n1[7]);
        } else if (input.charAt(3) == '9') {
            System.out.print(n1[8]);
        }
    }
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter a number from 1-9999");
        int b = input.length();
        if (b == 1) {
            Method1(input);
        } else if (b == 2) {
            int a = Integer.parseInt(input);
            if (a <= 19) {
                Method2(input);
            } else if (a >= 20) {
                Method3(input);
                Method4(input);
            }
        } else if (b==3){
            Method5(input);
        }
        else if(b==4){
            Method8(input);
        }
    }
}

