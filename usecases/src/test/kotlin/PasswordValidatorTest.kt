import com.clean.arquitecture.service.helper.isPasswordValid
import org.junit.Assert
import org.junit.Test
import java.util.stream.Stream

class PasswordValidatorTest {


    fun validPasswordProvider(): Stream<String> {
        return Stream.of(
            "",
            "aa",
            "ab",
            "AAAbbbCc",
            "AbTp9!foo",
            "AbTp9!foA",
            "AbTp9 fok"
        )
    }

    @Test
    fun test_password_regex_invalid() {
        val password = validPasswordProvider()
        password.forEach {
            Assert.assertFalse(isPasswordValid(it))
        }

    }


    @Test
    fun test_password_regex_valid() {
        Assert.assertTrue(isPasswordValid("AbTp9!fok"))


    }


}