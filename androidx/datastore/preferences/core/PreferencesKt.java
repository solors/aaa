package androidx.datastore.preferences.core;

import androidx.datastore.core.DataStore;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Preferences.kt */
@Metadata
/* loaded from: classes.dex */
public final class PreferencesKt {
    @Nullable
    public static final Object edit(@NotNull DataStore<Preferences> dataStore, @NotNull Function2<? super MutablePreferences, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super Preferences> continuation) {
        return dataStore.updateData(new PreferencesKt$edit$2(function2, null), continuation);
    }
}
