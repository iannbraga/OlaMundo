package controller;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named
@RequestScoped
public class LoginController {

	private String usuario;
	private String senha;
	
	public String entrar() {
		if(usuario.equals("adm") && senha.equals("123")) {
			return "olaMundo.xhtml?faces-redirect=true";
		}
		else {
			FacesContext.getCurrentInstance().addMessage(null, 
					new FacesMessage(FacesMessage.SEVERITY_ERROR, 
							"Usuario e/ou senha incorretos", null));
			return null;
		}
	}
	
	public void limpar() {
		
	}
	
	public String getUsuario() {
		return usuario;
	}
	
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
