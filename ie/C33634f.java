package ie;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* compiled from: Scopes.kt */
@Metadata
/* renamed from: ie.f */
/* loaded from: classes8.dex */
public final class C33634f implements CoroutineScope {
    @NotNull

    /* renamed from: b */
    private final CoroutineContext f92090b;

    public C33634f(@NotNull CoroutineContext coroutineContext) {
        this.f92090b = coroutineContext;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f92090b;
    }

    @NotNull
    public String toString() {
        return "CoroutineScope(coroutineContext=" + getCoroutineContext() + ')';
    }
}
