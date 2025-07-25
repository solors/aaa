package com.vungle.ads.internal.persistence;

import androidx.annotation.VisibleForTesting;
import com.vungle.ads.internal.util.CollectionsConcurrencyUtil;
import com.vungle.ads.internal.util.FileUtility;
import com.vungle.ads.internal.util.PathProvider;
import java.io.File;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.vungle.ads.internal.persistence.b */
/* loaded from: classes7.dex */
public final class FilePreferences {
    @NotNull
    public static final String FILENAME = "settings_vungle";
    @NotNull
    public static final String TPAT_FAILED_FILENAME = "failedTpats";
    @NotNull
    private final File file;
    @NotNull
    private final Executor ioExecutor;
    @NotNull
    private final ConcurrentHashMap<String, Object> values;
    @NotNull
    public static final C29388a Companion = new C29388a(null);
    @NotNull
    private static final ConcurrentHashMap<String, FilePreferences> filePreferenceMap = new ConcurrentHashMap<>();

    public /* synthetic */ FilePreferences(Executor executor, PathProvider pathProvider, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(executor, pathProvider, str);
    }

    /* renamed from: apply$lambda-0 */
    public static final void m110347apply$lambda0(FilePreferences this$0, Serializable serializable) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(serializable, "$serializable");
        FileUtility.writeSerializable(this$0.file, serializable);
    }

    @NotNull
    public static final synchronized FilePreferences get(@NotNull Executor executor, @NotNull PathProvider pathProvider, @NotNull String str) {
        FilePreferences filePreferences;
        synchronized (FilePreferences.class) {
            filePreferences = Companion.get(executor, pathProvider, str);
        }
        return filePreferences;
    }

    public final void apply() {
        final HashMap hashMap = new HashMap(this.values);
        this.ioExecutor.execute(new Runnable() { // from class: com.vungle.ads.internal.persistence.a
            {
                FilePreferences.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FilePreferences.m110347apply$lambda0(FilePreferences.this, hashMap);
            }
        });
    }

    public final boolean getBoolean(@NotNull String key, boolean z) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = this.values.get(key);
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : z;
    }

    public final int getInt(@NotNull String key, int i) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = this.values.get(key);
        if (obj instanceof Integer) {
            return ((Number) obj).intValue();
        }
        return i;
    }

    public final long getLong(@NotNull String key, long j) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = this.values.get(key);
        if (obj instanceof Long) {
            return ((Number) obj).longValue();
        }
        return j;
    }

    @NotNull
    public final String getString(@NotNull String key, @NotNull String defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Object obj = this.values.get(key);
        return obj instanceof String ? (String) obj : defaultValue;
    }

    @NotNull
    public final HashSet<String> getStringSet(@NotNull String key, @NotNull HashSet<String> defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Object obj = this.values.get(key);
        if (obj instanceof HashSet) {
            return CollectionsConcurrencyUtil.getNewHashSet((HashSet) obj);
        }
        return defaultValue;
    }

    @NotNull
    public final FilePreferences put(@NotNull String key, boolean z) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.values.put(key, Boolean.valueOf(z));
        return this;
    }

    @NotNull
    public final FilePreferences remove(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (this.values.containsKey(key)) {
            this.values.remove(key);
        }
        return this;
    }

    private FilePreferences(Executor executor, PathProvider pathProvider, String str) {
        this.ioExecutor = executor;
        File file = new File(pathProvider.getSharedPrefsDir(), str);
        this.file = file;
        ConcurrentHashMap<String, Object> concurrentHashMap = new ConcurrentHashMap<>();
        this.values = concurrentHashMap;
        Object readSerializable = FileUtility.readSerializable(file);
        if (readSerializable instanceof HashMap) {
            concurrentHashMap.putAll((HashMap) readSerializable);
        }
    }

    @NotNull
    public final FilePreferences put(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.values.put(key, value);
        return this;
    }

    @Nullable
    public final Boolean getBoolean(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = this.values.get(key);
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        return null;
    }

    @Nullable
    public final String getString(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = this.values.get(key);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    @NotNull
    public final FilePreferences put(@NotNull String key, int i) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.values.put(key, Integer.valueOf(i));
        return this;
    }

    @NotNull
    public final FilePreferences put(@NotNull String key, @Nullable HashSet<String> hashSet) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.values.put(key, CollectionsConcurrencyUtil.getNewHashSet(hashSet));
        return this;
    }

    @NotNull
    public final FilePreferences put(@NotNull String key, long j) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.values.put(key, Long.valueOf(j));
        return this;
    }

    /* synthetic */ FilePreferences(Executor executor, PathProvider pathProvider, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(executor, pathProvider, (i & 4) != 0 ? FILENAME : str);
    }

    /* compiled from: FilePreferences.kt */
    @Metadata
    /* renamed from: com.vungle.ads.internal.persistence.b$a */
    /* loaded from: classes7.dex */
    public static final class C29388a {
        private C29388a() {
        }

        public /* synthetic */ C29388a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ FilePreferences get$default(C29388a c29388a, Executor executor, PathProvider pathProvider, String str, int i, Object obj) {
            if ((i & 4) != 0) {
                str = FilePreferences.FILENAME;
            }
            return c29388a.get(executor, pathProvider, str);
        }

        @NotNull
        public final synchronized FilePreferences get(@NotNull Executor ioExecutor, @NotNull PathProvider pathProvider, @NotNull String filename) {
            Object obj;
            Object putIfAbsent;
            Intrinsics.checkNotNullParameter(ioExecutor, "ioExecutor");
            Intrinsics.checkNotNullParameter(pathProvider, "pathProvider");
            Intrinsics.checkNotNullParameter(filename, "filename");
            ConcurrentHashMap concurrentHashMap = FilePreferences.filePreferenceMap;
            obj = concurrentHashMap.get(filename);
            if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(filename, (obj = new FilePreferences(ioExecutor, pathProvider, filename, null)))) != null) {
                obj = putIfAbsent;
            }
            Intrinsics.checkNotNullExpressionValue(obj, "filePreferenceMap.getOrP…, filename)\n            }");
            return (FilePreferences) obj;
        }

        @VisibleForTesting
        public static /* synthetic */ void getFILENAME$annotations() {
        }
    }
}
