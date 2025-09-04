import Une_histoire_de_note.*;
import org.junit.jupiter.api.Test;
import java.time.Instant;
import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleGradeServiceTest {

    @Test
    public void testNoteExamen() {
        Enseignants prof = new Enseignants(1, "Prof", "Java", LocalDate.of(1980, 1, 1), "prof@mail", "0000", "Java");
        Cours prog2 = new Cours(1, "PROG2", 6, prof);
        Examen examen = new Examen(1, "Examen PROG2", prog2, Instant.now(), 2);


        tuteurs tuteur = new tuteurs(10, "Marie", "Dupont", LocalDate.of(1970, 1, 1), "tutor@mail", "1111", "Mère");
        étudiants etudiant = new étudiants(2, "Paul", "Durand", LocalDate.of(2000, 5, 5), "paul@mail", "2222", "G1", tuteur);

        // On dit que Paul a eu 12 au début
        Notes note = new Notes(etudiant, examen, 12, Instant.parse("2025-01-01T10:00:00Z"), "Initial");

        // Puis la note a été corrigée à 15
        note.update(15, Instant.parse("2025-02-01T10:00:00Z"), "Correction");

    }
}