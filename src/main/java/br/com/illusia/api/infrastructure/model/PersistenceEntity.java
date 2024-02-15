// ✦•······················• PACKAGE - START •······················•✦ //
package br.com.illusia.api.infrastructure.model;
// ✦•······················• PACKAGE - END •······················•✦ //

// ✦•······················• IMPORTS - START •······················•✦ //
import jakarta.persistence.*;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;
// ✦•······················• IMPORTS - END •······················•✦ //

/**
 * @author Giovane Neves
 * @since v1
 */
@Data
@MappedSuperclass
public class PersistenceEntity {

    // ✦•······················• ATTRIBUTES - START •······················•✦ //
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id", columnDefinition = "BINARY(16)")
    private UUID id;
    // ✦•······················• ATTRIBUTES - END •······················•✦ //

}
