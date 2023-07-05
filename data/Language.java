package data;

public enum Language {
    UK("uk"),
    RU("ru");


    private String lang;

    Language(String lang) {
        this.lang = lang;
    }

    public String getLang() {
        return lang;
    }
}

