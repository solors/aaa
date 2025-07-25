package p001a0;

import androidx.annotation.RestrictTo;
import java.util.List;
import p035c0.ShapeGroup;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: a0.d */
/* loaded from: classes2.dex */
public class FontCharacter {

    /* renamed from: a */
    private final List<ShapeGroup> f23a;

    /* renamed from: b */
    private final char f24b;

    /* renamed from: c */
    private final double f25c;

    /* renamed from: d */
    private final double f26d;

    /* renamed from: e */
    private final String f27e;

    /* renamed from: f */
    private final String f28f;

    public FontCharacter(List<ShapeGroup> list, char c, double d, double d2, String str, String str2) {
        this.f23a = list;
        this.f24b = c;
        this.f25c = d;
        this.f26d = d2;
        this.f27e = str;
        this.f28f = str2;
    }

    /* renamed from: c */
    public static int m105894c(char c, String str, String str2) {
        return ((((0 + c) * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    /* renamed from: a */
    public List<ShapeGroup> m105896a() {
        return this.f23a;
    }

    /* renamed from: b */
    public double m105895b() {
        return this.f26d;
    }

    public int hashCode() {
        return m105894c(this.f24b, this.f28f, this.f27e);
    }
}
