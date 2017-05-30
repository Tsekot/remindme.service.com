package com.tsekot.remindme.server.services;

import com.tsekot.remindme.server.entity.Remind;

import java.util.List;

public interface ReminderService {
    List<Remind> getAll();
    Remind getById(long id);
    Remind save(Remind remind);
    void remove(long id);

}
