package controllers;

import forms.ConnectionForm;
import forms.RegistrationForm;
import models.Account;
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
    public Result login(){
        Form<ConnectionForm> connectionForm = Form.form(ConnectionForm.class);
        return ok(views.html.account.login.render("Login", connectionForm));
    }

    // POST
    public Result authenticate(){

        return ok(Form.form(ConnectionForm.class).bindFromRequest().toString());
    }

    // GET
    public Result create(){

        Form<RegistrationForm> registrationForm = Form.form(RegistrationForm.class);
        return ok(views.html.account.create.render("Register", registrationForm));

    }

    // POST
    public Result register(){
        Form<RegistrationForm> registrationForm = Form.form(RegistrationForm.class).bindFromRequest();

        if(registrationForm.hasErrors()){
            return badRequest(views.html.account.create.render("Errors", registrationForm));
        }else{
            session().clear();
            session("username", registrationForm.get().getUsername());
            Account account = new Account();
            account.setName(registrationForm.get().getUsername());
            account.setEmail(registrationForm.get().getEmail());
            account.setPassword(registrationForm.get().getPassword());
            account.setLastLogin(new Date());
            account.setCreatedOn(new Date());
            account.save();
            return redirect(
                    routes.HomeController.index()
            );
        }
    }

    // GET
    public Result passwordForgotten(){
        return null;
    }

    // POST
    public Result recoverPassword(){
        return null;
    }

}