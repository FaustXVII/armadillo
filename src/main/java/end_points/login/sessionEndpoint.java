package end_points.login;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class sessionEndpoint {
    @PostMapping("/signup")
    public String signup(final String emailAddress, final String password){
        return null;
    }

    @PostMapping("/login")
    public String loggin(final String emailAddress, final String password){
        return null;
    }

    @GetMapping("/logout")
    public String logout(){
        return null;
    }

    @PostMapping("/request-password-change")
    public String requestPasswordChange(final String emailAddress){
        return null;
    }

    @PostMapping("/change-password")
    public String changePassword(final String token){
        return null;
    }
}
