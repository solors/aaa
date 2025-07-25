package com.bytedance.adsdk.p183IL.p185bX;

import android.util.Pair;
import com.bytedance.component.sdk.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: com.bytedance.adsdk.IL.bX.iR */
/* loaded from: classes3.dex */
public class C6767iR<T> {

    /* renamed from: IL */
    T f14467IL;

    /* renamed from: bg */
    T f14468bg;

    /* renamed from: IL */
    private static boolean m90881IL(Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj == null || !obj.equals(obj2)) {
                return false;
            }
            return true;
        }
        return true;
    }

    /* renamed from: bg */
    public void m90880bg(T t, T t2) {
        this.f14468bg = t;
        this.f14467IL = t2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        if (!m90881IL(pair.first, this.f14468bg) || !m90881IL(pair.second, this.f14467IL)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode;
        T t = this.f14468bg;
        int i = 0;
        if (t == null) {
            hashCode = 0;
        } else {
            hashCode = t.hashCode();
        }
        T t2 = this.f14467IL;
        if (t2 != null) {
            i = t2.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "Pair{" + this.f14468bg + " " + this.f14467IL + "}";
    }
}
