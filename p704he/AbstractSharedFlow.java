package p704he;

import ge.StateFlow;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p704he.AbstractC33507d;
import p804nd.Result;

@Metadata
/* renamed from: he.b */
/* loaded from: classes8.dex */
public abstract class AbstractSharedFlow<S extends AbstractC33507d<?>> {
    @Nullable

    /* renamed from: b */
    private S[] f91462b;

    /* renamed from: c */
    private int f91463c;

    /* renamed from: d */
    private int f91464d;
    @Nullable

    /* renamed from: f */
    private C33538y f91465f;

    /* renamed from: c */
    public static final /* synthetic */ int m23601c(AbstractSharedFlow abstractSharedFlow) {
        return abstractSharedFlow.f91463c;
    }

    /* renamed from: g */
    public static final /* synthetic */ AbstractC33507d[] m23599g(AbstractSharedFlow abstractSharedFlow) {
        return abstractSharedFlow.f91462b;
    }

    @NotNull
    /* renamed from: f */
    public final StateFlow<Integer> m23600f() {
        C33538y c33538y;
        synchronized (this) {
            c33538y = this.f91465f;
            if (c33538y == null) {
                c33538y = new C33538y(this.f91463c);
                this.f91465f = c33538y;
            }
        }
        return c33538y;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @NotNull
    /* renamed from: h */
    public final S m23598h() {
        S s;
        C33538y c33538y;
        synchronized (this) {
            S[] sArr = this.f91462b;
            if (sArr == null) {
                sArr = mo23596j(2);
                this.f91462b = sArr;
            } else if (this.f91463c >= sArr.length) {
                Object[] copyOf = Arrays.copyOf(sArr, sArr.length * 2);
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
                this.f91462b = (S[]) ((AbstractC33507d[]) copyOf);
                sArr = (S[]) ((AbstractC33507d[]) copyOf);
            }
            int i = this.f91464d;
            do {
                s = sArr[i];
                if (s == null) {
                    s = mo23597i();
                    sArr[i] = s;
                }
                i++;
                if (i >= sArr.length) {
                    i = 0;
                }
                Intrinsics.m17073h(s, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
            } while (!s.mo23592a(this));
            this.f91464d = i;
            this.f91463c++;
            c33538y = this.f91465f;
        }
        if (c33538y != null) {
            c33538y.m23557Z(1);
        }
        return s;
    }

    @NotNull
    /* renamed from: i */
    protected abstract S mo23597i();

    @NotNull
    /* renamed from: j */
    protected abstract S[] mo23596j(int i);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k */
    public final void m23595k(@NotNull S s) {
        C33538y c33538y;
        int i;
        Continuation<Unit>[] mo23591b;
        synchronized (this) {
            int i2 = this.f91463c - 1;
            this.f91463c = i2;
            c33538y = this.f91465f;
            if (i2 == 0) {
                this.f91464d = 0;
            }
            Intrinsics.m17073h(s, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
            mo23591b = s.mo23591b(this);
        }
        for (Continuation<Unit> continuation : mo23591b) {
            if (continuation != null) {
                Result.C38506a c38506a = Result.f101870c;
                continuation.resumeWith(Result.m14549b(Unit.f99208a));
            }
        }
        if (c33538y != null) {
            c33538y.m23557Z(-1);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public final int m23594l() {
        return this.f91463c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Nullable
    /* renamed from: m */
    public final S[] m23593m() {
        return this.f91462b;
    }
}
