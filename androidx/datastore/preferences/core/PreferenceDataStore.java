package androidx.datastore.preferences.core;

import androidx.datastore.core.DataStore;
import ge.InterfaceC33327h;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PreferenceDataStoreFactory.kt */
@Metadata
/* loaded from: classes.dex */
public final class PreferenceDataStore implements DataStore<Preferences> {
    @NotNull
    private final DataStore<Preferences> delegate;

    public PreferenceDataStore(@NotNull DataStore<Preferences> delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // androidx.datastore.core.DataStore
    @NotNull
    public InterfaceC33327h<Preferences> getData() {
        return this.delegate.getData();
    }

    @Override // androidx.datastore.core.DataStore
    @Nullable
    public Object updateData(@NotNull Function2<? super Preferences, ? super Continuation<? super Preferences>, ? extends Object> function2, @NotNull Continuation<? super Preferences> continuation) {
        return this.delegate.updateData(new PreferenceDataStore$updateData$2(function2, null), continuation);
    }
}
