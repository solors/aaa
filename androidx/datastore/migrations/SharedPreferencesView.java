package androidx.datastore.migrations;

import android.content.SharedPreferences;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.MapsJVM;
import kotlin.collections._Collections;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SharedPreferencesMigration.kt */
@Metadata
/* loaded from: classes.dex */
public final class SharedPreferencesView {
    @Nullable
    private final Set<String> keySet;
    @NotNull
    private final SharedPreferences prefs;

    public SharedPreferencesView(@NotNull SharedPreferences prefs, @Nullable Set<String> set) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        this.prefs = prefs;
        this.keySet = set;
    }

    private final String checkKey(String str) {
        Set<String> set = this.keySet;
        if (set == null || set.contains(str)) {
            return str;
        }
        throw new IllegalStateException(Intrinsics.m17064q("Can't access key outside migration: ", str).toString());
    }

    public static /* synthetic */ String getString$default(SharedPreferencesView sharedPreferencesView, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return sharedPreferencesView.getString(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Set getStringSet$default(SharedPreferencesView sharedPreferencesView, String str, Set set, int i, Object obj) {
        if ((i & 2) != 0) {
            set = null;
        }
        return sharedPreferencesView.getStringSet(str, set);
    }

    public final boolean contains(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.prefs.contains(checkKey(key));
    }

    @NotNull
    public final Map<String, Object> getAll() {
        int m17292f;
        boolean contains;
        Map<String, ?> all = this.prefs.getAll();
        Intrinsics.checkNotNullExpressionValue(all, "prefs.all");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Set<String> set = this.keySet;
            if (set == null) {
                contains = true;
            } else {
                contains = set.contains(key);
            }
            if (contains) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        m17292f = MapsJVM.m17292f(linkedHashMap.size());
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(m17292f);
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key2 = entry2.getKey();
            Object value = entry2.getValue();
            if (value instanceof Set) {
                value = _Collections.m17547e1((Iterable) value);
            }
            linkedHashMap2.put(key2, value);
        }
        return linkedHashMap2;
    }

    public final boolean getBoolean(@NotNull String key, boolean z) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.prefs.getBoolean(checkKey(key), z);
    }

    public final float getFloat(@NotNull String key, float f) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.prefs.getFloat(checkKey(key), f);
    }

    public final int getInt(@NotNull String key, int i) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.prefs.getInt(checkKey(key), i);
    }

    public final long getLong(@NotNull String key, long j) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.prefs.getLong(checkKey(key), j);
    }

    @Nullable
    public final String getString(@NotNull String key, @Nullable String str) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.prefs.getString(checkKey(key), str);
    }

    @Nullable
    public final Set<String> getStringSet(@NotNull String key, @Nullable Set<String> set) {
        Set<String> m17549d1;
        Intrinsics.checkNotNullParameter(key, "key");
        Set<String> stringSet = this.prefs.getStringSet(checkKey(key), set);
        if (stringSet != null) {
            m17549d1 = _Collections.m17549d1(stringSet);
            return m17549d1;
        }
        return null;
    }
}
