package td;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: EnumEntries.kt */
@Metadata
/* renamed from: td.b */
/* loaded from: classes7.dex */
public final class C44401b {
    @NotNull
    /* renamed from: a */
    public static final <E extends Enum<E>> EnumEntries<E> m3113a(@NotNull E[] entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        return new C44402c(entries);
    }
}
