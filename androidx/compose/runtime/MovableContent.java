package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p1076zd.InterfaceC45268n;

/* compiled from: Composer.kt */
@StabilityInferred(parameters = 0)
@InternalComposeApi
@Metadata
/* loaded from: classes.dex */
public final class MovableContent<P> {
    public static final int $stable = 0;
    @NotNull
    private final InterfaceC45268n<P, Composer, Integer, Unit> content;

    /* JADX WARN: Multi-variable type inference failed */
    public MovableContent(@NotNull InterfaceC45268n<? super P, ? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.content = content;
    }

    @NotNull
    public final InterfaceC45268n<P, Composer, Integer, Unit> getContent() {
        return this.content;
    }
}
