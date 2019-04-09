package com.squeed.jokeapp.cli;

import java.lang.module.ModuleDescriptor;
import java.lang.module.ModuleFinder;
import java.lang.module.ModuleReference;
import java.util.Optional;
import java.util.Set;
import java.util.logging.Logger;

public class JokeApp {
    private final static Logger LOGGER = Logger.getLogger(JokeApp.class.getName());
    public static void main(String[] args){
        System.out.println("JokeApp Analytics");
        Optional<ModuleReference> ref = ModuleFinder.ofSystem().find("java.base");

        if (ref.isPresent()){
            Set<ModuleDescriptor.Exports> providesSet = ref.get().descriptor().exports();
            for (final ModuleDescriptor.Exports provides1 : providesSet){
                System.out.println("The module exports " + provides1.source());
            }
        }

        ModuleLayer.boot().modules().stream().forEach(m -> System.out.println(m.getName()));
    }
}
