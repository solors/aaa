package sg.bigo.ads.p883ad.interstitial.p897e;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.common.utils.C43819d;
import sg.bigo.ads.common.view.p938a.C43875b;
import sg.bigo.ads.p883ad.interstitial.p897e.p898a.AbstractC43181b;

/* renamed from: sg.bigo.ads.ad.interstitial.e.b */
/* loaded from: classes10.dex */
public final class C43184b extends C43875b {

    /* renamed from: a */
    protected final int f113022a;

    /* renamed from: b */
    protected final boolean f113023b;
    @Nullable

    /* renamed from: c */
    protected final Drawable f113024c;

    public C43184b(float f, float f2, float f3, float f4, @Nullable Rect rect, float f5, @Nullable boolean[] zArr, @NonNull AbstractC43181b.C43182a c43182a) {
        super(f, f2, f3, f4, rect, c43182a.f113010b, c43182a.f113011c, f5, zArr);
        int i = c43182a.f113010b;
        this.f113022a = i;
        boolean z = c43182a.f113009a;
        this.f113023b = z;
        if (!z) {
            Drawable m4923a = C43819d.m4923a(f, f2, f3, f4, rect, i);
            this.f113024c = this.f114886n != null ? new LayerDrawable(new Drawable[]{m4923a, this.f114886n}) : m4923a;
            return;
        }
        this.f113024c = null;
    }

    @Nullable
    /* renamed from: a */
    public final Drawable m5981a() {
        return this.f113024c;
    }

    public C43184b(float f, float f2, @NonNull AbstractC43181b.C43182a c43182a) {
        this(f, f, f, f, null, f2, null, c43182a);
    }
}
