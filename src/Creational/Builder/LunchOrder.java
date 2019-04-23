package Creational.Builder;

public class LunchOrder {

    private String bread;
    private String condiments;
    private String dressing;
    private String meat;

    private LunchOrder(Builder builder) {
        bread = builder.bread;
        condiments = builder.condiments;
        dressing = builder.dressing;
        meat = builder.meat;
    }

    public String getBread() {
        return bread;
    }

    public String getCondiments() {
        return condiments;
    }

    public String getDressing() {
        return dressing;
    }

    public String getMeat() {
        return meat;
    }

    public static final class Builder {
        private String bread;
        private String condiments;
        private String dressing;
        private String meat;

        public Builder() {
        }

        public Builder bread(String val) {
            bread = val;
            return this;
        }

        public Builder condiments(String val) {
            condiments = val;
            return this;
        }

        public Builder dressing(String val) {
            dressing = val;
            return this;
        }

        public Builder meat(String val) {
            meat = val;
            return this;
        }

        public LunchOrder build() {
            return new LunchOrder(this);
        }
    }
}
