package edu.example.cards;

// create enum here:
enum Suit {
    CLUBS(Color.BLACK) {
        @Override
        public boolean isBlack() {
            return true;
        }
    },
    DIAMONDS(Color.RED) {
        @Override
        public boolean isRed() {
            return true;
        }
    },
    HEARTS(Color.RED) {
        @Override
        public boolean isRed() {
            return true;
        }
    },
    SPADES(Color.BLACK) {
        @Override
        public boolean isBlack() {
            return true;
        }
    };
    Color color;

    Suit(Color color) {
        this.color = color;
    }

    public boolean isBlack() {
        return false;
    }

    public boolean isRed() {
        return false;
    }

    @Override
    public String toString() {
        String sSuit = Suit.this.name().toLowerCase();
        return sSuit.substring(0, 1).toUpperCase() + sSuit.substring(1) + color.toString();
    }
    enum Color {
        RED,
        BLACK;

        @Override
        public String toString(){
            String sColor = Color.this.name().toLowerCase();
            return " Color is " +sColor.substring(0,1).toUpperCase() + sColor.substring(1);
        }
    }
}
