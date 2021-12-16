package lesson7.project;

import lesson7.project.enums.Periods;

import java.io.IOException;

public interface WeatherProvider {

    public void getWeather(Periods period) throws IOException;
}
