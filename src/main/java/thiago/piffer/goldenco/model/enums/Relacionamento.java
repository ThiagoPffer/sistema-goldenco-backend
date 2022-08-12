package thiago.piffer.goldenco.model.enums;

public enum Relacionamento {

    NAMORADOS(1, "Namorados"),
    NOIVOS(2, "Noivos"),
    CASADOS(3, "Casados");

    private int cod;
    private String desc;

    Relacionamento(int cod, String desc) {
        this.cod = cod;
        this.desc = desc;
    }

    public int getCod() {
        return cod;
    }

    public String getDesc() {
        return desc;
    }

    public static Relacionamento toEnum(Integer cod) {
        if(cod == null) { return null; }

        for(Relacionamento value : Relacionamento.values()) {
            if(cod.equals(value.getCod())) { return value; }
        }

        throw new IllegalArgumentException("ID inválido: " + cod);
    }
}
