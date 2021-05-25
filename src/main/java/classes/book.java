package classes;

public class book {

    public String name;
    public Boolean banned;
    public String language;
    public String genre;

    public book(String name, Boolean banned, String language, String genre) {
        this.name = name;
        this.banned = banned;
        this.language = language;
        this.genre = genre;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getName() {
        return this.name;
    }

    public Boolean getBanned() {
        return this.banned;
    }

    public void setBanned(Boolean newStatus) {
        this.banned = newStatus;
    }

    public String getlanguage() {
        return this.language;
    }

    public void setlanguage(String newLang) {
        //should check against language data for valadation. Needs handle method.
        this.language = newLang;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String newGenre) {
        //should check against language data for valadation. Needs handle method.
        this.genre = newGenre;
    }
}
