package Une_histoire_de_note;

import java.time.LocalDate;

public class tuteurs extends Person {
    private String lien;

    public tuteurs(int id, String nom, String prenom, LocalDate dateNaissance, String email, String telephone,
                   String lien) {
        super(id, nom, prenom, dateNaissance, email, telephone);
        this.lien = lien;
    }
}
