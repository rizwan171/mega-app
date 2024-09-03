package com.rizwan.mega.weather.constant;

public final class WeatherConstants {

  // Note that this takes a location id as a URL parameter
  private static final String BBC_WEATHER_ENDPOINT = "https://weather-broker-cdn.api.bbci.co.uk/en/forecast/aggregated/";

  public String getBBCWeatherUrl(String locationId) {
    return BBC_WEATHER_ENDPOINT + locationId;
  }
}
