// ✦•······················• PACKAGE - START •······················•✦ //
package br.com.illusia.api.entity.like.repository;
// ✦•······················• PACKAGE - END •······················•✦ //

// ✦•······················• IMPORTS - START •······················•✦ //
import br.com.illusia.api.entity.like.model.Like;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
// ✦•······················• IMPORTS - END •······················•✦ //

@Repository
public interface LikeRepository extends JpaRepository<Like, UUID> {

}
