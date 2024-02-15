// ✦•······················• PACKAGE - START •······················•✦ //
package br.com.illusia.api.entity.comment.repository;
// ✦•······················• PACKAGE - END •······················•✦ //

// ✦•······················• IMPORTS - START •······················•✦ //

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.illusia.api.entity.comment.model.Comment;

import java.util.UUID;
// ✦•······················• IMPORTS - END •······················•✦ //

@Repository
public interface CommentRepository extends JpaRepository<Comment, UUID>{
    
}