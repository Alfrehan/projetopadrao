package com.senac.projetopadrao.Schedulingtasks;

import com.senac.projetopadrao.model.Satelite;
import com.senac.projetopadrao.repository.SateliteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class MonitorarSatelite {

    @Autowired
    SateliteRepository sateliteRepository;

    @Scheduled(fixedRate = 60000)
    public void verificarSatelite(){
        RestTemplate restTemplate = new RestTemplate();
        RestTemplateBuilder restTemplateBuilder = new RestTemplateBuilder();
        restTemplate = restTemplateBuilder.build();

        Satelite satelite = restTemplate.getForObject(
                "https://api.wheretheiss.at/v1/satellites/25544",
                Satelite.class);

        sateliteRepository.save(satelite);
    }
}
