package net.hamzaouggadi.javaarduinorfidspring.services;

import net.hamzaouggadi.javaarduinorfidspring.entities.AppUser;

public interface AppUserService {

    AppUser getAppUserById(Long appUserId);
    AppUser getAppUserByRFID(String appUserRFID);

}
