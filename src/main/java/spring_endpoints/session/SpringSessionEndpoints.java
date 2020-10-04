package spring_endpoints.session;

import endpoints.SessionEndPoints;
import endpoints.SessionEndPointsImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringSessionEndpoints implements SessionEndPoints {
    private final SessionEndPoints session = new SessionEndPointsImpl();

    @PostMapping("/signup")
    public String signUp(final String emailAddress, final String password){
        return session.signUp(emailAddress, password);
    }

    @PostMapping("/login")
    public String logIn(final String emailAddress, final String password){
        return session.logIn(emailAddress, password);
    }

    @PostMapping("/logout")
    public String logOut(final String emailAddress){
        return session.logOut(emailAddress);
    }

    @PostMapping("/request-password-change")
    public String requestPasswordChange(final String emailAddress){
        return session.requestPasswordChange(emailAddress);
    }

    @PostMapping("/change-password")
    public String changePassword(final String token){
        return session.changePassword(token);
    }
}
