package com.kodilla.patterns.factory.tasks;

import java.util.HashMap;
import java.util.Map;

public final class TaskFactory {

    public static final String DRIVING_TASK = "DRIVING TASK";
    public static final String SHOPPING_TASK = "SHOPPING TASK";
    public static final String PAINTING_TASK = "PAINTING TASK";

    private final Map<Task, Boolean> tasksMap = new HashMap<>();

    public final Task createTask(final String taskClass) {
        return switch (taskClass) {
            case DRIVING_TASK -> new DrivingTask("Driving", "Gdansk", "Audi");
            case SHOPPING_TASK -> new ShoppingTask("Buy", "Juice", 2);
            case PAINTING_TASK -> new PaintingTask("Paint", "blue", "image");
            default -> null;
        };
    }
}
