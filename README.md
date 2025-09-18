# Maratona Java Virado no Jiraiya


## Interfaces
___
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