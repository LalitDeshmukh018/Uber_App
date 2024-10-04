package com.Lalitdk.project.uber.uberApp.services;

import com.Lalitdk.project.uber.uberApp.dto.DriverDto;
import com.Lalitdk.project.uber.uberApp.dto.RideDto;
import com.Lalitdk.project.uber.uberApp.dto.RideRequestDto;
import com.Lalitdk.project.uber.uberApp.dto.RiderDto;
import com.Lalitdk.project.uber.uberApp.entities.Rider;
import com.Lalitdk.project.uber.uberApp.entities.User;

import java.util.List;

public interface RiderService {

    RideRequestDto requestRide(RideRequestDto rideRequestDto);

    RideDto cancelRide(Long rideId);

    DriverDto rateDriver(Long rideId, Integer rating);

    RiderDto getMyProfile();

    List<RideDto> getAllMyRides();

    Rider createNewRider(User user);

    Rider getCurrentRider();
}
