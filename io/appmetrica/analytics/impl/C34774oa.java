package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.oa */
/* loaded from: classes9.dex */
public class C34774oa extends AbstractC34005K2 {

    /* renamed from: b */
    public final InterfaceC34854ra f95104b;

    public C34774oa(int i) {
        this(i, null);
    }

    /* renamed from: b */
    public int mo21159b(@Nullable Object obj) {
        return 0;
    }

    public C34774oa(int i, @Nullable InterfaceC34854ra interfaceC34854ra) {
        super(i);
        this.f95104b = interfaceC34854ra;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC34005K2, io.appmetrica.analytics.impl.InterfaceC34854ra
    @NonNull
    /* renamed from: a */
    public final C34049Lm mo20948a(@Nullable List<Object> list) {
        int i;
        int i2 = 0;
        if (list == null || (list.size() <= this.f93097a && this.f95104b == null)) {
            i = 0;
        } else {
            ArrayList arrayList = new ArrayList();
            i = 0;
            int i3 = 0;
            for (Object obj : list) {
                if (i3 < this.f93097a) {
                    InterfaceC34854ra interfaceC34854ra = this.f95104b;
                    if (interfaceC34854ra != null) {
                        C34049Lm mo20948a = interfaceC34854ra.mo20948a(obj);
                        Object obj2 = mo20948a.f93198a;
                        i += mo20948a.f93199b.getBytesTruncated();
                        AbstractC34679kn.m21471a(obj, mo20948a.f93198a);
                        obj = obj2;
                    }
                    arrayList.add(obj);
                } else {
                    i2++;
                    i += mo21159b(obj);
                }
                i3++;
            }
            list = arrayList;
        }
        return new C34049Lm(list, new C33810C4(i2, i));
    }

    @Nullable
    @VisibleForTesting
    /* renamed from: b */
    public final InterfaceC34854ra m21215b() {
        return this.f95104b;
    }
}
