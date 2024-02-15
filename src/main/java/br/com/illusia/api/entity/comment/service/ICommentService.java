// ✦•······················• PACKAGE - START •······················•✦ //
package br.com.illusia.api.entity.comment.service;
// ✦•······················• PACKAGE - END •······················•✦ //

// ✦•······················• IMPORTS - START •······················•✦ //
import br.com.illusia.api.entity.comment.model.Comment;

// ✦•······················• IMPORTS - END •······················•✦ //
public interface ICommentService {
    
    void saveComment(Comment comment);
}
