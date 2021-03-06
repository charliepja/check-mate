package com.example.codeclan.CheckMate.models.enums;

import java.util.ArrayList;
import java.util.EnumMap;

public enum CheckAsk {
    ONE("I haven't heard from you in awhile, are you okay?"),
    TWO("I saw that something happened, how are you feeling?"),
    THREE("Your mood has changed, do you want to talk about it?"),
    FOUR("Just checking in with you."),
    FIVE("How are you feeling?"),
    SIX("Do you need to talk?"),
    SEVEN("Do you need help?"),
    EIGHT("Are you feeling overwhelmed?"),
    NINE("How are you feeling today?"),
    TEN("Do you want me to come over?");

    public final String check;

    CheckAsk(String check) {
        this.check = check;
    }

    public String getCheck() {
        return this.check;
    }

    public EnumMap<CheckAsk, String> getAllChecks() {
        EnumMap<CheckAsk, String> allChecks = new EnumMap<CheckAsk, String>(CheckAsk.class);
        for(CheckAsk check : CheckAsk.values()) {
            allChecks.put(check, check.check);
        }
        return allChecks;
    }
}
