package com.applovin.impl;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.applovin.impl.AbstractC4247db;

/* renamed from: com.applovin.impl.m2 */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC4807m2 extends Binder {

    /* renamed from: a */
    private static final int f7867a;

    static {
        int i;
        if (AbstractC5863xp.f12151a >= 30) {
            i = IBinder.getSuggestedMaxIpcSizeBytes();
        } else {
            i = 65536;
        }
        f7867a = i;
    }

    /* renamed from: a */
    public static AbstractC4247db m97614a(IBinder iBinder) {
        int readInt;
        AbstractC4247db.C4248a m99831f = AbstractC4247db.m99831f();
        int i = 0;
        int i2 = 1;
        while (i2 != 0) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInt(i);
                try {
                    iBinder.transact(1, obtain, obtain2, 0);
                    while (true) {
                        readInt = obtain2.readInt();
                        if (readInt == 1) {
                            m99831f.m99827b((Bundle) AbstractC4100b1.m100583a(obtain2.readBundle()));
                            i++;
                        }
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    i2 = readInt;
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            } catch (Throwable th) {
                obtain2.recycle();
                obtain.recycle();
                throw th;
            }
        }
        return m99831f.m99828a();
    }
}
