package com.beyzakurt.dto;

import com.beyzakurt.entities.Room;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DtoHome {

    private Long id;
    private BigDecimal price;
    private List<Room> room;

}
