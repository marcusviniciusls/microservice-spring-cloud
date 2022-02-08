package br.com.dev.hrworker.service.BusinessRule;

import br.com.dev.hrworker.entities.Worker;
import br.com.dev.hrworker.exception.ResourceNotFoundException;
import br.com.dev.hrworker.service.response.WorkerDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Component
public class WorkerBusinessRule {

    private ModelMapper modelMapper;

    public WorkerBusinessRule() {
        this.modelMapper = new ModelMapper();
    }

    public WorkerDto convertWorkerInWorkerDto(Worker worker){
        WorkerDto workerDto = modelMapper.map(worker, WorkerDto.class);
        return workerDto;
    }

    public void checkExistingRecord (Optional<Worker> workerOptional){
        if (workerOptional.isEmpty()){
            throw new ResourceNotFoundException("ID NOT FOUND EXCEPTION");
        }
    }
}
