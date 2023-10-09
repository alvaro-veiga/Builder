package org.cafeteria.builder;



public class CafeteriaBuilder {
    private Cafeteria cafeteria;

    public CafeteriaBuilder() {
        cafeteria = new Cafeteria();
    }

    public Cafeteria build() {
        if (cafeteria.getNome().isEmpty()) {
            throw new IllegalArgumentException("Nome de cafeteria invalido");
        }
        if (cafeteria.getDono().isEmpty()) {
            throw new IllegalArgumentException("Nome de dono invalido");
        }
        return cafeteria;
    }

    public CafeteriaBuilder setNome(String nome) {
        cafeteria.setNome(nome);
        return this;
    }

    public CafeteriaBuilder setFuncionarios(int funcionarios) {
        cafeteria.setFuncionarios(funcionarios);
        return this;
    }

    public CafeteriaBuilder setFaturamento(float faturamento) {
        cafeteria.setFaturamento(faturamento);
        return this;
    }
    public  CafeteriaBuilder setDespesas(float despesas) {
        cafeteria.setDespesas(despesas);
        return this;
    }
    public CafeteriaBuilder setDono(String dono) {
        cafeteria.setDono(dono);
        return this;
    }
}
