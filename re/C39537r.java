package re;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Caching.kt */
@Metadata
/* renamed from: re.r */
/* loaded from: classes8.dex */
final class C39537r<T> extends ClassValue<Caching<T>> {
    /* JADX INFO: Access modifiers changed from: protected */
    @NotNull
    /* renamed from: a */
    public Caching<T> computeValue(@NotNull Class<?> type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new Caching<>();
    }
}
