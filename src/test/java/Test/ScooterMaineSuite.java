package Test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import ru.yandex.data.Url;
import ru.yandex.ScooterPageObject.MainePage;
import ru.yandex.data.AnswersManePage;

import static com.codeborne.selenide.Selenide.page;

public class ScooterMaineSuite extends BaseTest {

    private static final MainePage mainePage = page(MainePage.class);

    @BeforeAll
    public static void startTest(){
        mainePage
                .open(Url.MainPage)
                .clickButtonAcceptCookie();
    }

    // Проверка ответов на вопросы
    @ParameterizedTest
    @EnumSource(
            value = AnswersManePage.class,
            names = {"FirstAnswer", "SecondAnswer", "ThirdAnswer", "FourthAnswer",
                    "FifthAnswer", "SixthAnswer", "SeventhAnswer", "EighthAnswer"})
    public void answersToQuestionsTwo(AnswersManePage answersManePage) {

        mainePage
                .open(Url.MainPage)
                .openQuestionAndCheckingAnswer(answersManePage);
    }

    // Тест проверяет, что находясь на главной странице
    // и кликая на кнопку "Скутер", пользователь остается на главной
    @Test
    public void buttonScooterInManePage() {

        mainePage
                .open(Url.MainPage)
                .clickButtonScooter()
                .urlIsManeScooter();
    }

    // Тест проверяет, что находясь на главной странице и кликая на
    // кнопку "Яндекс", у пользователя открывается страница с Яндексом
    @Test
    public void buttonYandexInManePage() {

        mainePage
                .open(Url.MainPage)
                .clickButtonYandex()
                .isUrlIsYandex();
    }
}