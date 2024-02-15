// ✦•······················• PACKAGE - START •······················•✦ //
package br.com.illusia.api.web.controller.v1;
// ✦•······················• PACKAGE - END •······················•✦ //

// ✦•······················• IMPORTS - START •······················•✦ //
import br.com.illusia.api.entity.user.service.IUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// ✦•······················• IMPORTS - END •······················•✦ //

/**
 * @author Giovane Neves
 * @since v1
 */
@RestController
@RequestMapping(path = "/api/v1")
public class UserController {

    // ✦•······················• ATTRIBUTES - START •······················•✦ //
    @Autowired
    IUserService userService;
    // ✦•······················• ATTRIBUTES - END •······················•✦ //
    // ✦•················•✦•···············•✦ //
    // CRUD PATTERN: POST - GET - PUT - DELETE //
    // ✦•················•✦•···············•✦ //

    @CrossOrigin(allowedHeaders = "*", origins = "*") /*WARN: Editar antes de enviar para produção*/
    @PostMapping(path = "/users/user", consumes = "application/json", produces = "application/json")
    public void saveUser(){

        //this.userService.saveUser();

    }
}
