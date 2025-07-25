package androidx.datastore.core;

import ge.InterfaceC33327h;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DataStore.kt */
@Metadata
/* loaded from: classes.dex */
public interface DataStore<T> {
    @NotNull
    InterfaceC33327h<T> getData();

    @Nullable
    Object updateData(@NotNull Function2<? super T, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation);
}
