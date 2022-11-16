package com.abp.service;

import com.abp.domain.Manager;

import java.util.List;

public interface ManagerService {

    Manager insert(String name, String phone, String email, String part);

    Manager update(int id, String name, String phone, String email, String part);

    List<Manager> getAll();

    Manager getById(int id);

    void deleteById(int id);

    List<Manager> getByName(String name);
}
