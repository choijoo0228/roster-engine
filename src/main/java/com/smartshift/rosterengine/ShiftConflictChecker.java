package com.smartshift.rosterengine;

import java.time.LocalTime;

public class ShiftConflictChecker {
    public boolean hasOverLap(LocalTime newStart, LocalTime newEnd, LocalTime existingStart, LocalTime existingEnd) {
        return newStart.isBefore(existingEnd) && newEnd.isAfter(existingStart);

    }
}
