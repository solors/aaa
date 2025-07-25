package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.C37591h;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C37784p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.Result;
import sd.C42688d;
import sd.IntrinsicsJvm;

/* compiled from: Latch.kt */
@Metadata
/* loaded from: classes.dex */
public final class Latch {
    @NotNull
    private final Object lock = new Object();
    @NotNull
    private List<Continuation<Unit>> awaiters = new ArrayList();
    @NotNull
    private List<Continuation<Unit>> spareList = new ArrayList();
    private boolean _isOpen = true;

    @Nullable
    public final Object await(@NotNull Continuation<? super Unit> continuation) {
        Continuation m6961c;
        Object m6959e;
        Object m6959e2;
        if (!isOpen()) {
            m6961c = IntrinsicsJvm.m6961c(continuation);
            C37784p c37784p = new C37784p(m6961c, 1);
            c37784p.m16132y();
            synchronized (this.lock) {
                this.awaiters.add(c37784p);
            }
            c37784p.mo15160z(new Latch$await$2$2(this, c37784p));
            Object m16135u = c37784p.m16135u();
            m6959e = C42688d.m6959e();
            if (m16135u == m6959e) {
                C37591h.m17084c(continuation);
            }
            m6959e2 = C42688d.m6959e();
            if (m16135u == m6959e2) {
                return m16135u;
            }
            return Unit.f99208a;
        }
        return Unit.f99208a;
    }

    public final void closeLatch() {
        synchronized (this.lock) {
            this._isOpen = false;
            Unit unit = Unit.f99208a;
        }
    }

    public final boolean isOpen() {
        boolean z;
        synchronized (this.lock) {
            z = this._isOpen;
        }
        return z;
    }

    public final void openLatch() {
        synchronized (this.lock) {
            if (isOpen()) {
                return;
            }
            List<Continuation<Unit>> list = this.awaiters;
            this.awaiters = this.spareList;
            this.spareList = list;
            this._isOpen = true;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Result.C38506a c38506a = Result.f101870c;
                list.get(i).resumeWith(Result.m14549b(Unit.f99208a));
            }
            list.clear();
            Unit unit = Unit.f99208a;
        }
    }

    public final <R> R withClosed(@NotNull Functions<? extends R> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        closeLatch();
        try {
            return block.invoke();
        } finally {
            InlineMarker.m17017b(1);
            openLatch();
            InlineMarker.m17018a(1);
        }
    }
}
