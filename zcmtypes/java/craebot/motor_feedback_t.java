/* ZCM type definition class file
 * This file was automatically generated by zcm-gen
 * DO NOT MODIFY BY HAND!!!!
 */

package craebot;
 
import java.io.*;
import java.util.*;
import zcm.zcm.*;
 
public final class motor_feedback_t implements zcm.zcm.ZCMEncodable
{
    public long utime;
    public float left_wheel_position;
    public float right_wheel_position;
    public float left_wheel_speed;
    public float right_wheel_speed;
 
    public motor_feedback_t()
    {
    }
 
    public static final long ZCM_FINGERPRINT;
    public static final long ZCM_FINGERPRINT_BASE = 0x99ec2ef391b3f0fbL;
 
    static {
        ZCM_FINGERPRINT = _hashRecursive(new ArrayList<Class<?>>());
    }
 
    public static long _hashRecursive(ArrayList<Class<?>> classes)
    {
        if (classes.contains(craebot.motor_feedback_t.class))
            return 0L;
 
        classes.add(craebot.motor_feedback_t.class);
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
 
        outs.writeFloat(this.left_wheel_position); 
 
        outs.writeFloat(this.right_wheel_position); 
 
        outs.writeFloat(this.left_wheel_speed); 
 
        outs.writeFloat(this.right_wheel_speed); 
 
    }
 
    public motor_feedback_t(byte[] data) throws IOException
    {
        this(new ZCMDataInputStream(data));
    }
 
    public motor_feedback_t(DataInput ins) throws IOException
    {
        if (ins.readLong() != ZCM_FINGERPRINT)
            throw new IOException("ZCM Decode error: bad fingerprint");
 
        _decodeRecursive(ins);
    }
 
    public static craebot.motor_feedback_t _decodeRecursiveFactory(DataInput ins) throws IOException
    {
        craebot.motor_feedback_t o = new craebot.motor_feedback_t();
        o._decodeRecursive(ins);
        return o;
    }
 
    public void _decodeRecursive(DataInput ins) throws IOException
    {
        this.utime = ins.readLong();
 
        this.left_wheel_position = ins.readFloat();
 
        this.right_wheel_position = ins.readFloat();
 
        this.left_wheel_speed = ins.readFloat();
 
        this.right_wheel_speed = ins.readFloat();
 
    }
 
    public craebot.motor_feedback_t copy()
    {
        craebot.motor_feedback_t outobj = new craebot.motor_feedback_t();
        outobj.utime = this.utime;
 
        outobj.left_wheel_position = this.left_wheel_position;
 
        outobj.right_wheel_position = this.right_wheel_position;
 
        outobj.left_wheel_speed = this.left_wheel_speed;
 
        outobj.right_wheel_speed = this.right_wheel_speed;
 
        return outobj;
    }
 
}

