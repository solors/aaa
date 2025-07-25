package kotlinx.coroutines.android;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.InterfaceC37731g1;
import kotlinx.coroutines.InterfaceC37780o;
import kotlinx.coroutines.InterfaceC37814x0;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HandlerDispatcher.kt */
@Metadata
/* loaded from: classes7.dex */
public abstract class HandlerDispatcher extends MainCoroutineDispatcher implements InterfaceC37814x0 {
    public /* synthetic */ HandlerDispatcher(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Nullable
    public Object delay(long j, @NotNull Continuation<? super Unit> continuation) {
        return InterfaceC37814x0.C37815a.m16081a(this, j, continuation);
    }

    @Override // kotlinx.coroutines.MainCoroutineDispatcher
    @NotNull
    public abstract HandlerDispatcher getImmediate();

    @NotNull
    public InterfaceC37731g1 invokeOnTimeout(long j, @NotNull Runnable runnable, @NotNull CoroutineContext coroutineContext) {
        return InterfaceC37814x0.C37815a.m16080b(this, j, runnable, coroutineContext);
    }

    public abstract /* synthetic */ void scheduleResumeAfterDelay(long j, @NotNull InterfaceC37780o<? super Unit> interfaceC37780o);

    private HandlerDispatcher() {
    }
}
