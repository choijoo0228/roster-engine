package com.smartshift.rosterengine;

import java.time.Duration;
import java.time.LocalTime;

public class ShiftTimeValidator {

    public boolean isValidShiftTime(LocalTime start, LocalTime end) {
        return start.isBefore(end);
    }

    public long getShiftDurationHours(LocalTime start, LocalTime end) {
        return Duration.between(start, end).toHours();
    }
}
