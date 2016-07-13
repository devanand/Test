public class PughFail {
    
	public static class Something {
        private Something() {
            throw new RuntimeException("I dont want this happening");
        }
        private static class LazyHolder {
            private static final Something INSTANCE = new Something();
        }
        public static Something getInstance() {
            return LazyHolder.INSTANCE;
        }
    }
    
    
    public static void main(String[] args) {
        System.out.println("First try");
        try {
            Something.getInstance();
        } catch (Throwable t) {
            System.out.println(t.getMessage());
        }
        System.out.println("Second try");
        try {
            Something.getInstance();
        } catch (Throwable t) {
            System.out.println(t.getMessage());
        }
    }
}