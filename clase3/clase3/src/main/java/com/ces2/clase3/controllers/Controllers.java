package com.ces2.clase3.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;
import com.ces2.clase3.models.Curso;
import com.ces2.clase3.models.Estudiante;
import com.ces2.clase3.repositories.Cursos;

@Controller
public class Controllers {

    // peticion 1 ej 15 clase1
    @GetMapping("peticion1")
    public String peticion1(Model model) {
        String salida2 = Cursos.lista.stream()
                .map(Curso::getNombreCurso)
                //.map(String::toUpperCase)
                .collect(Collectors.joining(", "));

        model.addAttribute("salida", salida2);
        return "vista1.html";
    }

    // peticion 2 ej 15 de la clase2
    @GetMapping("peticion2")
    public String peticion2(Model model) {
        DoubleSummaryStatistics estadisticas = Cursos.lista.stream()
                .flatMap(curso -> curso.getEstudiantes().stream())
                .collect(Collectors.summarizingDouble(Estudiante::getPromedio));

        model.addAttribute("conteo", estadisticas.getCount());
        model.addAttribute("sumatotal", estadisticas.getSum());
        model.addAttribute("promedio", estadisticas.getAverage());
        model.addAttribute("min", estadisticas.getMin());
        model.addAttribute("max", estadisticas.getMax());
        return "vista2";
    }

    // peticion 3 ej 18 de la clase2
    @GetMapping("peticion3")
    public String peticion3(Model model) {
        List<Estudiante> todosLosEstudiantes = Cursos.lista.stream()
                .flatMap(curso -> curso.getEstudiantes().stream())
                .toList();

        List<String> nombresEstudiantes = todosLosEstudiantes.stream()
                .map(Estudiante::getNombre)
                .toList();

        model.addAttribute("nombresEstudiantes", nombresEstudiantes);
        return "vista3";
    }

    //peticion4 ej 19y20 de la clase2

    @GetMapping("peticion4")
    public String peticion4(Model model) {
        Boolean sincorreos = Cursos.lista.stream()
                .anyMatch(curso -> curso.getEstudiantes().isEmpty());

        Boolean masdedos = Cursos.lista.stream()
                .anyMatch(curso -> curso.getEstudiantes().size() > 1);

        Boolean cincoomas = Cursos.lista.stream()
                .noneMatch(curso -> curso.getEstudiantes().size() > 3);

        model.addAttribute("sincorreos", sincorreos);
        model.addAttribute("masdedos", masdedos);
        model.addAttribute("cincoomas", cincoomas);

        return "vista4";
    }

    //peticion 5 ej 18 de la clase2
    @GetMapping("peticion5")
    public String peticion5(Model model) {
        List<Estudiante> listaEstudiantes = Cursos.lista.stream()
                .flatMap(curso -> curso.getEstudiantes().stream())
                .toList();

        Estudiante mejorEstudiante = listaEstudiantes.stream()
                .max(Comparator.comparingDouble(Estudiante::getPromedio))
                .orElse(null);

        model.addAttribute("mejorEstudiante", mejorEstudiante);
        return "vista5";
    }
}