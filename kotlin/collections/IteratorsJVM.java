package kotlin.collections;

import ae.KMarkers;
import java.util.Enumeration;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata
/* renamed from: kotlin.collections.x */
/* loaded from: classes7.dex */
public class IteratorsJVM extends C37566w {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: IteratorsJVM.kt */
    @Metadata
    /* renamed from: kotlin.collections.x$a */
    /* loaded from: classes7.dex */
    public static final class C37569a<T> implements Iterator<T>, KMarkers {

        /* renamed from: b */
        final /* synthetic */ Enumeration<T> f99276b;

        C37569a(Enumeration<T> enumeration) {
            this.f99276b = enumeration;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f99276b.hasMoreElements();
        }

        @Override // java.util.Iterator
        public T next() {
            return this.f99276b.nextElement();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @NotNull
    /* renamed from: A */
    public static <T> Iterator<T> m17144A(@NotNull Enumeration<T> enumeration) {
        Intrinsics.checkNotNullParameter(enumeration, "<this>");
        return new C37569a(enumeration);
    }
}
