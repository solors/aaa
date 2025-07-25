package se;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ArrayPools.kt */
@Metadata
/* renamed from: se.l */
/* loaded from: classes8.dex */
public class C42713l {
    @NotNull

    /* renamed from: a */
    private final ArrayDeque<byte[]> f111849a = new ArrayDeque<>();

    /* renamed from: b */
    private int f111850b;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final void m6743a(@NotNull byte[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        synchronized (this) {
            if (this.f111850b + array.length < ArrayPools.m6770a()) {
                this.f111850b += array.length / 2;
                this.f111849a.addLast(array);
            }
            Unit unit = Unit.f99208a;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @NotNull
    /* renamed from: b */
    public final byte[] m6742b(int i) {
        byte[] m17490m;
        synchronized (this) {
            m17490m = this.f111849a.m17490m();
            if (m17490m != null) {
                this.f111850b -= m17490m.length / 2;
            } else {
                m17490m = null;
            }
        }
        if (m17490m == null) {
            return new byte[i];
        }
        return m17490m;
    }
}
