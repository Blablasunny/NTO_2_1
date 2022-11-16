package com.abp.service;

import com.abp.domain.Location;
import com.abp.repository.LocationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class LocationServiceImpl implements LocationService {

    private final LocationRepository locationRepository;

    @Override
    public Location insert(String region) {

        Location location = Location.builder()
                .region(region)
                .build();

        return locationRepository.save(location);
    }

    @Override
    public Location update(int id, String region) {

        Location location = Location.builder()
                .id(id)
                .region(region)
                .build();

        return locationRepository.save(location);
    }

    @Override
    public List<Location> getAll() {

        return locationRepository.findAll();
    }

    @Override
    public Location getById(int id) {

        return locationRepository.getById(id);
    }

    @Override
    public void deleteById(int id) {

        locationRepository.deleteById(id);
    }

    @Override
    public List<Location> getByRegion(String region) {

        List<Location> locations = locationRepository.findAll();
        List<Location> locationList = new ArrayList<>();

        for (Location location : locations) {
            if (location.getRegion().equals(region)) {
                locationList.add(location);
            }
        }

        return locationList;
    }
}
