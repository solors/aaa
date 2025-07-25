package io.appmetrica.analytics.impl;

import android.content.Context;
import android.util.SparseArray;
import io.appmetrica.analytics.AppMetrica;

/* renamed from: io.appmetrica.analytics.impl.vc */
/* loaded from: classes9.dex */
public abstract class AbstractC34960vc {
    /* renamed from: a */
    public abstract void mo20715a(int i);

    /* renamed from: a */
    public final synchronized void m20870a(Context context) {
        int mo20714b = mo20714b();
        int libraryApiLevel = AppMetrica.getLibraryApiLevel();
        if (mo20714b != libraryApiLevel) {
            if (mo20714b < libraryApiLevel) {
                SparseArray mo20713c = mo20713c();
                while (true) {
                    mo20714b++;
                    if (mo20714b > libraryApiLevel) {
                        break;
                    }
                    InterfaceC34934uc interfaceC34934uc = (InterfaceC34934uc) mo20713c.get(mo20714b);
                    if (interfaceC34934uc != null) {
                        interfaceC34934uc.mo20915a(context);
                    }
                }
            }
            mo20715a(libraryApiLevel);
        }
    }

    /* renamed from: b */
    public abstract int mo20714b();

    /* renamed from: c */
    public abstract SparseArray mo20713c();

    /* renamed from: a */
    public final int m20871a() {
        return AppMetrica.getLibraryApiLevel();
    }
}
