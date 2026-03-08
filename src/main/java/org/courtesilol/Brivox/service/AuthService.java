package org.courtesilol.Brivox.service;

import java.util.logging.Logger;
import org.courtesilol.Brivox.controller.ui.AuthController;
import org.courtesilol.Brivox.db.entity.UserEntity;
import org.courtesilol.Brivox.db.repository.UserRepository;
import org.courtesilol.Brivox.model.UserRegister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 *
 * @author javier
 */
@Service
public class AuthService {
    private final Logger log = Logger.getLogger(AuthService.class.getName());
    private final UserRepository userRepo;
    private final PasswordEncoder encoder;
    
    public AuthService(UserRepository userRepo, PasswordEncoder encoder) {
        this.userRepo = userRepo;
        this.encoder = encoder;
    }
    
    public ResponseEntity register(UserRegister user) {
        
        if (userRepo.findByEmail(user.email()) != null) {
            log.info("El usuario ya existe");
            return ResponseEntity.status(HttpStatus.CONFLICT).body("This user already existe");
        }
            
        
        if (!user.password().equals(user.password2())) {
            log.info("Las contraseñas no coinciden");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Passwords do not match");
        }
            
        
        var newUser = new UserEntity();
        
        newUser.setEmail(user.email());
        newUser.setName(user.username());
        newUser.setPassword(encoder.encode(user.password()));
        newUser.setRole("USER");
        
        userRepo.save(newUser);
        log.info("User registed: "+newUser.getName());
        return ResponseEntity.ok("User registered succesfully");
    }
    
}
