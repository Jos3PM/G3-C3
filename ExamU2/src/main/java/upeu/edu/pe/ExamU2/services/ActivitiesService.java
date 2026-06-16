package upeu.edu.pe.ExamU2.services;

import upeu.edu.pe.ExamU2.models.Activities;

import java.util.List;

public interface ActivitiesService {
    List<Activities> listar();
    Activities buscar(Integer id);
    void guardar(Activities activities);
    void  eliminar(Integer id);
}
