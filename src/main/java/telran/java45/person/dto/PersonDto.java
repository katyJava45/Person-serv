package telran.java45.person.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat;

import lombok.Getter;

@Getter
@JsonTypeInfo(use = Id.NAME, include = As.PROPERTY, property = "type", defaultImpl = PersonDto.class)
@JsonSubTypes({@JsonSubTypes.Type(value = ChildDto.class, name = "ChildDto"),
	@JsonSubTypes.Type(value = EmployeeDto.class, name = "EmployeeDto")
})
public class PersonDto {

    Integer id;
    String name;
    LocalDate birthDate;
    AddressDto address; 
}
