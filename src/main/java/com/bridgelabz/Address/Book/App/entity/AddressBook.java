package com.bridgelabz.Address.Book.App.entity;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Layer that contains entities in  database
 * @author - Sheetal Panda
 * @version - 0.0.1
 * @since - 12/10/2021
 */
@Entity
@Data
public class AddressBook {
    @Id
    private String name;
    private String address;

}
