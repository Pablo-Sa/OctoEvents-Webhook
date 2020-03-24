package com.webhooks.octoevents.Enum;

public enum Error {
	
	ERRO_GET("Issue Event ID not foud: "),
    ERRO_POST("Object cannd not be null");

 
    private String descricao;
 
    Error(String descricao) {
        this.descricao = descricao;
    }
 
    public String getDescricao() { return descricao; }
    
}
