package androidx.room.util;

import android.database.Cursor;
import android.database.CursorWrapper;
import android.database.MatrixCursor;
import android.os.Build;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import kotlin.Metadata;
import kotlin.collections._Arrays;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsJVM;
import org.jetbrains.annotations.NotNull;
import p1046xd.Closeable;

/* compiled from: CursorUtil.kt */
@Metadata
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes2.dex */
public final class CursorUtil {
    @NotNull
    public static final Cursor copyAndClose(@NotNull Cursor c) {
        Intrinsics.checkNotNullParameter(c, "c");
        Cursor cursor = c;
        try {
            Cursor cursor2 = cursor;
            MatrixCursor matrixCursor = new MatrixCursor(cursor2.getColumnNames(), cursor2.getCount());
            while (cursor2.moveToNext()) {
                Object[] objArr = new Object[cursor2.getColumnCount()];
                int columnCount = c.getColumnCount();
                for (int i = 0; i < columnCount; i++) {
                    int type = cursor2.getType(i);
                    if (type != 0) {
                        if (type != 1) {
                            if (type != 2) {
                                if (type != 3) {
                                    if (type == 4) {
                                        objArr[i] = cursor2.getBlob(i);
                                    } else {
                                        throw new IllegalStateException();
                                    }
                                } else {
                                    objArr[i] = cursor2.getString(i);
                                }
                            } else {
                                objArr[i] = Double.valueOf(cursor2.getDouble(i));
                            }
                        } else {
                            objArr[i] = Long.valueOf(cursor2.getLong(i));
                        }
                    } else {
                        objArr[i] = null;
                    }
                }
                matrixCursor.addRow(objArr);
            }
            Closeable.m1220a(cursor, null);
            return matrixCursor;
        } finally {
        }
    }

    private static final int findColumnIndexBySuffix(Cursor cursor, String str) {
        if (Build.VERSION.SDK_INT > 25) {
            return -1;
        }
        if (str.length() == 0) {
            return -1;
        }
        String[] columnNames = cursor.getColumnNames();
        Intrinsics.checkNotNullExpressionValue(columnNames, "columnNames");
        return findColumnIndexBySuffix(columnNames, str);
    }

    public static final int getColumnIndex(@NotNull Cursor c, @NotNull String name) {
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(name, "name");
        int columnIndex = c.getColumnIndex(name);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = c.getColumnIndex('`' + name + '`');
        if (columnIndex2 < 0) {
            return findColumnIndexBySuffix(c, name);
        }
        return columnIndex2;
    }

    public static final int getColumnIndexOrThrow(@NotNull Cursor c, @NotNull String name) {
        String str;
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(name, "name");
        int columnIndex = getColumnIndex(c, name);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            String[] columnNames = c.getColumnNames();
            Intrinsics.checkNotNullExpressionValue(columnNames, "c.columnNames");
            str = _Arrays.m17314l0(columnNames, null, null, null, 0, null, null, 63, null);
        } catch (Exception e) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e);
            str = "unknown";
        }
        throw new IllegalArgumentException("column '" + name + "' does not exist. Available columns: " + str);
    }

    public static final <R> R useCursor(@NotNull Cursor cursor, @NotNull Function1<? super Cursor, ? extends R> block) {
        Intrinsics.checkNotNullParameter(cursor, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        Cursor cursor2 = cursor;
        try {
            R invoke = block.invoke(cursor2);
            InlineMarker.m17017b(1);
            Closeable.m1220a(cursor2, null);
            InlineMarker.m17018a(1);
            return invoke;
        } finally {
        }
    }

    @NotNull
    public static final Cursor wrapMappedColumns(@NotNull Cursor cursor, @NotNull final String[] columnNames, @NotNull final int[] mapping) {
        boolean z;
        Intrinsics.checkNotNullParameter(cursor, "cursor");
        Intrinsics.checkNotNullParameter(columnNames, "columnNames");
        Intrinsics.checkNotNullParameter(mapping, "mapping");
        if (columnNames.length == mapping.length) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new CursorWrapper(cursor) { // from class: androidx.room.util.CursorUtil$wrapMappedColumns$2
                @Override // android.database.CursorWrapper, android.database.Cursor
                public int getColumnIndex(@NotNull String columnName) {
                    boolean m16615y;
                    Intrinsics.checkNotNullParameter(columnName, "columnName");
                    String[] strArr = columnNames;
                    int[] iArr = mapping;
                    int length = strArr.length;
                    int i = 0;
                    int i2 = 0;
                    while (i < length) {
                        int i3 = i2 + 1;
                        m16615y = StringsJVM.m16615y(strArr[i], columnName, true);
                        if (m16615y) {
                            return iArr[i2];
                        }
                        i++;
                        i2 = i3;
                    }
                    return super.getColumnIndex(columnName);
                }
            };
        }
        throw new IllegalStateException("Expected columnNames.length == mapping.length".toString());
    }

    @VisibleForTesting(otherwise = 2)
    public static final int findColumnIndexBySuffix(@NotNull String[] columnNames, @NotNull String name) {
        boolean m16616x;
        boolean m16616x2;
        Intrinsics.checkNotNullParameter(columnNames, "columnNames");
        Intrinsics.checkNotNullParameter(name, "name");
        String str = '.' + name;
        String str2 = '.' + name + '`';
        int length = columnNames.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            String str3 = columnNames[i];
            int i3 = i2 + 1;
            if (str3.length() >= name.length() + 2) {
                m16616x = StringsJVM.m16616x(str3, str, false, 2, null);
                if (m16616x) {
                    return i2;
                }
                if (str3.charAt(0) == '`') {
                    m16616x2 = StringsJVM.m16616x(str3, str2, false, 2, null);
                    if (m16616x2) {
                        return i2;
                    }
                } else {
                    continue;
                }
            }
            i++;
            i2 = i3;
        }
        return -1;
    }
}
