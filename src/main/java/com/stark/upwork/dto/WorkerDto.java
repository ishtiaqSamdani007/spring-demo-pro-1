package com.stark.upwork.dto;

import com.stark.upwork.entity.Worker;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class WorkerDto {
    private Long id;
    private String name;
    private String surname;
    private String position;

    private static ModelMapper modelMapper;
    static {
        modelMapper = new ModelMapper();
    }



    public static Worker convertDtoToEntity(WorkerDto workerDto){
        modelMapper.getConfiguration()
                .setMatchingStrategy(MatchingStrategies.LOOSE);
        return modelMapper.map(workerDto,Worker.class);
    }

    public static WorkerDto convertEntityToDto(Worker worker){
        modelMapper.getConfiguration()
                .setMatchingStrategy(MatchingStrategies.LOOSE);
        return modelMapper.map(worker,WorkerDto.class);
    }

}

