package re;

import java.lang.ref.SoftReference;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: re.b1 */
/* loaded from: classes8.dex */
final class Caching<T> {
    @NotNull

    /* renamed from: a */
    public volatile SoftReference<T> f103812a = new SoftReference<>(null);

    /* renamed from: a */
    public final synchronized T m12499a(@NotNull Functions<? extends T> factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        T t = this.f103812a.get();
        if (t != null) {
            return t;
        }
        T invoke = factory.invoke();
        this.f103812a = new SoftReference<>(invoke);
        return invoke;
    }
}
