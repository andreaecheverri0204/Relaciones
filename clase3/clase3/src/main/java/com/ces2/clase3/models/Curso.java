package com.ces2.clase3.models;

import java.util.List;

public class Curso {
    private String nombreCurso;
    private String codigo;
    private List<Estudiante> estudiantes;

    public Curso(String nombreCurso, String codigo, List<Estudiante> estudiantes) {
        this.nombreCurso = nombreCurso;
        this.codigo = codigo;
        this.estudiantes = estudiantes;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }
    public String getCodigo() {
        return codigo;
    }
    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }
}
