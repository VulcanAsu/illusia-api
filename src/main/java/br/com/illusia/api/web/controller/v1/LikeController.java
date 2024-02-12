// ✦•······················• PACKAGE - START •······················•✦ //
package br.com.illusia.api.web.controller.v1;
// ✦•······················• PACKAGE - END •······················•✦ //

// ✦•······················• IMPORTS - START •······················•✦ //
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// ✦•······················• IMPORTS - END   •······················•✦ //

/**
 * @author Giovane Neves
 * @since v1
 */
@RestController
@RequestMapping(path = "/api/v1")
public class LikeController {

    // ✦•················•✦•···············•✦ //
    // CRUD PATTERN: POST - GET - PUT - DELETE //
    // ✦•················•✦•···············•✦ //

    @CrossOrigin(allowedHeaders = "*", origins = "*") /*WARN: Editar antes de enviar para produção*/
    @PostMapping(path = "/likes/like", consumes = "application/json", produces = "application/json")
    public void saveLike(/*TODO: Criar objeto DTO para Like*/){

        // TODO: Adicionar lógica para salvar comentários

    }

    @CrossOrigin(allowedHeaders = "*", origins = "*") /*WARN: Editar antes de enviar para produção*/
    @GetMapping(path = "/comments/comment/{id}/likes", produces = "application/json")
    public void getLikesByCommentId(@PathVariable(name = "id") String commentId){

        // TODO: Adicionar lógica para pegar likes do comentário.

    }

    @CrossOrigin(allowedHeaders = "*", origins = "*") /*WARN: Editar antes de enviar para produção*/
    @GetMapping(path = "/chapters/chapter/{id}/likes", produces = "application/json")
    public void getLikesByChapterId(@PathVariable(name = "id") String chapterId){

        // TODO: Adicionar lógica para pegar likes do capítulo.

    }

    @CrossOrigin(allowedHeaders = "*", origins = "*") /*WARN: Editar antes de enviar para produção*/
    @DeleteMapping(path = "/likes/like/{id}", produces = "application/json")
    public void deleteLikeById(@PathVariable(name = "id") String id){

        // TODO: Adicionar lógica para remover like pelo id.

    }

}
