package org.imaginary;

public class PhoneNumberVerification {   
    private static final String VERIFICATION_PATTERN = "(?=(?:[+\\-()]?\\d){12}$)\\+\\d*(?:\\(\\d{3}\\))"
            + "?\\d*-?\\d+-?\\d+|^(?=(?:[+\\-()]?\\d){10}$)(?:\\(\\d{3}\\))?\\d*-?\\d+-?\\d+";

    public boolean checkPhoneNumber(String phoneNumber) {
        if (phoneNumber == null)
            throw new IllegalArgumentException("User intut can't be null");
        else
            return phoneNumber.matches(VERIFICATION_PATTERN);
    }
}
