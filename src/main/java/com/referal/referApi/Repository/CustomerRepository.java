package com.referal.referApi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//import com.referal.referApi.Model.Cstmer;
import com.referal.referApi.Model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
