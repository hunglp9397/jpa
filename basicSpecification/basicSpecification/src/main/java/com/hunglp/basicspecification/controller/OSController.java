package com.hunglp.basicspecification.controller;

import com.hunglp.basicspecification.domain.common.query.SearchRequest;
import com.hunglp.basicspecification.domain.dao.OperatingSystem;
import com.hunglp.basicspecification.service.OSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class OSController {

    @Autowired
    private OSService osService;

    @PostMapping("/os")
    public Page<OperatingSystem> getOS(@RequestBody SearchRequest request){
        return osService.searchOperatingSystem(request);
    }


}
