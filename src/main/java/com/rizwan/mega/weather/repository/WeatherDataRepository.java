package com.rizwan.mega.weather.repository;

import com.rizwan.mega.weather.model.WeatherData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface WeatherDataRepository extends CrudRepository<WeatherData, UUID> {
}