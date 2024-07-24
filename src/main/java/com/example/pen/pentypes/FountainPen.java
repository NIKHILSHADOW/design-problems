package com.example.pen.pentypes;

import com.example.pen.Ink;
import com.example.pen.Nib;
import com.example.pen.Pen;

import lombok.Getter;

@Getter
public class FountainPen extends Pen {

    private Ink ink;
    private Nib nib;

    // public FountainPen(Ink ink, Nib nib, String name, String brand,
    // WritingStrategy writingStrategy) {
    // super(name, brand, PenType.FOUNTAINPEN, writingStrategy);
    // this.ink = ink;
    // this.nib = nib;
    // }

    private FountainPen(Builder builder) {
        super(builder);
        this.ink = builder.ink;
        this.nib = builder.nib;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder extends PenBuilder {
        private Ink ink;
        private Nib nib;

        public Builder ink(Ink ink) {
            this.ink = ink;
            return this;
        }

        public Builder nib(Nib nib) {
            this.nib = nib;
            return this;
        }

        public FountainPen build() {
            return new FountainPen(this);
        }
    }

    @Override
    public void write() {
        this.getWritingStrategy().write();
    }
}
