package com.techreturners.exercise004;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Exercise004 {
    private LocalDateTime datetime;

    public Exercise004(LocalDate date) {
        this.datetime = date.atStartOfDay();
          }

    public Exercise004(LocalDateTime datetime) {
            this.datetime = datetime;
              }
   
    public LocalDateTime getDateTime() {
       return datetime.plusSeconds(1000000000);
    }
}
