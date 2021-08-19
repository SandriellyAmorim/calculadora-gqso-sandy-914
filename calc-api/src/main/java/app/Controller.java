package app;

import io.jooby.annotations.*;

@Path("/")
public class Controller {

  @GET
  public String bemVindos() {
    return "Bem-vindos a API de uma Calculadora!";
  }
}
