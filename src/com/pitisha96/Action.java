package com.pitisha96;


/**
 * Описывает действия программы
 * @author Илья Петровский
 * @since 20.12.2020
 */
public interface Action {
    /**
     * выполнить действия
     * @param clinic  Клиника
     * @param validator Валидатор ввода
     */
    void execute(final ClinicUI clinic, final Validator validator);

    /**
     * Описание действий
     * @return Описание
     */
    String intro();

    /**
     * Ключ
     * @return Ключ
     */
    int key();
}
