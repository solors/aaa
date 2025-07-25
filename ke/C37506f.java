package ke;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.AbstractC37789q1;
import org.jetbrains.annotations.NotNull;

/* compiled from: Dispatcher.kt */
@Metadata
/* renamed from: ke.f */
/* loaded from: classes8.dex */
public class C37506f extends AbstractC37789q1 {

    /* renamed from: c */
    private final int f99154c;

    /* renamed from: d */
    private final int f99155d;

    /* renamed from: f */
    private final long f99156f;
    @NotNull

    /* renamed from: g */
    private final String f99157g;
    @NotNull

    /* renamed from: h */
    private CoroutineScheduler f99158h = m17681s();

    public C37506f(int i, int i2, long j, @NotNull String str) {
        this.f99154c = i;
        this.f99155d = i2;
        this.f99156f = j;
        this.f99157g = str;
    }

    /* renamed from: s */
    private final CoroutineScheduler m17681s() {
        return new CoroutineScheduler(this.f99154c, this.f99155d, this.f99156f, this.f99157g);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatch(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        CoroutineScheduler.m17717k(this.f99158h, runnable, null, false, 6, null);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatchYield(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        CoroutineScheduler.m17717k(this.f99158h, runnable, null, true, 2, null);
    }

    @Override // kotlinx.coroutines.AbstractC37789q1
    @NotNull
    /* renamed from: r */
    public Executor mo16108r() {
        return this.f99158h;
    }

    /* renamed from: u */
    public final void m17680u(@NotNull Runnable runnable, @NotNull InterfaceC37509i interfaceC37509i, boolean z) {
        this.f99158h.m17718i(runnable, interfaceC37509i, z);
    }
}
