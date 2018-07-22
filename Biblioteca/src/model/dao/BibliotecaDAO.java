package model.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashSet;

import javax.swing.JOptionPane;

import model.vo.Biblioteca;
import model.vo.Livro;
import model.vo.Usuario;

public class BibliotecaDAO {

	
	
	
	public boolean criaBiblioteca() {
		
		File file = new File("db.txt");
		
		if (file.exists()){
			return true;
			
		} else{
			Biblioteca b = new Biblioteca("Biblioteca do Gui", 0);
			try {
				file.createNewFile();
				FileOutputStream fileOutput = new FileOutputStream("//home//guilherme//workspace//Biblioteca//db.txt");
				ObjectOutputStream objGravar = new ObjectOutputStream(fileOutput);
				
				objGravar.writeObject(b);
				objGravar.flush();
				objGravar.close();
				
				fileOutput.flush();
				fileOutput.close();
				
				System.out.println("gravado");
				
				
			} catch (Exception e){
				System.out.println("n gravado");
				
			}
			
			return false;
		}
	}
	
	public boolean cadastraLivro(String titulo, String autor, String editora, String dataLancamento, String volume, 
			String edicao, int qtdVolumes){
		
		try {
			
			FileInputStream fileInput = new FileInputStream("//home//guilherme//workspace//Biblioteca//db.txt");
			ObjectInputStream objectInput = new ObjectInputStream(fileInput);
			Biblioteca b = (Biblioteca)objectInput.readObject();
			objectInput.close();
			b.cadastrarLivro(titulo, autor, editora, dataLancamento, volume, edicao, qtdVolumes);
			
			FileOutputStream fileOutput = new FileOutputStream("//home//guilherme//workspace//Biblioteca//db.txt");
			ObjectOutputStream objGravar = new ObjectOutputStream(fileOutput);
			
			objGravar.writeObject(b);
			objGravar.flush();
			objGravar.close();
			JOptionPane.showMessageDialog(null, "Livro gravado");
			
			return true;
			
			
			
			
		} catch (Exception e){
			e.printStackTrace();
			return false;
			
		}
		
		
	}
	
	public void listarLivros(){
		Biblioteca b = null;
		try {
		
		FileInputStream fileInput = new FileInputStream("//home//guilherme//workspace//Biblioteca//db.txt");
		ObjectInputStream objectInput = new ObjectInputStream(fileInput);
		b = (Biblioteca)objectInput.readObject();
		objectInput.close();
		
		} catch (Exception e){
			JOptionPane.showMessageDialog(null, "deu ruim");
			e.printStackTrace();
			
		}
		
		b.listarLivros();
		
		
	}
	
	public boolean cadastrarAluno (String nome, String telefone, String dataNasci, String matAluno, int anoAluno){
		try {
			
			FileInputStream fileInput = new FileInputStream("//home//guilherme//workspace//Biblioteca//db.txt");
			ObjectInputStream objectInput = new ObjectInputStream(fileInput);
			Biblioteca b = (Biblioteca)objectInput.readObject();
			objectInput.close();
			b.cadastrarAluno(nome, telefone, dataNasci, matAluno, anoAluno);
			
			FileOutputStream fileOutput = new FileOutputStream("//home//guilherme//workspace//Biblioteca//db.txt");
			ObjectOutputStream objGravar = new ObjectOutputStream(fileOutput);
			
			objGravar.writeObject(b);
			objGravar.flush();
			objGravar.close();
			JOptionPane.showMessageDialog(null, "Aluno gravado");
			
			return true;
			
			
			
			
		} catch (Exception e){
			e.printStackTrace();
			return false;
			
		}
		
	}
	
	public boolean cadastrarProfessor (String nome, String telefone, String dataNasci, String codigoProf, String dptoProf){
		try {
			
			FileInputStream fileInput = new FileInputStream("//home//guilherme//workspace//Biblioteca//db.txt");
			ObjectInputStream objectInput = new ObjectInputStream(fileInput);
			Biblioteca b = (Biblioteca)objectInput.readObject();
			objectInput.close();
			b.cadastrarProfessor(nome, telefone, dataNasci, codigoProf, dptoProf);
			
			FileOutputStream fileOutput = new FileOutputStream("//home//guilherme//workspace//Biblioteca//db.txt");
			ObjectOutputStream objGravar = new ObjectOutputStream(fileOutput);
			
			objGravar.writeObject(b);
			objGravar.flush();
			objGravar.close();
			JOptionPane.showMessageDialog(null, "Professor gravado");
			
			return true;
			
			
			
			
		} catch (Exception e){
			e.printStackTrace();
			return false;
			
		}
		
	}
	
	public boolean cadastrarExterno (String nome, String telefone, String dataNasci, String tipoExt, String idExt){
		try {
			
			FileInputStream fileInput = new FileInputStream("//home//guilherme//workspace//Biblioteca//db.txt");
			ObjectInputStream objectInput = new ObjectInputStream(fileInput);
			Biblioteca b = (Biblioteca)objectInput.readObject();
			objectInput.close();
			b.cadastrarExterno(nome, telefone, dataNasci, tipoExt, idExt);
			
			FileOutputStream fileOutput = new FileOutputStream("//home//guilherme//workspace//Biblioteca//db.txt");
			ObjectOutputStream objGravar = new ObjectOutputStream(fileOutput);
			
			objGravar.writeObject(b);
			objGravar.flush();
			objGravar.close();
			JOptionPane.showMessageDialog(null, "Externo gravado");
			
			return true;
			
			
			
			
		} catch (Exception e){
			e.printStackTrace();
			return false;
			
		}
		
	}
	
	public HashSet<Livro> retornaLivrosEmprestaveis (){
		
		HashSet<Livro> livros = new HashSet();
		try {
			FileInputStream fileInput = new FileInputStream("//home//guilherme//workspace//Biblioteca//db.txt");
			ObjectInputStream objectInput = new ObjectInputStream(fileInput);
			Biblioteca b = (Biblioteca)objectInput.readObject();
			objectInput.close();
			livros = b.retornaLivrosEmprestaveis();
		
		
		} catch (Exception e){
			e.printStackTrace();
		}
		
		return livros;
		
	}
	
	public HashSet<Usuario> retornaUsuariosEmprestaveis (){
		

		HashSet<Usuario> usuarios = new HashSet();
		try {
			FileInputStream fileInput = new FileInputStream("//home//guilherme//workspace//Biblioteca//db.txt");
			ObjectInputStream objectInput = new ObjectInputStream(fileInput);
			Biblioteca b = (Biblioteca)objectInput.readObject();
			objectInput.close();
			usuarios = b.retornaUsuariosEmprestaveis();
		
		
		} catch (Exception e){
			e.printStackTrace();
		}
		
		return usuarios;
		
		}
		
	}
	
	
	

