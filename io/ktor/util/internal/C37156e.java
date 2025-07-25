package io.ktor.util.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LockFreeLinkedList.kt */
@Metadata
/* renamed from: io.ktor.util.internal.e */
/* loaded from: classes9.dex */
public final class C37156e {
    @NotNull

    /* renamed from: a */
    public final C37154c f98022a;

    public C37156e(@NotNull C37154c ref) {
        Intrinsics.checkNotNullParameter(ref, "ref");
        this.f98022a = ref;
    }

    @NotNull
    public String toString() {
        return "Removed[" + this.f98022a + ']';
    }
}
