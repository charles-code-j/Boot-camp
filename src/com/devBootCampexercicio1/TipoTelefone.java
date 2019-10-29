package com.devBootCampexercicio1;

public enum TipoTelefone {
    COMERCIAL("Comercial"),
    RESIDENCIA("Redidencia"),
    CELULAR("Celular");

        private String telefone;

    TipoTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getTelefone(){
        return telefone;
    }
}
