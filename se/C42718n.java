package se;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ArrayPools.kt */
@Metadata
/* renamed from: se.n */
/* loaded from: classes8.dex */
public class C42718n {
    @NotNull

    /* renamed from: a */
    private final ArrayDeque<char[]> f111867a = new ArrayDeque<>();

    /* renamed from: b */
    private int f111868b;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final void m6718a(@NotNull char[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        synchronized (this) {
            if (this.f111868b + array.length < ArrayPools.m6770a()) {
                this.f111868b += array.length;
                this.f111867a.addLast(array);
            }
            Unit unit = Unit.f99208a;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @NotNull
    /* renamed from: b */
    public final char[] m6717b(int i) {
        char[] m17490m;
        synchronized (this) {
            m17490m = this.f111867a.m17490m();
            if (m17490m != null) {
                this.f111868b -= m17490m.length;
            } else {
                m17490m = null;
            }
        }
        if (m17490m == null) {
            return new char[i];
        }
        return m17490m;
    }
}
