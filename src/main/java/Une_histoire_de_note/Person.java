package Une_histoire_de_note;

import java.time.LocalDate;
import java.time.Instant;
import java.util.*;

class Person {
    protected int id;
    protected String nom;
    protected String prenom;
    protected LocalDate dateNaissance;
    protected String email;
    protected String telephone;

    public Person(int id, String nom, String prenom, LocalDate dateNaissance, String email, String telephone) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.email = email;
        this.telephone = telephone;
    }

    public int getId() {
        return id;
    }
}
