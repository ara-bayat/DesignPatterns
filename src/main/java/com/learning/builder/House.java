package com.learning.builder;

public class House {
    private String walls;
    private String roof;
    private String windows;

    private House(Builder builder) {
        this.walls = builder.walls;
        this.roof = builder.roof;
        this.windows = builder.windows;
    }

    @Override
    public String toString() {
        return "House with " + walls + ", " + roof + ", and " + windows;
    }

    // Inner class for building House
    public static class Builder {
        private String walls;
        private String roof;
        private String windows;

        public Builder walls(String walls) {
            this.walls = walls;
            return this;
        }

        public Builder roof(String roof) {
            this.roof = roof;
            return this;
        }

        public Builder windows(String windows) {
            this.windows = windows;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }
    public static Builder builder() {
        return new Builder();
    }
}

