public class ExceptionExam {
    public static void main(String[] args) {
        int num = 10; //4
        long num2 = 20L; //8
        char c= 'A'; //1

//        if(true){ //컴파일에러
//            System.out.println("hihi");
//        }
//
//        int[] arr = new int[3];
//        arr[4] = 10; //실행해보기 전에는 모르는 오류 => 런타임 오류

        //프로그램 실행 전에 코드 보고 변수 크기 계산 => 컴파일 타임
        //프로그램 시행 중 => 런타임

        //예외가 발생하면 프로그램 종료 -> 잘 처리해서 프로그램 잘 되도록
        try{
            int[] arr = new int[3];
            arr[2] = 10;

            String str = "1a";
            int rst = Integer.parseInt(str);
            System.out.println(rst + 3);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("배열 관련 예외 발생");
        }catch (NumberFormatException e){
            System.out.println("숫자 변환 관련 예외 발생");
        }catch (Exception e){
            System.out.println("예외 발생");
        }

        System.out.println("hihi");
    }
}
