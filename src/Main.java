void main() {

    Filme filme = new Filme();

    IO.println(filme.getNome());

    filme.setNome("A lagoa azul");

    filme.setDuracao(200);

    IO.println(filme.getDuracao());

    filme.setDataEstreia(LocalDate.of(2026,8,12));

}