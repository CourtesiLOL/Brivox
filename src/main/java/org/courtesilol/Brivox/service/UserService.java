package org.courtesilol.Brivox.service;

import org.courtesilol.Brivox.db.entity.UserEntity;
import org.courtesilol.Brivox.db.repository.UserRepository;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

/**
 *
 * @author ruizn
 */
@Service
public class UserService {
    
    private final UserRepository userRepo;
    
    public UserService (UserRepository userRepo) {
        this.userRepo = userRepo;
    }
    
    
    public UserEntity getUserFromSesion() {
        var auth = SecurityContextHolder.getContext().getAuthentication();
        return userRepo.findByEmail(auth.getName());
    }
    
}
