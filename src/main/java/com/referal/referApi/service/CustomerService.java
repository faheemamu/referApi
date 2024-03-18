// CustomerService.java
package com.referal.referApi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.base.Optional;
import com.referal.referApi.Model.Customer;
import com.referal.referApi.Model.ParentChildRelation;
import com.referal.referApi.Repository.CustomerRepository;
import com.referal.referApi.Repository.ParentChildRelationRepository;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private ParentChildRelationRepository relationRepository;

    public void addCustomers(Long parentId, List<Long> childIds) {
         java.util.Optional<Customer> parentOptional = customerRepository.findById(parentId);
        if (parentOptional.isPresent()) {
            Customer parent = parentOptional.get();
            for (Long childId : childIds) {
                java.util.Optional<Customer> childOptional = customerRepository.findById(childId);
                if (childOptional.isPresent()) {
                    Customer child = childOptional.get();
                    ParentChildRelation relation = new ParentChildRelation();
                    relation.setParent(parent);
                    relation.setChild(child);
                    relationRepository.save(relation);
                }
            }
        }
    }
}
