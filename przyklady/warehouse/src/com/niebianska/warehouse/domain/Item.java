package com.niebianska.warehouse.domain;

import java.util.Objects;
import java.util.UUID;

public class Item {
    private final UUID id;
    private final String name;
    private final String type;

    public Item(final String name, final String type) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.type = type;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id: " + id +
                "name: '" + name + '\'' +
                "type: '" + type + '\'' +
                '}';
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Item item = (Item) o;
        return Objects.equals(id, item.id) &&
                Objects.equals(name, item.name) &&
                Objects.equals(type, item.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, type);
    }
}
