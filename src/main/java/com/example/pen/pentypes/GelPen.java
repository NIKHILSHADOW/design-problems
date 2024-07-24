package com.example.pen.pentypes;

import com.example.pen.Pen;
import com.example.pen.Refill;

import lombok.Getter;

@Getter
public class GelPen extends Pen {
    private Refill refill;

    // public GelPen(Refill refill, String name, String brand, WritingStrategy
    // writingStrategy) {
    // super(name, brand, PenType.GELPEN, writingStrategy);
    // this.refill = refill;
    // }

    public static Builder builder() {
        return new Builder();
    }

    private GelPen(Builder builder) {
        super(builder);
        this.refill = builder.refill;
    }

    public static class Builder extends PenBuilder {

        private Refill refill;

        public Builder refill(Refill refill) {
            this.refill = refill;
            return this;
        }

        public GelPen build() {
            return new GelPen(this);
        }

    }

    @Override
    public void write() {
        this.getWritingStrategy().write();
    }

}
