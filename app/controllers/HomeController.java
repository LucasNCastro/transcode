package controllers;

import play.mvc.*;
import play.data.*;
import static play.data.Form.*;
import views.html.*;

import models.*;

/**
 * Manage a database of computers
 */
public class HomeController extends Controller {

    private final static Form<Conversion> userForm = new Form<Conversion>(Conversion.class);

    public static Result index(){
        return ok(index.render("Page d'accueil"));
    }

}
            
