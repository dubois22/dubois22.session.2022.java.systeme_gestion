public class getset {
    private int num;

    public int getnum() {
        return num;
    }

    public void setnum(int num) {
        this.num = num;
    }

    public static void main(String[] args) {
        getset papa = new getset();
        papa.setnum(10);
        System.out.println("numero : " + papa.getnum());
        System.out.println("en fin j'ai reussi mon accesseur et mutateur");
    }
}