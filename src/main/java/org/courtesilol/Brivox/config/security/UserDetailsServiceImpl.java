package org.courtesilol.Brivox.config.security;

import java.util.logging.Logger;
import org.courtesilol.Brivox.db.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 *
 * @author ruizn
 */
public class UserDetailsServiceImpl implements UserDetailsService {

    private final Logger log = Logger.getLogger(UserDetailsServiceImpl.class.getName());
    
    @Autowired
    private UserRepository repo;
    
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        var user = repo.findByEmail(email);
        
        if (user == null) 
            throw new UsernameNotFoundException("This user not exist");
        
        log.info("Usuario logeado: "+user.getName());
        return User.builder()
                .username(user.getEmail())
                .password(user.getPassword())
                .roles(user.getRole())
                .build();
                
    }
    
}
