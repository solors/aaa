package androidx.room.util;

import android.database.Cursor;
import androidx.room.util.TableInfo;
import androidx.sqlite.p021db.SupportSQLiteDatabase;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.google.firebase.messaging.Constants;
import com.ironsource.C20517nb;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.collections.C37559r0;
import kotlin.collections.CollectionsJVM;
import kotlin.collections.MapsJVM;
import kotlin.collections.SetsJVM;
import kotlin.collections._Collections;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p1046xd.Closeable;

/* compiled from: TableInfo.kt */
@Metadata
/* loaded from: classes2.dex */
public final class TableInfoKt {
    private static final Map<String, TableInfo.Column> readColumns(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        Map m17294d;
        Map<String, TableInfo.Column> m17295c;
        boolean z;
        Map<String, TableInfo.Column> m17284j;
        Cursor query = supportSQLiteDatabase.query("PRAGMA table_info(`" + str + "`)");
        try {
            Cursor cursor = query;
            if (cursor.getColumnCount() <= 0) {
                m17284j = C37559r0.m17284j();
                Closeable.m1220a(query, null);
                return m17284j;
            }
            int columnIndex = cursor.getColumnIndex("name");
            int columnIndex2 = cursor.getColumnIndex("type");
            int columnIndex3 = cursor.getColumnIndex("notnull");
            int columnIndex4 = cursor.getColumnIndex("pk");
            int columnIndex5 = cursor.getColumnIndex("dflt_value");
            m17294d = MapsJVM.m17294d();
            while (cursor.moveToNext()) {
                String name = cursor.getString(columnIndex);
                String type = cursor.getString(columnIndex2);
                if (cursor.getInt(columnIndex3) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                int i = cursor.getInt(columnIndex4);
                String string = cursor.getString(columnIndex5);
                Intrinsics.checkNotNullExpressionValue(name, "name");
                Intrinsics.checkNotNullExpressionValue(type, "type");
                m17294d.put(name, new TableInfo.Column(name, type, z, i, string, 2));
            }
            m17295c = MapsJVM.m17295c(m17294d);
            Closeable.m1220a(query, null);
            return m17295c;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                Closeable.m1220a(query, th);
                throw th2;
            }
        }
    }

    private static final List<TableInfo.ForeignKeyWithSequence> readForeignKeyFieldMappings(Cursor cursor) {
        List m17177c;
        List m17179a;
        List<TableInfo.ForeignKeyWithSequence> m17561R0;
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex(Constants.MessagePayloadKeys.FROM);
        int columnIndex4 = cursor.getColumnIndex("to");
        m17177c = CollectionsJVM.m17177c();
        while (cursor.moveToNext()) {
            int i = cursor.getInt(columnIndex);
            int i2 = cursor.getInt(columnIndex2);
            String string = cursor.getString(columnIndex3);
            Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(fromColumnIndex)");
            String string2 = cursor.getString(columnIndex4);
            Intrinsics.checkNotNullExpressionValue(string2, "cursor.getString(toColumnIndex)");
            m17177c.add(new TableInfo.ForeignKeyWithSequence(i, i2, string, string2));
        }
        m17179a = CollectionsJVM.m17179a(m17177c);
        m17561R0 = _Collections.m17561R0(m17179a);
        return m17561R0;
    }

    private static final Set<TableInfo.ForeignKey> readForeignKeys(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        Set m17129b;
        Set<TableInfo.ForeignKey> m17130a;
        boolean z;
        Cursor query = supportSQLiteDatabase.query("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            Cursor cursor = query;
            int columnIndex = cursor.getColumnIndex("id");
            int columnIndex2 = cursor.getColumnIndex("seq");
            int columnIndex3 = cursor.getColumnIndex(C20517nb.f52170Q);
            int columnIndex4 = cursor.getColumnIndex("on_delete");
            int columnIndex5 = cursor.getColumnIndex("on_update");
            List<TableInfo.ForeignKeyWithSequence> readForeignKeyFieldMappings = readForeignKeyFieldMappings(cursor);
            cursor.moveToPosition(-1);
            m17129b = SetsJVM.m17129b();
            while (cursor.moveToNext()) {
                if (cursor.getInt(columnIndex2) == 0) {
                    int i = cursor.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList<TableInfo.ForeignKeyWithSequence> arrayList3 = new ArrayList();
                    for (Object obj : readForeignKeyFieldMappings) {
                        if (((TableInfo.ForeignKeyWithSequence) obj).getId() == i) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            arrayList3.add(obj);
                        }
                    }
                    for (TableInfo.ForeignKeyWithSequence foreignKeyWithSequence : arrayList3) {
                        arrayList.add(foreignKeyWithSequence.getFrom());
                        arrayList2.add(foreignKeyWithSequence.getTo());
                    }
                    String string = cursor.getString(columnIndex3);
                    Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(tableColumnIndex)");
                    String string2 = cursor.getString(columnIndex4);
                    Intrinsics.checkNotNullExpressionValue(string2, "cursor.getString(onDeleteColumnIndex)");
                    String string3 = cursor.getString(columnIndex5);
                    Intrinsics.checkNotNullExpressionValue(string3, "cursor.getString(onUpdateColumnIndex)");
                    m17129b.add(new TableInfo.ForeignKey(string, string2, string3, arrayList, arrayList2));
                }
            }
            m17130a = SetsJVM.m17130a(m17129b);
            Closeable.m1220a(query, null);
            return m17130a;
        } finally {
        }
    }

    private static final TableInfo.Index readIndex(SupportSQLiteDatabase supportSQLiteDatabase, String str, boolean z) {
        List m17553Z0;
        List m17553Z02;
        String str2;
        Cursor query = supportSQLiteDatabase.query("PRAGMA index_xinfo(`" + str + "`)");
        try {
            Cursor cursor = query;
            int columnIndex = cursor.getColumnIndex("seqno");
            int columnIndex2 = cursor.getColumnIndex("cid");
            int columnIndex3 = cursor.getColumnIndex("name");
            int columnIndex4 = cursor.getColumnIndex(CampaignEx.JSON_KEY_DESC);
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                while (cursor.moveToNext()) {
                    if (cursor.getInt(columnIndex2) >= 0) {
                        int i = cursor.getInt(columnIndex);
                        String columnName = cursor.getString(columnIndex3);
                        if (cursor.getInt(columnIndex4) > 0) {
                            str2 = "DESC";
                        } else {
                            str2 = "ASC";
                        }
                        Integer valueOf = Integer.valueOf(i);
                        Intrinsics.checkNotNullExpressionValue(columnName, "columnName");
                        treeMap.put(valueOf, columnName);
                        treeMap2.put(Integer.valueOf(i), str2);
                    }
                }
                Collection values = treeMap.values();
                Intrinsics.checkNotNullExpressionValue(values, "columnsMap.values");
                m17553Z0 = _Collections.m17553Z0(values);
                Collection values2 = treeMap2.values();
                Intrinsics.checkNotNullExpressionValue(values2, "ordersMap.values");
                m17553Z02 = _Collections.m17553Z0(values2);
                TableInfo.Index index = new TableInfo.Index(str, z, m17553Z0, m17553Z02);
                Closeable.m1220a(query, null);
                return index;
            }
            Closeable.m1220a(query, null);
            return null;
        } finally {
        }
    }

    private static final Set<TableInfo.Index> readIndices(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        Set m17129b;
        Set<TableInfo.Index> m17130a;
        Cursor query = supportSQLiteDatabase.query("PRAGMA index_list(`" + str + "`)");
        try {
            Cursor cursor = query;
            int columnIndex = cursor.getColumnIndex("name");
            int columnIndex2 = cursor.getColumnIndex("origin");
            int columnIndex3 = cursor.getColumnIndex("unique");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                m17129b = SetsJVM.m17129b();
                while (cursor.moveToNext()) {
                    if (Intrinsics.m17075f(ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, cursor.getString(columnIndex2))) {
                        String name = cursor.getString(columnIndex);
                        boolean z = true;
                        if (cursor.getInt(columnIndex3) != 1) {
                            z = false;
                        }
                        Intrinsics.checkNotNullExpressionValue(name, "name");
                        TableInfo.Index readIndex = readIndex(supportSQLiteDatabase, name, z);
                        if (readIndex == null) {
                            Closeable.m1220a(query, null);
                            return null;
                        }
                        m17129b.add(readIndex);
                    }
                }
                m17130a = SetsJVM.m17130a(m17129b);
                Closeable.m1220a(query, null);
                return m17130a;
            }
            Closeable.m1220a(query, null);
            return null;
        } finally {
        }
    }

    @NotNull
    public static final TableInfo readTableInfo(@NotNull SupportSQLiteDatabase database, @NotNull String tableName) {
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        return new TableInfo(tableName, readColumns(database, tableName), readForeignKeys(database, tableName), readIndices(database, tableName));
    }
}
