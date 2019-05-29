package com.example.demo.dao;

import com.example.demo.model.JobAndTrigger;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobAndTriggerMapper {

    List<JobAndTrigger> getJobAndTriggerDetails();
}
