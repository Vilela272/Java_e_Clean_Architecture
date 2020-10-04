<h1 align="center">
     Curso de Java e Clean Architecture: Descomplicando arquitetura de software   💜🚀
</h1>

### :scroll: Sobre
```bash
$ Qual é a sua definição de arquitetura de software

$ Resumo
$ Qual é a sua definição de arquitetura de software?

# O SEI compilou uma lista de definições modernas, clássicas e bibliográficas de arquitetura de software. As definições # modernas vêm da Arquitetura de software na prática e da norma ANSI / IEEE 1471-2000, Prática recomendada para 
# descrição arquitetônica de sistemas intensivos em software. As definições clássicas aparecem em alguns dos livros e 
# artigos mais proeminentes ou influentes sobre arquitetura. As definições bibliográficas são retiradas de papéis e 
# artigos em nossa bibliografia de arquitetura de software.

$ Arquitetura Limpa (Clean Architecture)

# A arquitetura limpa criada por Uncle Bob (Robert C. Martin), representada por um diagrama com camadas circulares
# concêntricas, baseia-se no isolamento dessas camadas, para que a substituição dos componentes na camada sejam fáceis
# e não afetem todo o sistema. A troca de um componente por outro não deve fazer o software funcionar diferente, ou até
# mesmo parar de funcionar. As responsabilidades das camadas são definidas da seguinte forma:

$ Framework e Drivers

# É a camada mais externa, protege o sistema das mudanças de detalhes, ou seja as alterações nesta camada não implicam
# na funcionalidade do software, por isso é a camada dos detalhes e que se comunica com o próximo círculo interno.

$ Adaptadores de interfaces (Interface Adapters)

# Converte os dados informados pelos usuários em uma estrutura que interage com o sistema, é a camada onde reside os
# presenters, controles, gateways e repositories.

$  Regras de negócios de aplicações (Application Business Rules)

# É responsável pelo processamento das informações, é onde ficam os casos de uso, onde acontece a validação das regras
# de negócios e feedback do que está acontecendo.

$ Regras de negócios corporativos (Enterprise Business Rules)

# Camada das entities onde ficam os códigos de regra de negócio à nível de negócio. Esses códigos devem estar prontos
# para o reaproveitamento.
```
<h1 align="center">
    <img src="https://i.ibb.co/tJGvHCG/arqClean.png" alt="arqClean" border="0">
</h1>

```bash
# Na proposta da Arquitetura limpa todas as dependências devem apontar para dentro, os círculos externos são mecanismos
# e os internos políticas. Em outras palavras o código fonte não deve ter conhecimento das camadas externas a sua
# camada, não devem ter nenhum tipo de dependência a estas por isso o nome de Regra da Dependência.
```
### :computer: Stack
#### :japanese_ogre: Back-end
```bash
- Java 11
- Maven (3.8.0)
- JUnit 5
```
```bash
# Foi criada duas Branches, uma para desenvolvimento e outra para testes.

$ Branch - development (dar andamento no desenvolvimento do projeto Java e Clean Architecture)
$ Branch - release (dar andamento nos testes do projeto Java e Clean Architecture) 
```
## :black_nib: Author - Guilherme Vilela Moreira - Software Engineer at Accenture

##### Talk is cheap, show me the code!
Torvalds, Linus.
---