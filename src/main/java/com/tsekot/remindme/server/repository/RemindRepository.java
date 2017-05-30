package com.tsekot.remindme.server.repository;

import com.tsekot.remindme.server.entity.Remind;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RemindRepository  extends JpaRepository<Remind,Long>{
}
