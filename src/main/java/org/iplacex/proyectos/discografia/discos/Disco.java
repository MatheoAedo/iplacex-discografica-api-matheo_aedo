package org.iplacex.proyectos.discografia.discos;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Document(collection = "discos")
public class Disco {
    @Id
    public String id;
    public String idArtista;
    public String nombre;
    public int anioLanzamiento;
    public List<String> canciones;

    // Constructor vacío
    public Disco() {}

    // Constructor con parámetros
    public Disco(String idArtista, String nombre, int anioLanzamiento, List<String> canciones) {
        this.idArtista = idArtista;
        this.nombre = nombre;
        this.anioLanzamiento = anioLanzamiento;
        this.canciones = canciones;
    }

    // Getters y Setters (opcionales)
}