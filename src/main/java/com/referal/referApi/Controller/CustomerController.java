package com.referal.referApi.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.referal.referApi.service.CustomerService;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping("/{parentId}/add-children")
    public ResponseEntity<String> addChildrenToParent(
            @PathVariable Long parentId,
            @RequestBody List<Long> childIds) {
        customerService.addCustomers(parentId, childIds);
        return ResponseEntity.ok("Children added successfully to the parent.");
    }
}
