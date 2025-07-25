package com.taurusx.tax.p606j.p607a0.p610f;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.taurusx.tax.C28162a;

/* renamed from: com.taurusx.tax.j.a0.f.b */
/* loaded from: classes7.dex */
public class C28482b implements IInterface {

    /* renamed from: a */
    public IBinder f73914a;

    public C28482b(IBinder iBinder) {
        this.f73914a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f73914a;
    }

    /* renamed from: b */
    public final String m38067b() {
        String str;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(C28162a.f73047a.m23824a(new byte[]{-87, 15, -89, 78, -71, 1, -89, 19, -65, 14, -83, 78, -85, 14, -82, 18, -91, 9, -82, 78, -82, 5, -68, 9, -87, 5, -93, 4, -71, 5, -72, 22, -93, 3, -81, 78, -125, 36, -81, 22, -93, 3, -81, 41, -82, 51, -81, 18, -68, 9, -87, 5}, new byte[]{-54, 96}));
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.f73914a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            str = obtain2.readString();
        } catch (Throwable th2) {
            th = th2;
            obtain2.recycle();
            obtain.recycle();
            th.printStackTrace();
            str = null;
            obtain2.recycle();
            obtain.recycle();
            return str;
        }
        obtain2.recycle();
        obtain.recycle();
        return str;
    }
}
