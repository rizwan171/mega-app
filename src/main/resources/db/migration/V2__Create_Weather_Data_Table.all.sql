CREATE TABLE mega.weather_data (
  id UUID DEFAULT uuid_generate_v4() PRIMARY KEY,
  forecastIssueDate DATE,
  minTempC INTEGER,
  maxTempC INTEGER,
  minTempF INTEGER,
  maxTempF INTEGER,
  rainChancePercent INTEGER,
  rainChanceText VARCHAR(100),
  sunrise TIMESTAMP,
  sunset TIMESTAMP,
  weatherDescription VARCHAR(100),
  windDescription VARCHAR(100),
  windDirection VARCHAR(100),
  windSpeedKph INTEGER,
  windSpeedMph INTEGER,
  weatherSource VARCHAR(20),
  generatedTimestamp TIMESTAMP
);