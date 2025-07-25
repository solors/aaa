package sg.bigo.ads.common.p927o;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: sg.bigo.ads.common.o.f */
/* loaded from: classes10.dex */
public interface InterfaceC43743f extends IInterface {

    /* renamed from: sg.bigo.ads.common.o.f$a */
    /* loaded from: classes10.dex */
    public static abstract class AbstractBinderC43744a extends Binder implements InterfaceC43743f {

        /* renamed from: sg.bigo.ads.common.o.f$a$a */
        /* loaded from: classes10.dex */
        static class C43745a implements InterfaceC43743f {

            /* renamed from: a */
            private IBinder f114476a;

            C43745a(IBinder iBinder) {
                this.f114476a = iBinder;
            }

            @Override // sg.bigo.ads.common.p927o.InterfaceC43743f
            /* renamed from: a */
            public final String mo5071a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                    this.f114476a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f114476a;
            }

            @Override // sg.bigo.ads.common.p927o.InterfaceC43743f
            /* renamed from: b */
            public final boolean mo5070b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                    boolean z = false;
                    this.f114476a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static InterfaceC43743f m5072a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC43743f)) {
                return (InterfaceC43743f) queryLocalInterface;
            }
            return new C43745a(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 1598968902) {
                        return super.onTransact(i, parcel, parcel2, i2);
                    }
                    parcel2.writeString("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                    return true;
                }
                parcel.enforceInterface("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                boolean mo5070b = mo5070b();
                parcel2.writeNoException();
                parcel2.writeInt(mo5070b ? 1 : 0);
                return true;
            }
            parcel.enforceInterface("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
            String mo5071a = mo5071a();
            parcel2.writeNoException();
            parcel2.writeString(mo5071a);
            return true;
        }
    }

    /* renamed from: a */
    String mo5071a();

    /* renamed from: b */
    boolean mo5070b();
}
