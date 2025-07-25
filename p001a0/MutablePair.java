package p001a0;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.util.Pair;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: a0.i */
/* loaded from: classes2.dex */
public class MutablePair<T> {
    @Nullable

    /* renamed from: a */
    T f38a;
    @Nullable

    /* renamed from: b */
    T f39b;

    /* renamed from: a */
    private static boolean m105880a(Object obj, Object obj2) {
        if (obj != obj2 && (obj == null || !obj.equals(obj2))) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public void m105879b(T t, T t2) {
        this.f38a = t;
        this.f39b = t2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        if (!m105880a(pair.first, this.f38a) || !m105880a(pair.second, this.f39b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode;
        T t = this.f38a;
        int i = 0;
        if (t == null) {
            hashCode = 0;
        } else {
            hashCode = t.hashCode();
        }
        T t2 = this.f39b;
        if (t2 != null) {
            i = t2.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "Pair{" + String.valueOf(this.f38a) + " " + String.valueOf(this.f39b) + "}";
    }
}
