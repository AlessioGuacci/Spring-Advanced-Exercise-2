package com.develope.advanced2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Month {
    private int monthNumber;
    private String englishName;
    private String italianName;
    private String germanName;
}
