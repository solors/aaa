package kotlinx.coroutines;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: EventLoop.kt */
@Metadata
/* renamed from: kotlinx.coroutines.n1 */
/* loaded from: classes7.dex */
public final class C37779n1 {
    @NotNull
    /* renamed from: a */
    public static final AbstractC37759k1 m16171a() {
        return new EventLoop(Thread.currentThread());
    }

    /* renamed from: b */
    public static final long m16170b() {
        AbstractC37759k1 m16404a = C37711b3.f99517a.m16404a();
        if (m16404a != null) {
            return m16404a.mo16195S();
        }
        return Long.MAX_VALUE;
    }
}
