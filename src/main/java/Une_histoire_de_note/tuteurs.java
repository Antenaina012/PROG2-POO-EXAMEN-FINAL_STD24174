package Une_histoire_de_note;

public class tuteurs {
    private int id;
    private String Nom;
    private String Prénom;
    private String DateDeNaissance;
    private String Email;
    private String NuméroDeTéléphone;
    private String Description;

    public tuteurs(int id, String nom, String prénom, String dateDeNaissance, String email, String numéroDeTéléphone, String description) {
        this.id = id;
        Nom = nom;
        Prénom = prénom;
        DateDeNaissance = dateDeNaissance;
        Email = email;
        NuméroDeTéléphone = numéroDeTéléphone;
        Description = description;
    }
}
