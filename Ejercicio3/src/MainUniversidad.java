public class MainUniversidad {
    public static void main(String[] args) {
        Universidad uni = new Universidad("UTN");

        Profesor p1 = new Profesor("PR01", "Ana Torres", "Matematica");
        Profesor p2 = new Profesor("PR02", "Luis Perez", "Programacion");
        Profesor p3 = new Profesor("PR03", "Maria Gomez", "Fisica");

        uni.agregarProfesor(p1);
        uni.agregarProfesor(p2);
        uni.agregarProfesor(p3);

        Curso c1 = new Curso("C001", "Algebra I");
        Curso c2 = new Curso("C002", "Programacion II");
        Curso c3 = new Curso("C003", "Fisica I");
        Curso c4 = new Curso("C004", "Estructuras de Datos");
        Curso c5 = new Curso("C005", "Electromagnetismo");

        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);

        uni.asignarProfesorACurso("C001", "PR01");
        uni.asignarProfesorACurso("C002", "PR02");
        uni.asignarProfesorACurso("C004", "PR02");
        uni.asignarProfesorACurso("C003", "PR03");
        uni.asignarProfesorACurso("C005", "PR03");

        uni.listarProfesores();
        uni.listarCursos();

        System.out.println("\nReasignando profesor de C004 a PR03...");
        uni.asignarProfesorACurso("C004", "PR03");

        System.out.println("\nEliminando curso C001...");
        uni.eliminarCurso("C001");

        System.out.println("\nEliminando profesor PR02...");
        uni.eliminarProfesor("PR02");

        uni.reporteCursosPorProfesor();
    }
}
