package com.cona.projectcona.Sample;

import com.cona.projectcona.Base.BaseController;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/sample")
@RestController
public class SampleController extends BaseController {

    @GetMapping
    public Sample showSample(){
        return null;
    }

    @PostMapping
    public Sample createSample(@RequestBody Sample sample){
        return null;
    }
}
