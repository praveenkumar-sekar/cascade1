package com.Sample.Cascade.dto;

import com.Sample.Cascade.entity.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OderRequest {

    private Customer customer;

}
