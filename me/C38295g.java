package me;

import ie.AbstractC33633e0;
import ie.Symbol;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Semaphore.kt */
@Metadata
/* renamed from: me.g */
/* loaded from: classes8.dex */
public final class C38295g extends AbstractC33633e0<C38295g> {
    @NotNull

    /* renamed from: g */
    private final AtomicReferenceArray f101200g;

    public C38295g(long j, @Nullable C38295g c38295g, int i) {
        super(j, c38295g, i);
        int i2;
        i2 = C38294f.f101199f;
        this.f101200g = new AtomicReferenceArray(i2);
    }

    @Override // ie.AbstractC33633e0
    /* renamed from: n */
    public int mo15131n() {
        int i;
        i = C38294f.f101199f;
        return i;
    }

    @Override // ie.AbstractC33633e0
    /* renamed from: o */
    public void mo15130o(int i, @Nullable Throwable th, @NotNull CoroutineContext coroutineContext) {
        Symbol symbol;
        symbol = C38294f.f101198e;
        m15129r().set(i, symbol);
        m22989p();
    }

    @NotNull
    /* renamed from: r */
    public final AtomicReferenceArray m15129r() {
        return this.f101200g;
    }

    @NotNull
    public String toString() {
        return "SemaphoreSegment[id=" + this.f92089d + ", hashCode=" + hashCode() + ']';
    }
}
