package de;

import java.lang.Comparable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Range.kt */
@Metadata
/* renamed from: de.c */
/* loaded from: classes7.dex */
public interface InterfaceC32867c<T extends Comparable<? super T>> {

    /* compiled from: Range.kt */
    @Metadata
    /* renamed from: de.c$a */
    /* loaded from: classes7.dex */
    public static final class C32868a {
        /* renamed from: a */
        public static <T extends Comparable<? super T>> boolean m25659a(@NotNull InterfaceC32867c<T> interfaceC32867c, @NotNull T value) {
            Intrinsics.checkNotNullParameter(value, "value");
            if (value.compareTo(interfaceC32867c.getStart()) >= 0 && value.compareTo(interfaceC32867c.getEndInclusive()) <= 0) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public static <T extends Comparable<? super T>> boolean m25658b(@NotNull InterfaceC32867c<T> interfaceC32867c) {
            if (interfaceC32867c.getStart().compareTo(interfaceC32867c.getEndInclusive()) > 0) {
                return true;
            }
            return false;
        }
    }

    @NotNull
    T getEndInclusive();

    @NotNull
    T getStart();

    boolean isEmpty();
}
