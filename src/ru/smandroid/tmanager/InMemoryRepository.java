package ru.smandroid.tmanager;

import java.util.ArrayList;
import java.util.List;

public class InMemoryRepository implements Repository {

    private List<Task> tasks;

    public InMemoryRepository() {
        tasks = new ArrayList<>();
    }

    @Override
    public void insert(Task task) {
        this.tasks.add(task);
    }

    @Override
    public boolean delete(Task task) {
        return this.tasks.remove(task);
    }

    @Override
    public boolean delete(int id) {
        if (id < size()) {
            this.tasks.remove(id);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int delete(RemoveCondition condition) {
        int res = 0;
        for (int i = 0; i < this.tasks.size(); i++) {
            if (condition.onRemove(this.tasks.get(i))) {
                this.tasks.remove(i);
                i--;
            }
        }
        return 0;
    }

    @Override
    public Task get(int id) {
        return this.tasks.get(id);
    }

    @Override
    public List<Task> getAll() {
        return this.tasks;
    }

    @Override
    public int size() {
        return this.tasks.size();
    }
}
