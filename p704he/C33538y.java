package p704he;

import ge.C33318e0;
import ge.StateFlow;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p674fe.BufferOverflow;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AbstractSharedFlow.kt */
@Metadata
/* renamed from: he.y */
/* loaded from: classes8.dex */
public final class C33538y extends C33318e0<Integer> implements StateFlow<Integer> {
    public C33538y(int i) {
        super(1, Integer.MAX_VALUE, BufferOverflow.DROP_OLDEST);
        mo23983e(Integer.valueOf(i));
    }

    @Override // ge.StateFlow
    @NotNull
    /* renamed from: Y */
    public Integer getValue() {
        Integer valueOf;
        synchronized (this) {
            valueOf = Integer.valueOf(m24155L().intValue());
        }
        return valueOf;
    }

    /* renamed from: Z */
    public final boolean m23557Z(int i) {
        boolean mo23983e;
        synchronized (this) {
            mo23983e = mo23983e(Integer.valueOf(m24155L().intValue() + i));
        }
        return mo23983e;
    }
}
