package cr.mycode.service;

import java.io.IOException;
import java.util.List;

public interface WeatherDemoService {
    //根据地址获取天气
    String getWeather(String url) throws IOException;
}
