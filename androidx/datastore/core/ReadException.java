package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: SingleProcessDataStore.kt */
@Metadata
/* loaded from: classes.dex */
final class ReadException<T> extends State<T> {
    @NotNull
    private final Throwable readException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReadException(@NotNull Throwable readException) {
        super(null);
        Intrinsics.checkNotNullParameter(readException, "readException");
        this.readException = readException;
    }

    @NotNull
    public final Throwable getReadException() {
        return this.readException;
    }
}
