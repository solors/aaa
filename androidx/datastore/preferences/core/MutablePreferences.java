package androidx.datastore.preferences.core;

import androidx.datastore.preferences.core.Preferences;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.collections._Collections;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Preferences.kt */
@Metadata
/* loaded from: classes.dex */
public final class MutablePreferences extends Preferences {
    @NotNull
    private final AtomicBoolean frozen;
    @NotNull
    private final Map<Preferences.Key<?>, Object> preferencesMap;

    public MutablePreferences() {
        this(null, false, 3, null);
    }

    @Override // androidx.datastore.preferences.core.Preferences
    @NotNull
    public Map<Preferences.Key<?>, Object> asMap() {
        Map<Preferences.Key<?>, Object> unmodifiableMap = Collections.unmodifiableMap(this.preferencesMap);
        Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "unmodifiableMap(preferencesMap)");
        return unmodifiableMap;
    }

    public final void checkNotFrozen$datastore_preferences_core() {
        if (!this.frozen.get()) {
            return;
        }
        throw new IllegalStateException("Do mutate preferences once returned to DataStore.".toString());
    }

    public final void clear() {
        checkNotFrozen$datastore_preferences_core();
        this.preferencesMap.clear();
    }

    @Override // androidx.datastore.preferences.core.Preferences
    public <T> boolean contains(@NotNull Preferences.Key<T> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.preferencesMap.containsKey(key);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof MutablePreferences) {
            return Intrinsics.m17075f(this.preferencesMap, ((MutablePreferences) obj).preferencesMap);
        }
        return false;
    }

    public final void freeze$datastore_preferences_core() {
        this.frozen.set(true);
    }

    @Override // androidx.datastore.preferences.core.Preferences
    @Nullable
    public <T> T get(@NotNull Preferences.Key<T> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (T) this.preferencesMap.get(key);
    }

    @NotNull
    public final Map<Preferences.Key<?>, Object> getPreferencesMap$datastore_preferences_core() {
        return this.preferencesMap;
    }

    public int hashCode() {
        return this.preferencesMap.hashCode();
    }

    public final void minusAssign(@NotNull Preferences.Key<?> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        checkNotFrozen$datastore_preferences_core();
        remove(key);
    }

    public final void plusAssign(@NotNull Preferences prefs) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        checkNotFrozen$datastore_preferences_core();
        this.preferencesMap.putAll(prefs.asMap());
    }

    public final void putAll(@NotNull Preferences.Pair<?>... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        checkNotFrozen$datastore_preferences_core();
        for (Preferences.Pair<?> pair : pairs) {
            setUnchecked$datastore_preferences_core(pair.getKey$datastore_preferences_core(), pair.getValue$datastore_preferences_core());
        }
    }

    public final <T> T remove(@NotNull Preferences.Key<T> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        checkNotFrozen$datastore_preferences_core();
        return (T) this.preferencesMap.remove(key);
    }

    public final <T> void set(@NotNull Preferences.Key<T> key, T t) {
        Intrinsics.checkNotNullParameter(key, "key");
        setUnchecked$datastore_preferences_core(key, t);
    }

    public final void setUnchecked$datastore_preferences_core(@NotNull Preferences.Key<?> key, @Nullable Object obj) {
        Set m17547e1;
        Intrinsics.checkNotNullParameter(key, "key");
        checkNotFrozen$datastore_preferences_core();
        if (obj == null) {
            remove(key);
        } else if (obj instanceof Set) {
            Map<Preferences.Key<?>, Object> map = this.preferencesMap;
            m17547e1 = _Collections.m17547e1((Iterable) obj);
            Set unmodifiableSet = Collections.unmodifiableSet(m17547e1);
            Intrinsics.checkNotNullExpressionValue(unmodifiableSet, "unmodifiableSet(value.toSet())");
            map.put(key, unmodifiableSet);
        } else {
            this.preferencesMap.put(key, obj);
        }
    }

    @NotNull
    public String toString() {
        String m17521z0;
        m17521z0 = _Collections.m17521z0(this.preferencesMap.entrySet(), ",\n", "{\n", "\n}", 0, null, MutablePreferences$toString$1.INSTANCE, 24, null);
        return m17521z0;
    }

    public /* synthetic */ MutablePreferences(Map map, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new LinkedHashMap() : map, (i & 2) != 0 ? true : z);
    }

    public final void plusAssign(@NotNull Preferences.Pair<?> pair) {
        Intrinsics.checkNotNullParameter(pair, "pair");
        checkNotFrozen$datastore_preferences_core();
        putAll(pair);
    }

    public MutablePreferences(@NotNull Map<Preferences.Key<?>, Object> preferencesMap, boolean z) {
        Intrinsics.checkNotNullParameter(preferencesMap, "preferencesMap");
        this.preferencesMap = preferencesMap;
        this.frozen = new AtomicBoolean(z);
    }
}
