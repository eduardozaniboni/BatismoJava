- Método Final: Um método declarado com a palavra-chave final não pode ser sobrescrito por subclasses. Isso é útil
  quando se deseja garantir que a implementação de um método permaneça inalterada em classes derivadas.
- Classe Final: Uma classe que é marcada como final não pode ser estendida. Isso impede que outras classes herdem de uma
  classe final, assegurando que sua funcionalidade seja preservada sem modificações.
- Uso Comum: Métodos e classes finais são frequentemente usados em situações onde a segurança, integridade ou o
  comportamento esperado de uma classe precisa ser garantido, como em frameworks ou bibliotecas.
- Benefícios dos Métodos Finais: O uso de métodos finais pode melhorar o desempenho, pois o compilador pode otimizar
  chamadas para esses métodos com a certeza de que não serão alterados em subclasses. Também ajuda a evitar erros
  acidentais de sobrescrita.