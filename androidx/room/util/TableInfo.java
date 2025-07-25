package androidx.room.util;

import android.annotation.SuppressLint;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.room.ColumnInfo;
import androidx.room.Index;
import androidx.sqlite.p021db.SupportSQLiteDatabase;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C37690r;
import kotlin.text.StringsJVM;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TableInfo.kt */
@Metadata
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes2.dex */
public final class TableInfo {
    public static final int CREATED_FROM_DATABASE = 2;
    public static final int CREATED_FROM_ENTITY = 1;
    public static final int CREATED_FROM_UNKNOWN = 0;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    public final Map<String, Column> columns;
    @NotNull
    public final Set<ForeignKey> foreignKeys;
    @Nullable
    public final Set<Index> indices;
    @NotNull
    public final String name;

    /* compiled from: TableInfo.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TableInfo read(@NotNull SupportSQLiteDatabase database, @NotNull String tableName) {
            Intrinsics.checkNotNullParameter(database, "database");
            Intrinsics.checkNotNullParameter(tableName, "tableName");
            return TableInfoKt.readTableInfo(database, tableName);
        }
    }

    /* compiled from: TableInfo.kt */
    @Retention(RetentionPolicy.SOURCE)
    @Metadata
    /* loaded from: classes2.dex */
    public @interface CreatedFrom {
    }

    /* compiled from: TableInfo.kt */
    @Metadata
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes2.dex */
    public static final class ForeignKey {
        @NotNull
        public final List<String> columnNames;
        @NotNull
        public final String onDelete;
        @NotNull
        public final String onUpdate;
        @NotNull
        public final List<String> referenceColumnNames;
        @NotNull
        public final String referenceTable;

        public ForeignKey(@NotNull String referenceTable, @NotNull String onDelete, @NotNull String onUpdate, @NotNull List<String> columnNames, @NotNull List<String> referenceColumnNames) {
            Intrinsics.checkNotNullParameter(referenceTable, "referenceTable");
            Intrinsics.checkNotNullParameter(onDelete, "onDelete");
            Intrinsics.checkNotNullParameter(onUpdate, "onUpdate");
            Intrinsics.checkNotNullParameter(columnNames, "columnNames");
            Intrinsics.checkNotNullParameter(referenceColumnNames, "referenceColumnNames");
            this.referenceTable = referenceTable;
            this.onDelete = onDelete;
            this.onUpdate = onUpdate;
            this.columnNames = columnNames;
            this.referenceColumnNames = referenceColumnNames;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ForeignKey)) {
                return false;
            }
            ForeignKey foreignKey = (ForeignKey) obj;
            if (!Intrinsics.m17075f(this.referenceTable, foreignKey.referenceTable) || !Intrinsics.m17075f(this.onDelete, foreignKey.onDelete) || !Intrinsics.m17075f(this.onUpdate, foreignKey.onUpdate) || !Intrinsics.m17075f(this.columnNames, foreignKey.columnNames)) {
                return false;
            }
            return Intrinsics.m17075f(this.referenceColumnNames, foreignKey.referenceColumnNames);
        }

        public int hashCode() {
            return (((((((this.referenceTable.hashCode() * 31) + this.onDelete.hashCode()) * 31) + this.onUpdate.hashCode()) * 31) + this.columnNames.hashCode()) * 31) + this.referenceColumnNames.hashCode();
        }

        @NotNull
        public String toString() {
            return "ForeignKey{referenceTable='" + this.referenceTable + "', onDelete='" + this.onDelete + " +', onUpdate='" + this.onUpdate + "', columnNames=" + this.columnNames + ", referenceColumnNames=" + this.referenceColumnNames + '}';
        }
    }

    /* compiled from: TableInfo.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public static final class ForeignKeyWithSequence implements Comparable<ForeignKeyWithSequence> {
        @NotNull
        private final String from;

        /* renamed from: id */
        private final int f1459id;
        private final int sequence;
        @NotNull

        /* renamed from: to */
        private final String f1460to;

        public ForeignKeyWithSequence(int i, int i2, @NotNull String from, @NotNull String to) {
            Intrinsics.checkNotNullParameter(from, "from");
            Intrinsics.checkNotNullParameter(to, "to");
            this.f1459id = i;
            this.sequence = i2;
            this.from = from;
            this.f1460to = to;
        }

        @NotNull
        public final String getFrom() {
            return this.from;
        }

        public final int getId() {
            return this.f1459id;
        }

        public final int getSequence() {
            return this.sequence;
        }

        @NotNull
        public final String getTo() {
            return this.f1460to;
        }

        @Override // java.lang.Comparable
        public int compareTo(@NotNull ForeignKeyWithSequence other) {
            Intrinsics.checkNotNullParameter(other, "other");
            int i = this.f1459id - other.f1459id;
            return i == 0 ? this.sequence - other.sequence : i;
        }
    }

    public TableInfo(@NotNull String name, @NotNull Map<String, Column> columns, @NotNull Set<ForeignKey> foreignKeys, @Nullable Set<Index> set) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(columns, "columns");
        Intrinsics.checkNotNullParameter(foreignKeys, "foreignKeys");
        this.name = name;
        this.columns = columns;
        this.foreignKeys = foreignKeys;
        this.indices = set;
    }

    @NotNull
    public static final TableInfo read(@NotNull SupportSQLiteDatabase supportSQLiteDatabase, @NotNull String str) {
        return Companion.read(supportSQLiteDatabase, str);
    }

    public boolean equals(@Nullable Object obj) {
        Set<Index> set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TableInfo)) {
            return false;
        }
        TableInfo tableInfo = (TableInfo) obj;
        if (!Intrinsics.m17075f(this.name, tableInfo.name) || !Intrinsics.m17075f(this.columns, tableInfo.columns) || !Intrinsics.m17075f(this.foreignKeys, tableInfo.foreignKeys)) {
            return false;
        }
        Set<Index> set2 = this.indices;
        if (set2 == null || (set = tableInfo.indices) == null) {
            return true;
        }
        return Intrinsics.m17075f(set2, set);
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + this.columns.hashCode()) * 31) + this.foreignKeys.hashCode();
    }

    @NotNull
    public String toString() {
        return "TableInfo{name='" + this.name + "', columns=" + this.columns + ", foreignKeys=" + this.foreignKeys + ", indices=" + this.indices + '}';
    }

    public /* synthetic */ TableInfo(String str, Map map, Set set, Set set2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, map, set, (i & 8) != 0 ? null : set2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public TableInfo(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, androidx.room.util.TableInfo.Column> r3, @org.jetbrains.annotations.NotNull java.util.Set<androidx.room.util.TableInfo.ForeignKey> r4) {
        /*
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "columns"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "foreignKeys"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.util.Set r0 = kotlin.collections.C37570x0.m17138f()
            r1.<init>(r2, r3, r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.util.TableInfo.<init>(java.lang.String, java.util.Map, java.util.Set):void");
    }

    /* compiled from: TableInfo.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public static final class Column {
        @NotNull
        public static final Companion Companion = new Companion(null);
        public final int affinity;
        public final int createdFrom;
        @Nullable
        public final String defaultValue;
        @NotNull
        public final String name;
        public final boolean notNull;
        public final int primaryKeyPosition;
        @NotNull
        public final String type;

        /* compiled from: TableInfo.kt */
        @Metadata
        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final boolean containsSurroundingParenthesis(String str) {
                boolean z;
                if (str.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return false;
                }
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                while (i < str.length()) {
                    char charAt = str.charAt(i);
                    int i4 = i3 + 1;
                    if (i3 == 0 && charAt != '(') {
                        return false;
                    }
                    if (charAt == '(') {
                        i2++;
                    } else if (charAt == ')' && i2 - 1 == 0 && i3 != str.length() - 1) {
                        return false;
                    }
                    i++;
                    i3 = i4;
                }
                if (i2 == 0) {
                    return true;
                }
                return false;
            }

            @SuppressLint({"SyntheticAccessor"})
            @VisibleForTesting
            public final boolean defaultValueEquals(@NotNull String current, @Nullable String str) {
                CharSequence m16571b1;
                Intrinsics.checkNotNullParameter(current, "current");
                if (Intrinsics.m17075f(current, str)) {
                    return true;
                }
                if (containsSurroundingParenthesis(current)) {
                    String substring = current.substring(1, current.length() - 1);
                    Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    m16571b1 = C37690r.m16571b1(substring);
                    return Intrinsics.m17075f(m16571b1.toString(), str);
                }
                return false;
            }
        }

        public Column(@NotNull String name, @NotNull String type, boolean z, int i, @Nullable String str, int i2) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(type, "type");
            this.name = name;
            this.type = type;
            this.notNull = z;
            this.primaryKeyPosition = i;
            this.defaultValue = str;
            this.createdFrom = i2;
            this.affinity = findAffinity(type);
        }

        @SuppressLint({"SyntheticAccessor"})
        @VisibleForTesting
        public static final boolean defaultValueEquals(@NotNull String str, @Nullable String str2) {
            return Companion.defaultValueEquals(str, str2);
        }

        @ColumnInfo.SQLiteTypeAffinity
        private final int findAffinity(String str) {
            boolean m16592R;
            boolean m16592R2;
            boolean m16592R3;
            boolean m16592R4;
            boolean m16592R5;
            boolean m16592R6;
            boolean m16592R7;
            boolean m16592R8;
            if (str == null) {
                return 5;
            }
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String upperCase = str.toUpperCase(US);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
            m16592R = C37690r.m16592R(upperCase, "INT", false, 2, null);
            if (!m16592R) {
                m16592R2 = C37690r.m16592R(upperCase, "CHAR", false, 2, null);
                if (!m16592R2) {
                    m16592R3 = C37690r.m16592R(upperCase, "CLOB", false, 2, null);
                    if (!m16592R3) {
                        m16592R4 = C37690r.m16592R(upperCase, "TEXT", false, 2, null);
                        if (!m16592R4) {
                            m16592R5 = C37690r.m16592R(upperCase, "BLOB", false, 2, null);
                            if (m16592R5) {
                                return 5;
                            }
                            m16592R6 = C37690r.m16592R(upperCase, "REAL", false, 2, null);
                            if (!m16592R6) {
                                m16592R7 = C37690r.m16592R(upperCase, "FLOA", false, 2, null);
                                if (!m16592R7) {
                                    m16592R8 = C37690r.m16592R(upperCase, "DOUB", false, 2, null);
                                    if (!m16592R8) {
                                        return 1;
                                    }
                                    return 4;
                                }
                                return 4;
                            }
                            return 4;
                        }
                    }
                }
                return 2;
            }
            return 3;
        }

        /* JADX WARN: Code restructure failed: missing block: B:46:0x0072, code lost:
            r1 = true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r7) {
            /*
                r6 = this;
                r0 = 1
                if (r6 != r7) goto L4
                return r0
            L4:
                boolean r1 = r7 instanceof androidx.room.util.TableInfo.Column
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                int r1 = r6.primaryKeyPosition
                r3 = r7
                androidx.room.util.TableInfo$Column r3 = (androidx.room.util.TableInfo.Column) r3
                int r3 = r3.primaryKeyPosition
                if (r1 == r3) goto L14
                return r2
            L14:
                java.lang.String r1 = r6.name
                androidx.room.util.TableInfo$Column r7 = (androidx.room.util.TableInfo.Column) r7
                java.lang.String r3 = r7.name
                boolean r1 = kotlin.jvm.internal.Intrinsics.m17075f(r1, r3)
                if (r1 != 0) goto L21
                return r2
            L21:
                boolean r1 = r6.notNull
                boolean r3 = r7.notNull
                if (r1 == r3) goto L28
                return r2
            L28:
                int r1 = r6.createdFrom
                r3 = 2
                if (r1 != r0) goto L40
                int r1 = r7.createdFrom
                if (r1 != r3) goto L40
                java.lang.String r1 = r6.defaultValue
                if (r1 == 0) goto L40
                androidx.room.util.TableInfo$Column$Companion r4 = androidx.room.util.TableInfo.Column.Companion
                java.lang.String r5 = r7.defaultValue
                boolean r1 = r4.defaultValueEquals(r1, r5)
                if (r1 != 0) goto L40
                return r2
            L40:
                int r1 = r6.createdFrom
                if (r1 != r3) goto L57
                int r1 = r7.createdFrom
                if (r1 != r0) goto L57
                java.lang.String r1 = r7.defaultValue
                if (r1 == 0) goto L57
                androidx.room.util.TableInfo$Column$Companion r3 = androidx.room.util.TableInfo.Column.Companion
                java.lang.String r4 = r6.defaultValue
                boolean r1 = r3.defaultValueEquals(r1, r4)
                if (r1 != 0) goto L57
                return r2
            L57:
                int r1 = r6.createdFrom
                if (r1 == 0) goto L78
                int r3 = r7.createdFrom
                if (r1 != r3) goto L78
                java.lang.String r1 = r6.defaultValue
                if (r1 == 0) goto L6e
                androidx.room.util.TableInfo$Column$Companion r3 = androidx.room.util.TableInfo.Column.Companion
                java.lang.String r4 = r7.defaultValue
                boolean r1 = r3.defaultValueEquals(r1, r4)
                if (r1 != 0) goto L74
                goto L72
            L6e:
                java.lang.String r1 = r7.defaultValue
                if (r1 == 0) goto L74
            L72:
                r1 = r0
                goto L75
            L74:
                r1 = r2
            L75:
                if (r1 == 0) goto L78
                return r2
            L78:
                int r1 = r6.affinity
                int r7 = r7.affinity
                if (r1 != r7) goto L7f
                goto L80
            L7f:
                r0 = r2
            L80:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.util.TableInfo.Column.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            int i;
            int hashCode = ((this.name.hashCode() * 31) + this.affinity) * 31;
            if (this.notNull) {
                i = 1231;
            } else {
                i = 1237;
            }
            return ((hashCode + i) * 31) + this.primaryKeyPosition;
        }

        public final boolean isPrimaryKey() {
            if (this.primaryKeyPosition > 0) {
                return true;
            }
            return false;
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Column{name='");
            sb2.append(this.name);
            sb2.append("', type='");
            sb2.append(this.type);
            sb2.append("', affinity='");
            sb2.append(this.affinity);
            sb2.append("', notNull=");
            sb2.append(this.notNull);
            sb2.append(", primaryKeyPosition=");
            sb2.append(this.primaryKeyPosition);
            sb2.append(", defaultValue='");
            String str = this.defaultValue;
            if (str == null) {
                str = "undefined";
            }
            sb2.append(str);
            sb2.append("'}");
            return sb2.toString();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Column(@NotNull String name, @NotNull String type, boolean z, int i) {
            this(name, type, z, i, null, 0);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(type, "type");
        }

        @ColumnInfo.SQLiteTypeAffinity
        public static /* synthetic */ void getAffinity$annotations() {
        }
    }

    /* compiled from: TableInfo.kt */
    @Metadata
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes2.dex */
    public static final class Index {
        @NotNull
        public static final Companion Companion = new Companion(null);
        @NotNull
        public static final String DEFAULT_PREFIX = "index_";
        @NotNull
        public final List<String> columns;
        @NotNull
        public final String name;
        @NotNull
        public List<String> orders;
        public final boolean unique;

        /* compiled from: TableInfo.kt */
        @Metadata
        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r5v2 */
        /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
        public Index(@NotNull String name, boolean z, @NotNull List<String> columns, @NotNull List<String> orders) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(columns, "columns");
            Intrinsics.checkNotNullParameter(orders, "orders");
            this.name = name;
            this.unique = z;
            this.columns = columns;
            this.orders = orders;
            List<String> list = orders;
            if (list.isEmpty()) {
                int size = columns.size();
                list = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    list.add(Index.Order.ASC.name());
                }
            }
            this.orders = (List) list;
        }

        public boolean equals(@Nullable Object obj) {
            boolean m16624M;
            boolean m16624M2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Index)) {
                return false;
            }
            Index index = (Index) obj;
            if (this.unique == index.unique && Intrinsics.m17075f(this.columns, index.columns) && Intrinsics.m17075f(this.orders, index.orders)) {
                m16624M = StringsJVM.m16624M(this.name, DEFAULT_PREFIX, false, 2, null);
                if (m16624M) {
                    m16624M2 = StringsJVM.m16624M(index.name, DEFAULT_PREFIX, false, 2, null);
                    return m16624M2;
                }
                return Intrinsics.m17075f(this.name, index.name);
            }
            return false;
        }

        public int hashCode() {
            boolean m16624M;
            int hashCode;
            m16624M = StringsJVM.m16624M(this.name, DEFAULT_PREFIX, false, 2, null);
            if (m16624M) {
                hashCode = -1184239155;
            } else {
                hashCode = this.name.hashCode();
            }
            return (((((hashCode * 31) + (this.unique ? 1 : 0)) * 31) + this.columns.hashCode()) * 31) + this.orders.hashCode();
        }

        @NotNull
        public String toString() {
            return "Index{name='" + this.name + "', unique=" + this.unique + ", columns=" + this.columns + ", orders=" + this.orders + "'}";
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public Index(@org.jetbrains.annotations.NotNull java.lang.String r5, boolean r6, @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> r7) {
            /*
                r4 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                java.lang.String r0 = "columns"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
                int r0 = r7.size()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>(r0)
                r2 = 0
            L14:
                if (r2 >= r0) goto L22
                androidx.room.Index$Order r3 = androidx.room.Index.Order.ASC
                java.lang.String r3 = r3.name()
                r1.add(r3)
                int r2 = r2 + 1
                goto L14
            L22:
                r4.<init>(r5, r6, r7, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.util.TableInfo.Index.<init>(java.lang.String, boolean, java.util.List):void");
        }
    }
}
