Comparator<Produto> comparadorPrecoDescricao = Comparator
.comparingDouble(Produto::getPreco)
.thenComparing(Produto::getDescricao);
