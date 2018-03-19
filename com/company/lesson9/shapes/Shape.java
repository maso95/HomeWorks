package com.company.lesson9.shapes;

public abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void draw(String color);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof com.company.lesson9.shapes.Shape)) return false;

        com.company.lesson9.shapes.Shape shape = (com.company.lesson9.shapes.Shape) o;

        return getColor() != null ? getColor().equals(shape.getColor()) : shape.getColor() == null;

    }

    @Override
    public int hashCode() {
        return getColor() != null ? getColor().hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                '}';
    }
}
