// ✦•······················• PACKAGE - START •······················•✦ //
package br.com.illusia.api.entity.comment.model;
// ✦•······················• PACKAGE - END •······················•✦ //

// ✦•······················• IMPORTS - START •······················•✦ //
import br.com.illusia.api.infrastructure.model.PersistenceEntity;
import br.com.illusia.api.entity.like.model.Like;
import br.com.illusia.api.entity.user.model.User;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
// ✦•······················• IMPORTS - END •······················•✦ //

/**
 * Represents a comment made by a user.
 * 
 * @author Andesson Reis
 * @since v1
 */
@Entity
@Table(name = "comments")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment extends PersistenceEntity {

    // ✦•······················• ATTRIBUTES - START •······················•✦ //
    @Column(name = "content", nullable = false)
    private String content;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt; 

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "comment_replies",
            joinColumns = @JoinColumn(name = "comment_id"),
            inverseJoinColumns = @JoinColumn(name = "reply_id"))
    private List<Comment> replies;

    @OneToMany(mappedBy = "comment")
    private List<Like> likes;

    // ✦•······················• ATTRIBUTES - END •······················•✦ //
}
