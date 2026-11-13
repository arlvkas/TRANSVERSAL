import java.time.LocalDate;

public class Vacuna {

    private int id;
    private String tipoVacuna;
    private String lote;
    private LocalDate fechaAplicacion;
    private LocalDate fechaProximaDosis;
    private String estado;
    private int pacienteId;

    public Vacuna() {
        this.estado = "PENDIENTE";
    }

    public Vacuna(int id, String tipoVacuna, String lote, LocalDate fechaAplicacion,
                  LocalDate fechaProximaDosis, int pacienteId) {
        this.id = id;
        this.tipoVacuna = tipoVacuna;
        this.lote = lote;
        this.fechaAplicacion = fechaAplicacion;
        this.fechaProximaDosis = fechaProximaDosis;
        this.pacienteId = pacienteId;
        this.estado = "REALIZADA";
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getTipoVacuna() {
        return tipoVacuna;
    }
    public void setTipoVacuna(String tipoVacuna) {
        this.tipoVacuna = tipoVacuna;
    }

    public String getLote() {
        return lote;
    }
    public void setLote(String lote) {
        this.lote = lote;
    }

    public LocalDate getFechaAplicacion() {
        return fechaAplicacion;
    }
    public void setFechaAplicacion(LocalDate fechaAplicacion) {
        this.fechaAplicacion = fechaAplicacion;
    }

    public LocalDate getFechaProximaDosis() {
        return fechaProximaDosis;
    }
    public void setFechaProximaDosis(LocalDate fechaProximaDosis) {
        this.fechaProximaDosis = fechaProximaDosis;
    }

    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getPacienteId() {
        return pacienteId;
    }
    public void setPacienteId(int pacienteId) {
        this.pacienteId = pacienteId;
    }

    public boolean estaRealizada() {
        return "REALIZADA".equalsIgnoreCase(this.estado);
    }

    public boolean estaPendiente() {
        return "PENDIENTE".equalsIgnoreCase(this.estado);
    }

    @Override
    public String toString() {
        return "Vacuna[id=" + id + ", tipo='" + tipoVacuna + "', estado='" + estado + "']";
    }
}