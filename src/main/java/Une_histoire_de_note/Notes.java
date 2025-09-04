package Une_histoire_de_note;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Notes {
    private double value;
    private Instant date;
    private String reason;

    public Notes(double value, Instant date, String reason) {
        this.value = value;
        this.date = date;
        this.reason = reason;
    }

    public double getValue() {
        return value;
    }

    public Instant getDate() {
        return date;
    }
}

class NoteActuelle {
    private étudiants élèves;
    private Examen examen;
    private List<Notes> history = new ArrayList<>();

    public NoteActuelle(étudiants élèves, Examen exam, double initialValue, Instant date, String reason) {
        this.élèves = élèves;
        this.examen = examen;
        history.add(new Notes(initialValue, date, reason));
    }

    public void miseàjour(double nouveauValeur, Instant date, String reason) {
        history.add(new Notes(nouveauValeur, date, reason));
    }

    public Examen getExamen() {
        return examen;
    }

    public étudiants getStudent() {
        return élèves;
    }
}
