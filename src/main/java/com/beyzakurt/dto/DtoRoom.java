package com.beyzakurt.dto;

import com.beyzakurt.entities.Room;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DtoRoom extends Room {

    private Long id;
    private String name;
}
