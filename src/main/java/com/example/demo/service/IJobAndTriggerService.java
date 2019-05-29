package com.example.demo.service;

import com.example.demo.model.JobAndTrigger;
import com.github.pagehelper.PageInfo;

public interface IJobAndTriggerService {
    PageInfo<JobAndTrigger> getJobAndTriggerDetails(Integer pageNum, Integer pageSize);
}
