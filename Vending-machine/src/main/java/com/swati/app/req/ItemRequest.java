package com.swati.app.req;

import lombok.Data;

@Data
public class ItemRequest {
    private Integer id ;
    private String type;
    private Integer price;
    private String name;
    private Integer count;
}
