package piloto;

import java.sql.SQLException;
import java.util.HashMap;

public interface SGestPiloto {

    public abstract Piloto getP(String codPiloto);
    public abstract boolean addPiloto(String nome, float cts, float sva);
    public abstract boolean removePiloto(String codPiloto);
    public abstract HashMap<String,Piloto> getPilotos() throws SQLException;
    public abstract boolean existsPiloto(String codPiloto);
}
