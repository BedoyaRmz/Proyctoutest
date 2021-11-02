package proyectoutest.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;
import proyectoutest.userinterface.JoinTodayPage;


public class JoinToday implements Task {

    public static JoinToday onThePage() {
        return Tasks.instrumented(JoinToday.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(JoinTodayPage.REGISTER_BUTTON),
                //PERSONAL DATES
                Enter.theValue("Dahiana").into(JoinTodayPage.FIRSTNAME_INPUT),
                Enter.theValue("Bedoya").into(JoinTodayPage.LASTNAME_INPUT),
                Enter.theValue("bedoyarmz@gmail.com").into(JoinTodayPage.EMAIL_INPUT),
                Enter.keyValues("January").into(JoinTodayPage.MONTH_DDL),
                Enter.keyValues("8").into(JoinTodayPage.DAY_DDL),
                Enter.keyValues("1999").into(JoinTodayPage.YEAR_DDL),
                Click.on(JoinTodayPage.NEXT1_BUTTON),

                //LOCALIZATION
                Enter.theValue(" ").into(JoinTodayPage.CITY_INPUT),
                Enter.keyValues("Salgar Colombia").into(JoinTodayPage.CITY_INPUT),
                Hit.the(Keys.ARROW_DOWN).keyIn(JoinTodayPage.CITY_INPUT),
                Enter.theValue(" ").into(JoinTodayPage.POSTALCODE_INPUT),
                Enter.keyValues("12345").into(JoinTodayPage.POSTALCODE_INPUT),
                Click.on(JoinTodayPage.NEXT2_BUTTON),

                //DEVICES
                //Click.on(JoinTodayPage.equis),
                //Click.on(JoinTodayPage.triangulito),
                //Enter.keyValues("Linux").into(JoinTodayPage.COMPUTER_DDL).thenHit(Keys.ENTER),
                //Click.on(JoinTodayPage.SelectOS),
                //Enter.theValue("Linux Deepin 15.11").into(JoinTodayPage.VERSION_DDL),
                //Enter.keyValues("English").into(JoinTodayPage.LANGUAGE_DDL),
                Click.on(JoinTodayPage.NEXT3_BUTTON),

                //PASSWORD
                Enter.theValue("C6dwqHtf_G.Q.7x").into(JoinTodayPage.PASSWORD1),
                Enter.theValue("C6dwqHtf_G.Q.7x").into(JoinTodayPage.PASSWORD2),
                Click.on(JoinTodayPage.CHECKBOX1),
                Click.on(JoinTodayPage.CHECKBOX2),
                Click.on(JoinTodayPage.CHECKBOX3),
                Click.on(JoinTodayPage.NEXT4_BUTTON));



    }

}
