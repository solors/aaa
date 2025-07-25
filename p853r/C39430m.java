package p853r;

import android.view.View;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: ViewSizeResolver.kt */
@Metadata
/* renamed from: r.m */
/* loaded from: classes2.dex */
public final class C39430m {
    @NotNull
    /* renamed from: a */
    public static final <T extends View> ViewSizeResolver<T> m12710a(@NotNull T t, boolean z) {
        return new RealViewSizeResolver(t, z);
    }

    /* renamed from: b */
    public static /* synthetic */ ViewSizeResolver m12709b(View view, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return m12710a(view, z);
    }
}
