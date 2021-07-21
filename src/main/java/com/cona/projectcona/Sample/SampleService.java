package com.cona.projectcona.Sample;

import com.cona.projectcona.Base.BaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SampleService extends BaseService {

    private final SampleRepository sampleRepository;

    public Sample getSample(Long Id){
        return null;
    }
}
