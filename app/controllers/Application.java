package controllers;

import play.mvc.*;
import play.data.*;
import static play.data.Form.*;

import views.html.*;

import models.*;

/**
 * Manage a database of computers
 */
public class Application extends Controller {
    
    /**
     * This result directly redirect to application home.
     */
    /*public static Result GO_HOME = redirect(
        routes.Application.list(0, "name", "asc", "")
    );*/
    
    /**
     * Handle default path requests, redirect to computers list
     */
    public static Result index() {
        return ok("Hello");
    }

}
            
