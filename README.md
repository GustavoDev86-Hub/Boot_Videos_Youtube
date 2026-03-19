# Boot_Videos_Youtube - Automação de Downloads

![Status](https://img.shields.io/badge/Status-Conclu%C3%ADdo-brightgreen)

* **Tecnologias Utilizadas**

Para a construção desta ferramenta de automação, foram utilizadas as seguintes ferramentas:

![JAVA](https://img.shields.io/badge/JAVA-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![SELENIUM](https://img.shields.io/badge/SELENIUM-43B02A?style=for-the-badge&logo=selenium&logoColor=white)
![GOOGLE CHROME](https://img.shields.io/badge/GOOGLE%20CHROME-4285F4?style=for-the-badge&logo=googlechrome&logoColor=white)
![WINDOWS](https://img.shields.io/badge/WINDOWS-0078D6?style=for-the-badge&logo=windows&logoColor=white)

* **Linguagem:** Java (JDK 11+)
* **Automação:** Selenium WebDriver
* **Driver:** ChromeDriver (v120+)
* **Ambiente:** Windows

Este projeto é uma ferramenta de automação desenvolvida em Java utilizando Selenium WebDriver. O objetivo principal é automatizar o processo de interação e captura de dados/vídeos da plataforma YouTube de forma eficiente.

* **Como funciona?** O bot utiliza o ChromeDriver para simular a navegação humana no Windows, acessando links específicos e realizando as tarefas de automação programadas diretamente no navegador Chrome instalado na máquina.

O sistema é dividido em duas partes principais:

**Bot Core:** Contém a lógica de navegação, busca e interação com os elementos da página do YouTube.

**Automação de Driver:** Gerencia a instância do navegador para garantir que as ações sejam executadas conforme o script.

* **Pré-requisitos** Antes de rodar, você precisará de:

* Java JDK 11 ou superior.
* Google Chrome instalado.
* ChromeDriver compatível com a sua versão do Chrome baixado e configurado no PATH.

---

## 🚀 Como Executar
1. **Clonar o repositório:**
   ```bash
   git clone [https://github.com/GustavoDev86-Hub/Boot_Videos_Youtube.git](https://github.com/GustavoDev86-Hub/Boot_Videos_Youtube.git)

2. Configurar o WebDriver:
Certifique-se de que o executável do chromedriver.exe está na pasta do projeto ou configurado corretamente no código Java.

3. Abrir na IDE:
Importe o projeto no VS Code ou IntelliJ como um projeto Java/Maven.

4. Executar:
Rode a classe Main do projeto para iniciar a automação.

⚙️ Gerenciamento e Logs
Acompanhamento: O status de cada interação é exibido diretamente no console da IDE.

Manutenção: Se o YouTube atualizar os seletores (IDs e Classes), o código precisará de ajustes nos seletores do Selenium.

Desenvolvido por Gustavo Viana 🚀

1. **Clonar o repositório:**
   ```bash
   git clone [https://github.com/GustavoDev86-Hub/Boot_Videos_Youtube.git](https://github.com/GustavoDev86-Hub/Boot_Videos_Youtube.git)
