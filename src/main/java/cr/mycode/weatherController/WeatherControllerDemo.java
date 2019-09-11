package cr.mycode.weatherController;

import cr.mycode.service.WeatherDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/")
public class WeatherControllerDemo {
    @Autowired
    private WeatherDemoService weatherDemoService;

    @RequestMapping("getweather")
    @ResponseBody
    public String getweather(String url)throws Exception{
        return weatherDemoService.getWeather(url);
    }
}
