// ✦•······················• PACKAGE - START •······················•✦ //
package br.com.illusia.api.entity.like.model;
// ✦•······················• PACKAGE - END •······················•✦ //

// ✦•······················• IMPORTS - START •······················•✦ //
import br.com.illusia.api.infrastructure.model.PersistenceEntity;
import br.com.illusia.api.entity.comment.model.Comment;
import br.com.illusia.api.entity.user.model.User;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
// ✦•······················• IMPORTS - END •······················•✦ //

/**
 * 
 * @author Andesson Reis
 * @since v1
 */
@Entity
@Table(name = "likes")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Like extends PersistenceEntity {

    // ✦•······················• ATTRIBUTES - START •······················•✦ //

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "comment_id")
    private Comment comment;

    // TODO: Adicionar a entidade Chapter quando estiver disponível
    //private Chapter chapter;

    @Column(name = "like_count", nullable = false)
    private Integer likeCount; 

    // ✦•······················• ATTRIBUTES - END •······················•✦ //
}
