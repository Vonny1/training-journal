package com.example.trainingdiary.controllers;

import com.example.trainingdiary.entities.Exercise;
import com.example.trainingdiary.handlers.ActionHandlerNames;
import com.example.trainingdiary.handlers.ExercisesContext;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/training")
public class TrainingController extends BaseController {

    @GetMapping("allExercises")
    public ResponseEntity<List<Exercise>> getAllExercises(){
        return handleAction(new ExercisesContext(),
                getActionHandler(ActionHandlerNames.GET_ALL_EXERCISES));
    }
}
