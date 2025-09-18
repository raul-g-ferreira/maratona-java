# Maratona Java Virado no Jiraiya


## Interfaces
___
- São "contratos" feitos pra serem implementados
  -  por isso não podem ser final
- Os métodos criados são (por padrão) abstratos
- Não são extendidas (*extends*), e sim implementadas (*implements*)
#### Exemplo de uso:
```java
public interface DataLoader {
    void load();
}
```