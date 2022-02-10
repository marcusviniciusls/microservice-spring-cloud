package br.com.dev.hrworker.controller;

import br.com.dev.hrworker.service.WorkerService;
import br.com.dev.hrworker.service.response.WorkerDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RefreshScope
@RestController
@RequestMapping("/worker")
public class WorkerController {

    @Autowired
    private WorkerService workerService;

    private static Logger LOOGGER = LoggerFactory.getLogger(WorkerController.class);

    @Value("${test.config}")
    private String testConfig;

    @GetMapping(value = "/configs")
    public ResponseEntity<Void> getConfigs(){
        LOOGGER.info("Config" + testConfig);
        return ResponseEntity.noContent().build();
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<WorkerDto> findById(@PathVariable Long id){
        WorkerDto workerDto = workerService.findById(id);
        return ResponseEntity.ok(workerDto);
    }

    @GetMapping
    public ResponseEntity<Page<WorkerDto>> findByAll(
            @RequestParam(value="page", defaultValue = "0") Integer page,
            @RequestParam(value="linesPerPage", defaultValue = "10") Integer linesPerPage,
            @RequestParam(value="orderBy", defaultValue = "name") String orderBy,
            @RequestParam(value="direction", defaultValue = "DESC") String direction
    ) {
        Page<WorkerDto> pageWorkerDto = workerService.findByAll(page,linesPerPage,orderBy, direction);
        return ResponseEntity.ok(pageWorkerDto);
    }
}
