// ✦•······················• PACKAGE - START •······················•✦ //
package br.com.illusia.api.entity.user.repository;
// ✦•······················• PACKAGE - END •······················•✦ //

// ✦•······················• IMPORTS - START •······················•✦ //
import br.com.illusia.api.entity.user.model.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
// ✦•······················• IMPORTS - END •······················•✦ //

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {

}
