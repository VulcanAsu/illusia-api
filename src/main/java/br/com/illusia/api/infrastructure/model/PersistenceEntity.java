// ✦•······················• PACKAGE - START •······················•✦ //
package br.com.illusia.api.infrastructure.model;
// ✦•······················• PACKAGE - END •······················•✦ //

// ✦•······················• IMPORTS - START •······················•✦ //
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

import lombok.Data;

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
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    // ✦•······················• ATTRIBUTES - END •······················•✦ //

}
