package ru.smandroid.tmanager;

import java.util.List;

public interface Repository {
    // Вставка задачи в список задач
    void insert(Task task);
    // Удаление по самому объекту
    boolean delete(Task task);
    // Удаление по номеру объекта (его id)
    boolean delete(int id);
    // Удаление по какому-то условию
    int delete(RemoveCondition condition);
    // Получить задачу по номеру
    Task get(int id);
    // Получение всех задач
    List<Task> getAll();
    // Кол-во данных в задачнике
    int size();
}
