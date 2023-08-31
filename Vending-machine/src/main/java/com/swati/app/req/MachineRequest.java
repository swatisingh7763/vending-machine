package com.swati.app.req;

import com.swati.app.models.Item;
import lombok.Data;

import java.util.List;
@Data
public class MachineRequest {
    private Integer id;
    private String name;
    private String availableCash;
    private List<Integer> itemList;
}
