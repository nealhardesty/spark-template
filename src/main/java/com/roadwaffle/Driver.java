package com.roadwaffle;

import static spark.Spark.*;

import spark.*;

public class Driver {

   public static void main(String[] args) {

      get(new Route("/") {
         @Override
         public Object handle(Request request, Response response) {
            return "Hello World!";
         }
      });

   }

}
