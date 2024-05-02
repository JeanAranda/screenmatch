package com.aluracursos.screenmatch.exception;

public class ErrorEnConversionDeDuracionDeException extends RuntimeException {
    private String mensaje;

    public ErrorEnConversionDeDuracionDeException(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMessage() {
        return this.mensaje;
    }
}
