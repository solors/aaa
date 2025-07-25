package androidx.room;

import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.sqlite.p021db.SupportSQLiteProgram;
import androidx.sqlite.p021db.SupportSQLiteQuery;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RoomSQLiteQuery.kt */
@Metadata
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes2.dex */
public final class RoomSQLiteQuery implements SupportSQLiteQuery, SupportSQLiteProgram {
    private static final int BLOB = 5;
    public static final int DESIRED_POOL_SIZE = 10;
    private static final int DOUBLE = 3;
    private static final int LONG = 2;
    private static final int NULL = 1;
    public static final int POOL_LIMIT = 15;
    private static final int STRING = 4;
    private int argCount;
    @NotNull
    private final int[] bindingTypes;
    @NotNull
    public final byte[][] blobBindings;
    @VisibleForTesting
    private final int capacity;
    @NotNull
    public final double[] doubleBindings;
    @NotNull
    public final long[] longBindings;
    @Nullable
    private volatile String query;
    @NotNull
    public final String[] stringBindings;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    public static final TreeMap<Integer, RoomSQLiteQuery> queryPool = new TreeMap<>();

    /* compiled from: RoomSQLiteQuery.kt */
    @Retention(RetentionPolicy.SOURCE)
    @Metadata
    /* loaded from: classes2.dex */
    public @interface Binding {
    }

    public /* synthetic */ RoomSQLiteQuery(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    @NotNull
    public static final RoomSQLiteQuery acquire(@NotNull String str, int i) {
        return Companion.acquire(str, i);
    }

    @NotNull
    public static final RoomSQLiteQuery copyFrom(@NotNull SupportSQLiteQuery supportSQLiteQuery) {
        return Companion.copyFrom(supportSQLiteQuery);
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteProgram
    public void bindBlob(int i, @NotNull byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.bindingTypes[i] = 5;
        this.blobBindings[i] = value;
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteProgram
    public void bindDouble(int i, double d) {
        this.bindingTypes[i] = 3;
        this.doubleBindings[i] = d;
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteProgram
    public void bindLong(int i, long j) {
        this.bindingTypes[i] = 2;
        this.longBindings[i] = j;
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteProgram
    public void bindNull(int i) {
        this.bindingTypes[i] = 1;
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteProgram
    public void bindString(int i, @NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.bindingTypes[i] = 4;
        this.stringBindings[i] = value;
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteQuery
    public void bindTo(@NotNull SupportSQLiteProgram statement) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        int argCount = getArgCount();
        if (1 <= argCount) {
            int i = 1;
            while (true) {
                int i2 = this.bindingTypes[i];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 != 4) {
                                if (i2 == 5) {
                                    byte[] bArr = this.blobBindings[i];
                                    if (bArr != null) {
                                        statement.bindBlob(i, bArr);
                                    } else {
                                        throw new IllegalArgumentException("Required value was null.".toString());
                                    }
                                }
                            } else {
                                String str = this.stringBindings[i];
                                if (str != null) {
                                    statement.bindString(i, str);
                                } else {
                                    throw new IllegalArgumentException("Required value was null.".toString());
                                }
                            }
                        } else {
                            statement.bindDouble(i, this.doubleBindings[i]);
                        }
                    } else {
                        statement.bindLong(i, this.longBindings[i]);
                    }
                } else {
                    statement.bindNull(i);
                }
                if (i != argCount) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteProgram
    public void clearBindings() {
        Arrays.fill(this.bindingTypes, 1);
        Arrays.fill(this.stringBindings, (Object) null);
        Arrays.fill(this.blobBindings, (Object) null);
        this.query = null;
    }

    public final void copyArgumentsFrom(@NotNull RoomSQLiteQuery other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int argCount = other.getArgCount() + 1;
        System.arraycopy(other.bindingTypes, 0, this.bindingTypes, 0, argCount);
        System.arraycopy(other.longBindings, 0, this.longBindings, 0, argCount);
        System.arraycopy(other.stringBindings, 0, this.stringBindings, 0, argCount);
        System.arraycopy(other.blobBindings, 0, this.blobBindings, 0, argCount);
        System.arraycopy(other.doubleBindings, 0, this.doubleBindings, 0, argCount);
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteQuery
    public int getArgCount() {
        return this.argCount;
    }

    public final int getCapacity() {
        return this.capacity;
    }

    @Override // androidx.sqlite.p021db.SupportSQLiteQuery
    @NotNull
    public String getSql() {
        String str = this.query;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public final void init(@NotNull String query, int i) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.query = query;
        this.argCount = i;
    }

    public final void release() {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = queryPool;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.capacity), this);
            Companion.prunePoolLocked$room_runtime_release();
            Unit unit = Unit.f99208a;
        }
    }

    private RoomSQLiteQuery(int i) {
        this.capacity = i;
        int i2 = i + 1;
        this.bindingTypes = new int[i2];
        this.longBindings = new long[i2];
        this.doubleBindings = new double[i2];
        this.stringBindings = new String[i2];
        this.blobBindings = new byte[i2];
    }

    /* compiled from: RoomSQLiteQuery.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final RoomSQLiteQuery acquire(@NotNull String query, int i) {
            Intrinsics.checkNotNullParameter(query, "query");
            TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.queryPool;
            synchronized (treeMap) {
                Map.Entry<Integer, RoomSQLiteQuery> ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
                if (ceilingEntry != null) {
                    treeMap.remove(ceilingEntry.getKey());
                    RoomSQLiteQuery sqliteQuery = ceilingEntry.getValue();
                    sqliteQuery.init(query, i);
                    Intrinsics.checkNotNullExpressionValue(sqliteQuery, "sqliteQuery");
                    return sqliteQuery;
                }
                Unit unit = Unit.f99208a;
                RoomSQLiteQuery roomSQLiteQuery = new RoomSQLiteQuery(i, null);
                roomSQLiteQuery.init(query, i);
                return roomSQLiteQuery;
            }
        }

        @NotNull
        public final RoomSQLiteQuery copyFrom(@NotNull SupportSQLiteQuery supportSQLiteQuery) {
            Intrinsics.checkNotNullParameter(supportSQLiteQuery, "supportSQLiteQuery");
            final RoomSQLiteQuery acquire = acquire(supportSQLiteQuery.getSql(), supportSQLiteQuery.getArgCount());
            supportSQLiteQuery.bindTo(new SupportSQLiteProgram() { // from class: androidx.room.RoomSQLiteQuery$Companion$copyFrom$1
                @Override // androidx.sqlite.p021db.SupportSQLiteProgram
                public void bindBlob(int i, @NotNull byte[] value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    RoomSQLiteQuery.this.bindBlob(i, value);
                }

                @Override // androidx.sqlite.p021db.SupportSQLiteProgram
                public void bindDouble(int i, double d) {
                    RoomSQLiteQuery.this.bindDouble(i, d);
                }

                @Override // androidx.sqlite.p021db.SupportSQLiteProgram
                public void bindLong(int i, long j) {
                    RoomSQLiteQuery.this.bindLong(i, j);
                }

                @Override // androidx.sqlite.p021db.SupportSQLiteProgram
                public void bindNull(int i) {
                    RoomSQLiteQuery.this.bindNull(i);
                }

                @Override // androidx.sqlite.p021db.SupportSQLiteProgram
                public void bindString(int i, @NotNull String value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    RoomSQLiteQuery.this.bindString(i, value);
                }

                @Override // androidx.sqlite.p021db.SupportSQLiteProgram
                public void clearBindings() {
                    RoomSQLiteQuery.this.clearBindings();
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                    RoomSQLiteQuery.this.close();
                }
            });
            return acquire;
        }

        public final void prunePoolLocked$room_runtime_release() {
            TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.queryPool;
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator<Integer> it = treeMap.descendingKeySet().iterator();
                Intrinsics.checkNotNullExpressionValue(it, "queryPool.descendingKeySet().iterator()");
                while (true) {
                    int i = size - 1;
                    if (size > 0) {
                        it.next();
                        it.remove();
                        size = i;
                    } else {
                        return;
                    }
                }
            }
        }

        @VisibleForTesting
        public static /* synthetic */ void getDESIRED_POOL_SIZE$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getPOOL_LIMIT$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getQueryPool$annotations() {
        }
    }

    private static /* synthetic */ void getBindingTypes$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getBlobBindings$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getDoubleBindings$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getLongBindings$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getStringBindings$annotations() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
