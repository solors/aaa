package sg.bigo.ads.core.mraid;

import android.content.Context;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import sg.bigo.ads.common.utils.C43822e;

/* renamed from: sg.bigo.ads.core.mraid.j */
/* loaded from: classes10.dex */
final class C44286j {
    @NonNull

    /* renamed from: a */
    final Rect f116259a = new Rect();
    @NonNull

    /* renamed from: b */
    final Rect f116260b = new Rect();
    @NonNull

    /* renamed from: c */
    final Rect f116261c = new Rect();
    @NonNull

    /* renamed from: d */
    final Rect f116262d = new Rect();
    @NonNull

    /* renamed from: e */
    final Rect f116263e = new Rect();
    @NonNull

    /* renamed from: f */
    final Rect f116264f = new Rect();
    @NonNull

    /* renamed from: g */
    final Rect f116265g = new Rect();
    @NonNull

    /* renamed from: h */
    final Rect f116266h = new Rect();
    @NonNull

    /* renamed from: i */
    private final Context f116267i;

    /* renamed from: j */
    private final float f116268j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C44286j(Context context, float f) {
        this.f116267i = context.getApplicationContext();
        this.f116268j = f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m3440a(Rect rect, Rect rect2) {
        rect2.set(C43822e.m4906a(this.f116267i, rect.left), C43822e.m4906a(this.f116267i, rect.top), C43822e.m4906a(this.f116267i, rect.right), C43822e.m4906a(this.f116267i, rect.bottom));
    }
}
