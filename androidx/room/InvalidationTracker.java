package androidx.room;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.arch.core.internal.SafeIterableMap;
import androidx.lifecycle.LiveData;
import androidx.sqlite.p021db.SimpleSQLiteQuery;
import androidx.sqlite.p021db.SupportSQLiteDatabase;
import androidx.sqlite.p021db.SupportSQLiteStatement;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C37559r0;
import kotlin.collections.C37572z0;
import kotlin.collections.SetsJVM;
import kotlin.collections._Collections;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsJVM;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1046xd.Closeable;

/* compiled from: InvalidationTracker.kt */
@Metadata
/* loaded from: classes2.dex */
public class InvalidationTracker {
    @NotNull
    private static final String CREATE_TRACKING_TABLE_SQL = "CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)";
    @NotNull
    private static final String INVALIDATED_COLUMN_NAME = "invalidated";
    @NotNull
    public static final String RESET_UPDATED_TABLES_SQL = "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1";
    @NotNull
    public static final String SELECT_UPDATED_TABLES_SQL = "SELECT * FROM room_table_modification_log WHERE invalidated = 1;";
    @NotNull
    private static final String TABLE_ID_COLUMN_NAME = "table_id";
    @NotNull
    private static final String UPDATE_TABLE_NAME = "room_table_modification_log";
    @Nullable
    private AutoCloser autoCloser;
    @Nullable
    private volatile SupportSQLiteStatement cleanupStatement;
    @NotNull
    private final RoomDatabase database;
    private volatile boolean initialized;
    @NotNull
    private final InvalidationLiveDataContainer invalidationLiveDataContainer;
    @Nullable
    private MultiInstanceInvalidationClient multiInstanceInvalidationClient;
    @NotNull
    private final ObservedTableTracker observedTableTracker;
    @GuardedBy("observerMap")
    @NotNull
    private final SafeIterableMap<Observer, ObserverWrapper> observerMap;
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @NotNull
    private final AtomicBoolean pendingRefresh;
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @NotNull
    public final Runnable refreshRunnable;
    @NotNull
    private final Map<String, String> shadowTablesMap;
    @NotNull
    private final Object syncTriggersLock;
    @NotNull
    private final Map<String, Integer> tableIdLookup;
    @NotNull
    private final String[] tablesNames;
    @NotNull
    private final Object trackerLock;
    @NotNull
    private final Map<String, Set<String>> viewTables;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final String[] TRIGGERS = {"UPDATE", "DELETE", "INSERT"};

    /* compiled from: InvalidationTracker.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public static final class ObservedTableTracker {
        public static final int ADD = 1;
        @NotNull
        public static final Companion Companion = new Companion(null);
        public static final int NO_OP = 0;
        public static final int REMOVE = 2;
        private boolean needsSync;
        @NotNull
        private final long[] tableObservers;
        @NotNull
        private final int[] triggerStateChanges;
        @NotNull
        private final boolean[] triggerStates;

        /* compiled from: InvalidationTracker.kt */
        @Metadata
        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public ObservedTableTracker(int i) {
            this.tableObservers = new long[i];
            this.triggerStates = new boolean[i];
            this.triggerStateChanges = new int[i];
        }

        public final boolean getNeedsSync() {
            return this.needsSync;
        }

        @NotNull
        public final long[] getTableObservers() {
            return this.tableObservers;
        }

        @VisibleForTesting
        @Nullable
        public final int[] getTablesToSync() {
            boolean z;
            synchronized (this) {
                if (!this.needsSync) {
                    return null;
                }
                long[] jArr = this.tableObservers;
                int length = jArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    int i3 = i2 + 1;
                    int i4 = 1;
                    if (jArr[i] > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    boolean[] zArr = this.triggerStates;
                    if (z != zArr[i2]) {
                        int[] iArr = this.triggerStateChanges;
                        if (!z) {
                            i4 = 2;
                        }
                        iArr[i2] = i4;
                    } else {
                        this.triggerStateChanges[i2] = 0;
                    }
                    zArr[i2] = z;
                    i++;
                    i2 = i3;
                }
                this.needsSync = false;
                return (int[]) this.triggerStateChanges.clone();
            }
        }

        public final boolean onAdded(@NotNull int... tableIds) {
            boolean z;
            Intrinsics.checkNotNullParameter(tableIds, "tableIds");
            synchronized (this) {
                z = false;
                for (int i : tableIds) {
                    long[] jArr = this.tableObservers;
                    long j = jArr[i];
                    jArr[i] = 1 + j;
                    if (j == 0) {
                        z = true;
                        this.needsSync = true;
                    }
                }
                Unit unit = Unit.f99208a;
            }
            return z;
        }

        public final boolean onRemoved(@NotNull int... tableIds) {
            boolean z;
            Intrinsics.checkNotNullParameter(tableIds, "tableIds");
            synchronized (this) {
                z = false;
                for (int i : tableIds) {
                    long[] jArr = this.tableObservers;
                    long j = jArr[i];
                    jArr[i] = j - 1;
                    if (j == 1) {
                        z = true;
                        this.needsSync = true;
                    }
                }
                Unit unit = Unit.f99208a;
            }
            return z;
        }

        public final void resetTriggerState() {
            synchronized (this) {
                Arrays.fill(this.triggerStates, false);
                this.needsSync = true;
                Unit unit = Unit.f99208a;
            }
        }

        public final void setNeedsSync(boolean z) {
            this.needsSync = z;
        }
    }

    /* compiled from: InvalidationTracker.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public static abstract class Observer {
        @NotNull
        private final String[] tables;

        public Observer(@NotNull String[] tables) {
            Intrinsics.checkNotNullParameter(tables, "tables");
            this.tables = tables;
        }

        @NotNull
        public final String[] getTables$room_runtime_release() {
            return this.tables;
        }

        public boolean isRemote$room_runtime_release() {
            return false;
        }

        public abstract void onInvalidated(@NotNull Set<String> set);

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        protected Observer(@org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.NotNull java.lang.String... r4) {
            /*
                r2 = this;
                java.lang.String r0 = "firstTable"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r0 = "rest"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                java.util.List r0 = kotlin.collections.C37561t.m17222c()
                r1 = r0
                java.util.Collection r1 = (java.util.Collection) r1
                kotlin.collections.C37561t.m17257F(r1, r4)
                r0.add(r3)
                java.util.List r3 = kotlin.collections.C37561t.m17225a(r0)
                java.util.Collection r3 = (java.util.Collection) r3
                r4 = 0
                java.lang.String[] r4 = new java.lang.String[r4]
                java.lang.Object[] r3 = r3.toArray(r4)
                java.lang.String r4 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
                kotlin.jvm.internal.Intrinsics.m17073h(r3, r4)
                java.lang.String[] r3 = (java.lang.String[]) r3
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.InvalidationTracker.Observer.<init>(java.lang.String, java.lang.String[]):void");
        }
    }

    /* compiled from: InvalidationTracker.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public static final class ObserverWrapper {
        @NotNull
        private final Observer observer;
        @NotNull
        private final Set<String> singleTableSet;
        @NotNull
        private final int[] tableIds;
        @NotNull
        private final String[] tableNames;

        public ObserverWrapper(@NotNull Observer observer, @NotNull int[] tableIds, @NotNull String[] tableNames) {
            boolean z;
            Intrinsics.checkNotNullParameter(observer, "observer");
            Intrinsics.checkNotNullParameter(tableIds, "tableIds");
            Intrinsics.checkNotNullParameter(tableNames, "tableNames");
            this.observer = observer;
            this.tableIds = tableIds;
            this.tableNames = tableNames;
            if (tableNames.length == 0) {
                z = true;
            } else {
                z = false;
            }
            this.singleTableSet = z ^ true ? SetsJVM.m17127d(tableNames[0]) : C37572z0.m17123f();
            if (tableIds.length == tableNames.length) {
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        }

        @NotNull
        public final Observer getObserver$room_runtime_release() {
            return this.observer;
        }

        @NotNull
        public final int[] getTableIds$room_runtime_release() {
            return this.tableIds;
        }

        public final void notifyByTableInvalidStatus$room_runtime_release(@NotNull Set<Integer> invalidatedTablesIds) {
            Set<String> m17123f;
            Set m17129b;
            Intrinsics.checkNotNullParameter(invalidatedTablesIds, "invalidatedTablesIds");
            int[] iArr = this.tableIds;
            int length = iArr.length;
            if (length == 0) {
                m17123f = C37572z0.m17123f();
            } else {
                int i = 0;
                if (length != 1) {
                    m17129b = SetsJVM.m17129b();
                    int[] iArr2 = this.tableIds;
                    int length2 = iArr2.length;
                    int i2 = 0;
                    while (i < length2) {
                        int i3 = i2 + 1;
                        if (invalidatedTablesIds.contains(Integer.valueOf(iArr2[i]))) {
                            m17129b.add(this.tableNames[i2]);
                        }
                        i++;
                        i2 = i3;
                    }
                    m17123f = SetsJVM.m17130a(m17129b);
                } else {
                    m17123f = invalidatedTablesIds.contains(Integer.valueOf(iArr[0])) ? this.singleTableSet : C37572z0.m17123f();
                }
            }
            if (!m17123f.isEmpty()) {
                this.observer.onInvalidated(m17123f);
            }
        }

        public final void notifyByTableNames$room_runtime_release(@NotNull String[] tables) {
            Set<String> m17123f;
            boolean m16615y;
            Set m17129b;
            String[] strArr;
            boolean m16615y2;
            Intrinsics.checkNotNullParameter(tables, "tables");
            int length = this.tableNames.length;
            if (length == 0) {
                m17123f = C37572z0.m17123f();
            } else {
                boolean z = false;
                if (length != 1) {
                    m17129b = SetsJVM.m17129b();
                    for (String str : tables) {
                        for (String str2 : this.tableNames) {
                            m16615y2 = StringsJVM.m16615y(str2, str, true);
                            if (m16615y2) {
                                m17129b.add(str2);
                            }
                        }
                    }
                    m17123f = SetsJVM.m17130a(m17129b);
                } else {
                    int length2 = tables.length;
                    int i = 0;
                    while (true) {
                        if (i >= length2) {
                            break;
                        }
                        m16615y = StringsJVM.m16615y(tables[i], this.tableNames[0], true);
                        if (m16615y) {
                            z = true;
                            break;
                        }
                        i++;
                    }
                    m17123f = z ? this.singleTableSet : C37572z0.m17123f();
                }
            }
            if (!m17123f.isEmpty()) {
                this.observer.onInvalidated(m17123f);
            }
        }
    }

    /* compiled from: InvalidationTracker.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public static final class WeakObserver extends Observer {
        @NotNull
        private final WeakReference<Observer> delegateRef;
        @NotNull
        private final InvalidationTracker tracker;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WeakObserver(@NotNull InvalidationTracker tracker, @NotNull Observer delegate) {
            super(delegate.getTables$room_runtime_release());
            Intrinsics.checkNotNullParameter(tracker, "tracker");
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.tracker = tracker;
            this.delegateRef = new WeakReference<>(delegate);
        }

        @NotNull
        public final WeakReference<Observer> getDelegateRef() {
            return this.delegateRef;
        }

        @NotNull
        public final InvalidationTracker getTracker() {
            return this.tracker;
        }

        @Override // androidx.room.InvalidationTracker.Observer
        public void onInvalidated(@NotNull Set<String> tables) {
            Intrinsics.checkNotNullParameter(tables, "tables");
            Observer observer = this.delegateRef.get();
            if (observer == null) {
                this.tracker.removeObserver(this);
            } else {
                observer.onInvalidated(tables);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public InvalidationTracker(@NotNull RoomDatabase database, @NotNull Map<String, String> shadowTablesMap, @NotNull Map<String, Set<String>> viewTables, @NotNull String... tableNames) {
        Object m17283k;
        String str;
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(shadowTablesMap, "shadowTablesMap");
        Intrinsics.checkNotNullParameter(viewTables, "viewTables");
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        this.database = database;
        this.shadowTablesMap = shadowTablesMap;
        this.viewTables = viewTables;
        this.pendingRefresh = new AtomicBoolean(false);
        this.observedTableTracker = new ObservedTableTracker(tableNames.length);
        this.invalidationLiveDataContainer = new InvalidationLiveDataContainer(database);
        this.observerMap = new SafeIterableMap<>();
        this.syncTriggersLock = new Object();
        this.trackerLock = new Object();
        this.tableIdLookup = new LinkedHashMap();
        int length = tableNames.length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            String str2 = tableNames[i];
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = str2.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            this.tableIdLookup.put(lowerCase, Integer.valueOf(i));
            String str3 = this.shadowTablesMap.get(tableNames[i]);
            if (str3 != null) {
                Intrinsics.checkNotNullExpressionValue(US, "US");
                str = str3.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String).toLowerCase(locale)");
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr[i] = lowerCase;
        }
        this.tablesNames = strArr;
        for (Map.Entry<String, String> entry : this.shadowTablesMap.entrySet()) {
            Locale US2 = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US2, "US");
            String lowerCase2 = entry.getValue().toLowerCase(US2);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            if (this.tableIdLookup.containsKey(lowerCase2)) {
                Intrinsics.checkNotNullExpressionValue(US2, "US");
                String lowerCase3 = entry.getKey().toLowerCase(US2);
                Intrinsics.checkNotNullExpressionValue(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
                Map<String, Integer> map = this.tableIdLookup;
                m17283k = C37559r0.m17283k(map, lowerCase2);
                map.put(lowerCase3, m17283k);
            }
        }
        this.refreshRunnable = new Runnable() { // from class: androidx.room.InvalidationTracker$refreshRunnable$1
            private final Set<Integer> checkUpdatedTable() {
                Set m17129b;
                Set<Integer> m17130a;
                InvalidationTracker invalidationTracker = InvalidationTracker.this;
                m17129b = SetsJVM.m17129b();
                Cursor query$default = RoomDatabase.query$default(invalidationTracker.getDatabase$room_runtime_release(), new SimpleSQLiteQuery(InvalidationTracker.SELECT_UPDATED_TABLES_SQL), null, 2, null);
                try {
                    Cursor cursor = query$default;
                    while (cursor.moveToNext()) {
                        m17129b.add(Integer.valueOf(cursor.getInt(0)));
                    }
                    Unit unit = Unit.f99208a;
                    Closeable.m1220a(query$default, null);
                    m17130a = SetsJVM.m17130a(m17129b);
                    if (!m17130a.isEmpty()) {
                        if (InvalidationTracker.this.getCleanupStatement$room_runtime_release() != null) {
                            SupportSQLiteStatement cleanupStatement$room_runtime_release = InvalidationTracker.this.getCleanupStatement$room_runtime_release();
                            if (cleanupStatement$room_runtime_release != null) {
                                cleanupStatement$room_runtime_release.executeUpdateDelete();
                            } else {
                                throw new IllegalArgumentException("Required value was null.".toString());
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.".toString());
                        }
                    }
                    return m17130a;
                } finally {
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:25:0x0080, code lost:
                if (r0 != null) goto L31;
             */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x0082, code lost:
                r0.decrementCountAndScheduleClose();
             */
            /* JADX WARN: Code restructure failed: missing block: B:35:0x00a2, code lost:
                if (r0 == null) goto L32;
             */
            /* JADX WARN: Code restructure failed: missing block: B:40:0x00ba, code lost:
                if (r0 == null) goto L32;
             */
            /* JADX WARN: Code restructure failed: missing block: B:43:0x00c5, code lost:
                if ((!r3.isEmpty()) == false) goto L48;
             */
            /* JADX WARN: Code restructure failed: missing block: B:44:0x00c7, code lost:
                r0 = r5.this$0.getObserverMap$room_runtime_release();
                r1 = r5.this$0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:45:0x00cf, code lost:
                monitor-enter(r0);
             */
            /* JADX WARN: Code restructure failed: missing block: B:46:0x00d0, code lost:
                r1 = r1.getObserverMap$room_runtime_release().iterator();
             */
            /* JADX WARN: Code restructure failed: missing block: B:48:0x00dc, code lost:
                if (r1.hasNext() == false) goto L41;
             */
            /* JADX WARN: Code restructure failed: missing block: B:49:0x00de, code lost:
                ((androidx.room.InvalidationTracker.ObserverWrapper) ((java.util.Map.Entry) r1.next()).getValue()).notifyByTableInvalidStatus$room_runtime_release(r3);
             */
            /* JADX WARN: Code restructure failed: missing block: B:50:0x00ee, code lost:
                r1 = kotlin.Unit.f99208a;
             */
            /* JADX WARN: Code restructure failed: missing block: B:51:0x00f0, code lost:
                monitor-exit(r0);
             */
            /* JADX WARN: Code restructure failed: missing block: B:56:0x00f5, code lost:
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:70:?, code lost:
                return;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void run() {
                /*
                    Method dump skipped, instructions count: 261
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.room.InvalidationTracker$refreshRunnable$1.run():void");
            }
        };
    }

    public final void onAutoCloseCallback() {
        synchronized (this.trackerLock) {
            this.initialized = false;
            this.observedTableTracker.resetTriggerState();
            SupportSQLiteStatement supportSQLiteStatement = this.cleanupStatement;
            if (supportSQLiteStatement != null) {
                supportSQLiteStatement.close();
                Unit unit = Unit.f99208a;
            }
        }
    }

    private final String[] resolveViews(String[] strArr) {
        Set m17129b;
        Set m17130a;
        m17129b = SetsJVM.m17129b();
        for (String str : strArr) {
            Map<String, Set<String>> map = this.viewTables;
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = str.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (map.containsKey(lowerCase)) {
                Map<String, Set<String>> map2 = this.viewTables;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                String lowerCase2 = str.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                Set<String> set = map2.get(lowerCase2);
                Intrinsics.m17074g(set);
                m17129b.addAll(set);
            } else {
                m17129b.add(str);
            }
        }
        m17130a = SetsJVM.m17130a(m17129b);
        Object[] array = m17130a.toArray(new String[0]);
        Intrinsics.m17073h(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (String[]) array;
    }

    private final void startTrackingTable(SupportSQLiteDatabase supportSQLiteDatabase, int i) {
        supportSQLiteDatabase.execSQL("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i + ", 0)");
        String str = this.tablesNames[i];
        for (String str2 : TRIGGERS) {
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + Companion.getTriggerName$room_runtime_release(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE " + UPDATE_TABLE_NAME + " SET " + INVALIDATED_COLUMN_NAME + " = 1 WHERE " + TABLE_ID_COLUMN_NAME + " = " + i + " AND " + INVALIDATED_COLUMN_NAME + " = 0; END";
            Intrinsics.checkNotNullExpressionValue(str3, "StringBuilder().apply(builderAction).toString()");
            supportSQLiteDatabase.execSQL(str3);
        }
    }

    private final void stopTrackingTable(SupportSQLiteDatabase supportSQLiteDatabase, int i) {
        String[] strArr;
        String str = this.tablesNames[i];
        for (String str2 : TRIGGERS) {
            String str3 = "DROP TRIGGER IF EXISTS " + Companion.getTriggerName$room_runtime_release(str, str2);
            Intrinsics.checkNotNullExpressionValue(str3, "StringBuilder().apply(builderAction).toString()");
            supportSQLiteDatabase.execSQL(str3);
        }
    }

    private final String[] validateAndResolveTableNames(String[] strArr) {
        String[] resolveViews = resolveViews(strArr);
        for (String str : resolveViews) {
            Map<String, Integer> map = this.tableIdLookup;
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = str.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!map.containsKey(lowerCase)) {
                throw new IllegalArgumentException(("There is no table with name " + str).toString());
            }
        }
        return resolveViews;
    }

    @SuppressLint({"RestrictedApi"})
    @WorkerThread
    public void addObserver(@NotNull Observer observer) {
        int[] m17554Y0;
        ObserverWrapper putIfAbsent;
        Intrinsics.checkNotNullParameter(observer, "observer");
        String[] resolveViews = resolveViews(observer.getTables$room_runtime_release());
        ArrayList arrayList = new ArrayList(resolveViews.length);
        for (String str : resolveViews) {
            Map<String, Integer> map = this.tableIdLookup;
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = str.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            Integer num = map.get(lowerCase);
            if (num != null) {
                arrayList.add(Integer.valueOf(num.intValue()));
            } else {
                throw new IllegalArgumentException("There is no table with name " + str);
            }
        }
        m17554Y0 = _Collections.m17554Y0(arrayList);
        ObserverWrapper observerWrapper = new ObserverWrapper(observer, m17554Y0, resolveViews);
        synchronized (this.observerMap) {
            putIfAbsent = this.observerMap.putIfAbsent(observer, observerWrapper);
        }
        if (putIfAbsent == null && this.observedTableTracker.onAdded(Arrays.copyOf(m17554Y0, m17554Y0.length))) {
            syncTriggers$room_runtime_release();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void addWeakObserver(@NotNull Observer observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        addObserver(new WeakObserver(this, observer));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @NotNull
    public <T> LiveData<T> createLiveData(@NotNull String[] tableNames, @NotNull Callable<T> computeFunction) {
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        Intrinsics.checkNotNullParameter(computeFunction, "computeFunction");
        return createLiveData(tableNames, false, computeFunction);
    }

    public final boolean ensureInitialization$room_runtime_release() {
        if (!this.database.isOpenInternal()) {
            return false;
        }
        if (!this.initialized) {
            this.database.getOpenHelper().getWritableDatabase();
        }
        if (!this.initialized) {
            Log.e(Room.LOG_TAG, "database is not initialized even though it is open");
            return false;
        }
        return true;
    }

    @Nullable
    public final SupportSQLiteStatement getCleanupStatement$room_runtime_release() {
        return this.cleanupStatement;
    }

    @NotNull
    public final RoomDatabase getDatabase$room_runtime_release() {
        return this.database;
    }

    @NotNull
    public final SafeIterableMap<Observer, ObserverWrapper> getObserverMap$room_runtime_release() {
        return this.observerMap;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @NotNull
    public final AtomicBoolean getPendingRefresh() {
        return this.pendingRefresh;
    }

    @NotNull
    public final Map<String, Integer> getTableIdLookup$room_runtime_release() {
        return this.tableIdLookup;
    }

    @NotNull
    public final String[] getTablesNames$room_runtime_release() {
        return this.tablesNames;
    }

    public final void internalInit$room_runtime_release(@NotNull SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        synchronized (this.trackerLock) {
            if (this.initialized) {
                Log.e(Room.LOG_TAG, "Invalidation tracker is initialized twice :/.");
                return;
            }
            database.execSQL("PRAGMA temp_store = MEMORY;");
            database.execSQL("PRAGMA recursive_triggers='ON';");
            database.execSQL(CREATE_TRACKING_TABLE_SQL);
            syncTriggers$room_runtime_release(database);
            this.cleanupStatement = database.compileStatement(RESET_UPDATED_TABLES_SQL);
            this.initialized = true;
            Unit unit = Unit.f99208a;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @VisibleForTesting(otherwise = 3)
    public final void notifyObserversByTableNames(@NotNull String... tables) {
        Intrinsics.checkNotNullParameter(tables, "tables");
        synchronized (this.observerMap) {
            Iterator<Map.Entry<K, V>> it = this.observerMap.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Intrinsics.checkNotNullExpressionValue(entry, "(observer, wrapper)");
                ObserverWrapper observerWrapper = (ObserverWrapper) entry.getValue();
                if (!((Observer) entry.getKey()).isRemote$room_runtime_release()) {
                    observerWrapper.notifyByTableNames$room_runtime_release(tables);
                }
            }
            Unit unit = Unit.f99208a;
        }
    }

    public void refreshVersionsAsync() {
        if (this.pendingRefresh.compareAndSet(false, true)) {
            AutoCloser autoCloser = this.autoCloser;
            if (autoCloser != null) {
                autoCloser.incrementCountAndEnsureDbIsOpen();
            }
            this.database.getQueryExecutor().execute(this.refreshRunnable);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @WorkerThread
    public void refreshVersionsSync() {
        AutoCloser autoCloser = this.autoCloser;
        if (autoCloser != null) {
            autoCloser.incrementCountAndEnsureDbIsOpen();
        }
        syncTriggers$room_runtime_release();
        this.refreshRunnable.run();
    }

    @SuppressLint({"RestrictedApi"})
    @WorkerThread
    public void removeObserver(@NotNull Observer observer) {
        ObserverWrapper remove;
        Intrinsics.checkNotNullParameter(observer, "observer");
        synchronized (this.observerMap) {
            remove = this.observerMap.remove(observer);
        }
        if (remove != null) {
            ObservedTableTracker observedTableTracker = this.observedTableTracker;
            int[] tableIds$room_runtime_release = remove.getTableIds$room_runtime_release();
            if (observedTableTracker.onRemoved(Arrays.copyOf(tableIds$room_runtime_release, tableIds$room_runtime_release.length))) {
                syncTriggers$room_runtime_release();
            }
        }
    }

    public final void setAutoCloser$room_runtime_release(@NotNull AutoCloser autoCloser) {
        Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
        this.autoCloser = autoCloser;
        autoCloser.setAutoCloseCallback(new Runnable() { // from class: androidx.room.c
            {
                InvalidationTracker.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                InvalidationTracker.this.onAutoCloseCallback();
            }
        });
    }

    public final void setCleanupStatement$room_runtime_release(@Nullable SupportSQLiteStatement supportSQLiteStatement) {
        this.cleanupStatement = supportSQLiteStatement;
    }

    public final void startMultiInstanceInvalidation$room_runtime_release(@NotNull Context context, @NotNull String name, @NotNull Intent serviceIntent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(serviceIntent, "serviceIntent");
        this.multiInstanceInvalidationClient = new MultiInstanceInvalidationClient(context, name, serviceIntent, this, this.database.getQueryExecutor());
    }

    public final void stopMultiInstanceInvalidation$room_runtime_release() {
        MultiInstanceInvalidationClient multiInstanceInvalidationClient = this.multiInstanceInvalidationClient;
        if (multiInstanceInvalidationClient != null) {
            multiInstanceInvalidationClient.stop();
        }
        this.multiInstanceInvalidationClient = null;
    }

    public final void syncTriggers$room_runtime_release(@NotNull SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        if (database.inTransaction()) {
            return;
        }
        try {
            Lock closeLock$room_runtime_release = this.database.getCloseLock$room_runtime_release();
            closeLock$room_runtime_release.lock();
            synchronized (this.syncTriggersLock) {
                int[] tablesToSync = this.observedTableTracker.getTablesToSync();
                if (tablesToSync == null) {
                    closeLock$room_runtime_release.unlock();
                    return;
                }
                Companion.beginTransactionInternal$room_runtime_release(database);
                int length = tablesToSync.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    int i3 = tablesToSync[i];
                    int i4 = i2 + 1;
                    if (i3 == 1) {
                        startTrackingTable(database, i2);
                    } else if (i3 == 2) {
                        stopTrackingTable(database, i2);
                    }
                    i++;
                    i2 = i4;
                }
                database.setTransactionSuccessful();
                database.endTransaction();
                Unit unit = Unit.f99208a;
                closeLock$room_runtime_release.unlock();
            }
        } catch (SQLiteException e) {
            Log.e(Room.LOG_TAG, "Cannot run invalidation tracker. Is the db closed?", e);
        } catch (IllegalStateException e2) {
            Log.e(Room.LOG_TAG, "Cannot run invalidation tracker. Is the db closed?", e2);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @NotNull
    public <T> LiveData<T> createLiveData(@NotNull String[] tableNames, boolean z, @NotNull Callable<T> computeFunction) {
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        Intrinsics.checkNotNullParameter(computeFunction, "computeFunction");
        return this.invalidationLiveDataContainer.create(validateAndResolveTableNames(tableNames), z, computeFunction);
    }

    /* compiled from: InvalidationTracker.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void beginTransactionInternal$room_runtime_release(@NotNull SupportSQLiteDatabase database) {
            Intrinsics.checkNotNullParameter(database, "database");
            if (database.isWriteAheadLoggingEnabled()) {
                database.beginTransactionNonExclusive();
            } else {
                database.beginTransaction();
            }
        }

        @NotNull
        public final String getTriggerName$room_runtime_release(@NotNull String tableName, @NotNull String triggerType) {
            Intrinsics.checkNotNullParameter(tableName, "tableName");
            Intrinsics.checkNotNullParameter(triggerType, "triggerType");
            return "`room_table_modification_trigger_" + tableName + '_' + triggerType + '`';
        }

        @VisibleForTesting
        public static /* synthetic */ void getRESET_UPDATED_TABLES_SQL$room_runtime_release$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getSELECT_UPDATED_TABLES_SQL$room_runtime_release$annotations() {
        }
    }

    public final void syncTriggers$room_runtime_release() {
        if (this.database.isOpenInternal()) {
            syncTriggers$room_runtime_release(this.database.getOpenHelper().getWritableDatabase());
        }
    }

    @VisibleForTesting
    public static /* synthetic */ void getRefreshRunnable$annotations() {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public InvalidationTracker(@org.jetbrains.annotations.NotNull androidx.room.RoomDatabase r4, @org.jetbrains.annotations.NotNull java.lang.String... r5) {
        /*
            r3 = this;
            java.lang.String r0 = "database"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "tableNames"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.util.Map r0 = kotlin.collections.C37554o0.m17366j()
            java.util.Map r1 = kotlin.collections.C37554o0.m17366j()
            int r2 = r5.length
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r2)
            java.lang.String[] r5 = (java.lang.String[]) r5
            r3.<init>(r4, r0, r1, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.InvalidationTracker.<init>(androidx.room.RoomDatabase, java.lang.String[]):void");
    }
}
