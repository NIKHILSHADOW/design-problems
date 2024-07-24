package com.example.pen;

import lombok.Getter;

@Getter
public abstract class Pen {
    private String name;
    private String brand;
    private PenType pentype;
    private WritingStrategy writingStrategy;

    // private Pen(String name, String brand, PenType penType, WritingStrategy
    // writingStrategy) {
    // this.name = name;
    // this.brand = brand;
    // this.pentype = penType;
    // this.writingStrategy = writingStrategy;
    // }

    protected Pen(PenBuilder penBuilder) {
        this.name = penBuilder.name;
        this.brand = penBuilder.brand;
        this.pentype = penBuilder.pentype;
        this.writingStrategy = penBuilder.writingStrategy;
    }

    public static PenBuilder builder() {
        return new PenBuilder();
    }

    public static class PenBuilder {
        private String name;
        private String brand;
        private PenType pentype;
        private WritingStrategy writingStrategy;

        public PenBuilder name(String name) {
            this.name = name;
            return this;
        }

        public PenBuilder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public PenBuilder penType(PenType penType) {
            this.pentype = penType;
            return this;
        }

        public PenBuilder writingStrategy(WritingStrategy writingStrategy) {
            this.writingStrategy = writingStrategy;
            return this;
        }

    }

    public abstract void write();
}
