package com.example;

import java.util.List;

public class AlexLion extends Lion{

    public AlexLion(Feline feline) throws Exception {
        super("Самец", feline);
    }

    public List<String> getFriends(){
        return List.of("Марти", "Глория", "Мелман");
    }

    public String getPlaceOfLiving(){
        return "Зоопарк Нью-Йорка";
    }

    @Override
    public int getKittens(){
        return 0;
    }
}
