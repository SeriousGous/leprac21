package com.company;

public class Factory implements ChairFactory {
    @Override
    public VictorianChair createVictorianChair() {
        return new VictorianChair();
    }
    @Override
    public MultifunctionalChair createMultifunctionalChair() {
        return new MultifunctionalChair();
    }
    @Override
    public MagicChair createMagicChair() {
        return new MagicChair();
    }
}