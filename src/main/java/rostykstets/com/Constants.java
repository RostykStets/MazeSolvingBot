package rostykstets.com;

public enum Constants {
    FREE_CELL_SYMBOL('0'),
    WALL_SYMBOL('1'),
    EXIT_SYMBOL('2'),
    ENTRANCE_SYMBOL('#'),
    VISITED_CELL_SYMBOL('.'),
    BOT_SYMBOL('B');

    public final char symbol;

    private Constants(char symbol) {
        this.symbol = symbol;
    }
}
