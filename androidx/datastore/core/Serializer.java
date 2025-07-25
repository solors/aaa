package androidx.datastore.core;

import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Serializer.kt */
@Metadata
/* loaded from: classes.dex */
public interface Serializer<T> {
    T getDefaultValue();

    @Nullable
    Object readFrom(@NotNull InputStream inputStream, @NotNull Continuation<? super T> continuation);

    @Nullable
    Object writeTo(T t, @NotNull OutputStream outputStream, @NotNull Continuation<? super Unit> continuation);
}
