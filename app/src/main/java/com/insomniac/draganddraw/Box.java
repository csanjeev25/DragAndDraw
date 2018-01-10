package com.insomniac.draganddraw;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Sanjeev on 1/10/2018.
 */

import android.graphics.*;

public class Box implements java.io.Serializable
{
    private static final long serialVersionUID = 0L;

    private PointF mLt;
    private PointF mRt;
    private PointF mRb;
    private PointF mLb;

    public void setLt(PointF lt)
    {
        this.mLt = lt;
    }

    public PointF getLt()
    {
        return mLt;
    }

    public void setRt(PointF rt)
    {
        this.mRt = rt;
    }

    public PointF getRt()
    {
        return mRt;
    }

    public void setRb(PointF rb)
    {
        this.mRb = rb;
    }

    public PointF getRb()
    {
        return mRb;
    }

    public void setLb(PointF lb)
    {
        this.mLb = lb;
    }

    public PointF getLb()
    {
        return mLb;
    }

    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeFloat(mLt.x);
        out.writeFloat(mLt.y);

        out.writeFloat(mRt.x);
        out.writeFloat(mRt.x);

        out.writeFloat(mRt.x);
        out.writeFloat(mRt.x);

        out.writeFloat(mLb.x);
        out.writeFloat(mLb.x);
    }

    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
        mLt.x = in.readFloat();
        mLt.y = in.readFloat();

        mRt.x = in.readFloat();
        mRt.y = in.readFloat();

        mRb.x = in.readFloat();
        mRb.y = in.readFloat();

        mLb.x = in.readFloat();
        mLb.y = in.readFloat();
    }

}