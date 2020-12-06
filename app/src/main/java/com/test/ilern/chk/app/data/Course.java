package com.test.ilern.chk.app.data;

import lombok.Data;

@Data
public class Course {

    String id;
    String name;
    String description;

    public Course(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Course() {
    }
}
