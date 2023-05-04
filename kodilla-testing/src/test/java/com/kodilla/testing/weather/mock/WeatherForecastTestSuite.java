package com.kodilla.testing.weather.mock;
import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
@ExtendWith(MockitoExtension.class)
class WeatherForecastTestSuite {

    @Mock
    private Temperatures temperaturesMock;

        public Map<String, Double> generateMockData(){
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);

        Map<String, Double> temperaturesMockMap = new HashMap<>();

        temperaturesMockMap.putAll(temperaturesMap);

        return temperaturesMockMap;
    }


    @Test
    void testCalculateForecastWithMock() {
        //Given
        Map<String, Double> temperaturesData = generateMockData();
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesData);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }
    @Test
    void testCalculateAverageTemperatureWithMock(){
        //Given
        Map<String, Double> temperaturesData = generateMockData();
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesData);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double result = weatherForecast.calculateAverage();
        //Then
        Assertions.assertEquals(25.56,result);
    }

    @Test
    void testCalculateMedianTemperatureWithMock(){
        //Given
        Map<String, Double> temperaturesData = generateMockData();
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesData);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        //When
        double result = weatherForecast.calculateMedian();
        //Then
        Assertions.assertEquals(25.5,result);
    }

}