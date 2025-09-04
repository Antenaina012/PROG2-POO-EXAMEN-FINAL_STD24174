package Une_histoire_de_note;

import java.time.LocalDate;

class étudiants extends Person {
    private String groupe;
    private tuteurs tuteur;

    public étudiants(int id, String nom, String prenom, LocalDate dateNaissance, String email, String telephone,
                     String groupe, tuteurs tuteur) {
        super(id, nom, prenom, dateNaissance, email, telephone);
        this.groupe = groupe;
        this.tuteur = tuteur;
    }
}
