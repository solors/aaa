package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.InterfaceC30632jl;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public final class w02 implements InterfaceC30632jl {

    /* renamed from: e */
    public static final w02 f87074e = new w02(new v02[0]);

    /* renamed from: f */
    public static final InterfaceC30632jl.InterfaceC30633a<w02> f87075f = new InterfaceC30632jl.InterfaceC30633a() { // from class: com.yandex.mobile.ads.impl.zz2
        @Override // com.yandex.mobile.ads.impl.InterfaceC30632jl.InterfaceC30633a
        public final InterfaceC30632jl fromBundle(Bundle bundle) {
            return w02.m28078b(bundle);
        }
    };

    /* renamed from: b */
    public final int f87076b;

    /* renamed from: c */
    private final oh0<v02> f87077c;

    /* renamed from: d */
    private int f87078d;

    public w02(v02... v02VarArr) {
        this.f87077c = oh0.m31011b(v02VarArr);
        this.f87076b = v02VarArr.length;
        m28082a();
    }

    /* renamed from: b */
    public static /* synthetic */ w02 m28078b(Bundle bundle) {
        return m28080a(bundle);
    }

    /* renamed from: a */
    public final v02 m28081a(int i) {
        return this.f87077c.get(i);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w02.class != obj.getClass()) {
            return false;
        }
        w02 w02Var = (w02) obj;
        if (this.f87076b == w02Var.f87076b && this.f87077c.equals(w02Var.f87077c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f87078d == 0) {
            this.f87078d = this.f87077c.hashCode();
        }
        return this.f87078d;
    }

    /* renamed from: a */
    public final int m28079a(v02 v02Var) {
        int indexOf = this.f87077c.indexOf(v02Var);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    /* renamed from: a */
    public static w02 m28080a(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(0, 36));
        if (parcelableArrayList == null) {
            return new w02(new v02[0]);
        }
        return new w02((v02[]) C30734kl.m32506a(v02.f86516g, parcelableArrayList).toArray(new v02[0]));
    }

    /* renamed from: a */
    private void m28082a() {
        int i = 0;
        while (i < this.f87077c.size()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.f87077c.size(); i3++) {
                if (this.f87077c.get(i).equals(this.f87077c.get(i3))) {
                    gq0.m33797a("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }
}
