import com.adapter.Cable;
import com.adapter.ChargingAdapter;
import com.adapter.Iphone;
import com.adapter.TypeCcable;
import com.builder.Phone;
import com.builder.PhoneBuilder;
import com.composite.Computer;
import com.composite.ComputerLeaf;
import com.factory.Android;
import com.factory.Os;
import com.factory.OsFactory;
import com.prototype.PhoneShop;

public class Main
{
    public static void main( String[] args )
    {
        //Factory design pattern
        OsFactory osf = new OsFactory();
        Os os1 = osf.os_chooser( 1 );
        os1.spec();
        Os os2 =osf.os_chooser( 2 );
        os2.spec();
        Os os3 = osf.os_chooser( 3 );
        os3.spec();
        Os os4 = osf.os_chooser( 8888 );
        os4.spec();

        Android android = new Android();
        android.spec();

        //Builder design pattern
        Phone phone = new PhoneBuilder().setBrand( "Samsung" ).setColor( "Black" ).getPhone();
        System.out.println(phone);

        Phone phone1 = new PhoneBuilder().setPrice( 100000.00 ).getPhone();
        System.out.println(phone1);

        //Adapter design pattern
        Iphone iphone = new Iphone();
        Cable cable = new ChargingAdapter();
        iphone.setCable( cable );
        iphone.chargePhone( "Smartphone is charging" );

        //Composite design pattern
        ComputerLeaf computerLeaf = new ComputerLeaf("MB",1000);
        ComputerLeaf computerLeaf1 = new ComputerLeaf( "HDD",2000 );
        computerLeaf.showPrice();

        Computer computer = new Computer();
        computer.addComponents( computerLeaf );
        computer.addComponents( computerLeaf1 );
        computer.showPrice();


        //Prototype design pattern
        PhoneShop ps =new PhoneShop();
        System.out.println(ps);
    }
}