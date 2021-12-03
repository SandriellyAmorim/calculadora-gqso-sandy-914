package app;

import io.jooby.annotations.*;
import io.jooby.exception.*;

@Path("/soma/{x}/{y}")
public class Soma {
    @GET
    public String funcaoSoma(@PathParam String x, @PathParam String y) throws BadRequestException {
        try {
            double somatorio = soma(x,y);

            return String.format("%.2f", somatorio);
        } catch (IllegalArgumentException iae) {
            throw new BadRequestException(iae.getMessage());
        }
    }

    public double soma(String a, String b) throws IllegalArgumentException {
        double somatorio;
        
        try {
            somatorio = Double.parseDouble(a) + Double.parseDouble(b);
        } catch (NumberFormatException nfe) {
            throw new IllegalArgumentException(String.format("Um ou mais parâmetros são inválidos."));
        }

        return somatorio;
    }
}