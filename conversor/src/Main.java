import javax.swing.JOptionPane;

class ConversorMoedas {

    public static void main(String[] args) {

        // Loop principal para permitir que o usuário faça várias conversões
        boolean continuar = true;
        while (continuar) {

            // 1. Apresenta o menu de opções para o usuário
            String[] opcoesDeConversao = {
                    "Reais para Dólar",
                    "Dólar para Reais",
                    "Reais para Euro",
                    "Euro para Reais",
                    "Sair"
            };

            Object escolha = JOptionPane.showInputDialog(
                    null,
                    "Escolha a moeda para a conversão:",
                    "Conversor de Moedas",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opcoesDeConversao,
                    opcoesDeConversao[0]
            );

            // Se o usuário clicar em "Cancelar" ou fechar a janela, o programa encerra.
            if (escolha == null || escolha.equals("Sair")) {
                JOptionPane.showMessageDialog(null, "Programa encerrado.");
                break; // Sai do loop 'while'
            }

            // 2. Solicita ao usuário o valor a ser convertido
            String valorString = JOptionPane.showInputDialog("Digite o valor a ser convertido:");

            // Variável para armazenar o valor numérico
            double valor = 0;

            // Usa try-catch para validar a entrada do usuário
            try {
                // Tenta converter a string para um número decimal
                valor = Double.parseDouble(valorString);
            } catch (NumberFormatException e) {
                // Se a conversão falhar (se o usuário digitar texto, por exemplo)
                JOptionPane.showMessageDialog(null, "Valor inválido. Por favor, digite apenas números.");
                continue; // Volta para o início do loop
            }

            // 3. Define as taxas de câmbio (você pode atualizar esses valores)
            final double TAXA_DOLAR_PARA_REAL = 5.25;
            final double TAXA_EURO_PARA_REAL = 6.05;

            // 4. Realiza o cálculo baseado na escolha do usuário
            double resultado = 0;
            String mensagemResultado = "";

            switch (escolha.toString()) {
                case "Reais para Dólar":
                    resultado = valor / TAXA_DOLAR_PARA_REAL;
                    mensagemResultado = String.format("R$ %.2f equivalem a US$ %.2f", valor, resultado);
                    break;
                case "Dólar para Reais":
                    resultado = valor * TAXA_DOLAR_PARA_REAL;
                    mensagemResultado = String.format("US$ %.2f equivalem a R$ %.2f", valor, resultado);
                    break;
                case "Reais para Euro":
                    resultado = valor / TAXA_EURO_PARA_REAL;
                    mensagemResultado = String.format("R$ %.2f equivalem a € %.2f", valor, resultado);
                    break;
                case "Euro para Reais":
                    resultado = valor * TAXA_EURO_PARA_REAL;
                    mensagemResultado = String.format("€ %.2f equivalem a R$ %.2f", valor, resultado);
                    break;
            }

            // 5. Mostra o resultado da conversão
            JOptionPane.showMessageDialog(null, mensagemResultado);

            // 6. Pergunta se o usuário quer fazer outra conversão
            int resposta = JOptionPane.showConfirmDialog(null, "Deseja fazer outra conversão?", "Continuar?", JOptionPane.YES_NO_OPTION);

            if (resposta == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Programa encerrado.");
                continuar = false; // Sai do loop
            }
        }
    }
}