package service;

import dao.PreguntaDao;
import model.Pregunta;

import java.sql.SQLException;
import java.util.List;

public class PreguntaService {
    private final PreguntaDao preguntaDao;

    public PreguntaService() throws SQLException {
        this.preguntaDao = new PreguntaDao();
    }

    // Método para agregar una nueva pregunta
    public void addPregunta(Pregunta pregunta) {
        try {
            this.preguntaDao.insertPregunta(pregunta);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para obtener todas las preguntas de un cuestionario específico
    public List<model.Pregunta> getPreguntasByCuestionarioId(int cuestionarioId) {
        try {
            return preguntaDao.getPreguntasByCuestionarioId(cuestionarioId);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    // Método para obtener una pregunta por su ID
    public model.Pregunta getPreguntaById(int id) {
        try {
            return preguntaDao.getPreguntaById(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    // Método para actualizar una pregunta existente
    public void updatePregunta(model.Pregunta pregunta) {
        try {
            this.preguntaDao.updatePregunta(pregunta);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para eliminar una pregunta por su ID
    public void deletePregunta(int id) {
        try {
            preguntaDao.deletePregunta(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
