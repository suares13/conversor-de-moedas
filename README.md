# Conversor de Moedas

Este projeto é um conversor de moedas desenvolvido em Java. Ele permite converter valores entre diferentes moedas com cotações atualizadas em tempo real, utilizando uma API externa.

### ✨ Funcionalidades

* **Conversão Dinâmica:** Utiliza a API [ExchangeRate-API](https://www.exchangerate-api.com/) para buscar as taxas de câmbio mais recentes, garantindo conversões precisas.
* **Moedas Suportadas:** Converte valores entre as seguintes moedas:
    * Real Brasileiro (BRL)
    * Dólar Americano (USD)
    * Euro (EUR)
* **Interface Amigável:** A interação com o usuário é feita por meio de janelas de diálogo, tornando a experiência de uso simples e direta.
* **Validação de Entrada:** Garante que o usuário insira apenas valores numéricos, prevenindo erros na aplicação.
* **Loop de Execução:** Permite realizar múltiplas conversões em uma única sessão, com a opção de continuar ou sair.

### 🛠️ Tecnologias Utilizadas

* **Linguagem de Programação:** Java
* **Gerenciador de Dependências:** Maven
* **Biblioteca de JSON:** Google Gson
* **Interface Gráfica:** `javax.swing.JOptionPane`

---

### 🚀 Como Usar

Para executar o programa, você precisa ter o **Java instalado** na sua máquina.

1.  **Baixe o arquivo JAR:**
    * Vá até a aba **[Releases](https://github.com/suares13/conversor/releases)** deste repositório.
    * Baixe o arquivo `.jar` da última versão.

2.  **Execute o programa:**
    * Abra o seu terminal ou prompt de comando.
    * Navegue até a pasta onde você baixou o arquivo.
    * Execute o comando:
        ```bash
        java -jar nome-do-seu-arquivo.jar
        ```
        (Troque `nome-do-seu-arquivo.jar` pelo nome exato do arquivo que você baixou).

---

### ✒️ Autor

* **Victória Suares** - [Github] (https://github.com/suares13)
* [LinkedIn](https://www.linkedin.com/in/victoria-suares/)

### 🎓 Agradecimentos

Este projeto foi desenvolvido como parte de um estudo sobre gerenciamento de projetos Java com Maven e consumo de APIs REST.
