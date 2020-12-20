package com.pitisha96;

/**
 * Класс собаки
 * @author Илья Петровский
 * @since 20.12.2020
 */
public class Dog implements Pet{
    /**
     * Имя питомца
     */
    private String name;

    /**
     * Задать имя при созданиии экземпляра собаки
     * @param name Новое имя собаки
     */
    public Dog(final String name){
        this.name=name;
    }

    /**
     * {@inheritDoc}
     * @param name Новое имя питомца
     */
    @Override
    public void setName(final String name){
        this.name=name;
    }

    /**
     * {@inheritDoc}
     * @return Имя питомца
     */
    @Override
    public String getName(){
        return this.name;
    }


}
