package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.InterfaceC30632jl;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public final class a12 implements InterfaceC30632jl {

    /* renamed from: d */
    public static final InterfaceC30632jl.InterfaceC30633a<a12> f76659d = new InterfaceC30632jl.InterfaceC30633a() { // from class: com.yandex.mobile.ads.impl.gj2
        @Override // com.yandex.mobile.ads.impl.InterfaceC30632jl.InterfaceC30633a
        public final InterfaceC30632jl fromBundle(Bundle bundle) {
            a12 m36012a;
            m36012a = a12.m36012a(bundle);
            return m36012a;
        }
    };

    /* renamed from: b */
    public final v02 f76660b;

    /* renamed from: c */
    public final oh0<Integer> f76661c;

    public a12(v02 v02Var, List<Integer> list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= v02Var.f86517b)) {
            throw new IndexOutOfBoundsException();
        }
        this.f76660b = v02Var;
        this.f76661c = oh0.m31014a((Collection) list);
    }

    /* renamed from: a */
    public static a12 m36012a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(Integer.toString(0, 36));
        bundle2.getClass();
        int[] intArray = bundle.getIntArray(Integer.toString(1, 36));
        intArray.getClass();
        return new a12(v02.f86516g.fromBundle(bundle2), jn0.m32833a(intArray));
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a12.class != obj.getClass()) {
            return false;
        }
        a12 a12Var = (a12) obj;
        if (this.f76660b.equals(a12Var.f76660b) && this.f76661c.equals(a12Var.f76661c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f76661c.hashCode() * 31) + this.f76660b.hashCode();
    }
}
