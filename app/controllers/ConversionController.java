package controllers;

import models.Conversion;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;

/**
 * Created by Ramneek on 14/05/2016.
 */
public class ConversionController extends Controller {
    private final static Form<Conversion> userForm = new Form<Conversion>(Conversion.class);

    public static Result Convert(){
        return ok(request().method());
    }

}
