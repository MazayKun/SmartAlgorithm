package ru.mikheev.kirill.creatures;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public enum CommandType {
    MOVE,
    GRAB,
    WAIT,
    EXPLORE;

    private static final List<CommandType> VALUES = List.copyOf(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();

    public boolean isExplore(){
        return this == EXPLORE;
    }

    public static CommandType getRandomCommandType(boolean ableToIf){
        Random rnd = new Random();
        if(ableToIf){
            return VALUES.get(rnd.nextInt(SIZE));
        }else{
            return VALUES.get(rnd.nextInt(SIZE - 1));
        }
    }
}
