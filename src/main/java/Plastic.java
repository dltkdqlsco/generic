public class Plastic extends Material{

    public String toString(){
        return "재료는 plastic 입니다.";
    }

    @Override
    public void doPrinter() {
        System.out.println("plastic 재료로 출력 합니다.");
    }
}
