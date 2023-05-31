package Day7;

public class CustomException extends Exception { // 에러를 만들어보자~
    public CustomException(String message) {  // command +n 해서 String 붙은걸로 생성
        super(message);
    }
}

