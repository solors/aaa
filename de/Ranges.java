package de;

import java.lang.Comparable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: de.b */
/* loaded from: classes7.dex */
public interface Ranges<T extends Comparable<? super T>> extends InterfaceC32867c<T> {
    /* renamed from: a */
    boolean mo16958a(@NotNull T t, @NotNull T t2);

    boolean contains(@NotNull T t);

    @Override // de.InterfaceC32867c
    boolean isEmpty();
}
