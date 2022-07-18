package mx.com.gm.servicio;

import java.util.List;
import mx.com.gm.dao.AlumnoDAO;
import mx.com.gx.domain.Alumno;

public class ServicioAlumno {

    private AlumnoDAO alumnoDao = new AlumnoDAO();

    public List<Alumno> listarAlumno() {
        return alumnoDao.listar();
    }

    public void guardar(Alumno alumno) {
        if (alumno != null && alumno.getIdAlumno() == null) {
            alumnoDao.insertar(alumno);
        } else {
            alumnoDao.actualizar(alumno);
        }
    }

    public void eliminar(Alumno alumno) {
        alumnoDao.eliminar(alumno);
    }

    public Alumno encontrarAlumno(Alumno alumno) {
        return alumnoDao.buscarPorId(alumno);
    }

}
