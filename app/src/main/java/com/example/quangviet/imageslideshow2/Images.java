package com.example.quangviet.imageslideshow2;

/**
 * Created by HV on 2/2/2018.
 */

public class Images {
    int id;
    String description;

    public Images(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
