package com.pitisha96;

/**
 * Создание клиента
 * @author Илья Петровский
 * @since 23.12.2020
 */
public class CreateClientAction implements Action{

    /**
     * {@inheritDoc}
     * @param clinic  Клиника
     * @param validator Валидатор ввода
     */
    @Override
    public void execute(IClinic clinic, Validator validator) {
        final String name=validator.getString("Введите имя пользователя: ");
        final Client client=new Client(name);
        clinic.addClient(client);
    }

    /**
     * {@inheritDoc}
     * @return пункт меню
     */
    @Override
    public String intro() {
        return String.format("%s-создание клиента",this.key());
    }

    /**
     * {@inheritDoc}
     * @return ключ операции
     */
    @Override
    public int key() {
        return 1;
    }
}
