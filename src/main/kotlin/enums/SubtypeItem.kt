package org.example.enums

enum class SubtypeItem(val description: String, val typeItem: TypeItem) {
    // Laticínios
    LEITE("Leite", TypeItem.LATICINIOS),
    QUEIJO("Queijo", TypeItem.LATICINIOS),
    IOGURTE("Iogurte", TypeItem.LATICINIOS),
    MANTEIGA("Manteiga", TypeItem.LATICINIOS),
    REQUEIJAO("Requeijão", TypeItem.LATICINIOS),

    // Carnes
    CARNE_BOVINA("Carne Bovina", TypeItem.CARNES),
    CARNE_SUINA("Carne Suína", TypeItem.CARNES),
    CARNE_OVINA("Carne Ovina", TypeItem.CARNES),

    // Aves
    FRANGO("Frango", TypeItem.AVES),
    PERU("Peru", TypeItem.AVES),
    PATO("Pato", TypeItem.AVES),

    // Peixes e Frutos do Mar
    PEIXE_AGUA_DOCE("Peixe de Água Doce", TypeItem.PEIXES_FRUTOS_MAR),
    PEIXE_AGUA_SALGADA("Peixe de Água Salgada", TypeItem.PEIXES_FRUTOS_MAR),
    CAMARAO("Camarão", TypeItem.PEIXES_FRUTOS_MAR),
    LULA("Lula", TypeItem.PEIXES_FRUTOS_MAR),

    // Grãos e Cereais
    ARROZ("Arroz", TypeItem.GRAOS_CEREAIS),
    AVEIA("Aveia", TypeItem.GRAOS_CEREAIS),
    TRIGO("Trigo", TypeItem.GRAOS_CEREAIS),
    QUINOA("Quinoa", TypeItem.GRAOS_CEREAIS),

    // Leguminosas
    FEIJAO("Feijão", TypeItem.LEGUMINOSAS),
    LENTILHA("Lentilha", TypeItem.LEGUMINOSAS),
    GRAO_BICO("Grão de Bico", TypeItem.LEGUMINOSAS),
    ERVILHA("Ervilha", TypeItem.LEGUMINOSAS),

    // Verduras
    ALFACE("Alface", TypeItem.VERDURAS),
    COUVE("Couve", TypeItem.VERDURAS),
    ESPINAFRE("Espinafre", TypeItem.VERDURAS),
    RUCULA("Rúcula", TypeItem.VERDURAS),

    // Legumes
    TOMATE("Tomate", TypeItem.LEGUMES),
    CENOURA("Cenoura", TypeItem.LEGUMES),
    BATATA("Batata", TypeItem.LEGUMES),
    ABOBRINHA("Abobrinha", TypeItem.LEGUMES),
    BERINJELA("Berinjela", TypeItem.LEGUMES),

    // Frutas
    BANANA("Banana", TypeItem.FRUTAS),
    MACA("Maçã", TypeItem.FRUTAS),
    LARANJA("Laranja", TypeItem.FRUTAS),
    MORANGO("Morango", TypeItem.FRUTAS),
    MANGA("Manga", TypeItem.FRUTAS),

    // Pães e Massas
    PAO_FRANCES("Pão Francês", TypeItem.PAES_MASSAS),
    PAO_FORMA("Pão de Forma", TypeItem.PAES_MASSAS),
    MACARRAO("Macarrão", TypeItem.PAES_MASSAS),
    PIZZA("Pizza", TypeItem.PAES_MASSAS),

    // Doces e Sobremesas
    CHOCOLATE("Chocolate", TypeItem.DOCES_SOBREMESAS),
    BOLO("Bolo", TypeItem.DOCES_SOBREMESAS),
    SORVETE("Sorvete", TypeItem.DOCES_SOBREMESAS),
    BISCOITO("Biscoito", TypeItem.DOCES_SOBREMESAS),

    // Bebidas
    REFRIGERANTE("Refrigerante", TypeItem.BEBIDAS),
    SUCO("Suco", TypeItem.BEBIDAS),
    CAFE("Café", TypeItem.BEBIDAS),
    CHA("Chá", TypeItem.BEBIDAS),
    AGUA("Água", TypeItem.BEBIDAS),

    // Oleaginosas
    AMENDOIM("Amendoim", TypeItem.OLEAGINOSAS),
    CASTANHA("Castanha", TypeItem.OLEAGINOSAS),
    AMENDOA("Amêndoa", TypeItem.OLEAGINOSAS),
    NOZ("Noz", TypeItem.OLEAGINOSAS),

    // Condimentos e Temperos
    SAL("Sal", TypeItem.CONDIMENTOS_TEMPEROS),
    PIMENTA("Pimenta", TypeItem.CONDIMENTOS_TEMPEROS),
    ALHO("Alho", TypeItem.CONDIMENTOS_TEMPEROS),
    CEBOLA("Cebola", TypeItem.CONDIMENTOS_TEMPEROS),

    // Óleos e Gorduras
    OLEO_SOJA("Óleo de Soja", TypeItem.OLEOS_GORDURAS),
    AZEITE("Azeite", TypeItem.OLEOS_GORDURAS),
    OLEO_GIRASSOL("Óleo de Girassol", TypeItem.OLEOS_GORDURAS),

    // Ovos
    OVO_GALINHA("Ovo de Galinha", TypeItem.OVOS),
    OVO_CODORNA("Ovo de Codorna", TypeItem.OVOS),

    // Embutidos
    PRESUNTO("Presunto", TypeItem.EMBUTIDOS),
    SALSICHA("Salsicha", TypeItem.EMBUTIDOS),
    MORTADELA("Mortadela", TypeItem.EMBUTIDOS),
    LINGUICA("Linguiça", TypeItem.EMBUTIDOS),

    // Congelados
    VEGETAIS_CONGELADOS("Vegetais Congelados", TypeItem.CONGELADOS),
    REFEICAO_PRONTA("Refeição Pronta", TypeItem.CONGELADOS),
    HAMBURGUER("Hambúrguer", TypeItem.CONGELADOS),

    // Enlatados
    MILHO_ENLATADO("Milho Enlatado", TypeItem.ENLATADOS),
    ERVILHA_ENLATADA("Ervilha Enlatada", TypeItem.ENLATADOS),
    ATUM_ENLATADO("Atum Enlatado", TypeItem.ENLATADOS),
    SARDINHA_ENLATADA("Sardinha Enlatada", TypeItem.ENLATADOS),

    // Snacks e Salgadinhos
    CHIPS("Chips", TypeItem.SNACKS_SALGADINHOS),
    PIPOCA("Pipoca", TypeItem.SNACKS_SALGADINHOS),
    AMENDOIM_SALGADO("Amendoim Salgado", TypeItem.SNACKS_SALGADINHOS),
    SALGADINHO("Salgadinho", TypeItem.SNACKS_SALGADINHOS)
}