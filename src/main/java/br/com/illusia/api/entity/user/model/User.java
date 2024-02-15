// ✦•······················• PACKAGE - START •······················•✦ //
package br.com.illusia.api.entity.user.model;
// ✦•······················• PACKAGE - END •······················•✦ //

// ✦•······················• IMPORTS - START •······················•✦ //
import br.com.illusia.api.infrastructure.model.PersistenceEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
// ✦•······················• IMPORTS - END •······················•✦ //

/**
 * @author Giovane Neves
 * @since v1
 */
@Table(name = "users")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User extends PersistenceEntity {

    // ✦•······················• ATTRIBUTES - START •······················•✦ //
    @Column(name = "name")
    private String name;
    @Column(name = "email", unique = true)
    private String email;
    @Column(name= "username", unique = true)
    private String username;
    @Column(name = "password")
    private String password;
    // ✦•······················• ATTRIBUTES - END •······················•✦ //

}
