package com.kodilla.stream.portfolio;

import java.util.ArrayList;
import java.util.List;

public final class Board {

    private final List<TaskList> taskLists = new ArrayList<>();
    private final String name;

    public Board(final String name) {
        this.name = name;
    }
}
