package androidx.room;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.CallSuper;
import androidx.annotation.IntRange;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.sqlite.p021db.SimpleSQLiteQuery;
import androidx.sqlite.p021db.SupportSQLiteCompat;
import androidx.sqlite.p021db.SupportSQLiteDatabase;
import androidx.sqlite.p021db.SupportSQLiteOpenHelper;
import androidx.sqlite.p021db.SupportSQLiteQuery;
import androidx.sqlite.p021db.SupportSQLiteStatement;
import androidx.sqlite.p021db.framework.FrameworkSQLiteOpenHelperFactory;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import kotlin.collections.C37559r0;
import kotlin.collections.C37563v;
import kotlin.collections.C37572z0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RoomDatabase.kt */
@Metadata
/* loaded from: classes2.dex */
public abstract class RoomDatabase {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final int MAX_BIND_PARAMETER_CNT = 999;
    private boolean allowMainThreadQueries;
    @Nullable
    private AutoCloser autoCloser;
    @NotNull
    private final Map<String, Object> backingFieldMap;
    private SupportSQLiteOpenHelper internalOpenHelper;
    private Executor internalQueryExecutor;
    private Executor internalTransactionExecutor;
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Nullable
    protected List<? extends Callback> mCallbacks;
    @Nullable
    protected volatile SupportSQLiteDatabase mDatabase;
    @NotNull
    private final Map<Class<?>, Object> typeConverters;
    private boolean writeAheadLoggingEnabled;
    @NotNull
    private final InvalidationTracker invalidationTracker = createInvalidationTracker();
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    private Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecs = new LinkedHashMap();
    @NotNull
    private final ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    @NotNull
    private final ThreadLocal<Integer> suspendingTransactionId = new ThreadLocal<>();

    /* compiled from: RoomDatabase.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public static class Builder<T extends RoomDatabase> {
        private boolean allowDestructiveMigrationOnDowngrade;
        private boolean allowMainThreadQueries;
        @Nullable
        private TimeUnit autoCloseTimeUnit;
        private long autoCloseTimeout;
        @NotNull
        private List<AutoMigrationSpec> autoMigrationSpecs;
        @NotNull
        private final List<Callback> callbacks;
        @NotNull
        private final Context context;
        @Nullable
        private String copyFromAssetPath;
        @Nullable
        private File copyFromFile;
        @Nullable
        private Callable<InputStream> copyFromInputStream;
        @Nullable
        private SupportSQLiteOpenHelper.Factory factory;
        @NotNull
        private JournalMode journalMode;
        @NotNull
        private final Class<T> klass;
        @NotNull
        private final MigrationContainer migrationContainer;
        @Nullable
        private Set<Integer> migrationStartAndEndVersions;
        @NotNull
        private Set<Integer> migrationsNotRequiredFrom;
        @Nullable
        private Intent multiInstanceInvalidationIntent;
        @Nullable
        private final String name;
        @Nullable
        private PrepackagedDatabaseCallback prepackagedDatabaseCallback;
        @Nullable
        private QueryCallback queryCallback;
        @Nullable
        private Executor queryCallbackExecutor;
        @Nullable
        private Executor queryExecutor;
        private boolean requireMigration;
        @Nullable
        private Executor transactionExecutor;
        @NotNull
        private final List<Object> typeConverters;

        public Builder(@NotNull Context context, @NotNull Class<T> klass, @Nullable String str) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(klass, "klass");
            this.context = context;
            this.klass = klass;
            this.name = str;
            this.callbacks = new ArrayList();
            this.typeConverters = new ArrayList();
            this.autoMigrationSpecs = new ArrayList();
            this.journalMode = JournalMode.AUTOMATIC;
            this.requireMigration = true;
            this.autoCloseTimeout = -1L;
            this.migrationContainer = new MigrationContainer();
            this.migrationsNotRequiredFrom = new LinkedHashSet();
        }

        @NotNull
        public Builder<T> addAutoMigrationSpec(@NotNull AutoMigrationSpec autoMigrationSpec) {
            Intrinsics.checkNotNullParameter(autoMigrationSpec, "autoMigrationSpec");
            this.autoMigrationSpecs.add(autoMigrationSpec);
            return this;
        }

        @NotNull
        public Builder<T> addCallback(@NotNull Callback callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.callbacks.add(callback);
            return this;
        }

        @NotNull
        public Builder<T> addMigrations(@NotNull Migration... migrations) {
            Intrinsics.checkNotNullParameter(migrations, "migrations");
            if (this.migrationStartAndEndVersions == null) {
                this.migrationStartAndEndVersions = new HashSet();
            }
            for (Migration migration : migrations) {
                Set<Integer> set = this.migrationStartAndEndVersions;
                Intrinsics.m17074g(set);
                set.add(Integer.valueOf(migration.startVersion));
                Set<Integer> set2 = this.migrationStartAndEndVersions;
                Intrinsics.m17074g(set2);
                set2.add(Integer.valueOf(migration.endVersion));
            }
            this.migrationContainer.addMigrations((Migration[]) Arrays.copyOf(migrations, migrations.length));
            return this;
        }

        @NotNull
        public Builder<T> addTypeConverter(@NotNull Object typeConverter) {
            Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
            this.typeConverters.add(typeConverter);
            return this;
        }

        @NotNull
        public Builder<T> allowMainThreadQueries() {
            this.allowMainThreadQueries = true;
            return this;
        }

        @NotNull
        public T build() {
            SQLiteCopyOpenHelperFactory sQLiteCopyOpenHelperFactory;
            int i;
            int i2;
            int i3;
            Executor executor = this.queryExecutor;
            if (executor == null && this.transactionExecutor == null) {
                Executor iOThreadExecutor = ArchTaskExecutor.getIOThreadExecutor();
                this.transactionExecutor = iOThreadExecutor;
                this.queryExecutor = iOThreadExecutor;
            } else if (executor != null && this.transactionExecutor == null) {
                this.transactionExecutor = executor;
            } else if (executor == null) {
                this.queryExecutor = this.transactionExecutor;
            }
            Set<Integer> set = this.migrationStartAndEndVersions;
            boolean z = true;
            if (set != null) {
                Intrinsics.m17074g(set);
                for (Integer num : set) {
                    int intValue = num.intValue();
                    if (!(!this.migrationsNotRequiredFrom.contains(Integer.valueOf(intValue)))) {
                        throw new IllegalArgumentException(("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: " + intValue).toString());
                    }
                }
            }
            AutoClosingRoomOpenHelperFactory autoClosingRoomOpenHelperFactory = this.factory;
            if (autoClosingRoomOpenHelperFactory == null) {
                autoClosingRoomOpenHelperFactory = new FrameworkSQLiteOpenHelperFactory();
            }
            if (autoClosingRoomOpenHelperFactory != null) {
                if (this.autoCloseTimeout > 0) {
                    if (this.name != null) {
                        long j = this.autoCloseTimeout;
                        TimeUnit timeUnit = this.autoCloseTimeUnit;
                        if (timeUnit != null) {
                            Executor executor2 = this.queryExecutor;
                            if (executor2 != null) {
                                autoClosingRoomOpenHelperFactory = new AutoClosingRoomOpenHelperFactory(autoClosingRoomOpenHelperFactory, new AutoCloser(j, timeUnit, executor2));
                            } else {
                                throw new IllegalArgumentException("Required value was null.".toString());
                            }
                        } else {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    } else {
                        throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.".toString());
                    }
                }
                String str = this.copyFromAssetPath;
                if (str != null || this.copyFromFile != null || this.copyFromInputStream != null) {
                    if (this.name != null) {
                        if (str == null) {
                            i = 0;
                        } else {
                            i = 1;
                        }
                        File file = this.copyFromFile;
                        if (file == null) {
                            i2 = 0;
                        } else {
                            i2 = 1;
                        }
                        Callable<InputStream> callable = this.copyFromInputStream;
                        if (callable == null) {
                            i3 = 0;
                        } else {
                            i3 = 1;
                        }
                        if (i + i2 + i3 != 1) {
                            z = false;
                        }
                        if (z) {
                            autoClosingRoomOpenHelperFactory = new SQLiteCopyOpenHelperFactory(str, file, callable, autoClosingRoomOpenHelperFactory);
                        } else {
                            throw new IllegalArgumentException("More than one of createFromAsset(), createFromInputStream(), and createFromFile() were called on this Builder, but the database can only be created using one of the three configurations.".toString());
                        }
                    } else {
                        throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.".toString());
                    }
                }
            } else {
                autoClosingRoomOpenHelperFactory = null;
            }
            if (autoClosingRoomOpenHelperFactory != null) {
                QueryCallback queryCallback = this.queryCallback;
                if (queryCallback != null) {
                    Executor executor3 = this.queryCallbackExecutor;
                    if (executor3 != null) {
                        if (queryCallback != null) {
                            sQLiteCopyOpenHelperFactory = new QueryInterceptorOpenHelperFactory(autoClosingRoomOpenHelperFactory, executor3, queryCallback);
                        } else {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                } else {
                    sQLiteCopyOpenHelperFactory = autoClosingRoomOpenHelperFactory;
                }
                Context context = this.context;
                String str2 = this.name;
                MigrationContainer migrationContainer = this.migrationContainer;
                List<Callback> list = this.callbacks;
                boolean z2 = this.allowMainThreadQueries;
                JournalMode resolve$room_runtime_release = this.journalMode.resolve$room_runtime_release(context);
                Executor executor4 = this.queryExecutor;
                if (executor4 != null) {
                    Executor executor5 = this.transactionExecutor;
                    if (executor5 != null) {
                        DatabaseConfiguration databaseConfiguration = new DatabaseConfiguration(context, str2, sQLiteCopyOpenHelperFactory, migrationContainer, list, z2, resolve$room_runtime_release, executor4, executor5, this.multiInstanceInvalidationIntent, this.requireMigration, this.allowDestructiveMigrationOnDowngrade, this.migrationsNotRequiredFrom, this.copyFromAssetPath, this.copyFromFile, this.copyFromInputStream, this.prepackagedDatabaseCallback, this.typeConverters, this.autoMigrationSpecs);
                        T t = (T) Room.getGeneratedImplementation(this.klass, "_Impl");
                        t.init(databaseConfiguration);
                        return t;
                    }
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }

        @NotNull
        public Builder<T> createFromAsset(@NotNull String databaseFilePath) {
            Intrinsics.checkNotNullParameter(databaseFilePath, "databaseFilePath");
            this.copyFromAssetPath = databaseFilePath;
            return this;
        }

        @NotNull
        public Builder<T> createFromFile(@NotNull File databaseFile) {
            Intrinsics.checkNotNullParameter(databaseFile, "databaseFile");
            this.copyFromFile = databaseFile;
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @NotNull
        public Builder<T> createFromInputStream(@NotNull Callable<InputStream> inputStreamCallable) {
            Intrinsics.checkNotNullParameter(inputStreamCallable, "inputStreamCallable");
            this.copyFromInputStream = inputStreamCallable;
            return this;
        }

        @NotNull
        public Builder<T> enableMultiInstanceInvalidation() {
            Intent intent;
            if (this.name != null) {
                intent = new Intent(this.context, MultiInstanceInvalidationService.class);
            } else {
                intent = null;
            }
            this.multiInstanceInvalidationIntent = intent;
            return this;
        }

        @NotNull
        public Builder<T> fallbackToDestructiveMigration() {
            this.requireMigration = false;
            this.allowDestructiveMigrationOnDowngrade = true;
            return this;
        }

        @NotNull
        public Builder<T> fallbackToDestructiveMigrationFrom(@NotNull int... startVersions) {
            Intrinsics.checkNotNullParameter(startVersions, "startVersions");
            for (int i : startVersions) {
                this.migrationsNotRequiredFrom.add(Integer.valueOf(i));
            }
            return this;
        }

        @NotNull
        public Builder<T> fallbackToDestructiveMigrationOnDowngrade() {
            this.requireMigration = true;
            this.allowDestructiveMigrationOnDowngrade = true;
            return this;
        }

        @NotNull
        public Builder<T> openHelperFactory(@Nullable SupportSQLiteOpenHelper.Factory factory) {
            this.factory = factory;
            return this;
        }

        @ExperimentalRoomApi
        @NotNull
        public Builder<T> setAutoCloseTimeout(@IntRange(from = 0) long j, @NotNull TimeUnit autoCloseTimeUnit) {
            boolean z;
            Intrinsics.checkNotNullParameter(autoCloseTimeUnit, "autoCloseTimeUnit");
            if (j >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.autoCloseTimeout = j;
                this.autoCloseTimeUnit = autoCloseTimeUnit;
                return this;
            }
            throw new IllegalArgumentException("autoCloseTimeout must be >= 0".toString());
        }

        @NotNull
        public Builder<T> setJournalMode(@NotNull JournalMode journalMode) {
            Intrinsics.checkNotNullParameter(journalMode, "journalMode");
            this.journalMode = journalMode;
            return this;
        }

        @ExperimentalRoomApi
        @NotNull
        public Builder<T> setMultiInstanceInvalidationServiceIntent(@NotNull Intent invalidationServiceIntent) {
            Intrinsics.checkNotNullParameter(invalidationServiceIntent, "invalidationServiceIntent");
            if (this.name == null) {
                invalidationServiceIntent = null;
            }
            this.multiInstanceInvalidationIntent = invalidationServiceIntent;
            return this;
        }

        @NotNull
        public Builder<T> setQueryCallback(@NotNull QueryCallback queryCallback, @NotNull Executor executor) {
            Intrinsics.checkNotNullParameter(queryCallback, "queryCallback");
            Intrinsics.checkNotNullParameter(executor, "executor");
            this.queryCallback = queryCallback;
            this.queryCallbackExecutor = executor;
            return this;
        }

        @NotNull
        public Builder<T> setQueryExecutor(@NotNull Executor executor) {
            Intrinsics.checkNotNullParameter(executor, "executor");
            this.queryExecutor = executor;
            return this;
        }

        @NotNull
        public Builder<T> setTransactionExecutor(@NotNull Executor executor) {
            Intrinsics.checkNotNullParameter(executor, "executor");
            this.transactionExecutor = executor;
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @NotNull
        public Builder<T> createFromAsset(@NotNull String databaseFilePath, @NotNull PrepackagedDatabaseCallback callback) {
            Intrinsics.checkNotNullParameter(databaseFilePath, "databaseFilePath");
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.prepackagedDatabaseCallback = callback;
            this.copyFromAssetPath = databaseFilePath;
            return this;
        }

        @SuppressLint({"BuilderSetStyle", "StreamFiles"})
        @NotNull
        public Builder<T> createFromFile(@NotNull File databaseFile, @NotNull PrepackagedDatabaseCallback callback) {
            Intrinsics.checkNotNullParameter(databaseFile, "databaseFile");
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.prepackagedDatabaseCallback = callback;
            this.copyFromFile = databaseFile;
            return this;
        }

        @SuppressLint({"BuilderSetStyle", "LambdaLast"})
        @NotNull
        public Builder<T> createFromInputStream(@NotNull Callable<InputStream> inputStreamCallable, @NotNull PrepackagedDatabaseCallback callback) {
            Intrinsics.checkNotNullParameter(inputStreamCallable, "inputStreamCallable");
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.prepackagedDatabaseCallback = callback;
            this.copyFromInputStream = inputStreamCallable;
            return this;
        }
    }

    /* compiled from: RoomDatabase.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public static abstract class Callback {
        public void onCreate(@NotNull SupportSQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
        }

        public void onDestructiveMigration(@NotNull SupportSQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
        }

        public void onOpen(@NotNull SupportSQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
        }
    }

    /* compiled from: RoomDatabase.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: RoomDatabase.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public enum JournalMode {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        private final boolean isLowRamDevice(ActivityManager activityManager) {
            return SupportSQLiteCompat.Api19Impl.isLowRamDevice(activityManager);
        }

        @NotNull
        public final JournalMode resolve$room_runtime_release(@NotNull Context context) {
            ActivityManager activityManager;
            Intrinsics.checkNotNullParameter(context, "context");
            if (this != AUTOMATIC) {
                return this;
            }
            Object systemService = context.getSystemService("activity");
            if (systemService instanceof ActivityManager) {
                activityManager = (ActivityManager) systemService;
            } else {
                activityManager = null;
            }
            if (activityManager != null && !isLowRamDevice(activityManager)) {
                return WRITE_AHEAD_LOGGING;
            }
            return TRUNCATE;
        }
    }

    /* compiled from: RoomDatabase.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public static abstract class PrepackagedDatabaseCallback {
        public void onOpenPrepackagedDatabase(@NotNull SupportSQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
        }
    }

    /* compiled from: RoomDatabase.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public interface QueryCallback {
        void onQuery(@NotNull String str, @NotNull List<? extends Object> list);
    }

    public RoomDatabase() {
        Map<String, Object> synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        Intrinsics.checkNotNullExpressionValue(synchronizedMap, "synchronizedMap(mutableMapOf())");
        this.backingFieldMap = synchronizedMap;
        this.typeConverters = new LinkedHashMap();
    }

    public final void internalBeginTransaction() {
        assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = getOpenHelper().getWritableDatabase();
        getInvalidationTracker().syncTriggers$room_runtime_release(writableDatabase);
        if (writableDatabase.isWriteAheadLoggingEnabled()) {
            writableDatabase.beginTransactionNonExclusive();
        } else {
            writableDatabase.beginTransaction();
        }
    }

    public final void internalEndTransaction() {
        getOpenHelper().getWritableDatabase().endTransaction();
        if (!inTransaction()) {
            getInvalidationTracker().refreshVersionsAsync();
        }
    }

    public static /* synthetic */ Cursor query$default(RoomDatabase roomDatabase, SupportSQLiteQuery supportSQLiteQuery, CancellationSignal cancellationSignal, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                cancellationSignal = null;
            }
            return roomDatabase.query(supportSQLiteQuery, cancellationSignal);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T> T unwrapOpenHelper(Class<T> cls, SupportSQLiteOpenHelper supportSQLiteOpenHelper) {
        if (cls.isInstance(supportSQLiteOpenHelper)) {
            return supportSQLiteOpenHelper;
        }
        if (supportSQLiteOpenHelper instanceof DelegatingOpenHelper) {
            return (T) unwrapOpenHelper(cls, ((DelegatingOpenHelper) supportSQLiteOpenHelper).getDelegate());
        }
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void assertNotMainThread() {
        if (this.allowMainThreadQueries || (!isMainThread$room_runtime_release())) {
            return;
        }
        throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.".toString());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void assertNotSuspendingTransaction() {
        boolean z;
        if (!inTransaction() && this.suspendingTransactionId.get() != null) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return;
        }
        throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.".toString());
    }

    public void beginTransaction() {
        assertNotMainThread();
        AutoCloser autoCloser = this.autoCloser;
        if (autoCloser == null) {
            internalBeginTransaction();
        } else {
            autoCloser.executeRefCountingFunction(new RoomDatabase$beginTransaction$1(this));
        }
    }

    @WorkerThread
    public abstract void clearAllTables();

    public void close() {
        if (isOpen()) {
            ReentrantReadWriteLock.WriteLock writeLock = this.readWriteLock.writeLock();
            Intrinsics.checkNotNullExpressionValue(writeLock, "readWriteLock.writeLock()");
            writeLock.lock();
            try {
                getInvalidationTracker().stopMultiInstanceInvalidation$room_runtime_release();
                getOpenHelper().close();
            } finally {
                writeLock.unlock();
            }
        }
    }

    @NotNull
    public SupportSQLiteStatement compileStatement(@NotNull String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return getOpenHelper().getWritableDatabase().compileStatement(sql);
    }

    @NotNull
    protected abstract InvalidationTracker createInvalidationTracker();

    @NotNull
    protected abstract SupportSQLiteOpenHelper createOpenHelper(@NotNull DatabaseConfiguration databaseConfiguration);

    public void endTransaction() {
        AutoCloser autoCloser = this.autoCloser;
        if (autoCloser == null) {
            internalEndTransaction();
        } else {
            autoCloser.executeRefCountingFunction(new RoomDatabase$endTransaction$1(this));
        }
    }

    @NotNull
    protected final Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> getAutoMigrationSpecs() {
        return this.autoMigrationSpecs;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public List<Migration> getAutoMigrations(@NotNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecs) {
        List<Migration> m17166m;
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        m17166m = C37563v.m17166m();
        return m17166m;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public final Map<String, Object> getBackingFieldMap() {
        return this.backingFieldMap;
    }

    @NotNull
    public final Lock getCloseLock$room_runtime_release() {
        ReentrantReadWriteLock.ReadLock readLock = this.readWriteLock.readLock();
        Intrinsics.checkNotNullExpressionValue(readLock, "readWriteLock.readLock()");
        return readLock;
    }

    @NotNull
    public InvalidationTracker getInvalidationTracker() {
        return this.invalidationTracker;
    }

    @NotNull
    public SupportSQLiteOpenHelper getOpenHelper() {
        SupportSQLiteOpenHelper supportSQLiteOpenHelper = this.internalOpenHelper;
        if (supportSQLiteOpenHelper == null) {
            Intrinsics.m17056y("internalOpenHelper");
            return null;
        }
        return supportSQLiteOpenHelper;
    }

    @NotNull
    public Executor getQueryExecutor() {
        Executor executor = this.internalQueryExecutor;
        if (executor == null) {
            Intrinsics.m17056y("internalQueryExecutor");
            return null;
        }
        return executor;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
        Set<Class<? extends AutoMigrationSpec>> m17123f;
        m17123f = C37572z0.m17123f();
        return m17123f;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        Map<Class<?>, List<Class<?>>> m17284j;
        m17284j = C37559r0.m17284j();
        return m17284j;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public final ThreadLocal<Integer> getSuspendingTransactionId() {
        return this.suspendingTransactionId;
    }

    @NotNull
    public Executor getTransactionExecutor() {
        Executor executor = this.internalTransactionExecutor;
        if (executor == null) {
            Intrinsics.m17056y("internalTransactionExecutor");
            return null;
        }
        return executor;
    }

    @Nullable
    public <T> T getTypeConverter(@NotNull Class<T> klass) {
        Intrinsics.checkNotNullParameter(klass, "klass");
        return (T) this.typeConverters.get(klass);
    }

    public boolean inTransaction() {
        return getOpenHelper().getWritableDatabase().inTransaction();
    }

    @CallSuper
    public void init(@NotNull DatabaseConfiguration configuration) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.internalOpenHelper = createOpenHelper(configuration);
        Set<Class<? extends AutoMigrationSpec>> requiredAutoMigrationSpecs = getRequiredAutoMigrationSpecs();
        BitSet bitSet = new BitSet();
        Iterator<Class<? extends AutoMigrationSpec>> it = requiredAutoMigrationSpecs.iterator();
        while (true) {
            boolean z3 = true;
            int i = -1;
            if (it.hasNext()) {
                Class<? extends AutoMigrationSpec> next = it.next();
                int size = configuration.autoMigrationSpecs.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i2 = size - 1;
                        if (next.isAssignableFrom(configuration.autoMigrationSpecs.get(size).getClass())) {
                            bitSet.set(size);
                            i = size;
                            break;
                        } else if (i2 < 0) {
                            break;
                        } else {
                            size = i2;
                        }
                    }
                }
                if (i < 0) {
                    z3 = false;
                }
                if (z3) {
                    this.autoMigrationSpecs.put(next, configuration.autoMigrationSpecs.get(i));
                } else {
                    throw new IllegalArgumentException(("A required auto migration spec (" + next.getCanonicalName() + ") is missing in the database configuration.").toString());
                }
            } else {
                int size2 = configuration.autoMigrationSpecs.size() - 1;
                if (size2 >= 0) {
                    while (true) {
                        int i3 = size2 - 1;
                        if (bitSet.get(size2)) {
                            if (i3 < 0) {
                                break;
                            }
                            size2 = i3;
                        } else {
                            throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.".toString());
                        }
                    }
                }
                for (Migration migration : getAutoMigrations(this.autoMigrationSpecs)) {
                    if (!configuration.migrationContainer.contains(migration.startVersion, migration.endVersion)) {
                        configuration.migrationContainer.addMigrations(migration);
                    }
                }
                SQLiteCopyOpenHelper sQLiteCopyOpenHelper = (SQLiteCopyOpenHelper) unwrapOpenHelper(SQLiteCopyOpenHelper.class, getOpenHelper());
                if (sQLiteCopyOpenHelper != null) {
                    sQLiteCopyOpenHelper.setDatabaseConfiguration(configuration);
                }
                AutoClosingRoomOpenHelper autoClosingRoomOpenHelper = (AutoClosingRoomOpenHelper) unwrapOpenHelper(AutoClosingRoomOpenHelper.class, getOpenHelper());
                if (autoClosingRoomOpenHelper != null) {
                    this.autoCloser = autoClosingRoomOpenHelper.autoCloser;
                    getInvalidationTracker().setAutoCloser$room_runtime_release(autoClosingRoomOpenHelper.autoCloser);
                }
                if (configuration.journalMode == JournalMode.WRITE_AHEAD_LOGGING) {
                    z = true;
                } else {
                    z = false;
                }
                getOpenHelper().setWriteAheadLoggingEnabled(z);
                this.mCallbacks = configuration.callbacks;
                this.internalQueryExecutor = configuration.queryExecutor;
                this.internalTransactionExecutor = new TransactionExecutor(configuration.transactionExecutor);
                this.allowMainThreadQueries = configuration.allowMainThreadQueries;
                this.writeAheadLoggingEnabled = z;
                if (configuration.multiInstanceInvalidationServiceIntent != null) {
                    if (configuration.name != null) {
                        getInvalidationTracker().startMultiInstanceInvalidation$room_runtime_release(configuration.context, configuration.name, configuration.multiInstanceInvalidationServiceIntent);
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                Map<Class<?>, List<Class<?>>> requiredTypeConverters = getRequiredTypeConverters();
                BitSet bitSet2 = new BitSet();
                for (Map.Entry<Class<?>, List<Class<?>>> entry : requiredTypeConverters.entrySet()) {
                    Class<?> key = entry.getKey();
                    for (Class<?> cls : entry.getValue()) {
                        int size3 = configuration.typeConverters.size() - 1;
                        if (size3 >= 0) {
                            while (true) {
                                int i4 = size3 - 1;
                                if (cls.isAssignableFrom(configuration.typeConverters.get(size3).getClass())) {
                                    bitSet2.set(size3);
                                    break;
                                } else if (i4 < 0) {
                                    break;
                                } else {
                                    size3 = i4;
                                }
                            }
                        }
                        size3 = -1;
                        if (size3 >= 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            this.typeConverters.put(cls, configuration.typeConverters.get(size3));
                        } else {
                            throw new IllegalArgumentException(("A required type converter (" + cls + ") for " + key.getCanonicalName() + " is missing in the database configuration.").toString());
                        }
                    }
                }
                int size4 = configuration.typeConverters.size() - 1;
                if (size4 < 0) {
                    return;
                }
                while (true) {
                    int i5 = size4 - 1;
                    if (bitSet2.get(size4)) {
                        if (i5 >= 0) {
                            size4 = i5;
                        } else {
                            return;
                        }
                    } else {
                        throw new IllegalArgumentException("Unexpected type converter " + configuration.typeConverters.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                    }
                }
            }
        }
    }

    public void internalInitInvalidationTracker(@NotNull SupportSQLiteDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        getInvalidationTracker().internalInit$room_runtime_release(db);
    }

    public final boolean isMainThread$room_runtime_release() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    public boolean isOpen() {
        Boolean bool;
        boolean isOpen;
        AutoCloser autoCloser = this.autoCloser;
        if (autoCloser != null) {
            isOpen = autoCloser.isActive();
        } else {
            SupportSQLiteDatabase supportSQLiteDatabase = this.mDatabase;
            if (supportSQLiteDatabase != null) {
                isOpen = supportSQLiteDatabase.isOpen();
            } else {
                bool = null;
                return Intrinsics.m17075f(bool, Boolean.TRUE);
            }
        }
        bool = Boolean.valueOf(isOpen);
        return Intrinsics.m17075f(bool, Boolean.TRUE);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean isOpenInternal() {
        SupportSQLiteDatabase supportSQLiteDatabase = this.mDatabase;
        if (supportSQLiteDatabase == null || !supportSQLiteDatabase.isOpen()) {
            return false;
        }
        return true;
    }

    @NotNull
    public final Cursor query(@NotNull SupportSQLiteQuery query) {
        Intrinsics.checkNotNullParameter(query, "query");
        return query$default(this, query, null, 2, null);
    }

    public void runInTransaction(@NotNull Runnable body) {
        Intrinsics.checkNotNullParameter(body, "body");
        beginTransaction();
        try {
            body.run();
            setTransactionSuccessful();
        } finally {
            endTransaction();
        }
    }

    protected final void setAutoMigrationSpecs(@NotNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.autoMigrationSpecs = map;
    }

    public void setTransactionSuccessful() {
        getOpenHelper().getWritableDatabase().setTransactionSuccessful();
    }

    @NotNull
    public Cursor query(@NotNull String query, @Nullable Object[] objArr) {
        Intrinsics.checkNotNullParameter(query, "query");
        return getOpenHelper().getWritableDatabase().query(new SimpleSQLiteQuery(query, objArr));
    }

    /* compiled from: RoomDatabase.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public static class MigrationContainer {
        @NotNull
        private final Map<Integer, TreeMap<Integer, Migration>> migrations = new LinkedHashMap();

        private final void addMigration(Migration migration) {
            int i = migration.startVersion;
            int i2 = migration.endVersion;
            Map<Integer, TreeMap<Integer, Migration>> map = this.migrations;
            Integer valueOf = Integer.valueOf(i);
            TreeMap<Integer, Migration> treeMap = map.get(valueOf);
            if (treeMap == null) {
                treeMap = new TreeMap<>();
                map.put(valueOf, treeMap);
            }
            TreeMap<Integer, Migration> treeMap2 = treeMap;
            if (treeMap2.containsKey(Integer.valueOf(i2))) {
                Log.w(Room.LOG_TAG, "Overriding migration " + treeMap2.get(Integer.valueOf(i2)) + " with " + migration);
            }
            treeMap2.put(Integer.valueOf(i2), migration);
        }

        /* JADX WARN: Code restructure failed: missing block: B:68:0x0049, code lost:
            if (r6 <= r12) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:72:0x0055, code lost:
            if (r6 < r11) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:73:0x0057, code lost:
            r6 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:89:0x005a, code lost:
            continue;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final java.util.List<androidx.room.migration.Migration> findUpMigrationPath(java.util.List<androidx.room.migration.Migration> r9, boolean r10, int r11, int r12) {
            /*
                r8 = this;
            L0:
                r0 = 1
                r1 = 0
                if (r10 == 0) goto L7
                if (r11 >= r12) goto Lb
                goto L9
            L7:
                if (r11 <= r12) goto Lb
            L9:
                r2 = r0
                goto Lc
            Lb:
                r2 = r1
            Lc:
                if (r2 == 0) goto L6f
                java.util.Map<java.lang.Integer, java.util.TreeMap<java.lang.Integer, androidx.room.migration.Migration>> r2 = r8.migrations
                java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
                java.lang.Object r2 = r2.get(r3)
                java.util.TreeMap r2 = (java.util.TreeMap) r2
                r3 = 0
                if (r2 != 0) goto L1e
                return r3
            L1e:
                if (r10 == 0) goto L25
                java.util.NavigableSet r4 = r2.descendingKeySet()
                goto L29
            L25:
                java.util.Set r4 = r2.keySet()
            L29:
                java.util.Iterator r4 = r4.iterator()
            L2d:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto L6b
                java.lang.Object r5 = r4.next()
                java.lang.Integer r5 = (java.lang.Integer) r5
                java.lang.String r6 = "targetVersion"
                if (r10 == 0) goto L4c
                int r7 = r11 + 1
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
                int r6 = r5.intValue()
                if (r7 > r6) goto L59
                if (r6 > r12) goto L59
                goto L57
            L4c:
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
                int r6 = r5.intValue()
                if (r12 > r6) goto L59
                if (r6 >= r11) goto L59
            L57:
                r6 = r0
                goto L5a
            L59:
                r6 = r1
            L5a:
                if (r6 == 0) goto L2d
                java.lang.Object r11 = r2.get(r5)
                kotlin.jvm.internal.Intrinsics.m17074g(r11)
                r9.add(r11)
                int r11 = r5.intValue()
                goto L6c
            L6b:
                r0 = r1
            L6c:
                if (r0 != 0) goto L0
                return r3
            L6f:
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.RoomDatabase.MigrationContainer.findUpMigrationPath(java.util.List, boolean, int, int):java.util.List");
        }

        public void addMigrations(@NotNull List<? extends Migration> migrations) {
            Intrinsics.checkNotNullParameter(migrations, "migrations");
            for (Migration migration : migrations) {
                addMigration(migration);
            }
        }

        public final boolean contains(int i, int i2) {
            Map<Integer, Map<Integer, Migration>> migrations = getMigrations();
            if (migrations.containsKey(Integer.valueOf(i))) {
                Map<Integer, Migration> map = migrations.get(Integer.valueOf(i));
                if (map == null) {
                    map = C37559r0.m17284j();
                }
                return map.containsKey(Integer.valueOf(i2));
            }
            return false;
        }

        @Nullable
        public List<Migration> findMigrationPath(int i, int i2) {
            boolean z;
            List<Migration> m17166m;
            if (i == i2) {
                m17166m = C37563v.m17166m();
                return m17166m;
            }
            if (i2 > i) {
                z = true;
            } else {
                z = false;
            }
            return findUpMigrationPath(new ArrayList(), z, i, i2);
        }

        @NotNull
        public Map<Integer, Map<Integer, Migration>> getMigrations() {
            return this.migrations;
        }

        public void addMigrations(@NotNull Migration... migrations) {
            Intrinsics.checkNotNullParameter(migrations, "migrations");
            for (Migration migration : migrations) {
                addMigration(migration);
            }
        }
    }

    @NotNull
    public Cursor query(@NotNull SupportSQLiteQuery query, @Nullable CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(query, "query");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        if (cancellationSignal != null) {
            return getOpenHelper().getWritableDatabase().query(query, cancellationSignal);
        }
        return getOpenHelper().getWritableDatabase().query(query);
    }

    public <V> V runInTransaction(@NotNull Callable<V> body) {
        Intrinsics.checkNotNullParameter(body, "body");
        beginTransaction();
        try {
            V call = body.call();
            setTransactionSuccessful();
            return call;
        } finally {
            endTransaction();
        }
    }

    protected static /* synthetic */ void getMCallbacks$annotations() {
    }

    protected static /* synthetic */ void getMDatabase$annotations() {
    }

    public static /* synthetic */ void isOpen$annotations() {
    }

    public static /* synthetic */ void isOpenInternal$annotations() {
    }
}
