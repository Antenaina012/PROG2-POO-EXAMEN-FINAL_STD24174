package Une_histoire_de_note;

import java.time.LocalDate;

class Enseignants extends Person {
    private String specialite;

    public Enseignants(int id, String nom, String prenom, LocalDate dateNaissance, String email, String telephone,
                       String specialite) {
        super(id, nom, prenom, dateNaissance, email, telephone);
        this.specialite = specialite;
    }
}
