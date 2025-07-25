package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.InterfaceC30632jl;
import com.yandex.mobile.ads.impl.w12;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/* loaded from: classes8.dex */
public final class w12 implements InterfaceC30632jl {

    /* renamed from: c */
    public static final w12 f87082c = new w12(oh0.m31009h());

    /* renamed from: b */
    private final oh0<C31716a> f87083b;

    /* renamed from: com.yandex.mobile.ads.impl.w12$a */
    /* loaded from: classes8.dex */
    public static final class C31716a implements InterfaceC30632jl {

        /* renamed from: g */
        public static final InterfaceC30632jl.InterfaceC30633a<C31716a> f87084g = new InterfaceC30632jl.InterfaceC30633a() { // from class: com.yandex.mobile.ads.impl.b03
            @Override // com.yandex.mobile.ads.impl.InterfaceC30632jl.InterfaceC30633a
            public final InterfaceC30632jl fromBundle(Bundle bundle) {
                w12.C31716a m28065a;
                m28065a = w12.C31716a.m28065a(bundle);
                return m28065a;
            }
        };

        /* renamed from: b */
        public final int f87085b;

        /* renamed from: c */
        private final v02 f87086c;

        /* renamed from: d */
        private final boolean f87087d;

        /* renamed from: e */
        private final int[] f87088e;

        /* renamed from: f */
        private final boolean[] f87089f;

        public C31716a(v02 v02Var, boolean z, int[] iArr, boolean[] zArr) {
            boolean z2;
            int i = v02Var.f86517b;
            this.f87085b = i;
            boolean z3 = false;
            if (i == iArr.length && i == zArr.length) {
                z2 = true;
            } else {
                z2 = false;
            }
            C30937nf.m31567a(z2);
            this.f87086c = v02Var;
            if (z && i > 1) {
                z3 = true;
            }
            this.f87087d = z3;
            this.f87088e = (int[]) iArr.clone();
            this.f87089f = (boolean[]) zArr.clone();
        }

        /* renamed from: a */
        public final v90 m28066a(int i) {
            return this.f87086c.m28579a(i);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C31716a.class != obj.getClass()) {
                return false;
            }
            C31716a c31716a = (C31716a) obj;
            if (this.f87087d == c31716a.f87087d && this.f87086c.equals(c31716a.f87086c) && Arrays.equals(this.f87088e, c31716a.f87088e) && Arrays.equals(this.f87089f, c31716a.f87089f)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode = Arrays.hashCode(this.f87088e);
            return Arrays.hashCode(this.f87089f) + ((hashCode + (((this.f87086c.hashCode() * 31) + (this.f87087d ? 1 : 0)) * 31)) * 31);
        }

        /* renamed from: a */
        public final int m28067a() {
            return this.f87086c.f86519d;
        }

        /* renamed from: b */
        public final boolean m28064b() {
            for (boolean z : this.f87089f) {
                if (z) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public static C31716a m28065a(Bundle bundle) {
            InterfaceC30632jl.InterfaceC30633a<v02> interfaceC30633a = v02.f86516g;
            Bundle bundle2 = bundle.getBundle(Integer.toString(0, 36));
            bundle2.getClass();
            v02 fromBundle = interfaceC30633a.fromBundle(bundle2);
            int[] intArray = bundle.getIntArray(Integer.toString(1, 36));
            int[] iArr = new int[fromBundle.f86517b];
            if (intArray == null) {
                intArray = iArr;
            }
            boolean[] booleanArray = bundle.getBooleanArray(Integer.toString(3, 36));
            boolean[] zArr = new boolean[fromBundle.f86517b];
            if (booleanArray == null) {
                booleanArray = zArr;
            }
            return new C31716a(fromBundle, bundle.getBoolean(Integer.toString(4, 36), false), intArray, booleanArray);
        }

        /* renamed from: b */
        public final boolean m28063b(int i) {
            return this.f87089f[i];
        }
    }

    static {
        new InterfaceC30632jl.InterfaceC30633a() { // from class: com.yandex.mobile.ads.impl.a03
            @Override // com.yandex.mobile.ads.impl.InterfaceC30632jl.InterfaceC30633a
            public final InterfaceC30632jl fromBundle(Bundle bundle) {
                w12 m28069a;
                m28069a = w12.m28069a(bundle);
                return m28069a;
            }
        };
    }

    public w12(oh0 oh0Var) {
        this.f87083b = oh0.m31014a((Collection) oh0Var);
    }

    /* renamed from: a */
    public final oh0<C31716a> m28071a() {
        return this.f87083b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w12.class == obj.getClass()) {
            return this.f87083b.equals(((w12) obj).f87083b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f87083b.hashCode();
    }

    /* renamed from: a */
    public final boolean m28070a(int i) {
        for (int i2 = 0; i2 < this.f87083b.size(); i2++) {
            C31716a c31716a = this.f87083b.get(i2);
            if (c31716a.m28064b() && c31716a.m28067a() == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static w12 m28069a(Bundle bundle) {
        oh0 m32506a;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(0, 36));
        if (parcelableArrayList == null) {
            m32506a = oh0.m31009h();
        } else {
            m32506a = C30734kl.m32506a(C31716a.f87084g, parcelableArrayList);
        }
        return new w12(m32506a);
    }
}
