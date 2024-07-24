package com.example.pen.pentypes;

import com.example.pen.Pen;
import com.example.pen.PenType;
import com.example.pen.Refill;

import lombok.Getter;

@Getter

public class BallPointPen extends Pen {

    private Refill refill;

    // private BallPointPen(Refill refill, String name, String brand,
    // WritingStrategy writingStrategy) {
    // // super(name, brand, PenType.BALLPOINTPEN, writingStrategy);
    // // this.refill = refill;
    // }

    private BallPointPen(Builder builder) {
        super(builder);
        this.refill = builder.refill;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder extends PenBuilder {
        private Refill refill;

        public Builder refill(Refill refill) {
            this.refill = refill;
            return this;
        }

        public BallPointPen build() {
            if (!check()) {
                throw new RuntimeException("incorrect arg");
            }
            this.penType(PenType.BALLPOINTPEN);
            return new BallPointPen(this);
        }

        private boolean check() {
            return true;
        }
    }

    @Override
    public void write() {
        this.getWritingStrategy().write();
    }

}
