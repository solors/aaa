package kotlin.jvm.internal;

import java.util.Iterator;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: ArrayIterator.kt */
@Metadata
/* renamed from: kotlin.jvm.internal.c */
/* loaded from: classes7.dex */
public final class C37598c {
    @NotNull
    /* renamed from: a */
    public static final <T> Iterator<T> m17055a(@NotNull T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return new ArrayIterator(array);
    }
}
