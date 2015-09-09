package controllers;

import java.util.Arrays;
import java.util.Date;

import models.Task;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }

    public static Result tasks() {
    	Task task = new Task();
    	task.name = "Pizzaを食べる";
    	task.period = new Date();
    	task.save();

    	List<String> taskList = Arrays.asList("foo", "bar", "baz");
        return ok(tasks.render(taskList));

    }

}
