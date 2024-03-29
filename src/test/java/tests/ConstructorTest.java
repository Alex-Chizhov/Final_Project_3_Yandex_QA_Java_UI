package tests;

import io.qameta.allure.Description;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;


public class ConstructorTest extends BaseTest {

    @BeforeEach
    public void openMainPage(){
        app.mainPage.open();
    }

    @Test
    @Description("Transition to Filling in constructor")
    public void transitionToFillingTest() {
        app.constructorPage.clickSpanFilling();
        app.constructorPage.clickFirstFillingCard();
        app.constructorPage.getModalCardText().shouldHave(text("Мясо бессмертных моллюсков Protostomia"));
        }

    @Test
    @Description("Transition to Sauces in constructor")
    public void transitionToSaucesTest() {
        app.constructorPage.clickSpanSauce();
        app.constructorPage.clickFirstSauceCard();
        app.constructorPage.getModalCardText().shouldHave(text("Соус Spicy-X"));

    }

    @Test
    @Description("Transition to Bun in constructor")
    public void transitionToBunTest() {
        app.constructorPage.clickSpanSauce();
        app.constructorPage.clickSpanBun();
        app.constructorPage.clickFirstBunCard();
        app.constructorPage.getModalCardText().shouldHave(text("Флюоресцентная булка R2-D3"));
    }

    @AfterEach
    public void closeModal(){
        app.constructorPage.closeModal();
    }
}


