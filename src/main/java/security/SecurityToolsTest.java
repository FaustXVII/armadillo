package security;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecurityToolsTest {
    private static final HashGenerator securityTools = new SecurityTools();

    @Test
    void test_passwordMatches_andReturns_True(){
        //given
        final var userPassword = "password123";
        final var storedPassword = securityTools.hashPassword("password123");

        //when
        final var passwordIsAMatches = securityTools.passwordMatches(userPassword, storedPassword);

        //then
        assertTrue(passwordIsAMatches);
    }

    @Test
    void test_passwordMatches_andReturns_False(){
        //given
        final var userPassword = "wrong-Password";
        final var storedPassword = securityTools.hashPassword("right-Password");

        //when
        final var passwordIsAMatches = securityTools.passwordMatches(userPassword, storedPassword);

        //then
        assertFalse(passwordIsAMatches);
    }

    @Test
    void test_givenPassword_against_storedPassword(){
        //given
        final var userPassword = "password123";
        final var storedPassword = "$2a$12$CBOsJNF56o/BfYjHNraSqeY4vUKjOOwOR3Bp.xY4prsVp6XmabDom";

        //when
        final var passwordIsAMatches = securityTools.passwordMatches(userPassword, storedPassword);

        //then
        assertTrue(passwordIsAMatches);
    }

    @Test
    void test_CSRFToken_onLength(){
        //when
        final var result = securityTools.generateCSRFToken();

        //then
        assertEquals(36, result.length());
    }
}