package com.analisearquivo.classes;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 *André - Retorna informações sobre o aquivo 
 */

public class Analise {

	private String fileStr;
	private File file;
	SimpleDateFormat spf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
	
	//Construtor
	public Analise(String fileStr){
		this.setFileStr(fileStr);
		this.setFile();
	}
	
	private String getFileStr(){
		return this.fileStr;
	}
	
	private void setFileStr(String fileStr){
		this.fileStr = fileStr;
	}
	
	public File getFile(){
		return this.file;
	}
	
	private void setFile(){
		this.file = new File(this.getFileStr());
	}
	
	//Diretório do arquivo
	public String getDiretorio(){
		return this.getFile().getParent();
	}

	//Identifica se é editável
	public boolean isEscrever(){
		return this.getFile().canWrite();
	}
	
	//Identifica se é executável
	public boolean isExecutar(){
		return this.getFile().canExecute();
	}

	//Identifica se pode ser lido
	public boolean isLer(){
		return this.getFile().canRead();
	}
	
	//Identifica o nome
	public String getNome(){
		return this.getFile().getName();
	}
	
	//Identifica o tamanho
	public long getTamanho(){
		return this.getFile().length();
	}
	
	//Identifica a data de modificação
	public String getDataModificacao(){
		Date data = new Date(this.getFile().lastModified());
        return spf.format(data);
	}
	
}