/*
Phone number verification
The checkTelNumber method should check if the telNumber argument is a valid phone number.

Validity criteria:
1) if the number starts with '+', then it contains 12 digits
2) if the number starts with digits or an open parenthesis, then it contains 10 digits
3) can contain 0-2 characters '-', which cannot be consecutive
4) may contain 1 pair of brackets '(' and ')', and if there is one, then it is used to the left of the signs '-'
5) brackets inside contain 3 numbers
6) the number does not contain letters
7) the number ends with a digit

Examples:
+380501234567 - true
+38 (050) 1234567 - true
+ 38050123-45-67 - true
050123-4567 - true
+38) 050 (1234567 - false
+38 (050) 1-23-45-6-7 - false
050ххх4567 - false
050123456 - false
(0) 501234567 - false
*/

public class RegExpPhoneNumber {
    public static boolean checkTelNumber(String telNumber) {
        if (telNumber == null) return false;
        else return telNumber.matches("(?=(?:[+\\-()]?\\d){12}$)\\+\\d*(?:\\(\\d{3}\\))" +
                "?\\d*-?\\d+-?\\d+|^(?=(?:[+\\-()]?\\d){10}$)(?:\\(\\d{3}\\))?\\d*-?\\d+-?\\d+");
    }

    public static void main(String[] args) {
    }
}
