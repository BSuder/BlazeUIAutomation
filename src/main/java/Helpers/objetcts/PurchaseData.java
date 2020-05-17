package Helpers.objetcts;

import lombok.Data;

@Data
public class PurchaseData {

    String firstName;
    String lastName;
    String city;
    String state;
    String zipCode;
    String cardType;
    Long cardNumber;
    Integer month;
    Integer year;
    String nameOnCard;

}
