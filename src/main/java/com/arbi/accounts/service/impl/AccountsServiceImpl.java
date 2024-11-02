package com.arbi.accounts.service.impl;

import com.arbi.accounts.dto.CustomerDto;
import com.arbi.accounts.repository.AccountsRepository;
import com.arbi.accounts.repository.CustomerRepository;
import com.arbi.accounts.service.IAccountsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AccountsServiceImpl implements IAccountsService {

    private AccountsRepository accountsRepository;
    private CustomerRepository customerRepository;

    @Override
    public void createAccount(CustomerDto customerDto) {
        //
    }
}
