# Introdução à linguagem Java
Este conteúdo apresenta os conceitos iniciais da linguagem Java, abordando sua origem, principais características e estrutura básica de desenvolvimento.

## Histórico do Java
- Criado pela Sun Microsystems em 1995
- Tornou-se open source em 2006
- Adquirido pela Oracle em 2009
- Utilizado em diversas plataformas (desktop, web, mobile, TV)

## Principais siglas
- **JRE (Java Runtime Environment)**: Ambiente necessário para executar aplicações Java.
- **JSE (Java Standard Edition)**: Versão padrão para desenvolvimento desktop.
- **JEE (Java Enterprise Edition)**: Voltado para aplicações web e servidores (Utiliza tecnologias como JSP e Servlets).
- **JME (Java Micro Edition)**: Para dispositivos com recursos limitados (ex: celulares).
- **JavaFX**: Plataforma para criação de interfaces gráficas modernas.
- **JDK (Java Development Kit)**: Kit de desenvolvimento Java, inclui ferramentas para compilar e executar código e com versões LTS comuns: 8, 11, 17.

## Build tools
- Ferramentas para automatizar compilação e build de projetos

## Características do Java
- Orientado a objetos
- Multiplataforma
- Portável
- Suporte a rede
- Integração com banco de dados

## Estrutura de arquivos
- `.java`: Código fonte, criado em editores de texto ou IDEs.
- `.class`: Arquivo compilado, executado pela JVM.
- `.jar`: Arquivo compactado contendo classes e recursos do projeto

## IDE (NetBeans)
- Ambiente de desenvolvimento integrado
- Possui:
  - Editor de código
  - Compilador
  - Depurador
- Projeto é organizado em:
  - Pacotes
  - Classes
  - Arquivos fonte

## Criação de projeto
- Definir nome do projeto
- Definir pacote inicial
- Criar classe principal
- IDE pode gerar código automaticamente

## Instalação
- Baixar e instalar o JDK (Oracle)
- Baixar o NetBeans (Apache)
- Configurar plugins necessários (ex: nb-javac)

## Primeiro programa (Hello World)
```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Olá Mundo!");
    }
}
```
Executado via IDE (ex: tecla F6 no NetBeans)
