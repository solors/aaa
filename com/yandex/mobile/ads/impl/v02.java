package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.yandex.mobile.ads.impl.InterfaceC30632jl;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes8.dex */
public final class v02 implements InterfaceC30632jl {

    /* renamed from: g */
    public static final InterfaceC30632jl.InterfaceC30633a<v02> f86516g = new InterfaceC30632jl.InterfaceC30633a() { // from class: com.yandex.mobile.ads.impl.jz2
        @Override // com.yandex.mobile.ads.impl.InterfaceC30632jl.InterfaceC30633a
        public final InterfaceC30632jl fromBundle(Bundle bundle) {
            return v02.m28576b(bundle);
        }
    };

    /* renamed from: b */
    public final int f86517b;

    /* renamed from: c */
    public final String f86518c;

    /* renamed from: d */
    public final int f86519d;

    /* renamed from: e */
    private final v90[] f86520e;

    /* renamed from: f */
    private int f86521f;

    public v02(String str, v90... v90VarArr) {
        boolean z;
        if (v90VarArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        C30937nf.m31567a(z);
        this.f86518c = str;
        this.f86520e = v90VarArr;
        this.f86517b = v90VarArr.length;
        int m29900c = rx0.m29900c(v90VarArr[0].f86623m);
        this.f86519d = m29900c == -1 ? rx0.m29900c(v90VarArr[0].f86622l) : m29900c;
        m28580a();
    }

    /* renamed from: b */
    public static /* synthetic */ v02 m28576b(Bundle bundle) {
        return m28578a(bundle);
    }

    /* renamed from: a */
    public final v90 m28579a(int i) {
        return this.f86520e[i];
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v02.class != obj.getClass()) {
            return false;
        }
        v02 v02Var = (v02) obj;
        if (this.f86518c.equals(v02Var.f86518c) && Arrays.equals(this.f86520e, v02Var.f86520e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f86521f == 0) {
            this.f86521f = C31014o3.m31189a(this.f86518c, IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31) + Arrays.hashCode(this.f86520e);
        }
        return this.f86521f;
    }

    /* renamed from: a */
    public final int m28577a(v90 v90Var) {
        int i = 0;
        while (true) {
            v90[] v90VarArr = this.f86520e;
            if (i >= v90VarArr.length) {
                return -1;
            }
            if (v90Var == v90VarArr[i]) {
                return i;
            }
            i++;
        }
    }

    /* renamed from: a */
    public static v02 m28578a(Bundle bundle) {
        oh0 m32506a;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(0, 36));
        if (parcelableArrayList == null) {
            m32506a = oh0.m31009h();
        } else {
            m32506a = C30734kl.m32506a(v90.f86604I, parcelableArrayList);
        }
        return new v02(bundle.getString(Integer.toString(1, 36), ""), (v90[]) m32506a.toArray(new v90[0]));
    }

    /* renamed from: a */
    private void m28580a() {
        String str = this.f86520e[0].f86614d;
        str = (str == null || str.equals("und")) ? "" : "";
        int i = this.f86520e[0].f86616f | 16384;
        int i2 = 1;
        while (true) {
            v90[] v90VarArr = this.f86520e;
            if (i2 >= v90VarArr.length) {
                return;
            }
            String str2 = v90VarArr[i2].f86614d;
            if (!str.equals((str2 == null || str2.equals("und")) ? "" : "")) {
                v90[] v90VarArr2 = this.f86520e;
                String str3 = v90VarArr2[0].f86614d;
                String str4 = v90VarArr2[i2].f86614d;
                gq0.m33797a("TrackGroup", "", new IllegalStateException("Different languages combined in one TrackGroup: '" + str3 + "' (track 0) and '" + str4 + "' (track " + i2 + ")"));
                return;
            }
            v90[] v90VarArr3 = this.f86520e;
            if (i != (v90VarArr3[i2].f86616f | 16384)) {
                String binaryString = Integer.toBinaryString(v90VarArr3[0].f86616f);
                String binaryString2 = Integer.toBinaryString(this.f86520e[i2].f86616f);
                gq0.m33797a("TrackGroup", "", new IllegalStateException("Different role flags combined in one TrackGroup: '" + binaryString + "' (track 0) and '" + binaryString2 + "' (track " + i2 + ")"));
                return;
            }
            i2++;
        }
    }
}
