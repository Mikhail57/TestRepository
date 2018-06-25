package ru.smandroid.tmanager;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Repository repository = new InMemoryRepository();
        repository.insert(new Task("Первая задача", new Date()));
        repository.insert(new Task("Вторая задача", new Date()));
        repository.insert(new Task("Третья задача", new Date(), true));
        System.out.println(repository.get(0));
        System.out.println("Размер: " + repository.size());
        repository.delete(new RemoveCondition() {
            @Override
            public boolean onRemove(Task task) {
                return task.isDone();
            }
        });
        System.out.println("Размер после удаления: " + repository.size());
    }
}
