package com.empresa.mi_proyecto_pruebas;

public class MiProyecto {
    
    private String estado = "activo";
    
    public String getEstado() {
        return estado;
    }
    
    public String procesarDatos(String entrada) {
        if (entrada == null || entrada.trim().isEmpty()) {
            return "Error: Entrada vacía";
        }
        return "Datos '" + entrada + "' procesados correctamente";
    }
    
    public String saludar(String nombre) {
        return "Hola, " + nombre + "!";
    }
    
    // Método adicional para tests de integración
    public boolean validarConfiguracion() {
        // Simular validación de configuración del sistema
        return estado.equals("activo");
    }
}