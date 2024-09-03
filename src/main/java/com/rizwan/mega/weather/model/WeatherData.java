package com.rizwan.mega.weather.model;

import com.rizwan.mega.weather.enumeration.WeatherSource;
import jakarta.persistence.*;

import java.time.Instant;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "weather_data")
public class WeatherData {

  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;

  private LocalDate forecastIssueDate;

  private Integer minTempC;

  private Integer maxTempC;

  private Integer minTempF;

  private Integer maxTempF;

  private int rainChancePercent;

  private String rainChanceText;

  private Instant sunrise;

  private Instant sunset;

  private String weatherDescription;

  private String windDescription;

  private String windDirection;

  private Integer windSpeedKph;

  private Integer windSpeedMph;

  private WeatherSource weatherSource;

  private Instant generatedTimestamp;

  public WeatherData() {
  }

  public UUID getId() {
    return id;
  }

  public WeatherData setId(UUID id) {
    this.id = id;
    return this;
  }

  public LocalDate getForecastIssueDate() {
    return forecastIssueDate;
  }

  public WeatherData setForecastIssueDate(LocalDate forecastIssueDate) {
    this.forecastIssueDate = forecastIssueDate;
    return this;
  }

  public Integer getMinTempC() {
    return minTempC;
  }

  public WeatherData setMinTempC(Integer minTempC) {
    this.minTempC = minTempC;
    return this;
  }

  public Integer getMaxTempC() {
    return maxTempC;
  }

  public WeatherData setMaxTempC(Integer maxTempC) {
    this.maxTempC = maxTempC;
    return this;
  }

  public Integer getMinTempF() {
    return minTempF;
  }

  public WeatherData setMinTempF(Integer minTempF) {
    this.minTempF = minTempF;
    return this;
  }

  public Integer getMaxTempF() {
    return maxTempF;
  }

  public WeatherData setMaxTempF(Integer maxTempF) {
    this.maxTempF = maxTempF;
    return this;
  }

  public int getRainChancePercent() {
    return rainChancePercent;
  }

  public WeatherData setRainChancePercent(int rainChancePercent) {
    this.rainChancePercent = rainChancePercent;
    return this;
  }

  public String getRainChanceText() {
    return rainChanceText;
  }

  public WeatherData setRainChanceText(String rainChanceText) {
    this.rainChanceText = rainChanceText;
    return this;
  }

  public Instant getSunrise() {
    return sunrise;
  }

  public WeatherData setSunrise(Instant sunrise) {
    this.sunrise = sunrise;
    return this;
  }

  public Instant getSunset() {
    return sunset;
  }

  public WeatherData setSunset(Instant sunset) {
    this.sunset = sunset;
    return this;
  }

  public String getWeatherDescription() {
    return weatherDescription;
  }

  public WeatherData setWeatherDescription(String weatherDescription) {
    this.weatherDescription = weatherDescription;
    return this;
  }

  public String getWindDescription() {
    return windDescription;
  }

  public WeatherData setWindDescription(String windDescription) {
    this.windDescription = windDescription;
    return this;
  }

  public String getWindDirection() {
    return windDirection;
  }

  public WeatherData setWindDirection(String windDirection) {
    this.windDirection = windDirection;
    return this;
  }

  public Integer getWindSpeedKph() {
    return windSpeedKph;
  }

  public WeatherData setWindSpeedKph(Integer windSpeedKph) {
    this.windSpeedKph = windSpeedKph;
    return this;
  }

  public Integer getWindSpeedMph() {
    return windSpeedMph;
  }

  public WeatherData setWindSpeedMph(Integer windSpeedMph) {
    this.windSpeedMph = windSpeedMph;
    return this;
  }

  public WeatherSource getWeatherSource() {
    return weatherSource;
  }

  public WeatherData setWeatherSource(WeatherSource weatherSource) {
    this.weatherSource = weatherSource;
    return this;
  }

  public Instant getGeneratedTimestamp() {
    return generatedTimestamp;
  }

  public WeatherData setGeneratedTimestamp(Instant generatedTimestamp) {
    this.generatedTimestamp = generatedTimestamp;
    return this;
  }
}
