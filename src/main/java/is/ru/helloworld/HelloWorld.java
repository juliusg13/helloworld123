package is.ru.helloworld;

import static spark.Spark.*;
import spark.*;

public class HelloWorld {
    public static void main(String[] args) {
        staticFileLocation("/public");
        
        setPort(Integer.valueOf(System.getenv("PORT")));

        post(new Route("/add") {
            @Override
            public Object handle(Request request, Response response) {
                Integer a = Integer.valueOf(request.queryParams("a"));
                Integer b = Integer.valueOf(request.queryParams("b"));
                return a + b;
            }
	post(new Route("/add") {
	public Object handle(Request request, Response response) {
		Integer a = Integer.valueOf(request.queryParams("location"));
		return location;
        });
    }
}

