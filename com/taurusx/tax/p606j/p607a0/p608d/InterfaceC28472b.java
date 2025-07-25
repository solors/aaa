package com.taurusx.tax.p606j.p607a0.p608d;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.taurusx.tax.C28162a;

/* renamed from: com.taurusx.tax.j.a0.d.b */
/* loaded from: classes7.dex */
public interface InterfaceC28472b extends IInterface {

    /* renamed from: com.taurusx.tax.j.a0.d.b$a */
    /* loaded from: classes7.dex */
    public static abstract class AbstractBinderC28473a extends Binder implements InterfaceC28472b {

        /* renamed from: a */
        public static final String f73907a = C28162a.f73047a.m23824a(new byte[]{-46, 46, -36, 111, -60, 46, -43, 40, -62, 111, -34, 49, -44, 47, -43, 36, -57, 40, -46, 36, -97, 32, -40, 37, -35, 111, -2, 49, -44, 47, -11, 36, -57, 40, -46, 36, -8, 37, -44, 47, -59, 40, -41, 40, -44, 51, -30, 36, -61, 55, -40, 34, -44}, new byte[]{-79, 65});

        /* renamed from: com.taurusx.tax.j.a0.d.b$a$a */
        /* loaded from: classes7.dex */
        public static class C28474a implements InterfaceC28472b {

            /* renamed from: a */
            public IBinder f73908a;

            public C28474a(IBinder iBinder) {
                this.f73908a = iBinder;
            }

            @Override // com.taurusx.tax.p606j.p607a0.p608d.InterfaceC28472b
            /* renamed from: a */
            public boolean mo38071a() throws RemoteException {
                boolean z;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    z = false;
                    obtain.writeInterfaceToken(C28162a.f73047a.m23824a(new byte[]{84, 16, 90, 81, 66, 16, 83, 22, 68, 81, 88, 15, 82, 17, 83, 26, 65, 22, 84, 26, 25, 30, 94, 27, 91, 81, 120, 15, 82, 17, 115, 26, 65, 22, 84, 26, 126, 27, 82, 17, 67, 22, 81, 22, 82, 13, 100, 26, 69, 9, 94, 28, 82}, new byte[]{55, Byte.MAX_VALUE}));
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    this.f73908a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } catch (Throwable th2) {
                    th = th2;
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f73908a;
            }

            @Override // com.taurusx.tax.p606j.p607a0.p608d.InterfaceC28472b
            /* renamed from: b */
            public String mo38070b() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C28162a.f73047a.m23824a(new byte[]{-27, -71, -21, -8, -13, -71, -30, -65, -11, -8, -23, -90, -29, -72, -30, -77, -16, -65, -27, -77, -88, -73, -17, -78, -22, -8, -55, -90, -29, -72, -62, -77, -16, -65, -27, -77, -49, -78, -29, -72, -14, -65, -32, -65, -29, -92, -43, -77, -12, -96, -17, -75, -29}, new byte[]{-122, -42}));
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    this.f73908a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    String readString = obtain2.readString();
                    obtain2.recycle();
                    obtain.recycle();
                    return readString;
                } catch (Throwable th2) {
                    th = th2;
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }
        }

        /* renamed from: a */
        public static InterfaceC28472b m38072a(IBinder iBinder) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f73907a);
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC28472b)) {
                return (InterfaceC28472b) queryLocalInterface;
            }
            return new C28474a(iBinder);
        }
    }

    /* renamed from: a */
    boolean mo38071a() throws RemoteException;

    /* renamed from: b */
    String mo38070b() throws RemoteException;
}
