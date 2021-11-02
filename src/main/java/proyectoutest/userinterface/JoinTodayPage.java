package proyectoutest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class JoinTodayPage {

    public static final Target REGISTER_BUTTON = Target.the("Donde empezamos a hacer el registro")
            .located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a"));
    //datos personales
    public static final Target FIRSTNAME_INPUT = Target.the("Colocamos nombre")
            .located(By.xpath("//*[@id=\"firstName\"]"));
    public static final Target LASTNAME_INPUT = Target.the("Colocamos apellido")
            .located(By.xpath("//*[@id=\"lastName\"]"));
    public static final Target EMAIL_INPUT = Target.the("colocamos email")
            .located(By.xpath("//*[@id=\"email\"]"));
    public static final Target MONTH_DDL = Target.the("colocamos mes de nacimiento")
            .located(By.xpath("//*[@id=\"birthMonth\"]"));
    public static final Target DAY_DDL = Target.the("colocamos año de nacimiento")
            .located(By.xpath("//*[@id=\"birthDay\"]"));
    public static final Target YEAR_DDL = Target.the("colocamos dia de nacimiento")
            .located(By.xpath("//*[@id=\"birthYear\"]"));
    public static final Target NEXT1_BUTTON = Target.the("Seguimos formulario")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));
    //localizacion
    public static final Target CITY_INPUT = Target.the("colocamos ciudad")
            .located(By.xpath("//*[@id=\"city\"]"));
    public static final Target POSTALCODE_INPUT = Target.the("colocamos codigo postal")
            .located(By.xpath("//*[@id=\"zip\"]"));
    public static final Target NEXT2_BUTTON = Target.the("Seguimos formulario2")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a"));
    //dispositivos
    //public static final Target equis = Target.the("x").located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/div[1]/span/a"));
    //public static final Target triangulito = Target.the("x").located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/div[1]/span"));
    //public static final Target COMPUTER_DDL = Target.the("colocamos sistema operativo del pc").located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/input[1]"));
    //public static final Target SelectOS = Target.the("dis soy yo de nuevo").located(By.xpath("//*[@id=\"ui-select-choices-row-5-2\"]/span/div"));
    //public static final Target VERSION_DDL = Target.the("colocamos version del pc").located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/div[1]/span"));
    //public static final Target LANGUAGE_DDL = Target.the("colocamos idioma").located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/div[1]/span"));
    public static final Target NEXT3_BUTTON = Target.the("seguimos formulario 3")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a"));

    //Password
    public static   final Target PASSWORD1 = Target.the("Contraseña")
            .located(By.xpath("//*[@id=\"password\"]"));
    public static   final Target PASSWORD2 = Target.the("confirmacion Contraseña")
            .located(By.xpath("//*[@id=\"confirmPassword\"]"));
    public static   final Target CHECKBOX1 = Target.the("ACEPT 1")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[4]/label/span"));
    public static   final Target CHECKBOX2 = Target.the("ACEPT 2")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static   final Target CHECKBOX3 = Target.the("ACEPT 3")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static   final Target NEXT4_BUTTON = Target.the("ACEPT 3")
            .located(By.xpath("//*[@id=\"laddaBtn\"]"));






}
