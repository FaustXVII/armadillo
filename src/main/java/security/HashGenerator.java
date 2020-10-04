package security;

public interface HashGenerator {
    boolean passwordMatches(final String userPassword, final String storedPassword);
    String hashPassword(final String password);
    String generateCSRFToken();

}
