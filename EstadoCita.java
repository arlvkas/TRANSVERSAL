import java.time.LocalDateTime;

/**
 * Tarea VET20-20: Consulta de estado de cita
 * Basado en US029 de VetCare Digital
 */
public class EstadoCita {

    private int id;
    private int reservaId;
    private String estadoActual;      // PROXIMAMENTE, EN_CURSO, REALIZADA, CANCELADA
    private String estadoAnterior;
    private LocalDateTime fechaCambioEstado;
    private String motivoCambio;
    private int cambiadoPorId;
    private String cambiadoPorNombre;

    public EstadoCita() {
        this.estadoActual = "PROXIMAMENTE";
        this.fechaCambioEstado = LocalDateTime.now();
    }

    public EstadoCita(int id, int reservaId, String estadoActual) {
        this.id = id;
        this.reservaId = reservaId;
        this.estadoActual = estadoActual != null ? estadoActual : "PROXIMAMENTE";
        this.fechaCambioEstado = LocalDateTime.now();
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getReservaId() { return reservaId; }
    public void setReservaId(int reservaId) { this.reservaId = reservaId; }

    public String getEstadoActual() { return estadoActual; }
    public void setEstadoActual(String estadoActual) {
        if (this.estadoActual != null && !this.estadoActual.equalsIgnoreCase(estadoActual)) {
            this.estadoAnterior = this.estadoActual;
            this.fechaCambioEstado = LocalDateTime.now();
        }
        this.estadoActual = estadoActual;
    }

    public String getEstadoAnterior() { return estadoAnterior; }
    public void setEstadoAnterior(String estadoAnterior) { this.estadoAnterior = estadoAnterior; }

    public LocalDateTime getFechaCambioEstado() { return fechaCambioEstado; }
    public void setFechaCambioEstado(LocalDateTime fechaCambioEstado) { this.fechaCambioEstado = fechaCambioEstado; }

    public String getMotivoCambio() { return motivoCambio; }
    public void setMotivoCambio(String motivoCambio) { this.motivoCambio = motivoCambio; }

    public int getCambiadoPorId() { return cambiadoPorId; }
    public void setCambiadoPorId(int cambiadoPorId) { this.cambiadoPorId = cambiadoPorId; }

    public String getCambiadoPorNombre() { return cambiadoPorNombre; }
    public void setCambiadoPorNombre(String cambiadoPorNombre) { this.cambiadoPorNombre = cambiadoPorNombre; }

    public boolean esProximamente() {
        return "PROXIMAMENTE".equalsIgnoreCase(this.estadoActual);
    }

    public boolean esEnCurso() {
        return "EN_CURSO".equalsIgnoreCase(this.estadoActual);
    }

    public boolean esRealizada() {
        return "REALIZADA".equalsIgnoreCase(this.estadoActual);
    }

    public boolean esCancelada() {
        return "CANCELADA".equalsIgnoreCase(this.estadoActual);
    }

    public void cambiarEstado(String nuevoEstado, String motivo, int usuarioId, String usuarioNombre) {
        this.estadoAnterior = this.estadoActual;
        this.estadoActual = nuevoEstado;
        this.fechaCambioEstado = LocalDateTime.now();
        this.motivoCambio = motivo;
        this.cambiadoPorId = usuarioId;
        this.cambiadoPorNombre = usuarioNombre;
    }

    @Override
    public String toString() {
        return "EstadoCita{id=" + id + ", reservaId=" + reservaId + ", estado='" + estadoActual + "'}";
    }
}