package ss16_io_text_file.exrcise.doc_file_csv;

public class Country {
    private int id;
    private String acronymOfCountry;
    private String nameCountry;

    public Country() {
    }

    public Country(int id, String acronymOfCountry, String nameCountry) {
        this.id = id;
        this.acronymOfCountry = acronymOfCountry;
        this.nameCountry = nameCountry;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAcronymOfCountry() {
        return acronymOfCountry;
    }

    public void setAcronymOfCountry(String acronymOfCountry) {
        this.acronymOfCountry = acronymOfCountry;
    }

    public String getNameCountry() {
        return nameCountry;
    }

    public void setNameCountry(String nameCountry) {
        this.nameCountry = nameCountry;
    }

    @Override
    public String toString() {
        return id + "," + acronymOfCountry + "," + nameCountry;
    }
}
