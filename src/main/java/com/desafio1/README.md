# Desafío 1: Gestión de Reportes 📊

## Descripción

Una empresa necesita generar reportes en diferentes formatos:

- PDF
- Excel
- CSV

Cada reporte debe permitir:

- Generar el reporte (`generateReport()`)
- Descargar el reporte (`downloadReport()`)

## Tareas

- Implementa el patrón Abstract Factory para generar reportes en diferentes formatos.
- Crea una fábrica concreta para cada tipo de reporte.
- El código cliente debe solicitar un formato y recibir el reporte adecuado.

## Clases e Interfaces

### Interfaz `Report`

```java
public interface Report {
    void generateReport();
    void downloadReport();
}
```

## Uso

Para ejecutar el programa, sigue estos pasos:

1. Compila el proyecto.
2. Ejecuta la clase `Main`.
3. Selecciona el tipo de reporte que deseas generar ingresando el número correspondiente (1 para PDF, 2 para Excel, 3 para CSV).



