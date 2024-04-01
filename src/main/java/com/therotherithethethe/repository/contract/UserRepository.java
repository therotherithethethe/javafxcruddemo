package com.therotherithethethe.repository.contract;

import com.therotherithethethe.persistance.User;
import com.therotherithethethe.repository.Repository;
import java.util.Date;
import java.util.Optional;
import java.util.Set;

public interface UserRepository extends Repository<User> {

    Set<User> findByFirstName(String firstName);
    Set<User> findByLastName(String lastName);
    Set<User> findByEmail(String email);
    Set<User> findByPhoneNumber(String phoneNumber);
    Set<User> findByDateOfBirth(Date dateOfBirth);
    Set<User> findByAddress(String address);
    Set<User> findByUsername(String username);

}
