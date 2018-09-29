package mailVerification2.mailVerification2;

import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.jpa.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//import com.codebyamir.model.User;

@Repository("userRepository")
public interface UserRepository extends CrudRepository<User, Long> {
     User findByEmail(String email);
     User findByConfirmationToken(String confirmationToken);
}
