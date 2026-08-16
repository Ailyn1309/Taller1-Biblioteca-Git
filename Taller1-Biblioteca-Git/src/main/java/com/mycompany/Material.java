package com.mycompany;

public class Material {
    private String code;
    private String title;
    private String yearpub;

    public Material(String code, String title, String yearpub) {
        this.code = code;
        this.title = title;
        this.yearpub = yearpub;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYearpub() {
        return yearpub;
    }

    public void setYearpub(String yearpub) {
        this.yearpub = yearpub;
    }

    @Override
    public String toString() {
        return "Material{" +
                "code='" + code + '\'' +
                ", title='" + title + '\'' +
                ", yearpub='" + yearpub + '\'' +
                '}';
    }
}
