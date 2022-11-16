package com.abp.service;

import com.abp.domain.Hotel;
import com.abp.domain.Location;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DemoServiceImpl implements DemoService {

    private final HotelService hotelService;
    private final LocationService locationService;
    private final ManagerService managerService;

    @Override
    public void replaceIdLocation(int id) {

        List<Hotel> hotelList = hotelService.getByLocationId(id);

        for (Hotel hotel : hotelList) {
            hotel.setLocation(null);
        }
    }

    @Override
    public void replaceIdManager(int id) {

        List<Hotel> hotelList = hotelService.getByLocationId(id);

        for (Hotel hotel : hotelList) {
            hotel.setManager(null);
        }
    }
}
