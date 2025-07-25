package androidx.sqlite.p021db;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.RequiresApi;
import androidx.sqlite.p021db.SupportSQLiteCompat;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsJVM;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SupportSQLiteOpenHelper.kt */
@Metadata
/* renamed from: androidx.sqlite.db.SupportSQLiteOpenHelper */
/* loaded from: classes2.dex */
public interface SupportSQLiteOpenHelper extends Closeable {

    /* compiled from: SupportSQLiteOpenHelper.kt */
    @Metadata
    /* renamed from: androidx.sqlite.db.SupportSQLiteOpenHelper$Callback */
    /* loaded from: classes2.dex */
    public static abstract class Callback {
        @NotNull
        public static final Companion Companion = new Companion(null);
        @NotNull
        private static final String TAG = "SupportSQLite";
        public final int version;

        /* compiled from: SupportSQLiteOpenHelper.kt */
        @Metadata
        /* renamed from: androidx.sqlite.db.SupportSQLiteOpenHelper$Callback$Companion */
        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public Callback(int i) {
            this.version = i;
        }

        private final void deleteDatabaseFile(String str) {
            boolean m16615y;
            int i;
            boolean z;
            boolean z2 = true;
            m16615y = StringsJVM.m16615y(str, ":memory:", true);
            if (!m16615y) {
                int length = str.length() - 1;
                int i2 = 0;
                boolean z3 = false;
                while (i2 <= length) {
                    if (!z3) {
                        i = i2;
                    } else {
                        i = length;
                    }
                    if (Intrinsics.m17071j(str.charAt(i), 32) <= 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z3) {
                        if (!z) {
                            z3 = true;
                        } else {
                            i2++;
                        }
                    } else if (!z) {
                        break;
                    } else {
                        length--;
                    }
                }
                if (str.subSequence(i2, length + 1).toString().length() != 0) {
                    z2 = false;
                }
                if (!z2) {
                    Log.w(TAG, "deleting the database file: " + str);
                    try {
                        SupportSQLiteCompat.Api16Impl.deleteDatabase(new File(str));
                    } catch (Exception e) {
                        Log.w(TAG, "delete failed: ", e);
                    }
                }
            }
        }

        public void onConfigure(@NotNull SupportSQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
        }

        public void onCorruption(@NotNull SupportSQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
            Log.e(TAG, "Corruption reported by sqlite on database: " + db + ".path");
            if (!db.isOpen()) {
                String path = db.getPath();
                if (path != null) {
                    deleteDatabaseFile(path);
                    return;
                }
                return;
            }
            List<Pair<String, String>> list = null;
            try {
                try {
                    list = db.getAttachedDbs();
                } finally {
                    if (list != null) {
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            Object obj = ((Pair) it.next()).second;
                            Intrinsics.checkNotNullExpressionValue(obj, "p.second");
                            deleteDatabaseFile((String) obj);
                        }
                    } else {
                        String path2 = db.getPath();
                        if (path2 != null) {
                            deleteDatabaseFile(path2);
                        }
                    }
                }
            } catch (SQLiteException unused) {
            }
            try {
                db.close();
            } catch (IOException unused2) {
            }
        }

        public abstract void onCreate(@NotNull SupportSQLiteDatabase supportSQLiteDatabase);

        public void onDowngrade(@NotNull SupportSQLiteDatabase db, int i, int i2) {
            Intrinsics.checkNotNullParameter(db, "db");
            throw new SQLiteException("Can't downgrade database from version " + i + " to " + i2);
        }

        public void onOpen(@NotNull SupportSQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
        }

        public abstract void onUpgrade(@NotNull SupportSQLiteDatabase supportSQLiteDatabase, int i, int i2);
    }

    /* compiled from: SupportSQLiteOpenHelper.kt */
    @Metadata
    /* renamed from: androidx.sqlite.db.SupportSQLiteOpenHelper$Factory */
    /* loaded from: classes2.dex */
    public interface Factory {
        @NotNull
        SupportSQLiteOpenHelper create(@NotNull Configuration configuration);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    @Nullable
    String getDatabaseName();

    @NotNull
    SupportSQLiteDatabase getReadableDatabase();

    @NotNull
    SupportSQLiteDatabase getWritableDatabase();

    @RequiresApi(api = 16)
    void setWriteAheadLoggingEnabled(boolean z);

    /* compiled from: SupportSQLiteOpenHelper.kt */
    @Metadata
    /* renamed from: androidx.sqlite.db.SupportSQLiteOpenHelper$Configuration */
    /* loaded from: classes2.dex */
    public static final class Configuration {
        @NotNull
        public static final Companion Companion = new Companion(null);
        public final boolean allowDataLossOnRecovery;
        @NotNull
        public final Callback callback;
        @NotNull
        public final Context context;
        @Nullable
        public final String name;
        public final boolean useNoBackupDirectory;

        /* compiled from: SupportSQLiteOpenHelper.kt */
        @Metadata
        /* renamed from: androidx.sqlite.db.SupportSQLiteOpenHelper$Configuration$Builder */
        /* loaded from: classes2.dex */
        public static class Builder {
            private boolean allowDataLossOnRecovery;
            @Nullable
            private Callback callback;
            @NotNull
            private final Context context;
            @Nullable
            private String name;
            private boolean useNoBackupDirectory;

            public Builder(@NotNull Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                this.context = context;
            }

            @NotNull
            public Builder allowDataLossOnRecovery(boolean z) {
                this.allowDataLossOnRecovery = z;
                return this;
            }

            @NotNull
            public Configuration build() {
                boolean z;
                Callback callback = this.callback;
                if (callback != null) {
                    boolean z2 = true;
                    if (this.useNoBackupDirectory) {
                        String str = this.name;
                        if (str != null && str.length() != 0) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (z) {
                            z2 = false;
                        }
                    }
                    if (z2) {
                        return new Configuration(this.context, this.name, callback, this.useNoBackupDirectory, this.allowDataLossOnRecovery);
                    }
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.".toString());
                }
                throw new IllegalArgumentException("Must set a callback to create the configuration.".toString());
            }

            @NotNull
            public Builder callback(@NotNull Callback callback) {
                Intrinsics.checkNotNullParameter(callback, "callback");
                this.callback = callback;
                return this;
            }

            @NotNull
            public Builder name(@Nullable String str) {
                this.name = str;
                return this;
            }

            @NotNull
            public Builder noBackupDirectory(boolean z) {
                this.useNoBackupDirectory = z;
                return this;
            }
        }

        /* compiled from: SupportSQLiteOpenHelper.kt */
        @Metadata
        /* renamed from: androidx.sqlite.db.SupportSQLiteOpenHelper$Configuration$Companion */
        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final Builder builder(@NotNull Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                return new Builder(context);
            }
        }

        public Configuration(@NotNull Context context, @Nullable String str, @NotNull Callback callback, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.context = context;
            this.name = str;
            this.callback = callback;
            this.useNoBackupDirectory = z;
            this.allowDataLossOnRecovery = z2;
        }

        @NotNull
        public static final Builder builder(@NotNull Context context) {
            return Companion.builder(context);
        }

        public /* synthetic */ Configuration(Context context, String str, Callback callback, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(context, str, callback, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2);
        }
    }
}
