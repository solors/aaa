package p001a0;

import androidx.annotation.ColorInt;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: a0.b */
/* loaded from: classes2.dex */
public class DocumentData {

    /* renamed from: a */
    public final String f4a;

    /* renamed from: b */
    public final String f5b;

    /* renamed from: c */
    public final float f6c;

    /* renamed from: d */
    public final EnumC0002a f7d;

    /* renamed from: e */
    public final int f8e;

    /* renamed from: f */
    public final float f9f;

    /* renamed from: g */
    public final float f10g;
    @ColorInt

    /* renamed from: h */
    public final int f11h;
    @ColorInt

    /* renamed from: i */
    public final int f12i;

    /* renamed from: j */
    public final float f13j;

    /* renamed from: k */
    public final boolean f14k;

    /* compiled from: DocumentData.java */
    /* renamed from: a0.b$a */
    /* loaded from: classes2.dex */
    public enum EnumC0002a {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public DocumentData(String str, String str2, float f, EnumC0002a enumC0002a, int i, float f2, float f3, @ColorInt int i2, @ColorInt int i3, float f4, boolean z) {
        this.f4a = str;
        this.f5b = str2;
        this.f6c = f;
        this.f7d = enumC0002a;
        this.f8e = i;
        this.f9f = f2;
        this.f10g = f3;
        this.f11h = i2;
        this.f12i = i3;
        this.f13j = f4;
        this.f14k = z;
    }

    public int hashCode() {
        int hashCode = (((((int) ((((this.f4a.hashCode() * 31) + this.f5b.hashCode()) * 31) + this.f6c)) * 31) + this.f7d.ordinal()) * 31) + this.f8e;
        long floatToRawIntBits = Float.floatToRawIntBits(this.f9f);
        return (((hashCode * 31) + ((int) (floatToRawIntBits ^ (floatToRawIntBits >>> 32)))) * 31) + this.f11h;
    }
}
