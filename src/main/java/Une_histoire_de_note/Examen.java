package Une_histoire_de_note;

import java.time.Instant;

class Examen {
    private int id;
    private String titre;
    private Cours course;
    private Instant date;
    private int coefficient;

    public Examen(int id, String titre, Cours course, Instant date, int coefficient) {
        this.id = id;
        this.titre = titre;
        this.course = course;
        this.date = date;
        this.coefficient = coefficient;
    }

    public int getCoefficient() {
        return coefficient;
    }

    public Cours getCourse() {
        return course;
    }

    public int getId() {
        return id;
    }
}
