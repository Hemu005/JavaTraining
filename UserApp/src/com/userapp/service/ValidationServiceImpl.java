package com.userapp.service;

import com.userapp.exception.NameExistsException;
import com.userapp.exception.TooLongException;
import com.userapp.exception.TooShortException;

public class ValidationServiceImpl implements IValidationService {


    @Override
    public boolean validatePassword(String password) throws TooShortException, TooLongException {
        if (password.length()<6){
            throw new TooShortException("too short password");
        } else if (password.length()>15) {
            throw new TooLongException("too long password");
        }
        return true;
    }

    @Override
    public boolean validateUserName(String username) throws NameExistsException {
        String[] usernames={"Gowda","Hemu","Kushu","Nithi"};
        for (String uname:usernames) {
            if (uname.equals(username)) {
                throw new NameExistsException("Name already exists");
            }
        }
        return false;
    }
}
