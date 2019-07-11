package com.sydiavivyanne.gerenciadortarefas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sydiavivyanne.gerenciadortarefas.modelos.Tarefa;

public interface RepositorioTarefa extends JpaRepository<Tarefa, Long>{
	
	
}
