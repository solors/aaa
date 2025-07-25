package kotlinx.coroutines;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: kotlinx.coroutines.h */
/* loaded from: classes7.dex */
public final class EventLoop extends AbstractC37767l1 {
    @NotNull

    /* renamed from: i */
    private final Thread f99557i;

    public EventLoop(@NotNull Thread thread) {
        this.f99557i = thread;
    }

    @Override // kotlinx.coroutines.AbstractC37775m1
    @NotNull
    /* renamed from: V */
    protected Thread mo16097V() {
        return this.f99557i;
    }
}
