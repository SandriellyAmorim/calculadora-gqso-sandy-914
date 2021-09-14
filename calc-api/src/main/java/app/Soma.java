package app;

import io.jooby.annotations.*;
import io.jooby.exception.*;

@Path("/soma/{x}/{y}")
public class Soma {
    @GET
    public String funcaoSoma(@PathParam String x, @PathParam String y) {
        try {
            double somatorio = Double.parseDouble(x) + Double.parseDouble(y);

            return String.format("%.2f", somatorio);
        } catch (NumberFormatException nfe) {
            throw new BadRequestException(String.format("Um ou mais parâmetros são inválidos."));
        }
    }
}