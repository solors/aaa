package androidx.datastore.preferences.core;

import androidx.datastore.preferences.core.Preferences;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: PreferencesKeys.kt */
@Metadata
/* loaded from: classes.dex */
public final class PreferencesKeys {
    @NotNull
    public static final Preferences.Key<Boolean> booleanKey(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new Preferences.Key<>(name);
    }

    @NotNull
    public static final Preferences.Key<Double> doubleKey(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new Preferences.Key<>(name);
    }

    @NotNull
    public static final Preferences.Key<Float> floatKey(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new Preferences.Key<>(name);
    }

    @NotNull
    public static final Preferences.Key<Integer> intKey(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new Preferences.Key<>(name);
    }

    @NotNull
    public static final Preferences.Key<Long> longKey(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new Preferences.Key<>(name);
    }

    @NotNull
    public static final Preferences.Key<String> stringKey(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new Preferences.Key<>(name);
    }

    @NotNull
    public static final Preferences.Key<Set<String>> stringSetKey(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new Preferences.Key<>(name);
    }
}
