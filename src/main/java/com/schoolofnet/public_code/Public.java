package com.schoolofnet.public_code;

import com.schoolofnet.Info;

@Info(createdBy = "Wesley")
public class Public {

    public Public() {
        System.out.print("Public class");
    }

    @Override
    public String toString() {
        return "Public class toString()";
    }
}
