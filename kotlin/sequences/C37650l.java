package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sd.IntrinsicsJvm;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SequenceBuilder.kt */
@Metadata
/* renamed from: kotlin.sequences.l */
/* loaded from: classes7.dex */
public class C37650l {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Sequences.kt */
    @Metadata
    /* renamed from: kotlin.sequences.l$a */
    /* loaded from: classes7.dex */
    public static final class C37651a<T> implements Sequence<T> {

        /* renamed from: a */
        final /* synthetic */ Function2 f99402a;

        public C37651a(Function2 function2) {
            this.f99402a = function2;
        }

        @Override // kotlin.sequences.Sequence
        @NotNull
        public Iterator<T> iterator() {
            Iterator<T> m16843a;
            m16843a = C37650l.m16843a(this.f99402a);
            return m16843a;
        }
    }

    @NotNull
    /* renamed from: a */
    public static <T> Iterator<T> m16843a(@NotNull Function2<? super AbstractC37648j<? super T>, ? super Continuation<? super Unit>, ? extends Object> block) {
        Continuation<? super Unit> m6963a;
        Intrinsics.checkNotNullParameter(block, "block");
        SequenceBuilder sequenceBuilder = new SequenceBuilder();
        m6963a = IntrinsicsJvm.m6963a(block, sequenceBuilder, sequenceBuilder);
        sequenceBuilder.m16878h(m6963a);
        return sequenceBuilder;
    }

    @NotNull
    /* renamed from: b */
    public static <T> Sequence<T> m16842b(@NotNull Function2<? super AbstractC37648j<? super T>, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return new C37651a(block);
    }
}
