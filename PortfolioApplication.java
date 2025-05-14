//package com.example.portfolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class PortfolioApplication {

    public static void main(String[] args) {
        SpringApplication.run(PortfolioApplication.class, args);
    }

    @GetMapping
    public Portfolio getPortfolio() {
        return new Portfolio(
                "Bishal",
                "Passionate developer eager to create impactful solutions.",
                List.of("Java Web Application", "Machine Learning Model", "Mobile App")
        );
    }

    static class Portfolio {
        private String name;
        private String about;
        private List<String> projects;

        public Portfolio(String name, String about, List<String> projects) {
            this.name = name;
            this.about = about;
            this.projects = projects;
        }

        public String getName() { return name; }
        public String getAbout() { return about; }
        public List<String> getProjects() { return projects; }
    }
}



