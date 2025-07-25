package me;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: me.d */
/* loaded from: classes8.dex */
public interface Semaphore {
    @Nullable
    /* renamed from: c */
    Object mo15155c(@NotNull Continuation<? super Unit> continuation);

    void release();
}
