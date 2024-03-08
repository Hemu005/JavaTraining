package com.voterapp.service;

import com.voterapp.exception.InvalidVoterIDException;
import com.voterapp.exception.LocalityNotFoundException;
import com.voterapp.exception.NotEligibleException;
import com.voterapp.exception.UnderAgeException;

public class ElectionBoothServiceImpl implements IElectionBoothService {
    @Override
    public boolean checkEligibility(int age, String locality, int vid) throws NotEligibleException{
        try {
            if (!checkAge(age))
                throw new UnderAgeException();
            if (!checkLocality(locality))
                throw new LocalityNotFoundException();
            if (!checkVoterId(vid))
                throw new InvalidVoterIDException();
        }catch (UnderAgeException | LocalityNotFoundException |InvalidVoterIDException e){
            throw new NotEligibleException(e.getMessage());
        }
        return true;
    }

    private boolean checkAge(int age) throws UnderAgeException {
        if (age < 18) {
            throw new UnderAgeException("Age should be more than 18");
        } else
            return true;
    }

    private boolean checkLocality(String locality) throws LocalityNotFoundException {
        String[] localities = {"JP Nagar", "ABC Nagar", "Whitefield"};
        for (String local : localities) {
            if (local.equals(locality))
                return true;
        }
        throw new LocalityNotFoundException("Your locality is not applicable");
    }

    private boolean checkVoterId(int voterId) throws InvalidVoterIDException {
        if(voterId<1000 || voterId>9999)
            throw new InvalidVoterIDException("This voter id is  not eligible");
        return true;
    }
}