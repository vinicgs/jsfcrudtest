package com.vinicgs.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.vinicgs.model.Evento;

@Named
@SessionScoped
public class EventoBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private Evento evento;

	private List<Evento> eventos = new ArrayList<Evento>();

	public String adicionarEvento() {
		eventos.add(evento);
		System.out.println("Evento " + evento.getNome() + " cadastrado com sucesso!");
		clear();
		return "";

	}

	public String excluirEvento(Evento e) {
		eventos.remove(e);
		System.out.println("Evento " + e.getNome() + " excluido com sucesso!");
		return "";
	}

	public String editarEvento(Evento e) {
		evento = e;
		return "";
	}

	public void clear() {
		this.evento = new Evento();
	}

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	public List<Evento> getEventos() {
		return eventos;
	}

	public void setEventos(List<Evento> eventos) {
		this.eventos = eventos;
	}

}
