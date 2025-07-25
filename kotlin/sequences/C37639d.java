package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.Collections;
import org.jetbrains.annotations.NotNull;

/* compiled from: Sequences.kt */
@Metadata
/* renamed from: kotlin.sequences.d */
/* loaded from: classes7.dex */
final class C37639d implements Sequence, InterfaceC37638c {
    @NotNull

    /* renamed from: a */
    public static final C37639d f99373a = new C37639d();

    private C37639d() {
    }

    @Override // kotlin.sequences.InterfaceC37638c
    @NotNull
    /* renamed from: c */
    public C37639d mo16796a(int i) {
        return f99373a;
    }

    @Override // kotlin.sequences.InterfaceC37638c
    @NotNull
    /* renamed from: d */
    public C37639d mo16795b(int i) {
        return f99373a;
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator iterator() {
        return Collections.f99245b;
    }
}
