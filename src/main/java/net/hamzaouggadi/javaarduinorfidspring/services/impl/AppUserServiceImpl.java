package net.hamzaouggadi.javaarduinorfidspring.services.impl;

import lombok.RequiredArgsConstructor;
import net.hamzaouggadi.javaarduinorfidspring.entities.AppUser;
import net.hamzaouggadi.javaarduinorfidspring.repositories.AppUserRepository;
import net.hamzaouggadi.javaarduinorfidspring.services.AppUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class AppUserServiceImpl implements AppUserService {

    private final AppUserRepository appUserRepository;

    @Override
    public AppUser getAppUserById(Long appUserId) {
        return null;
    }

    @Override
    public AppUser getAppUserByRFID(String appUserRFID) {
        return null;
    }
}
