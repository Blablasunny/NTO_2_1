package com.abp.service;

import com.abp.domain.Hotel;
import com.abp.repository.HotelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HotelServiceImpl implements HotelService {

    private final HotelRepository hotelRepository;

    @Override
    public Hotel insert(String name, int locationId, String phone, int managerId, String info) {
        return null;
    }

    @Override
    public Hotel update(int id, String name, int locationId, String phone, int managerId, String info) {
        return null;
    }

    @Override
    public List<Hotel> getAll() {
        return null;
    }

    @Override
    public Hotel getById(int id) {
        return null;
    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public Hotel getByName(String name) {
        return null;
    }
}
