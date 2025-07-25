package p045cb;

import com.yandex.div.internal.widget.indicator.AbstractC29814d;
import com.yandex.div.internal.widget.indicator.C29817e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p804nd.NoWhenBranchMatchedException;

/* compiled from: SingleIndicatorDrawer.kt */
@Metadata
/* renamed from: cb.d */
/* loaded from: classes8.dex */
public final class C3453d {
    @NotNull
    /* renamed from: a */
    public static final SingleIndicatorDrawer m103526a(@NotNull C29817e style) {
        Intrinsics.checkNotNullParameter(style, "style");
        AbstractC29814d m36322a = style.m36322a();
        if (m36322a instanceof AbstractC29814d.C29816b) {
            return new RoundedRect(style);
        }
        if (m36322a instanceof AbstractC29814d.C29815a) {
            return new Circle(style);
        }
        throw new NoWhenBranchMatchedException();
    }
}
