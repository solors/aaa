package io.ktor.utils.p731io;

import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import vc.C44557a;

@Metadata
/* renamed from: io.ktor.utils.io.j */
/* loaded from: classes9.dex */
public interface ByteWriteChannel {
    @Nullable
    /* renamed from: a */
    Object mo18751a(@NotNull ByteBuffer byteBuffer, @NotNull Continuation<? super Unit> continuation);

    /* renamed from: b */
    boolean mo18750b();

    /* renamed from: d */
    boolean mo18749d(@Nullable Throwable th);

    void flush();

    @Nullable
    /* renamed from: j */
    Object mo18748j(@NotNull byte[] bArr, int i, int i2, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    /* renamed from: m */
    Object mo18747m(@NotNull C44557a c44557a, @NotNull Continuation<? super Unit> continuation);
}
