public static Produto buscarPorDescricao(List<Produto> listaOrdenada, String descricao) {
    int esquerda = 0, direita = listaOrdenada.size() - 1;
    while (esquerda <= direita) {
    int meio = (esquerda + direita) / 2;
    Produto atual = listaOrdenada.get(meio);
    int comparacao = atual.getDescricao().compareToIgnoreCase(descricao);
    if (comparacao == 0) return atual;
    else if (comparacao < 0) esquerda = meio + 1;
    else direita = meio - 1;
    }
    return null;
    }