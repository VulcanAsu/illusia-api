// ✦•······················• PACKAGE - START •······················•✦ //
package br.com.illusia.api.web.controller.v1;
// ✦•······················• PACKAGE - END •······················•✦ //

// ✦•······················• IMPORTS - START •······················•✦ //
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// ✦•······················• IMPORTS - END •······················•✦ //

/**
 * @author Giovane Neves
 * @since v1
 */
@RestController
@RequestMapping(path = "/api/v1")
public class CommentController {

    // ✦•················•✦•···············•✦ //
    // CRUD PATTERN: POST - GET - PUT - DELETE //
    // ✦•················•✦•···············•✦ //

    @PostMapping(path = "/comments/comment")
    public void createComment(/*Todo: Criar DTO para receber dados do comentário*/){

        // TODO: Adicionar lógica para salvar comentários

    }

    @GetMapping(path = "/comments")
    public void getAllComments(){

        // TODO: Adicionar lógica para listar todos os comentário

    }

    @PutMapping(path = "/comments/comment/{id}")
    public void updateCommentById(@PathVariable(name = "id") String id /*Todo: Criar DTO para receber dados do comentário*/){

        // TODO: Adicionar lógica para atuliazar comentários pelo ID

    }

    @DeleteMapping(path = "/comments/comment/{id}")
    public void deleteCommentById(@PathVariable(name = "id") String id){

        // TODO: Adicionar lógica para deletar comentário por ID

    }

}
