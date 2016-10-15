package com.analisearquivo.classes;

import java.text.SimpleDateFormat;

public class ComparaArquivo {

	private Analise file1, file2;
	SimpleDateFormat spf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
	
	public ComparaArquivo(Analise file1, Analise file2){
		this.file1 = file1;
		this.file2 = file2;
	}
	
	public String getComparaGeral(){
		if(this.file1.getFile().compareTo(this.file2.getFile()) != 0){
			return "Os Arquivos s�o diferentes no geral!";
	    }else{
	    	return "Os Arquivos s�o iguais no geral!";
	    }
	}
	
	public String getComparaDatas(){
		if(this.file1.getDataModificacao() != this.file2.getDataModificacao()){
			return "As data de modifica��es est�o diferentes";
		}else{
			return "As data de modifica��es est�o iguais";
		}
	}
    
	public String getComparaTamanhos(){
		if(this.file1.getTamanho() != this.file2.getTamanho()){
			return "Os tamanhos dos arquivos est�o diferentes";
		}else{
			return "Os tamanhos dos arquivos est�o iguais";
		}
	}
}
