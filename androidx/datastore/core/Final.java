package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: SingleProcessDataStore.kt */
@Metadata
/* loaded from: classes.dex */
final class Final<T> extends State<T> {
    @NotNull
    private final Throwable finalException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Final(@NotNull Throwable finalException) {
        super(null);
        Intrinsics.checkNotNullParameter(finalException, "finalException");
        this.finalException = finalException;
    }

    @NotNull
    public final Throwable getFinalException() {
        return this.finalException;
    }
}
