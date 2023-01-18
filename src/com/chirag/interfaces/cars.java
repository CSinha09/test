package com.chirag.interfaces;

public class cars implements engine, brakes, media {
    @Override
    public void brake() {
        System.out.println("using brakes");
    }

    @Override
    public void start() {
        System.out.println("Starting engine");
    }

    @Override
    public void stop() {
        System.out.println("Stops engine");
    }

    @Override
    public void acc() {
        System.out.println("using accelerator");
    }
}
