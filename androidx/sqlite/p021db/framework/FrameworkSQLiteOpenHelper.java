package androidx.sqlite.p021db.framework;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.sqlite.p021db.SupportSQLiteCompat;
import androidx.sqlite.p021db.SupportSQLiteDatabase;
import androidx.sqlite.p021db.SupportSQLiteOpenHelper;
import androidx.sqlite.p021db.framework.FrameworkSQLiteOpenHelper;
import androidx.sqlite.util.ProcessLock;
import java.io.File;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.InterfaceC38501j;
import p804nd.LazyJVM;

/* compiled from: FrameworkSQLiteOpenHelper.kt */
@Metadata
/* renamed from: androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper */
/* loaded from: classes2.dex */
public final class FrameworkSQLiteOpenHelper implements SupportSQLiteOpenHelper {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final String TAG = "SupportSQLite";
    private final boolean allowDataLossOnRecovery;
    @NotNull
    private final SupportSQLiteOpenHelper.Callback callback;
    @NotNull
    private final Context context;
    @NotNull
    private final InterfaceC38501j<OpenHelper> lazyDelegate;
    @Nullable
    private final String name;
    private final boolean useNoBackupDirectory;
    private boolean writeAheadLoggingEnabled;

    /* compiled from: FrameworkSQLiteOpenHelper.kt */
    @Metadata
    /* renamed from: androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$Companion */
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: FrameworkSQLiteOpenHelper.kt */
    @Metadata
    /* renamed from: androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$DBRefHolder */
    /* loaded from: classes2.dex */
    public static final class DBRefHolder {
        @Nullable

        /* renamed from: db */
        private FrameworkSQLiteDatabase f1467db;

        public DBRefHolder(@Nullable FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
            this.f1467db = frameworkSQLiteDatabase;
        }

        @Nullable
        public final FrameworkSQLiteDatabase getDb() {
            return this.f1467db;
        }

        public final void setDb(@Nullable FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
            this.f1467db = frameworkSQLiteDatabase;
        }
    }

    /* compiled from: FrameworkSQLiteOpenHelper.kt */
    @Metadata
    /* renamed from: androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper */
    /* loaded from: classes2.dex */
    public static final class OpenHelper extends SQLiteOpenHelper {
        @NotNull
        public static final Companion Companion = new Companion(null);
        private final boolean allowDataLossOnRecovery;
        @NotNull
        private final SupportSQLiteOpenHelper.Callback callback;
        @NotNull
        private final Context context;
        @NotNull
        private final DBRefHolder dbRef;
        @NotNull
        private final ProcessLock lock;
        private boolean migrated;
        private boolean opened;

        /* compiled from: FrameworkSQLiteOpenHelper.kt */
        @Metadata
        /* renamed from: androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$CallbackException */
        /* loaded from: classes2.dex */
        public static final class CallbackException extends RuntimeException {
            @NotNull
            private final CallbackName callbackName;
            @NotNull
            private final Throwable cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CallbackException(@NotNull CallbackName callbackName, @NotNull Throwable cause) {
                super(cause);
                Intrinsics.checkNotNullParameter(callbackName, "callbackName");
                Intrinsics.checkNotNullParameter(cause, "cause");
                this.callbackName = callbackName;
                this.cause = cause;
            }

            @NotNull
            public final CallbackName getCallbackName() {
                return this.callbackName;
            }

            @Override // java.lang.Throwable
            @NotNull
            public Throwable getCause() {
                return this.cause;
            }
        }

        /* compiled from: FrameworkSQLiteOpenHelper.kt */
        @Metadata
        /* renamed from: androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$CallbackName */
        /* loaded from: classes2.dex */
        public enum CallbackName {
            ON_CONFIGURE,
            ON_CREATE,
            ON_UPGRADE,
            ON_DOWNGRADE,
            ON_OPEN
        }

        /* compiled from: FrameworkSQLiteOpenHelper.kt */
        @Metadata
        /* renamed from: androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$Companion */
        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final FrameworkSQLiteDatabase getWrappedDb(@NotNull DBRefHolder refHolder, @NotNull SQLiteDatabase sqLiteDatabase) {
                Intrinsics.checkNotNullParameter(refHolder, "refHolder");
                Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
                FrameworkSQLiteDatabase db = refHolder.getDb();
                if (db == null || !db.isDelegate(sqLiteDatabase)) {
                    FrameworkSQLiteDatabase frameworkSQLiteDatabase = new FrameworkSQLiteDatabase(sqLiteDatabase);
                    refHolder.setDb(frameworkSQLiteDatabase);
                    return frameworkSQLiteDatabase;
                }
                return db;
            }
        }

        /* compiled from: FrameworkSQLiteOpenHelper.kt */
        @Metadata
        /* renamed from: androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$WhenMappings */
        /* loaded from: classes2.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[CallbackName.values().length];
                try {
                    iArr[CallbackName.ON_CONFIGURE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CallbackName.ON_CREATE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[CallbackName.ON_UPGRADE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[CallbackName.ON_DOWNGRADE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[CallbackName.ON_OPEN.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenHelper(@NotNull Context context, @Nullable String str, @NotNull final DBRefHolder dbRef, @NotNull final SupportSQLiteOpenHelper.Callback callback, boolean z) {
            super(context, str, null, callback.version, new DatabaseErrorHandler() { // from class: androidx.sqlite.db.framework.d
                @Override // android.database.DatabaseErrorHandler
                public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                    FrameworkSQLiteOpenHelper.OpenHelper._init_$lambda$0(callback, dbRef, sQLiteDatabase);
                }
            });
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(dbRef, "dbRef");
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.context = context;
            this.dbRef = dbRef;
            this.callback = callback;
            this.allowDataLossOnRecovery = z;
            if (str == null) {
                str = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
            }
            this.lock = new ProcessLock(str, context.getCacheDir(), false);
        }

        public static final void _init_$lambda$0(SupportSQLiteOpenHelper.Callback callback, DBRefHolder dbRef, SQLiteDatabase dbObj) {
            Intrinsics.checkNotNullParameter(callback, "$callback");
            Intrinsics.checkNotNullParameter(dbRef, "$dbRef");
            Companion companion = Companion;
            Intrinsics.checkNotNullExpressionValue(dbObj, "dbObj");
            callback.onCorruption(companion.getWrappedDb(dbRef, dbObj));
        }

        private final SQLiteDatabase getWritableOrReadableDatabase(boolean z) {
            if (z) {
                SQLiteDatabase writableDatabase = super.getWritableDatabase();
                Intrinsics.checkNotNullExpressionValue(writableDatabase, "{\n                super.…eDatabase()\n            }");
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase = super.getReadableDatabase();
            Intrinsics.checkNotNullExpressionValue(readableDatabase, "{\n                super.…eDatabase()\n            }");
            return readableDatabase;
        }

        private final SQLiteDatabase innerGetDatabase(boolean z) {
            File parentFile;
            String databaseName = getDatabaseName();
            boolean z2 = this.opened;
            if (databaseName != null && !z2 && (parentFile = this.context.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    Log.w(FrameworkSQLiteOpenHelper.TAG, "Invalid database parent file, not a directory: " + parentFile);
                }
            }
            try {
                return getWritableOrReadableDatabase(z);
            } catch (Throwable unused) {
                super.close();
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused2) {
                }
                try {
                    return getWritableOrReadableDatabase(z);
                } catch (Throwable th) {
                    super.close();
                    if (th instanceof CallbackException) {
                        CallbackException callbackException = th;
                        Throwable cause = callbackException.getCause();
                        int i = WhenMappings.$EnumSwitchMapping$0[callbackException.getCallbackName().ordinal()];
                        if (i != 1 && i != 2 && i != 3 && i != 4) {
                            if (!(cause instanceof SQLiteException)) {
                                throw cause;
                            }
                        } else {
                            throw cause;
                        }
                    } else if (th instanceof SQLiteException) {
                        if (databaseName == null || !this.allowDataLossOnRecovery) {
                            throw th;
                        }
                    } else {
                        throw th;
                    }
                    this.context.deleteDatabase(databaseName);
                    try {
                        return getWritableOrReadableDatabase(z);
                    } catch (CallbackException e) {
                        throw e.getCause();
                    }
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public void close() {
            try {
                ProcessLock.lock$default(this.lock, false, 1, null);
                super.close();
                this.dbRef.setDb(null);
                this.opened = false;
            } finally {
                this.lock.unlock();
            }
        }

        public final boolean getAllowDataLossOnRecovery() {
            return this.allowDataLossOnRecovery;
        }

        @NotNull
        public final SupportSQLiteOpenHelper.Callback getCallback() {
            return this.callback;
        }

        @NotNull
        public final Context getContext() {
            return this.context;
        }

        @NotNull
        public final DBRefHolder getDbRef() {
            return this.dbRef;
        }

        @NotNull
        public final SupportSQLiteDatabase getSupportDatabase(boolean z) {
            boolean z2;
            try {
                ProcessLock processLock = this.lock;
                if (!this.opened && getDatabaseName() != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                processLock.lock(z2);
                this.migrated = false;
                SQLiteDatabase innerGetDatabase = innerGetDatabase(z);
                if (this.migrated) {
                    close();
                    return getSupportDatabase(z);
                }
                return getWrappedDb(innerGetDatabase);
            } finally {
                this.lock.unlock();
            }
        }

        @NotNull
        public final FrameworkSQLiteDatabase getWrappedDb(@NotNull SQLiteDatabase sqLiteDatabase) {
            Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
            return Companion.getWrappedDb(this.dbRef, sqLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(@NotNull SQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
            if (!this.migrated && this.callback.version != db.getVersion()) {
                db.setMaxSqlCacheSize(1);
            }
            try {
                this.callback.onConfigure(getWrappedDb(db));
            } catch (Throwable th) {
                throw new CallbackException(CallbackName.ON_CONFIGURE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(@NotNull SQLiteDatabase sqLiteDatabase) {
            Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
            try {
                this.callback.onCreate(getWrappedDb(sqLiteDatabase));
            } catch (Throwable th) {
                throw new CallbackException(CallbackName.ON_CREATE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(@NotNull SQLiteDatabase db, int i, int i2) {
            Intrinsics.checkNotNullParameter(db, "db");
            this.migrated = true;
            try {
                this.callback.onDowngrade(getWrappedDb(db), i, i2);
            } catch (Throwable th) {
                throw new CallbackException(CallbackName.ON_DOWNGRADE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(@NotNull SQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
            if (!this.migrated) {
                try {
                    this.callback.onOpen(getWrappedDb(db));
                } catch (Throwable th) {
                    throw new CallbackException(CallbackName.ON_OPEN, th);
                }
            }
            this.opened = true;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(@NotNull SQLiteDatabase sqLiteDatabase, int i, int i2) {
            Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
            this.migrated = true;
            try {
                this.callback.onUpgrade(getWrappedDb(sqLiteDatabase), i, i2);
            } catch (Throwable th) {
                throw new CallbackException(CallbackName.ON_UPGRADE, th);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FrameworkSQLiteOpenHelper(@NotNull Context context, @Nullable String str, @NotNull SupportSQLiteOpenHelper.Callback callback) {
        this(context, str, callback, false, false, 24, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    private final OpenHelper getDelegate() {
        return this.lazyDelegate.getValue();
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteOpenHelper, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.lazyDelegate.isInitialized()) {
            getDelegate().close();
        }
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteOpenHelper
    @Nullable
    public String getDatabaseName() {
        return this.name;
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteOpenHelper
    @NotNull
    public SupportSQLiteDatabase getReadableDatabase() {
        return getDelegate().getSupportDatabase(false);
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteOpenHelper
    @NotNull
    public SupportSQLiteDatabase getWritableDatabase() {
        return getDelegate().getSupportDatabase(true);
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteOpenHelper
    @RequiresApi(api = 16)
    public void setWriteAheadLoggingEnabled(boolean z) {
        if (this.lazyDelegate.isInitialized()) {
            SupportSQLiteCompat.Api16Impl.setWriteAheadLoggingEnabled(getDelegate(), z);
        }
        this.writeAheadLoggingEnabled = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FrameworkSQLiteOpenHelper(@NotNull Context context, @Nullable String str, @NotNull SupportSQLiteOpenHelper.Callback callback, boolean z) {
        this(context, str, callback, z, false, 16, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    public FrameworkSQLiteOpenHelper(@NotNull Context context, @Nullable String str, @NotNull SupportSQLiteOpenHelper.Callback callback, boolean z, boolean z2) {
        InterfaceC38501j<OpenHelper> m14554a;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.context = context;
        this.name = str;
        this.callback = callback;
        this.useNoBackupDirectory = z;
        this.allowDataLossOnRecovery = z2;
        m14554a = LazyJVM.m14554a(new FrameworkSQLiteOpenHelper$lazyDelegate$1(this));
        this.lazyDelegate = m14554a;
    }

    public /* synthetic */ FrameworkSQLiteOpenHelper(Context context, String str, SupportSQLiteOpenHelper.Callback callback, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, callback, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2);
    }
}
