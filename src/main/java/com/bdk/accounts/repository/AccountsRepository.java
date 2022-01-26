package com.bdk.accounts.repository;

import com.bdk.accounts.model.Accounts;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountsRepository extends CrudRepository <Accounts,Long>{
    Accounts findByCustomerId(int customerId);

}
