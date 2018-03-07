package com.movisens.smartgattlib.helper;

public abstract class AbstractAttribute
{

    protected byte[] data;

    public byte[] getBytes()
    {
        return data;
    }

    public abstract Characteristic<? extends AbstractAttribute> getCharacteristic();

    public boolean isReadable()
    {
        return false;
    }

    public boolean isWritable()
    {
        return false;
    }

}
