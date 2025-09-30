# Maratona Java Virado no Jiraiya


___
## Interfaces
- São "contratos" feitos pra serem implementados
  -  por isso não podem ser final
- Os métodos criados são (por padrão) **public abstract**
- Não são extendidas (*extends*), e sim implementadas (*implements*)
- Uma mesma classe pode implementar diversas *interfaces*
#### Exemplo de uso:
```java
public interface DataLoader {
    void load();
}
```
- A partir do java 8, os métodos de uma interface podem ter uma implementação
    - Para isso, utiliza-se **default** 
- Por padrão, todos os atributos são **public static final**

___
## Polimorfismo

## Exceções
Exception e Error são classes filhas de Throwable
#### Error
O sistema para de executar, não pode ser resolvido em tempo de execução

#### Exception
Dois Tipos:
- Checked
    - Filhas diretas da classe Exception. São exceções que se não forem tratadas vão lançar um erro em tempo de compilação 
- Unchecked
    - Filhas da classe RuntimeException. Costumam ser culpa do animal que tá programando
  
## Classes Utilitárias
#### String
- São imutáveis
- Cuidado ao criar outra string igual, coisas estranhas podem acontecer
##### Métodos
- .charAt(pos)
    - devolve o char na posição (pos) passada como argumento
- .length()
    - retorna o length da string
- .replace(x, y)
    - Percorre a string e troca todos os que forem iguais a (x) por (y)
- .toUpperCase() & .toLowerCase()
    
- .substring(inicio) / (inicio, fim)
    - É igual às substrings do python
- .trim()
    - Remove os espaços em branco no início e no fim do conteúdo
