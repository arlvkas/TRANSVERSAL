import java.time.LocalDateTime;

/**
 * Tarea VET20-21: Sistema de reservas
 * Basado en US001-US005 de VetCare Digital
 */
public class Reserva {

    private int id;
    private LocalDateTime fechaHoraInicio;
    private String motivo;            // US001: al solicitar cita necesita motivo/tipo
    private String estado;            // PROGRAMADA, EN_CURSO, REALIZADA, CANCELADA
    private int pacienteId;           // US001: reserva para una mascota/paciente
    private int clienteId;            // US001: quien solicita
    private String clienteNombre;     // US001: nombre del cliente
    private String clienteTelefono;   // US001: teléfono de contacto
    private int profesionalId;        // US004: debe haber un profesional asignado

    public Reserva() {
        this.estado = "PROGRAMADA";
    }

    public Reserva(int id, LocalDateTime fechaHoraInicio, String motivo,
                   int pacienteId, int clienteId, int profesionalId) {
        this.id = id;
        this.fechaHoraInicio = fechaHoraInicio;
        this.motivo = motivo;
        this.pacienteId = pacienteId;
        this.clienteId = clienteId;
        this.profesionalId = profesionalId;
        this.estado = "PROGRAMADA";
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public LocalDateTime getFechaHoraInicio() { return fechaHoraInicio; }
    public void setFechaHoraInicio(LocalDateTime fechaHoraInicio) { this.fechaHoraInicio = fechaHoraInicio; }

    public String getMotivo() { return motivo; }
    public void setMotivo(String motivo) { this.motivo = motivo; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public int getPacienteId() { return pacienteId; }
    public void setPacienteId(int pacienteId) { this.pacienteId = pacienteId; }

    public int getClienteId() { return clienteId; }
    public void setClienteId(int clienteId) { this.clienteId = clienteId; }

    public String getClienteNombre() { return clienteNombre; }
    public void setClienteNombre(String clienteNombre) { this.clienteNombre = clienteNombre; }

    public String getClienteTelefono() { return clienteTelefono; }
    public void setClienteTelefono(String clienteTelefono) { this.clienteTelefono = clienteTelefono; }

    public int getProfesionalId() { return profesionalId; }
    public void setProfesionalId(int profesionalId) { this.profesionalId = profesionalId; }

    public boolean estaProgramada() {
        return "PROGRAMADA".equalsIgnoreCase(this.estado);
    }

    public boolean estaEnCurso() {
        return "EN_CURSO".equalsIgnoreCase(this.estado);
    }

    public boolean estaRealizada() {
        return "REALIZADA".equalsIgnoreCase(this.estado);
    }

    public boolean estaCancelada() {
        return "CANCELADA".equalsIgnoreCase(this.estado);
    }

    @Override
    public String toString() {
        return "Reserva{id=" + id + ", estado='" + estado + "', pacienteId=" + pacienteId + "}";
    }
}