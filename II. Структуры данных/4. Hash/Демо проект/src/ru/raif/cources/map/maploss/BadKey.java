package ru.raif.cources.map.maploss;

public class BadKey {
    private Integer value;

    public BadKey(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BadKey badKey = (BadKey) o;

        return getValue() != null ? getValue().equals(badKey.getValue()) : badKey.getValue() == null;
    }

    @Override
    public int hashCode() {
        return getValue() != null ? getValue().hashCode() : 0;
    }
}
