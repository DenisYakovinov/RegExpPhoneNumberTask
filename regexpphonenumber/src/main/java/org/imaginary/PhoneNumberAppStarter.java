package org.imaginary;

public class PhoneNumberAppStarter {
    public static void main(String args[] ) {
        PhoneNumberVerification verification = new PhoneNumberVerification();
        System.out.println(verification.checkPhoneNumber("+380501234567"));
    }
}
