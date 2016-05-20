package controllers;

import forms.ConnectionForm;
import forms.RegistrationForm;
import models.User;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;

import java.util.Date;

/**
 * Created by Ramneek on 18/05/2016.
 */
public class AccountController extends Controller {

    // GET
    public static Result login(){
        Form<ConnectionForm> connectionForm = Form.form(ConnectionForm.class);
        return ok(views.html.account.login.render("Login", connectionForm));
    }

    // POST
    public static Result authenticate(){

        return ok(Form.form(ConnectionForm.class).bindFromRequest().toString());
    }

    // GET
    public static Result create(){

        Form<RegistrationForm> registrationForm = Form.form(RegistrationForm.class);
        return ok(views.html.account.create.render("Register", registrationForm));

    }

    // POST
    public static Result register(){
        Form<RegistrationForm> registrationForm = Form.form(RegistrationForm.class).bindFromRequest();

        if(registrationForm.hasErrors()){
            return badRequest(views.html.account.create.render("Errors", registrationForm));
        }else{
            session().clear();
            session("username", registrationForm.get().getUsername());
            User user = new User();
            user.setName(registrationForm.get().getUsername());
            user.setEmail(registrationForm.get().getEmail());
            user.setPassword(registrationForm.get().getPassword());
            user.setLastLogin(new Date());
            user.setCreatedOn(new Date());
            user.save();
            return redirect(
                    routes.HomeController.index()
            );
        }
    }

    // GET
    public static Result passwordForgotten(){
        return null;
    }

    // POST
    public static Result recoverPassword(){
        return null;
    }

}
