/* ZCM type definition class file
 * This file was automatically generated by zcm-gen
 * DO NOT MODIFY BY HAND!!!!
 */

package craebot;
 
import java.io.*;
import java.util.*;
import zcm.zcm.*;
 
public final class buttons_t implements zcm.zcm.ZCMEncodable
{
    public long utime;
    public boolean clean;
    public boolean day;
    public boolean hour;
    public boolean minute;
    public boolean dock;
    public boolean spot;
    public boolean wheeldrop;
    public boolean cliff;
 
    public buttons_t()
    {
    }
 
    public static final long ZCM_FINGERPRINT;
    public static final long ZCM_FINGERPRINT_BASE = 0x2fd9e0742ca00fc3L;
 
    static {
        ZCM_FINGERPRINT = _hashRecursive(new ArrayList<Class<?>>());
    }
 
    public static long _hashRecursive(ArrayList<Class<?>> classes)
    {
        if (classes.contains(craebot.buttons_t.class))
            return 0L;
 
        classes.add(craebot.buttons_t.class);
        long hash = ZCM_FINGERPRINT_BASE
            ;
        classes.remove(classes.size() - 1);
        return (hash<<1) + ((hash>>>63)&1);
    }
 
    public void encode(DataOutput outs) throws IOException
    {
        outs.writeLong(ZCM_FINGERPRINT);
        _encodeRecursive(outs);
    }
 
    public void _encodeRecursive(DataOutput outs) throws IOException
    {
        outs.writeLong(this.utime); 
 
        outs.writeByte( this.clean ? 1 : 0); 
 
        outs.writeByte( this.day ? 1 : 0); 
 
        outs.writeByte( this.hour ? 1 : 0); 
 
        outs.writeByte( this.minute ? 1 : 0); 
 
        outs.writeByte( this.dock ? 1 : 0); 
 
        outs.writeByte( this.spot ? 1 : 0); 
 
        outs.writeByte( this.wheeldrop ? 1 : 0); 
 
        outs.writeByte( this.cliff ? 1 : 0); 
 
    }
 
    public buttons_t(byte[] data) throws IOException
    {
        this(new ZCMDataInputStream(data));
    }
 
    public buttons_t(DataInput ins) throws IOException
    {
        if (ins.readLong() != ZCM_FINGERPRINT)
            throw new IOException("ZCM Decode error: bad fingerprint");
 
        _decodeRecursive(ins);
    }
 
    public static craebot.buttons_t _decodeRecursiveFactory(DataInput ins) throws IOException
    {
        craebot.buttons_t o = new craebot.buttons_t();
        o._decodeRecursive(ins);
        return o;
    }
 
    public void _decodeRecursive(DataInput ins) throws IOException
    {
        this.utime = ins.readLong();
 
        this.clean = ins.readByte()!=0;
 
        this.day = ins.readByte()!=0;
 
        this.hour = ins.readByte()!=0;
 
        this.minute = ins.readByte()!=0;
 
        this.dock = ins.readByte()!=0;
 
        this.spot = ins.readByte()!=0;
 
        this.wheeldrop = ins.readByte()!=0;
 
        this.cliff = ins.readByte()!=0;
 
    }
 
    public craebot.buttons_t copy()
    {
        craebot.buttons_t outobj = new craebot.buttons_t();
        outobj.utime = this.utime;
 
        outobj.clean = this.clean;
 
        outobj.day = this.day;
 
        outobj.hour = this.hour;
 
        outobj.minute = this.minute;
 
        outobj.dock = this.dock;
 
        outobj.spot = this.spot;
 
        outobj.wheeldrop = this.wheeldrop;
 
        outobj.cliff = this.cliff;
 
        return outobj;
    }
 
}

