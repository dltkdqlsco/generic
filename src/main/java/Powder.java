public class Powder extends Material{

    public String toString(){
        return "재료는 powder 입니다.";
    }

    @Override
    public void doPrinter() {
        System.out.println("powder 재료로 출력합니다.");
    }
}
