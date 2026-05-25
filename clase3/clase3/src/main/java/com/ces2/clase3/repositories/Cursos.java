package com.ces2.clase3.repositories;

import com.ces2.clase3.models.Curso;
import com.ces2.clase3.models.Estudiante;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cursos {
    public static List<Curso> lista = new ArrayList<>();
    static {
        lista.add(new Curso("matematicas", "mat01", Arrays.asList(
                new Estudiante("ana ruiz", 20, 4.5),
                new Estudiante("juan castañeda", 22, 3.8))));

        lista.add(new Curso("programacion I", "pr01", Arrays.asList(
                new Estudiante("luis garcia", 19, 4.8),
                new Estudiante("marta sosa", 21, 4.2),
                new Estudiante("pedro nel", 25, 3.5))));

        lista.add(new Curso("fisica", "fi01", Arrays.asList(
                new Estudiante("carlos paez", 23, 3.9),
                new Estudiante("sofia vergara", 20, 4.1),
                new Estudiante("carlos gil", 22, 2.8),
                new Estudiante("diana rico", 19, 4.9))));

        lista.add(new Curso("bases de datos", "bd01", Arrays.asList(
                new Estudiante("oscar mora", 21, 3.2),
                new Estudiante("paula cano", 24, 4.0))));

        lista.add(new Curso("sistemas operativos", "so01", Arrays.asList(new Estudiante("ricardo jorge", 26, 3.7))));
        lista.add(new Curso("etica", "eti01", new ArrayList<>()));
        lista.add(new Curso("catedra ", "cat01", new ArrayList<>()));
        lista.add(new Curso("deportes", "depr01", new ArrayList<>()));
        lista.add(new Curso("inglés ", "ing01", new ArrayList<>()));
        lista.add(new Curso("proyecto de grado", "py01", new ArrayList<>()));
        lista.add(new Curso("calculo diferencial", "cd01", Arrays.asList(new Estudiante("kevin diaz", 19, 3.5))));
        lista.add(new Curso("algebra lineal", "al01", Arrays.asList(new Estudiante("laura restrepo", 20, 4.4))));
        lista.add(new Curso("redes 1", "redes01", Arrays.asList(new Estudiante("esteban quito", 22, 3.1))));
        lista.add(new Curso("arquitectura", "arq01", new ArrayList<>()));
        lista.add(new Curso("logica de programacion", "dpas01", Arrays.asList(new Estudiante("felipe marin", 18, 5.0))));
        lista.add(new Curso("bibliografias", "biblio01", new ArrayList<>()));
        lista.add(new Curso("desarrollo movil", "dm01", Arrays.asList(new Estudiante("santiago arias", 23, 4.2))));
        lista.add(new Curso("inteligencia artificial", "ia01", new ArrayList<>()));
        lista.add(new Curso("seguridad informática", "si01", Arrays.asList(new Estudiante("valentina lopera", 21, 3.9))));
        lista.add(new Curso("calidad de software", "garantizar02", new ArrayList<>()));
        lista.add(new Curso("emprendimiento", "empr01", Arrays.asList(new Estudiante("mateo holguin", 25, 4.6))));
    }
}