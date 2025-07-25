package io.ktor.utils.p731io.jvm.javaio;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* compiled from: Blocking.kt */
@Metadata
/* renamed from: io.ktor.utils.io.jvm.javaio.i */
/* loaded from: classes9.dex */
final class C37222i extends CoroutineDispatcher {
    @NotNull

    /* renamed from: b */
    public static final C37222i f98296b = new C37222i();

    private C37222i() {
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatch(@NotNull CoroutineContext context, @NotNull Runnable block) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        block.run();
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public boolean isDispatchNeeded(@NotNull CoroutineContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return true;
    }
}
