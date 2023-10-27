package org.launchcode.techjobsmvc.controllers;

import org.launchcode.techjobsmvc.models.Job;
import org.launchcode.techjobsmvc.models.JobData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

import static org.launchcode.techjobsmvc.controllers.ListController.columnChoices;


/**
 * Created by LaunchCode
 */
@Controller
@RequestMapping("search")
public class SearchController {

    @GetMapping(value = "")
    public String search(Model model) {
        model.addAttribute("columns", columnChoices);
        return "search";
    }

    // TODO #3 - Create a handler to process a search request and render the updated search view.
//    @GetMapping(value = "jobs")
//    public String listBySearch(Model model, @RequestParam String column, @RequestParam(required = false) String value){
//        ArrayList<Job> jobs;
//        jobs = JobData.findByColumnAndValue(column, value);
//        model.addAttribute("title", "Jobs with " + columnChoices.get(column) + ": " + value);
//
//        model.addAttribute("jobs", jobs);
//
//        return "search-jobs";
//    }
}

