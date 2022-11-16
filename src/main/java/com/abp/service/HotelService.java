package com.abp.service;

import com.abp.domain.Hotel;

import java.util.List;

public interface HotelService {

    Hotel insert(String name, int locationId, String phone, int managerId, String info);

    Hotel update(int id, String name, int locationId, String phone, int managerId, String info);

    List<Hotel> getAll();

    Hotel getById(int id);

    void deleteById(int id);

    List<Hotel> getByName(String name);

    List<Hotel> getByLocationId(int locationId);

    List<Hotel> getByManagerId(int managerId);
}
