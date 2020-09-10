package com.example.my_project;

public class Chat {
    private String name;
    private String theme;
    private String field;

    public Chat(String name, String theme, String field) {
        this.name = name;
        this.theme = theme;
        this.field = field;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getThemes() {
        return this.theme;
    }

    public void setThemes(String theme) {
        this.theme = theme;
    }
    public String getFields() {
        return this.field;
    }

    public void setFields(String field) {
        this.field = field;
    }

}

