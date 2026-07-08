# TDE-PBL-Tabela-Hash

Laboratorio academico em Java para estudo de estruturas de dados, com
implementacoes iniciais de tabela hash e lista encadeada.

## O que o projeto demonstra

- Criacao de estrutura de tabela hash com armazenamento em array.
- Operacoes basicas de inserir, buscar e remover valores.
- Uso de classe generica para lista encadeada.
- Pratica de organizacao de modelos em pacotes Java.

## Estrutura

```text
src/Application.java
src/models/TabelaHash.java
src/models/ListaEncadeada.java
```

## Como executar

Este projeto nao possui ferramenta de build configurada. Para compilar usando o
JDK diretamente:

```powershell
javac src/Application.java src/models/*.java
java src.Application
```

No estado atual, `Application.java` ainda nao possui fluxo de demonstracao. As
estruturas principais estao em `src/models`.

## Status

Projeto de estudo em andamento. Um proximo passo util seria adicionar uma classe
de demonstracao com entradas de exemplo, tratar colisoes da tabela hash e criar
testes simples para as operacoes principais.

