package androidx.room.util;

import android.annotation.SuppressLint;
import android.database.Cursor;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.sqlite.p021db.SupportSQLiteDatabase;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C37572z0;
import kotlin.collections.SetsJVM;
import kotlin.collections._Collections;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C37690r;
import kotlin.text.StringsJVM;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1046xd.Closeable;

/* compiled from: FtsTableInfo.kt */
@Metadata
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes2.dex */
public final class FtsTableInfo {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final String[] FTS_OPTIONS = {"tokenize=", "compress=", "content=", "languageid=", "matchinfo=", "notindexed=", "order=", "prefix=", "uncompress="};
    @NotNull
    public final Set<String> columns;
    @NotNull
    public final String name;
    @NotNull
    public final Set<String> options;

    /* compiled from: FtsTableInfo.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Set<String> readColumns(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
            Set m17129b;
            Set<String> m17130a;
            m17129b = SetsJVM.m17129b();
            Cursor query = supportSQLiteDatabase.query("PRAGMA table_info(`" + str + "`)");
            try {
                Cursor cursor = query;
                if (cursor.getColumnCount() > 0) {
                    int columnIndex = cursor.getColumnIndex("name");
                    while (cursor.moveToNext()) {
                        String string = cursor.getString(columnIndex);
                        Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(nameIndex)");
                        m17129b.add(string);
                    }
                }
                Unit unit = Unit.f99208a;
                Closeable.m1220a(query, null);
                m17130a = SetsJVM.m17130a(m17129b);
                return m17130a;
            } finally {
            }
        }

        private final Set<String> readOptions(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
            String sql;
            Cursor query = supportSQLiteDatabase.query("SELECT * FROM sqlite_master WHERE `name` = '" + str + '\'');
            try {
                Cursor cursor = query;
                if (cursor.moveToFirst()) {
                    sql = cursor.getString(cursor.getColumnIndexOrThrow("sql"));
                } else {
                    sql = "";
                }
                Closeable.m1220a(query, null);
                Intrinsics.checkNotNullExpressionValue(sql, "sql");
                return parseOptions(sql);
            } finally {
            }
        }

        @VisibleForTesting
        @NotNull
        public final Set<String> parseOptions(@NotNull String createStatement) {
            boolean z;
            int m16568d0;
            int m16559j0;
            CharSequence m16571b1;
            Set<String> m17547e1;
            boolean z2;
            boolean m16624M;
            boolean z3;
            boolean z4;
            int i;
            boolean z5;
            Character ch;
            Set<String> m17123f;
            Intrinsics.checkNotNullParameter(createStatement, "createStatement");
            if (createStatement.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                m17123f = C37572z0.m17123f();
                return m17123f;
            }
            m16568d0 = C37690r.m16568d0(createStatement, '(', 0, false, 6, null);
            m16559j0 = C37690r.m16559j0(createStatement, ')', 0, false, 6, null);
            String substring = createStatement.substring(m16568d0 + 1, m16559j0);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            ArrayList arrayList = new ArrayList();
            ArrayDeque arrayDeque = new ArrayDeque();
            int i2 = -1;
            int i3 = 0;
            int i4 = 0;
            while (i3 < substring.length()) {
                char charAt = substring.charAt(i3);
                int i5 = i4 + 1;
                if (charAt == '\'' || charAt == '\"') {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3 || charAt == '`') {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    if (arrayDeque.isEmpty()) {
                        arrayDeque.push(Character.valueOf(charAt));
                    } else {
                        Character ch2 = (Character) arrayDeque.peek();
                        if (ch2 != null && ch2.charValue() == charAt) {
                            arrayDeque.pop();
                        }
                    }
                } else if (charAt == '[') {
                    if (arrayDeque.isEmpty()) {
                        arrayDeque.push(Character.valueOf(charAt));
                    }
                } else if (charAt == ']') {
                    if (!arrayDeque.isEmpty() && (ch = (Character) arrayDeque.peek()) != null && ch.charValue() == '[') {
                        arrayDeque.pop();
                    }
                } else if (charAt == ',' && arrayDeque.isEmpty()) {
                    String substring2 = substring.substring(i2 + 1, i4);
                    Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    int length = substring2.length() - 1;
                    int i6 = 0;
                    boolean z6 = false;
                    while (i6 <= length) {
                        if (!z6) {
                            i = i6;
                        } else {
                            i = length;
                        }
                        if (Intrinsics.m17071j(substring2.charAt(i), 32) <= 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (!z6) {
                            if (!z5) {
                                z6 = true;
                            } else {
                                i6++;
                            }
                        } else if (!z5) {
                            break;
                        } else {
                            length--;
                        }
                    }
                    arrayList.add(substring2.subSequence(i6, length + 1).toString());
                    i2 = i4;
                }
                i3++;
                i4 = i5;
            }
            String substring3 = substring.substring(i2 + 1);
            Intrinsics.checkNotNullExpressionValue(substring3, "this as java.lang.String).substring(startIndex)");
            m16571b1 = C37690r.m16571b1(substring3);
            arrayList.add(m16571b1.toString());
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                String str = (String) obj;
                String[] strArr = FtsTableInfo.FTS_OPTIONS;
                int length2 = strArr.length;
                int i7 = 0;
                while (true) {
                    if (i7 < length2) {
                        m16624M = StringsJVM.m16624M(str, strArr[i7], false, 2, null);
                        if (m16624M) {
                            z2 = true;
                            break;
                        }
                        i7++;
                    } else {
                        z2 = false;
                        break;
                    }
                }
                if (z2) {
                    arrayList2.add(obj);
                }
            }
            m17547e1 = _Collections.m17547e1(arrayList2);
            return m17547e1;
        }

        @SuppressLint({"SyntheticAccessor"})
        @NotNull
        public final FtsTableInfo read(@NotNull SupportSQLiteDatabase database, @NotNull String tableName) {
            Intrinsics.checkNotNullParameter(database, "database");
            Intrinsics.checkNotNullParameter(tableName, "tableName");
            return new FtsTableInfo(tableName, readColumns(database, tableName), readOptions(database, tableName));
        }
    }

    public FtsTableInfo(@NotNull String name, @NotNull Set<String> columns, @NotNull Set<String> options) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(columns, "columns");
        Intrinsics.checkNotNullParameter(options, "options");
        this.name = name;
        this.columns = columns;
        this.options = options;
    }

    @VisibleForTesting
    @NotNull
    public static final Set<String> parseOptions(@NotNull String str) {
        return Companion.parseOptions(str);
    }

    @SuppressLint({"SyntheticAccessor"})
    @NotNull
    public static final FtsTableInfo read(@NotNull SupportSQLiteDatabase supportSQLiteDatabase, @NotNull String str) {
        return Companion.read(supportSQLiteDatabase, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FtsTableInfo)) {
            return false;
        }
        FtsTableInfo ftsTableInfo = (FtsTableInfo) obj;
        if (!Intrinsics.m17075f(this.name, ftsTableInfo.name) || !Intrinsics.m17075f(this.columns, ftsTableInfo.columns)) {
            return false;
        }
        return Intrinsics.m17075f(this.options, ftsTableInfo.options);
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + this.columns.hashCode()) * 31) + this.options.hashCode();
    }

    @NotNull
    public String toString() {
        return "FtsTableInfo{name='" + this.name + "', columns=" + this.columns + ", options=" + this.options + "'}";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FtsTableInfo(@NotNull String name, @NotNull Set<String> columns, @NotNull String createSql) {
        this(name, columns, Companion.parseOptions(createSql));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(columns, "columns");
        Intrinsics.checkNotNullParameter(createSql, "createSql");
    }
}
