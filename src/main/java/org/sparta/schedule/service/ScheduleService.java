package org.sparta.schedule.service;

import lombok.RequiredArgsConstructor;
import org.sparta.schedule.dto.ScheduleAddDto;
import org.sparta.schedule.dto.ScheduleResDto;
import org.sparta.schedule.entity.Schedule;
import org.sparta.schedule.repository.ScheduleRepository;
import org.sparta.schedule.utils.mapper.MapperUtil;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ScheduleService {
    private final ScheduleRepository scheduleRepository;

    public ScheduleResDto createSchedule(ScheduleAddDto addDto) {
        Schedule schedule = MapperUtil.toEntity(addDto, Schedule.class);
        return new ScheduleResDto(
                scheduleRepository.save(schedule)
        );
    }
}
