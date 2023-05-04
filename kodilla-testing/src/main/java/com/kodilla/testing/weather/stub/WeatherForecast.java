package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double calculateAverage() {
        double sum = 0;
        ArrayList<Double> totalFromMap = new ArrayList<>();
        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            totalFromMap.add(temperature.getValue());
        }
        for (Double aDouble : totalFromMap) {
            sum += aDouble;
        }
        return sum / totalFromMap.size();
    }

    public double calculateMedian() {
        double median = 0.0;
        List<Double> tempList = new ArrayList<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            tempList.add(temperature.getValue());
        }
        Collections.sort(tempList);
        int size = tempList.size();

        if (size % 2 == 0) {
            median = (tempList.get(size / 2) + tempList.get(size / 2 - 1)) / 2.0;
        } else {
            median = tempList.get(size / 2);
        }
        return median;

    }
}
