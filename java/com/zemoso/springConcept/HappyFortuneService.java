package com.zemoso.springConcept;

public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "its a lucky day!";
    }
}
