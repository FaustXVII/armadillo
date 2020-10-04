package security;

import java.util.UUID;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class SecurityTools implements HashGenerator{
    private static final int strength = 12;
    private static final PasswordEncoder passwordEncoder =  new BCryptPasswordEncoder(strength);

    public boolean passwordMatches(final String userPassword, final String storedPassword) {
        return passwordEncoder.matches(userPassword, storedPassword);
    }

    public String hashPassword(final String password) {
        return passwordEncoder.encode(password);
    }

    public String generateCSRFToken() {
        return UUID.randomUUID().toString();
    }
}
