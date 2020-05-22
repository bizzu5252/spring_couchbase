package com.octacore.chbaselearning.repositories;

import com.octacore.chbaselearning.models.Employee;
import org.springframework.data.couchbase.repository.CouchbaseRepository;


public interface EmployeeRepository extends CouchbaseRepository<Employee, String> {
}
