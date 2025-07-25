package p853r;

import android.content.Context;
import android.util.DisplayMetrics;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p853r.AbstractC39420c;

@Metadata
/* renamed from: r.d */
/* loaded from: classes2.dex */
public final class DisplaySizeResolver implements SizeResolver {
    @NotNull

    /* renamed from: b */
    private final Context f103637b;

    public DisplaySizeResolver(@NotNull Context context) {
        this.f103637b = context;
    }

    @Override // p853r.SizeResolver
    @Nullable
    /* renamed from: b */
    public Object mo12721b(@NotNull Continuation<? super C39424i> continuation) {
        DisplayMetrics displayMetrics = this.f103637b.getResources().getDisplayMetrics();
        AbstractC39420c.C39421a m12727a = Dimension.m12727a(Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels));
        return new C39424i(m12727a, m12727a);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof DisplaySizeResolver) && Intrinsics.m17075f(this.f103637b, ((DisplaySizeResolver) obj).f103637b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f103637b.hashCode();
    }
}
