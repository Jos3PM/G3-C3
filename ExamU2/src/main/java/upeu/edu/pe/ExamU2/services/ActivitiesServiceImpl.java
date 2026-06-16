package upeu.edu.pe.ExamU2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upeu.edu.pe.ExamU2.models.Activities;
import upeu.edu.pe.ExamU2.repository.ActivitiesRepository;

import java.util.List;

@Service
public class ActivitiesServiceImpl implements ActivitiesService {

    @Autowired
    private ActivitiesRepository repository;

    @Override
    public List<Activities> listar() {
        return repository.findAll();
    }

    @Override
    public Activities buscar(Integer id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void guardar(Activities activities) {
        repository.save(activities);
    }

    @Override
    public void eliminar(Integer id) {
        repository.deleteById(id);
    }
}
