package p001a0;

import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.webkit.ProxyConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: a0.e */
/* loaded from: classes2.dex */
public class KeyPath {

    /* renamed from: c */
    public static final KeyPath f29c = new KeyPath("COMPOSITION");

    /* renamed from: a */
    private final List<String> f30a;
    @Nullable

    /* renamed from: b */
    private KeyPathElement f31b;

    public KeyPath(String... strArr) {
        this.f30a = Arrays.asList(strArr);
    }

    /* renamed from: b */
    private boolean m105892b() {
        List<String> list = this.f30a;
        return list.get(list.size() - 1).equals("**");
    }

    /* renamed from: f */
    private boolean m105888f(String str) {
        return "__container".equals(str);
    }

    @CheckResult
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: a */
    public KeyPath m105893a(String str) {
        KeyPath keyPath = new KeyPath(this);
        keyPath.f30a.add(str);
        return keyPath;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: c */
    public boolean m105891c(String str, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        if (i >= this.f30a.size()) {
            return false;
        }
        if (i == this.f30a.size() - 1) {
            z = true;
        } else {
            z = false;
        }
        String str2 = this.f30a.get(i);
        if (!str2.equals("**")) {
            if (!str2.equals(str) && !str2.equals(ProxyConfig.MATCH_ALL_SCHEMES)) {
                z3 = false;
            } else {
                z3 = true;
            }
            if ((!z && (i != this.f30a.size() - 2 || !m105892b())) || !z3) {
                return false;
            }
            return true;
        }
        if (!z && this.f30a.get(i + 1).equals(str)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (i != this.f30a.size() - 2 && (i != this.f30a.size() - 3 || !m105892b())) {
                return false;
            }
            return true;
        } else if (z) {
            return true;
        } else {
            int i2 = i + 1;
            if (i2 < this.f30a.size() - 1) {
                return false;
            }
            return this.f30a.get(i2).equals(str);
        }
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: d */
    public KeyPathElement m105890d() {
        return this.f31b;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: e */
    public int m105889e(String str, int i) {
        if (m105888f(str)) {
            return 0;
        }
        if (!this.f30a.get(i).equals("**")) {
            return 1;
        }
        if (i == this.f30a.size() - 1 || !this.f30a.get(i + 1).equals(str)) {
            return 0;
        }
        return 2;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: g */
    public boolean m105887g(String str, int i) {
        if (m105888f(str)) {
            return true;
        }
        if (i >= this.f30a.size()) {
            return false;
        }
        if (this.f30a.get(i).equals(str) || this.f30a.get(i).equals("**") || this.f30a.get(i).equals(ProxyConfig.MATCH_ALL_SCHEMES)) {
            return true;
        }
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: h */
    public boolean m105886h(String str, int i) {
        if ("__container".equals(str) || i < this.f30a.size() - 1 || this.f30a.get(i).equals("**")) {
            return true;
        }
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: i */
    public KeyPath m105885i(KeyPathElement keyPathElement) {
        KeyPath keyPath = new KeyPath(this);
        keyPath.f31b = keyPathElement;
        return keyPath;
    }

    public String toString() {
        boolean z;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("KeyPath{keys=");
        sb2.append(this.f30a);
        sb2.append(",resolved=");
        if (this.f31b != null) {
            z = true;
        } else {
            z = false;
        }
        sb2.append(z);
        sb2.append('}');
        return sb2.toString();
    }

    private KeyPath(KeyPath keyPath) {
        this.f30a = new ArrayList(keyPath.f30a);
        this.f31b = keyPath.f31b;
    }
}
