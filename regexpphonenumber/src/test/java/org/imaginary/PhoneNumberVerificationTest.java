package org.imaginary;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PhoneNumberVerificationTest {
    
    @Test
    void checkPhoneNumber_Null_ThrowIllegalArgumentException() {
        PhoneNumberVerification verification = new PhoneNumberVerification();
        Class<IllegalArgumentException> expected = IllegalArgumentException.class;
        assertThrows(expected, () -> verification.checkPhoneNumber(null));
    }
    
    @Test
    void checkPhoneNumber_ValidPhoneNumberCase1_True() {
        PhoneNumberVerification verification = new PhoneNumberVerification();
        boolean expected = true;
        boolean actual = verification.checkPhoneNumber("+380501234567");
        assertEquals(expected, actual);
    }
    
    @Test
    void checkPhoneNumber_ValidPhoneNumberCase2_True() {
        PhoneNumberVerification verification = new PhoneNumberVerification();
        boolean expected = true;
        boolean actual = verification.checkPhoneNumber("+38050123-45-67");
        assertEquals(expected, actual);
    }
    
    @Test
    void checkPhoneNumber_ValidPhoneNumberCase3_True() {
        PhoneNumberVerification verification = new PhoneNumberVerification();
        boolean expected = true;
        boolean actual = verification.checkPhoneNumber("+57(050)1234567");
        assertEquals(expected, actual);
    }
    
    @Test
    void checkPhoneNumber_NotValidPhoneNumberCase1_False() {
        PhoneNumberVerification verification = new PhoneNumberVerification();
        boolean expected = false;
        boolean actual = verification.checkPhoneNumber("+31) 050 (1234567 ");
        assertEquals(expected, actual);
    }
    
    @Test
    void checkPhoneNumber_NotValidPhoneNumberCase2_False() {
        PhoneNumberVerification verification = new PhoneNumberVerification();
        boolean expected = false;
        boolean actual = verification.checkPhoneNumber("(0) 501234567 ");
        assertEquals(expected, actual);
    }
    
    @Test
    void checkPhoneNumber_NotValidPhoneNumberCase3_False() {
        PhoneNumberVerification verification = new PhoneNumberVerification();
        boolean expected = false;
        boolean actual = verification.checkPhoneNumber("1000099");
        assertEquals(expected, actual);
    }
}
