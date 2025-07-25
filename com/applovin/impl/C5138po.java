package com.applovin.impl;

import android.os.Bundle;
import com.applovin.impl.InterfaceC5044o2;
import java.util.Arrays;

/* renamed from: com.applovin.impl.po */
/* loaded from: classes2.dex */
public final class C5138po implements InterfaceC5044o2 {

    /* renamed from: d */
    public static final C5138po f9050d = new C5138po(new C5078oo[0]);

    /* renamed from: f */
    public static final InterfaceC5044o2.InterfaceC5045a f9051f = new InterfaceC5044o2.InterfaceC5045a() { // from class: com.applovin.impl.t00
        @Override // com.applovin.impl.InterfaceC5044o2.InterfaceC5045a
        /* renamed from: a */
        public final InterfaceC5044o2 mo92505a(Bundle bundle) {
            C5138po m96508a;
            m96508a = C5138po.m96508a(bundle);
            return m96508a;
        }
    };

    /* renamed from: a */
    public final int f9052a;

    /* renamed from: b */
    private final C5078oo[] f9053b;

    /* renamed from: c */
    private int f9054c;

    public C5138po(C5078oo... c5078ooArr) {
        this.f9053b = c5078ooArr;
        this.f9052a = c5078ooArr.length;
    }

    /* renamed from: a */
    public C5078oo m96509a(int i) {
        return this.f9053b[i];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5138po.class != obj.getClass()) {
            return false;
        }
        C5138po c5138po = (C5138po) obj;
        if (this.f9052a == c5138po.f9052a && Arrays.equals(this.f9053b, c5138po.f9053b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.f9054c == 0) {
            this.f9054c = Arrays.hashCode(this.f9053b);
        }
        return this.f9054c;
    }

    /* renamed from: b */
    private static String m96506b(int i) {
        return Integer.toString(i, 36);
    }

    /* renamed from: a */
    public int m96507a(C5078oo c5078oo) {
        for (int i = 0; i < this.f9052a; i++) {
            if (this.f9053b[i] == c5078oo) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public boolean m96510a() {
        return this.f9052a == 0;
    }

    /* renamed from: a */
    public static /* synthetic */ C5138po m96508a(Bundle bundle) {
        return new C5138po((C5078oo[]) AbstractC5102p2.m96599a(C5078oo.f8918d, bundle.getParcelableArrayList(m96506b(0)), AbstractC4247db.m99829h()).toArray(new C5078oo[0]));
    }
}
