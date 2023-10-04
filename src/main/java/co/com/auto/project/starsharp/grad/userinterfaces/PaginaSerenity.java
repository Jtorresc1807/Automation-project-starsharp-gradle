package co.com.auto.project.starsharp.grad.userinterfaces;


import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

@DefaultUrl("https://demo.serenity.is/Account/Login/")
public class PaginaSerenity extends PageObject {
    public static final Target TXT_USUARIO = Target.the("Ingresar Usuario").located(By.xpath("//input[@id='LoginPanel0_Username']"));
    public static final Target TXT_CONTRASENIA = Target.the("Ingresar Contraseña").located(By.xpath("//input[@id='LoginPanel0_Password']"));
    public static final Target BTN_SING_IN = Target.the("Boton Ingresar").located(By.xpath("//button[@id='LoginPanel0_LoginButton']"));
    public static final Target LBL_DASHBOARD = Target.the("Verifica Ingreso").located(By.xpath("//h3[contains(text(), 'Orders')]"));

}