package com.pl.validator_of_pesel.validators;

public interface Validator<T> {
    boolean validate(T number);
}
