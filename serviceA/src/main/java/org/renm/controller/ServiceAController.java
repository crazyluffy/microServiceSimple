package org.renm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping("/serviceA")
public class ServiceAController {

    private RestTemplate restTemplate;
    private DiscoveryClient discoveryClient;
    // call serviceB
    @RequestMapping("/home")
    public String serviceA(){
//        List<ServiceInstance> instances = discoveryClient.getInstances("serviceB");
        String url = "http://serviceB/serviceB/home";
        return restTemplate.getForObject(url, String.class);
    }

    public DiscoveryClient getDiscoveryClient() {
        return discoveryClient;
    }

    @Autowired
    public void setDiscoveryClient(DiscoveryClient discoveryClient) {
        this.discoveryClient = discoveryClient;
    }

    public RestTemplate getRestTemplate() {
        return restTemplate;
    }

    @Autowired
    public void setRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
}
