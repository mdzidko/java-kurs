package com.niebianska.warehouse.domain;

import java.util.Objects;

public class Item {
    private final String name;
    private final PackageType packageType;

    public Item(final String name, final String packageType) {
        this.name = name;
        this.packageType = PackageType.valueOf(packageType.toUpperCase());
    }

    public String getName() {
        return name;
    }

    public PackageType getPackageType() {
        return packageType;
    }

    @Override
    public String toString() {
        return "name: " + name + ", packageType: " + packageType;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Item item = (Item) o;
        return Objects.equals(name, item.name) && Objects.equals(packageType, item.packageType);
    }
}
