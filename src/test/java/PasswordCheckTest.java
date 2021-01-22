import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class PasswordCheckTest {

    @ParameterizedTest
    @MethodSource
    public void PasswordCheckTestEx(String password, boolean expectedResult){
        //WHEN
        boolean result = PasswordCheckApp.passwordCheck(password);
        //THEN
        assertEquals(expectedResult, result);
    }
    private static Stream <Arguments> PasswordCheckTestEx(){
        return Stream.of(
                Arguments.of("bvzuezwg78", true),
                Arguments.of("buz6oi", false),
                Arguments.of("buzbewzsui", false),
                Arguments.of("78684236578", false)
        );
    }

    @ParameterizedTest
    @MethodSource
    public void PasswordListCheckTestEx(String[] passwords, boolean expectedResult){
        //WHEN
        boolean result = PasswordCheckApp.passwordListCheck(passwords);
        //THEN
        assertEquals(expectedResult, result);
    }
    private static Stream <Arguments> PasswordListCheckTestEx(){
        return Stream.of(
                Arguments.of(new String[]{"cubebzu46vu","ucwbcze64bhcd"}, true),
                Arguments.of(new String[]{"Studentfrfe","Studentczeuw76"}, false)
        );
    }
}
