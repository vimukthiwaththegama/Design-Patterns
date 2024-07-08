import com.phone.Android;
import com.phone.Os;
import com.phone.OsFactory;

public class FactoryMain
{
    public static void main( String[] args )
    {
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

    }
}