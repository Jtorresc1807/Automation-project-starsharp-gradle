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
    public static final Target BTN_ORGANIZACION = Target.the("Botón Organización").located(By.xpath("//span[contains(text(), 'Organization')]"));
    public static final Target BTN_UNIDADES = Target.the("Botón Unidades negocio").located(By.xpath("//span[contains(text(), 'Business Units')]"));
    public static final Target BTN_NEWUNIDAD = Target.the("Botón Nueva Unidad").located(By.xpath("//span[contains(text(), ' New Business Unit')]"));
    public static final Target TXT_NEWUNIDAD = Target.the("Nombre Nueva Unidad").located(By.xpath("//input[@id='Serenity_Pro_Organization_BusinessUnitDialog3_Name']"));
    public static final Target SELECIONAR = Target.the("Filtro Seleccionar").located(By.xpath("//span[@id='select2-chosen-1']"));
    public static final Target SELECT = Target.the("Selecionar Unidad Principal").located(By.xpath("//div[@id='select2-result-label-17']"));
    public static final Target SAVE = Target.the("Botón Guardar").located(By.xpath("//span[contains(text(), ' Save')]"));

}