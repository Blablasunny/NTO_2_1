package com.abp.service;

import com.abp.domain.Hotel;
import com.abp.domain.Location;
import com.abp.domain.Manager;
import com.abp.repository.HotelRepository;
import com.abp.repository.LocationRepository;
import com.abp.repository.ManagerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class HotelServiceImpl implements HotelService {

    private final HotelRepository hotelRepository;
    private final LocationRepository locationRepository;
    private final ManagerRepository managerRepository;

    @Override
    public Hotel insert(String name, int locationId, String phone, int managerId, String info) {

        Location location = locationRepository.findById(locationId).orElse(null);
        Manager manager = managerRepository.findById(managerId).orElse(null);

        Hotel hotel = Hotel.builder()
                .name(name)
                .location(location)
                .phone(phone)
                .manager(manager)
                .info(info)
                .build();

        return hotel;
    }

    @Override
    public Hotel update(int id, String name, int locationId, String phone, int managerId, String info) {

        Location location = locationRepository.findById(locationId).orElse(null);
        Manager manager = managerRepository.findById(managerId).orElse(null);

        Hotel hotel = Hotel.builder()
                .id(id)
                .name(name)
                .location(location)
                .phone(phone)
                .manager(manager)
                .info(info)
                .build();

        return hotel;
    }

    @Override
    public List<Hotel> getAll() {

        return hotelRepository.findAll();
    }

    @Override
    public Hotel getById(int id) {

        return hotelRepository.getById(id);
    }

    @Override
    public void deleteById(int id) {

        hotelRepository.getById(id);
    }

    @Override
    public List<Hotel> getByName(String name) {

        List<Hotel> hotels = hotelRepository.findAll();
        List<Hotel> hotelList = new ArrayList<>();

        for (Hotel hotel : hotels) {
            if (hotel.getName().equals(name)) {
                hotelList.add(hotel);
            }
        }

        return hotelList;
    }

    @Override
    public List<Hotel> getByLocationId(int locationId) {

        Location location = locationRepository.findById(locationId).orElse(null);

        List<Hotel> hotels = hotelRepository.findAll();
        List<Hotel> hotelList = new ArrayList<>();

        for (Hotel hotel : hotels) {
            if (hotel.getLocation().equals(location)) {
                hotelList.add(hotel);
            }
        }

        return hotelList;
    }

    @Override
    public List<Hotel> getByManagerId(int managerId) {

        Manager manager = managerRepository.findById(managerId).orElse(null);

        List<Hotel> hotels = hotelRepository.findAll();
        List<Hotel> hotelList = new ArrayList<>();

        for (Hotel hotel : hotels) {
            if (hotel.getManager().equals(manager)) {
                hotelList.add(hotel);
            }
        }

        return hotelList;
    }
}
