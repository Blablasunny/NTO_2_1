package com.abp.service;

import com.abp.domain.Manager;
import com.abp.repository.ManagerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ManagerServiceImpl implements ManagerService {

    private  final ManagerRepository managerRepository;

    @Override
    public Manager insert(String name, String phone, String email, String part) {

        Manager manager = Manager.builder()
                .name(name)
                .phone(phone)
                .email(email)
                .part(part)
                .build();

        return managerRepository.save(manager);
    }

    @Override
    public Manager update(int id, String name, String phone, String email, String part) {

        Manager manager = Manager.builder()
                .id(id)
                .name(name)
                .phone(phone)
                .email(email)
                .part(part)
                .build();

        return managerRepository.save(manager);
    }

    @Override
    public List<Manager> getAll() {

        return managerRepository.findAll();
    }

    @Override
    public Manager getById(int id) {

        return managerRepository.getById(id);
    }

    @Override
    public void deleteById(int id) {

        managerRepository.getById(id);
    }

    @Override
    public List<Manager> getByName(String name) {

        List<Manager> managers = managerRepository.findAll();
        List<Manager> managerList = new ArrayList<>();

        for (Manager manager : managers) {
            if (manager.getName().equals(name)) {
                managerList.add(manager);
            }
        }

        return managerList;
    }
}
