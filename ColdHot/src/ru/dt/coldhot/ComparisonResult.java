package ru.dt.coldhot;

enum ComparisonResult {
    CLOSER("теплее"),
    EQUAL("Успех!"),
    FAR_AWAY("холодно"),
    SAME("Так же"),
    FIRE("Огонь-огонь!!");

    private String text;

    ComparisonResult(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
