package androidx.datastore.preferences.core;

import androidx.datastore.preferences.core.Preferences;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: PreferencesFactory.kt */
@Metadata
/* loaded from: classes.dex */
public final class PreferencesFactory {
    @NotNull
    public static final Preferences create(@NotNull Preferences.Pair<?>... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        return createMutable((Preferences.Pair[]) Arrays.copyOf(pairs, pairs.length));
    }

    @NotNull
    public static final Preferences createEmpty() {
        return new MutablePreferences(null, true, 1, null);
    }

    @NotNull
    public static final MutablePreferences createMutable(@NotNull Preferences.Pair<?>... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        MutablePreferences mutablePreferences = new MutablePreferences(null, false, 1, null);
        mutablePreferences.putAll((Preferences.Pair[]) Arrays.copyOf(pairs, pairs.length));
        return mutablePreferences;
    }
}
