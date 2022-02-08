package br.com.dev.hrworker.service;

import br.com.dev.hrworker.entities.Worker;
import br.com.dev.hrworker.repository.WorkerRepository;
import br.com.dev.hrworker.service.BusinessRule.WorkerBusinessRule;
import br.com.dev.hrworker.service.response.WorkerDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class WorkerService {

    @Autowired
    private WorkerRepository workerRepository;

    @Autowired
    private WorkerBusinessRule workerBusinessRule;

    public WorkerDto findById (Long id){
        Optional<Worker> workerOptional = workerRepository.findById(id);
        workerBusinessRule.checkExistingRecord(workerOptional);
        Worker worker = workerOptional.get();
        WorkerDto workerDto = workerBusinessRule.convertWorkerInWorkerDto(worker);
        return workerDto;
    }

    public Page<WorkerDto> findByAll(Integer page, Integer linesPerPage, String orderBy, String direction){
        Pageable pageRequest = PageRequest.of(page, linesPerPage, Sort.Direction.fromString(direction), orderBy);
        Page<Worker> pageWorker = workerRepository.findByAllWorker(pageRequest);
        Page<WorkerDto> pageWorkerDto = pageWorker.map(workerBusinessRule::convertWorkerInWorkerDto);
        return pageWorkerDto;
    }
}
