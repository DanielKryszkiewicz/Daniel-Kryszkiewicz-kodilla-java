package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {

    String taskName;
    String color;
    String whatToPaint;
    boolean execute;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public void executeTask() {
        System.out.println("Painting task executed");
        execute = true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return execute;
    }

}
