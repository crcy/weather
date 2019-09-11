package cr.mycode.service.impl;

import cr.mycode.service.WeatherDemoService;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.io.*;

@Service
public class WeatherDemoServiceImpl implements WeatherDemoService {
    @Override
    public String getWeather(String url) throws IOException {
       StringBuilder sb=new StringBuilder();
        StringBuilder sb1=new StringBuilder();
       Document doc = Jsoup.connect(url).get();
        Elements content = doc.getElementsByClass("con today clearfix");
        for (Element e : content) {
            Document conDoc = Jsoup.parse(e.toString());
            Elements cru = conDoc.getElementsByClass("crumbs fl");
            Elements sky = content.select("li[class^=sky skyid lv]");
            for (Element element:cru){
                String text = element.text();
                sb.append(text);
            }
            sb.append(",");
            for (Element element:sky){
                String text = element.text();
                sb.append(text+",");
            }
        }
        return sb.toString();
    }
}



