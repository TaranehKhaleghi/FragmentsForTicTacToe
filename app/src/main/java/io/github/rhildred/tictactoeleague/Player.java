package io.github.rhildred.tictactoeleague;

import java.util.HashMap;

public class Player extends HashMap<String, String> {
    @Override
    public String toString(){
        return this.get("name");
    }
}
