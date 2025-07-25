package com.taurusx.tax.p606j.p607a0.p609e;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import com.taurusx.tax.C28162a;

/* renamed from: com.taurusx.tax.j.a0.e.b */
/* loaded from: classes7.dex */
public interface InterfaceC28477b extends IInterface {

    /* renamed from: com.taurusx.tax.j.a0.e.b$a */
    /* loaded from: classes7.dex */
    public static abstract class AbstractBinderC28478a extends Binder implements InterfaceC28477b {

        /* renamed from: com.taurusx.tax.j.a0.e.b$a$a */
        /* loaded from: classes7.dex */
        public static class C28479a implements InterfaceC28477b {

            /* renamed from: a */
            public IBinder f73911a;

            public C28479a(IBinder iBinder) {
                this.f73911a = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f73911a;
            }
        }

        /* renamed from: a */
        public static InterfaceC28477b m38068a(IBinder iBinder) {
            try {
                IInterface queryLocalInterface = iBinder.queryLocalInterface(C28162a.f73047a.m23824a(new byte[]{-96, 103, -82, 38, -85, 109, -70, 124, -94, 120, -19, 103, -77, 109, -83, 97, -89, 38, -118, 71, -77, 109, -83, 65, -121}, new byte[]{-61, 8}));
                if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC28477b)) {
                    return (InterfaceC28477b) queryLocalInterface;
                }
                return new C28479a(iBinder);
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }
    }
}
