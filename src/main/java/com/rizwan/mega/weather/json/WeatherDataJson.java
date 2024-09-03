package com.rizwan.mega.weather.json;

import com.rizwan.mega.weather.enumeration.WeatherSource;
import com.rizwan.mega.weather.model.WeatherData;

import java.time.Instant;
import java.time.LocalDate;
import java.util.UUID;

public record WeatherDataJson(
  UUID id,
  LocalDate forecastIssueDate,
  Integer minTempC,
  Integer maxTempC,
  Integer minTempF,
  Integer maxTempF,
  int rainChancePercent,
  String rainChanceText,
  Instant sunrise,
  Instant sunset,
  String weatherDescription,
  String windDescription,
  String windDirection,
  Integer windSpeedKph,
  Integer windSpeedMph,
  WeatherSource weatherSource,
  Instant generatedTimestamp
) {

  public static WeatherDataJson fromEntity(WeatherData weatherData) {
    return new WeatherDataJson(
      weatherData.getId(),
      weatherData.getForecastIssueDate(),
      weatherData.getMinTempC(),
      weatherData.getMaxTempC(),
      weatherData.getMinTempF(),
      weatherData.getMaxTempF(),
      weatherData.getRainChancePercent(),
      weatherData.getRainChanceText(),
      weatherData.getSunrise(),
      weatherData.getSunset(),
      weatherData.getWeatherDescription(),
      weatherData.getWindDescription(),
      weatherData.getWindDirection(),
      weatherData.getWindSpeedKph(),
      weatherData.getWindSpeedMph(),
      weatherData.getWeatherSource(),
      weatherData.getGeneratedTimestamp()
    );
  }
}
