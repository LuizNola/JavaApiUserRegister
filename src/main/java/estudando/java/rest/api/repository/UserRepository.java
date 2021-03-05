package estudando.java.rest.api.repository;

import estudando.java.rest.api.model.UserModel;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserModel, Integer> {

}
