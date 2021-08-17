public enum EnDescricao {

    ABAIXO_DO_PESO("Abaixo do peso")  ,
    PESO_IDEAL("Peso Ideal (Parabéns)"), 
    SOBREPESO("Levemente acima do peso"),
    OBESIDADE ("Obesidade do Iº grau"),
    OBESIDADE_IIG ("Obesidade do IIº grau (severa)"),
    OBESIDADE_IIIG ("Obesidade do IIIº grau (mórbido)");
    
 
    String descricao;
    EnDescricao(String descricao){
     this.descricao = descricao;
    }
 
     
 }
 
 