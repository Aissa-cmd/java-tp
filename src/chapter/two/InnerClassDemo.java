package chapter.two;


public class InnerClassDemo {
    public static void main(String[] args) {
        OuterClass.InnerClass ic = new OuterClass.InnerClass("Aissa");
        System.out.println(ic);
    }
}

class OuterClass {
    public static class InnerClass {
        private String name;

        public InnerClass(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            // TODO Auto-generated method stub
            return String.format("InnerClass[name=%s]", this.name);
        }
    }
}
