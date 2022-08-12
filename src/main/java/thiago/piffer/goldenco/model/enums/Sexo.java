package thiago.piffer.goldenco.model.enums;

public enum Sexo {
    MASCULINO(1, "Masculino"),
    FEMININO(2, "Feminino");

    private int cod;
    private String desc;

    Sexo(int cod, String desc) {
        this.cod = cod;
        this.desc = desc;
    }

    public int getCod() {
        return cod;
    }

    public String getDesc() {
        return desc;
    }

    public static Sexo toEnum(Integer cod) {
        if(cod == null) { return null; }

        for(Sexo value : Sexo.values()) {
            if(cod.equals(value.getCod())) { return value; }
        }

        throw new IllegalArgumentException("ID inválido: " + cod);
    }
}
