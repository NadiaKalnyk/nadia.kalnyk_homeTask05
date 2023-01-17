/*https://petstore3.swagger.io/#/*/

package ua.hillel.homeTask_20.entities;

import lombok.*;

import java.util.HashMap;
import java.util.Map;

@Data
public class Store {

    private Integer id;
    private Integer petId;
    private Integer quantity;
    private String shipDate;
    private String status;
    private Boolean complete;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

}