package com.tsekot.remindme.server.services;

import com.tsekot.remindme.server.entity.Remind;
import com.tsekot.remindme.server.repository.RemindRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReminderServiceImpl implements ReminderService {
    @Autowired
    private RemindRepository remindRepository;

    public List<Remind> getAll() {
        return remindRepository.findAll();
    }

    public Remind getById(long id) {
        return remindRepository.findOne(id);
    }

    public Remind save(Remind remind) {
        return remindRepository.saveAndFlush(remind);
    }

    public void remove(long id) {
        remindRepository.delete(id);
    }
}
