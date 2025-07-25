package sg.bigo.ads.common.view.p938a;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import sg.bigo.ads.common.utils.C43819d;

/* renamed from: sg.bigo.ads.common.view.a.b */
/* loaded from: classes10.dex */
public class C43875b {

    /* renamed from: d */
    protected final float f114876d;

    /* renamed from: e */
    protected final float f114877e;

    /* renamed from: f */
    protected final float f114878f;

    /* renamed from: g */
    protected final float f114879g;

    /* renamed from: h */
    protected final Rect f114880h;

    /* renamed from: i */
    protected final int f114881i;

    /* renamed from: j */
    protected final int f114882j;

    /* renamed from: k */
    protected final float f114883k;

    /* renamed from: l */
    protected final float f114884l;

    /* renamed from: m */
    protected final float f114885m;

    /* renamed from: n */
    protected final Drawable f114886n;

    public C43875b() {
        this(0.0f, 0.0f, 0.0f, 0.0f, 1291845632, 0, 0.0f);
    }

    /* renamed from: a */
    public final void m4720a(Rect rect) {
        Rect rect2 = this.f114880h;
        if (rect2 == null) {
            rect2 = new Rect();
        }
        rect.left = rect2.left;
        rect.top = rect2.top;
        rect.right = rect2.right;
        rect.bottom = rect2.bottom;
    }

    /* renamed from: b */
    public final int m4718b() {
        return this.f114881i;
    }

    @FloatRange(from = 0.0d, m105511to = 25.0d)
    /* renamed from: c */
    public final float m4717c() {
        return this.f114884l;
    }

    /* renamed from: d */
    public final float m4716d() {
        return this.f114885m;
    }

    @Nullable
    /* renamed from: e */
    public final Drawable m4715e() {
        return this.f114886n;
    }

    public C43875b(float f, float f2, float f3, float f4, int i, int i2, float f5) {
        this(f, f2, f3, f4, null, i, i2, f5, null);
    }

    /* renamed from: a */
    public final void m4719a(float[] fArr) {
        float f = this.f114876d;
        fArr[0] = f;
        fArr[1] = f;
        float f2 = this.f114877e;
        fArr[2] = f2;
        fArr[3] = f2;
        float f3 = this.f114878f;
        fArr[4] = f3;
        fArr[5] = f3;
        float f4 = this.f114879g;
        fArr[6] = f4;
        fArr[7] = f4;
    }

    public C43875b(float f, float f2, float f3, float f4, @Nullable Rect rect, int i, int i2, float f5, @Nullable boolean[] zArr) {
        this.f114876d = f;
        this.f114877e = f2;
        this.f114878f = f3;
        this.f114879g = f4;
        this.f114880h = rect;
        this.f114881i = i;
        this.f114882j = i2;
        this.f114883k = f5;
        this.f114884l = Math.max(0.0f, Math.min(25.0f, 23.0f));
        this.f114885m = 4.0f;
        this.f114886n = (i2 == 0 || f5 <= 0.0f) ? null : C43819d.m4925a(f, f2, f3, f4, i2, f5, zArr);
    }
}
