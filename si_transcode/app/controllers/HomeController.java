package controllers;

import play.mvc.*;
import play.data.*;
import static play.data.Form.*;
import views.html.*;

import models.*;


public class HomeController extends Controller {


    public Result index(){
        return ok(index.render("Page d'accueil"));
    }

}

