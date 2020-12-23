package com.pitisha96;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Интерфейс клиники
 * @author Илья Петровский
 * @since 23.12.2020
 */
public class SingleClinicUI implements ClinicUI{
    private final IClinic clinic;
    private final Validator validator;
    private final Map<Integer,Action> actions=new ConcurrentHashMap<>();

    /**
     * Конструктор интерфейса клиники
     * @param clinic клиника
     * @param validator валидатор ввода
     */
    public SingleClinicUI(IClinic clinic,Validator validator){
        this.clinic=clinic;
        this.validator=validator;
    }

    /**
     * Запрос операции и ее выполнение
     * @param validator валидатор ввода
     */
    public void doAction(Validator validator){
        this.actions.get(
            validator.getIntFromList("Введите номер операции: ",
                    actions.keySet())
        ).execute(this.clinic,validator);
    }

    /**
     * {@inheritDoc}
     * @param action новое действие
     */
    @Override
    public void loadActions(Action action) {
        this.actions.put(action.key(),action);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void show() {
        this.actions.values().forEach(a-> System.out.print(a.intro()));
    }
}
