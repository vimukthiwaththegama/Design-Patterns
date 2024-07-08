package com.phone;

public class OsFactory
{
    public Os os_chooser( Integer operatingSystem )
    {
        if( operatingSystem == 1 )
        {
            return new Android();
        }
        else if( operatingSystem == 2 )
        {
            return new Ios();
        }
        else
        {
            return new Windows();
        }
    }
}
