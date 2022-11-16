package com.abp.service;

import com.abp.domain.Location;

import java.util.List;

public interface LocationService {

   Location insert(String region);

    Location update(int id, String region);

    List<Location> getAll();

    Location getById(int id);

    void deleteById(int id);

    List<Location> getByRegion(String region);
}
