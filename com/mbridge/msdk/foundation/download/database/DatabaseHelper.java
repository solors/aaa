package com.mbridge.msdk.foundation.download.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.GlobalComponent;
import com.mbridge.msdk.foundation.download.database.IDatabaseHelper;
import com.mbridge.msdk.foundation.download.utils.Objects;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public class DatabaseHelper implements IDatabaseHelper {
    private volatile SQLiteDatabase database;
    private final IDatabaseOpenHelper databaseOpenHelper;
    private final Handler handler;
    private final String tableName = GlobalComponent.getInstance().getDatabaseTableName();

    public DatabaseHelper(Context context, Handler handler, IDatabaseOpenHelper iDatabaseOpenHelper) {
        this.handler = handler;
        this.databaseOpenHelper = iDatabaseOpenHelper;
    }

    @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
    public void clear() {
        this.handler.post(new Runnable() { // from class: com.mbridge.msdk.foundation.download.database.DatabaseHelper.9
            /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:25:0x008d
                	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1234)
                	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1018)
                	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
                */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x008e -> B:27:0x0095). Please submit an issue!!! */
            @Override // java.lang.Runnable
            public void run() {
                /*
                    r4 = this;
                    java.lang.String r0 = "DatabaseHelper"
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r1 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this
                    android.database.sqlite.SQLiteDatabase r1 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$000(r1)
                    boolean r1 = com.mbridge.msdk.foundation.download.utils.Objects.isNull(r1)
                    if (r1 == 0) goto L1b
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r1 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this
                    com.mbridge.msdk.foundation.download.database.IDatabaseOpenHelper r2 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$100(r1)
                    android.database.sqlite.SQLiteDatabase r2 = r2.getWritableDatabase()
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$002(r1, r2)
                L1b:
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r1 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this
                    android.database.sqlite.SQLiteDatabase r1 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$000(r1)
                    boolean r1 = com.mbridge.msdk.foundation.download.utils.Objects.isNull(r1)
                    if (r1 != 0) goto Lb5
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r1 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this
                    android.database.sqlite.SQLiteDatabase r1 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$000(r1)
                    boolean r1 = r1.isOpen()
                    if (r1 != 0) goto L35
                    goto Lb5
                L35:
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r1 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L6f
                    android.database.sqlite.SQLiteDatabase r1 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$000(r1)     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L6f
                    r1.beginTransaction()     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L6f
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r1 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L6f
                    android.database.sqlite.SQLiteDatabase r1 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$000(r1)     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L6f
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r2 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L6f
                    java.lang.String r2 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$200(r2)     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L6f
                    r3 = 0
                    r1.delete(r2, r3, r3)     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L6f
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r1 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L6f
                    android.database.sqlite.SQLiteDatabase r1 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$000(r1)     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L6f
                    r1.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L6f
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r1 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this     // Catch: java.lang.Throwable -> L8d
                    android.database.sqlite.SQLiteDatabase r1 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$000(r1)     // Catch: java.lang.Throwable -> L8d
                    boolean r1 = r1.inTransaction()     // Catch: java.lang.Throwable -> L8d
                    if (r1 == 0) goto L95
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r1 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this     // Catch: java.lang.Throwable -> L8d
                    android.database.sqlite.SQLiteDatabase r1 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$000(r1)     // Catch: java.lang.Throwable -> L8d
                    r1.endTransaction()     // Catch: java.lang.Throwable -> L8d
                    goto L95
                L6d:
                    r1 = move-exception
                    goto L96
                L6f:
                    r1 = move-exception
                    boolean r2 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch: java.lang.Throwable -> L6d
                    if (r2 == 0) goto L77
                    r1.printStackTrace()     // Catch: java.lang.Throwable -> L6d
                L77:
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r1 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this     // Catch: java.lang.Throwable -> L8d
                    android.database.sqlite.SQLiteDatabase r1 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$000(r1)     // Catch: java.lang.Throwable -> L8d
                    boolean r1 = r1.inTransaction()     // Catch: java.lang.Throwable -> L8d
                    if (r1 == 0) goto L95
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r1 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this     // Catch: java.lang.Throwable -> L8d
                    android.database.sqlite.SQLiteDatabase r1 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$000(r1)     // Catch: java.lang.Throwable -> L8d
                    r1.endTransaction()     // Catch: java.lang.Throwable -> L8d
                    goto L95
                L8d:
                    r1 = move-exception
                    java.lang.String r1 = r1.getMessage()
                    com.mbridge.msdk.foundation.tools.SameLogTool.m51824b(r0, r1)
                L95:
                    return
                L96:
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r2 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this     // Catch: java.lang.Throwable -> Lac
                    android.database.sqlite.SQLiteDatabase r2 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$000(r2)     // Catch: java.lang.Throwable -> Lac
                    boolean r2 = r2.inTransaction()     // Catch: java.lang.Throwable -> Lac
                    if (r2 == 0) goto Lb4
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r2 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this     // Catch: java.lang.Throwable -> Lac
                    android.database.sqlite.SQLiteDatabase r2 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$000(r2)     // Catch: java.lang.Throwable -> Lac
                    r2.endTransaction()     // Catch: java.lang.Throwable -> Lac
                    goto Lb4
                Lac:
                    r2 = move-exception
                    java.lang.String r2 = r2.getMessage()
                    com.mbridge.msdk.foundation.tools.SameLogTool.m51824b(r0, r2)
                Lb4:
                    throw r1
                Lb5:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.download.database.DatabaseHelper.RunnableC219469.run():void");
            }
        });
    }

    @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
    public void find(final String str, final String str2, final IDatabaseHelper.IDatabaseListener iDatabaseListener) {
        this.handler.post(new Runnable() { // from class: com.mbridge.msdk.foundation.download.database.DatabaseHelper.1
            /* JADX WARN: Removed duplicated region for block: B:38:0x00b0  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x00b7  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void run() {
                /*
                    r6 = this;
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r0 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this
                    android.database.sqlite.SQLiteDatabase r0 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$000(r0)
                    boolean r0 = com.mbridge.msdk.foundation.download.utils.Objects.isNull(r0)
                    if (r0 == 0) goto L19
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r0 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this
                    com.mbridge.msdk.foundation.download.database.IDatabaseOpenHelper r1 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$100(r0)
                    android.database.sqlite.SQLiteDatabase r1 = r1.getWritableDatabase()
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$002(r0, r1)
                L19:
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r0 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this
                    android.database.sqlite.SQLiteDatabase r0 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$000(r0)
                    boolean r0 = com.mbridge.msdk.foundation.download.utils.Objects.isNull(r0)
                    r1 = 0
                    if (r0 != 0) goto Lbb
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r0 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this
                    android.database.sqlite.SQLiteDatabase r0 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$000(r0)
                    boolean r0 = r0.isOpen()
                    if (r0 != 0) goto L34
                    goto Lbb
                L34:
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L97
                    r0.<init>()     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L97
                    java.lang.String r2 = "SELECT * FROM "
                    r0.append(r2)     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L97
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r2 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L97
                    java.lang.String r2 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$200(r2)     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L97
                    r0.append(r2)     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L97
                    java.lang.String r2 = " WHERE "
                    r0.append(r2)     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L97
                    java.lang.String r2 = "download_id"
                    r0.append(r2)     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L97
                    java.lang.String r2 = " = ? AND "
                    r0.append(r2)     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L97
                    java.lang.String r2 = "director_path"
                    r0.append(r2)     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L97
                    java.lang.String r2 = " = ?"
                    r0.append(r2)     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L97
                    java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L97
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r2 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L97
                    android.database.sqlite.SQLiteDatabase r2 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$000(r2)     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L97
                    r3 = 2
                    java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L97
                    java.lang.String r4 = r3     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L97
                    r5 = 0
                    r3[r5] = r4     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L97
                    java.lang.String r4 = r4     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L97
                    r5 = 1
                    r3[r5] = r4     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L97
                    android.database.Cursor r0 = r2.rawQuery(r0, r3)     // Catch: java.lang.Throwable -> L94 java.lang.Exception -> L97
                    if (r0 == 0) goto L8a
                    boolean r2 = r0.moveToFirst()     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> Lad
                    if (r2 == 0) goto L8a
                    com.mbridge.msdk.foundation.download.database.DownloadModel r1 = com.mbridge.msdk.foundation.download.database.DownloadModel.create(r0)     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> Lad
                    goto L8a
                L88:
                    r2 = move-exception
                    goto L99
                L8a:
                    if (r0 == 0) goto L8f
                    r0.close()
                L8f:
                    com.mbridge.msdk.foundation.download.database.IDatabaseHelper$IDatabaseListener r0 = r2
                    if (r0 == 0) goto Lac
                    goto La9
                L94:
                    r2 = move-exception
                    r0 = r1
                    goto Lae
                L97:
                    r2 = move-exception
                    r0 = r1
                L99:
                    boolean r3 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch: java.lang.Throwable -> Lad
                    if (r3 == 0) goto La0
                    r2.printStackTrace()     // Catch: java.lang.Throwable -> Lad
                La0:
                    if (r0 == 0) goto La5
                    r0.close()
                La5:
                    com.mbridge.msdk.foundation.download.database.IDatabaseHelper$IDatabaseListener r0 = r2
                    if (r0 == 0) goto Lac
                La9:
                    r0.onDatabase(r1)
                Lac:
                    return
                Lad:
                    r2 = move-exception
                Lae:
                    if (r0 == 0) goto Lb3
                    r0.close()
                Lb3:
                    com.mbridge.msdk.foundation.download.database.IDatabaseHelper$IDatabaseListener r0 = r2
                    if (r0 == 0) goto Lba
                    r0.onDatabase(r1)
                Lba:
                    throw r2
                Lbb:
                    com.mbridge.msdk.foundation.download.database.IDatabaseHelper$IDatabaseListener r0 = r2
                    boolean r0 = com.mbridge.msdk.foundation.download.utils.Objects.isNotNull(r0)
                    if (r0 == 0) goto Lc8
                    com.mbridge.msdk.foundation.download.database.IDatabaseHelper$IDatabaseListener r0 = r2
                    r0.onDatabase(r1)
                Lc8:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.download.database.DatabaseHelper.RunnableC219381.run():void");
            }
        });
    }

    @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
    public List<DownloadModel> findAll() {
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                if (Objects.isNull(this.database)) {
                    this.database = this.databaseOpenHelper.getWritableDatabase();
                }
                if (!Objects.isNull(this.database) && this.database.isOpen()) {
                    cursor = rawQuery("SELECT * FROM " + this.tableName, null);
                    if (cursor != null) {
                        while (cursor.moveToNext()) {
                            arrayList.add(DownloadModel.create(cursor));
                        }
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                }
                return arrayList;
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
                return arrayList;
            }
        } catch (Throwable unused) {
            if (cursor != null) {
                cursor.close();
            }
            return arrayList;
        }
    }

    @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
    public void findByDownloadUrl(final String str, final IDatabaseHelper.IDatabaseListener iDatabaseListener) {
        this.handler.post(new Runnable() { // from class: com.mbridge.msdk.foundation.download.database.DatabaseHelper.2
            /* JADX WARN: Removed duplicated region for block: B:38:0x00a1  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x00a8  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void run() {
                /*
                    r6 = this;
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r0 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this
                    android.database.sqlite.SQLiteDatabase r0 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$000(r0)
                    boolean r0 = com.mbridge.msdk.foundation.download.utils.Objects.isNull(r0)
                    if (r0 == 0) goto L19
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r0 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this
                    com.mbridge.msdk.foundation.download.database.IDatabaseOpenHelper r1 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$100(r0)
                    android.database.sqlite.SQLiteDatabase r1 = r1.getWritableDatabase()
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$002(r0, r1)
                L19:
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r0 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this
                    android.database.sqlite.SQLiteDatabase r0 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$000(r0)
                    boolean r0 = com.mbridge.msdk.foundation.download.utils.Objects.isNull(r0)
                    r1 = 0
                    if (r0 != 0) goto Lac
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r0 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this
                    android.database.sqlite.SQLiteDatabase r0 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$000(r0)
                    boolean r0 = r0.isOpen()
                    if (r0 != 0) goto L34
                    goto Lac
                L34:
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L88
                    r0.<init>()     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L88
                    java.lang.String r2 = "SELECT * FROM "
                    r0.append(r2)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L88
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r2 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L88
                    java.lang.String r2 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$200(r2)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L88
                    r0.append(r2)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L88
                    java.lang.String r2 = " WHERE "
                    r0.append(r2)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L88
                    java.lang.String r2 = "download_url"
                    r0.append(r2)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L88
                    java.lang.String r2 = " = ?"
                    r0.append(r2)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L88
                    java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L88
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r2 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L88
                    android.database.sqlite.SQLiteDatabase r2 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$000(r2)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L88
                    r3 = 1
                    java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L88
                    java.lang.String r4 = r3     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L88
                    r5 = 0
                    r3[r5] = r4     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L88
                    android.database.Cursor r0 = r2.rawQuery(r0, r3)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L88
                    if (r0 == 0) goto L7b
                    boolean r2 = r0.moveToFirst()     // Catch: java.lang.Exception -> L79 java.lang.Throwable -> L9e
                    if (r2 == 0) goto L7b
                    com.mbridge.msdk.foundation.download.database.DownloadModel r1 = com.mbridge.msdk.foundation.download.database.DownloadModel.create(r0)     // Catch: java.lang.Exception -> L79 java.lang.Throwable -> L9e
                    goto L7b
                L79:
                    r2 = move-exception
                    goto L8a
                L7b:
                    if (r0 == 0) goto L80
                    r0.close()
                L80:
                    com.mbridge.msdk.foundation.download.database.IDatabaseHelper$IDatabaseListener r0 = r2
                    if (r0 == 0) goto L9d
                    goto L9a
                L85:
                    r2 = move-exception
                    r0 = r1
                    goto L9f
                L88:
                    r2 = move-exception
                    r0 = r1
                L8a:
                    boolean r3 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch: java.lang.Throwable -> L9e
                    if (r3 == 0) goto L91
                    r2.printStackTrace()     // Catch: java.lang.Throwable -> L9e
                L91:
                    if (r0 == 0) goto L96
                    r0.close()
                L96:
                    com.mbridge.msdk.foundation.download.database.IDatabaseHelper$IDatabaseListener r0 = r2
                    if (r0 == 0) goto L9d
                L9a:
                    r0.onDatabase(r1)
                L9d:
                    return
                L9e:
                    r2 = move-exception
                L9f:
                    if (r0 == 0) goto La4
                    r0.close()
                La4:
                    com.mbridge.msdk.foundation.download.database.IDatabaseHelper$IDatabaseListener r0 = r2
                    if (r0 == 0) goto Lab
                    r0.onDatabase(r1)
                Lab:
                    throw r2
                Lac:
                    com.mbridge.msdk.foundation.download.database.IDatabaseHelper$IDatabaseListener r0 = r2
                    boolean r0 = com.mbridge.msdk.foundation.download.utils.Objects.isNotNull(r0)
                    if (r0 == 0) goto Lb9
                    com.mbridge.msdk.foundation.download.database.IDatabaseHelper$IDatabaseListener r0 = r2
                    r0.onDatabase(r1)
                Lb9:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.download.database.DatabaseHelper.RunnableC219392.run():void");
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0073, code lost:
        if (r1 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0081, code lost:
        if (r1 != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0083, code lost:
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0086, code lost:
        return r0;
     */
    @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List<com.mbridge.msdk.foundation.download.database.DownloadModel> getUnwantedModels(long r6) {
        /*
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r5.database     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            boolean r2 = com.mbridge.msdk.foundation.download.utils.Objects.isNull(r2)     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            if (r2 == 0) goto L16
            com.mbridge.msdk.foundation.download.database.IDatabaseOpenHelper r2 = r5.databaseOpenHelper     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            android.database.sqlite.SQLiteDatabase r2 = r2.getWritableDatabase()     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            r5.database = r2     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
        L16:
            android.database.sqlite.SQLiteDatabase r2 = r5.database     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            boolean r2 = com.mbridge.msdk.foundation.download.utils.Objects.isNull(r2)     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            if (r2 != 0) goto L76
            android.database.sqlite.SQLiteDatabase r2 = r5.database     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            boolean r2 = r2.isOpen()     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            if (r2 != 0) goto L27
            goto L76
        L27:
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            long r2 = r2 - r6
            android.database.sqlite.SQLiteDatabase r6 = r5.database     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            r7.<init>()     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            java.lang.String r4 = "SELECT * FROM "
            r7.append(r4)     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            java.lang.String r4 = r5.tableName     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            r7.append(r4)     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            java.lang.String r4 = " WHERE "
            r7.append(r4)     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            java.lang.String r4 = "last_modified_time"
            r7.append(r4)     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            java.lang.String r4 = " <= ?"
            r7.append(r4)     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            r4 = 1
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            r3 = 0
            r4[r3] = r2     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            android.database.Cursor r1 = r6.rawQuery(r7, r4)     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            if (r1 == 0) goto L73
            boolean r6 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            if (r6 == 0) goto L73
        L66:
            com.mbridge.msdk.foundation.download.database.DownloadModel r6 = com.mbridge.msdk.foundation.download.database.DownloadModel.create(r1)     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            r0.add(r6)     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            boolean r6 = r1.moveToNext()     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            if (r6 != 0) goto L66
        L73:
            if (r1 == 0) goto L86
            goto L83
        L76:
            return r0
        L77:
            r6 = move-exception
            goto L87
        L79:
            r6 = move-exception
            boolean r7 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch: java.lang.Throwable -> L77
            if (r7 == 0) goto L81
            r6.printStackTrace()     // Catch: java.lang.Throwable -> L77
        L81:
            if (r1 == 0) goto L86
        L83:
            r1.close()
        L86:
            return r0
        L87:
            if (r1 == 0) goto L8c
            r1.close()
        L8c:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.download.database.DatabaseHelper.getUnwantedModels(long):java.util.List");
    }

    @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
    public void insert(final DownloadModel downloadModel) {
        this.handler.postAtFrontOfQueue(new Runnable() { // from class: com.mbridge.msdk.foundation.download.database.DatabaseHelper.3
            /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:25:0x0093
                	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1234)
                	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1018)
                	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
                */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0094 -> B:27:0x009b). Please submit an issue!!! */
            @Override // java.lang.Runnable
            public void run() {
                /*
                    r5 = this;
                    java.lang.String r0 = "DatabaseHelper"
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r1 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this
                    android.database.sqlite.SQLiteDatabase r1 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$000(r1)
                    boolean r1 = com.mbridge.msdk.foundation.download.utils.Objects.isNull(r1)
                    if (r1 == 0) goto L1b
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r1 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this
                    com.mbridge.msdk.foundation.download.database.IDatabaseOpenHelper r2 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$100(r1)
                    android.database.sqlite.SQLiteDatabase r2 = r2.getWritableDatabase()
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$002(r1, r2)
                L1b:
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r1 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this
                    android.database.sqlite.SQLiteDatabase r1 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$000(r1)
                    boolean r1 = com.mbridge.msdk.foundation.download.utils.Objects.isNull(r1)
                    if (r1 != 0) goto Lbb
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r1 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this
                    android.database.sqlite.SQLiteDatabase r1 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$000(r1)
                    boolean r1 = r1.isOpen()
                    if (r1 != 0) goto L35
                    goto Lbb
                L35:
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r1 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L75
                    android.database.sqlite.SQLiteDatabase r1 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$000(r1)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L75
                    r1.beginTransaction()     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L75
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r1 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L75
                    android.database.sqlite.SQLiteDatabase r1 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$000(r1)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L75
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r2 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L75
                    java.lang.String r2 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$200(r2)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L75
                    com.mbridge.msdk.foundation.download.database.DownloadModel r3 = r2     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L75
                    android.content.ContentValues r3 = com.mbridge.msdk.foundation.download.database.DownloadModel.create(r3)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L75
                    r4 = 0
                    r1.insert(r2, r4, r3)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L75
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r1 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L75
                    android.database.sqlite.SQLiteDatabase r1 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$000(r1)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L75
                    r1.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L75
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r1 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this     // Catch: java.lang.Throwable -> L93
                    android.database.sqlite.SQLiteDatabase r1 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$000(r1)     // Catch: java.lang.Throwable -> L93
                    boolean r1 = r1.inTransaction()     // Catch: java.lang.Throwable -> L93
                    if (r1 == 0) goto L9b
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r1 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this     // Catch: java.lang.Throwable -> L93
                    android.database.sqlite.SQLiteDatabase r1 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$000(r1)     // Catch: java.lang.Throwable -> L93
                    r1.endTransaction()     // Catch: java.lang.Throwable -> L93
                    goto L9b
                L73:
                    r1 = move-exception
                    goto L9c
                L75:
                    r1 = move-exception
                    boolean r2 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch: java.lang.Throwable -> L73
                    if (r2 == 0) goto L7d
                    r1.printStackTrace()     // Catch: java.lang.Throwable -> L73
                L7d:
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r1 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this     // Catch: java.lang.Throwable -> L93
                    android.database.sqlite.SQLiteDatabase r1 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$000(r1)     // Catch: java.lang.Throwable -> L93
                    boolean r1 = r1.inTransaction()     // Catch: java.lang.Throwable -> L93
                    if (r1 == 0) goto L9b
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r1 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this     // Catch: java.lang.Throwable -> L93
                    android.database.sqlite.SQLiteDatabase r1 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$000(r1)     // Catch: java.lang.Throwable -> L93
                    r1.endTransaction()     // Catch: java.lang.Throwable -> L93
                    goto L9b
                L93:
                    r1 = move-exception
                    java.lang.String r1 = r1.getMessage()
                    com.mbridge.msdk.foundation.tools.SameLogTool.m51824b(r0, r1)
                L9b:
                    return
                L9c:
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r2 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this     // Catch: java.lang.Throwable -> Lb2
                    android.database.sqlite.SQLiteDatabase r2 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$000(r2)     // Catch: java.lang.Throwable -> Lb2
                    boolean r2 = r2.inTransaction()     // Catch: java.lang.Throwable -> Lb2
                    if (r2 == 0) goto Lba
                    com.mbridge.msdk.foundation.download.database.DatabaseHelper r2 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.this     // Catch: java.lang.Throwable -> Lb2
                    android.database.sqlite.SQLiteDatabase r2 = com.mbridge.msdk.foundation.download.database.DatabaseHelper.access$000(r2)     // Catch: java.lang.Throwable -> Lb2
                    r2.endTransaction()     // Catch: java.lang.Throwable -> Lb2
                    goto Lba
                Lb2:
                    r2 = move-exception
                    java.lang.String r2 = r2.getMessage()
                    com.mbridge.msdk.foundation.tools.SameLogTool.m51824b(r0, r2)
                Lba:
                    throw r1
                Lbb:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.download.database.DatabaseHelper.RunnableC219403.run():void");
            }
        });
    }

    @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
    public Cursor rawQuery(String str, String[] strArr) {
        try {
            try {
                if (Objects.isNull(this.database)) {
                    this.database = this.databaseOpenHelper.getWritableDatabase();
                }
                if (!Objects.isNull(this.database) && this.database.isOpen()) {
                    this.database.beginTransaction();
                    Cursor rawQuery = this.database.rawQuery(str, strArr);
                    this.database.setTransactionSuccessful();
                    try {
                        if (this.database.inTransaction()) {
                            this.database.endTransaction();
                        }
                    } catch (Throwable th) {
                        if (MBridgeConstans.DEBUG) {
                            th.printStackTrace();
                        }
                    }
                    return rawQuery;
                }
                try {
                    if (this.database.inTransaction()) {
                        this.database.endTransaction();
                    }
                } catch (Throwable th2) {
                    if (MBridgeConstans.DEBUG) {
                        th2.printStackTrace();
                    }
                }
                return null;
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
                try {
                    if (this.database.inTransaction()) {
                        this.database.endTransaction();
                    }
                } catch (Throwable th3) {
                    if (MBridgeConstans.DEBUG) {
                        th3.printStackTrace();
                    }
                }
                return null;
            }
        } catch (Throwable th4) {
            try {
                if (this.database.inTransaction()) {
                    this.database.endTransaction();
                }
            } catch (Throwable th5) {
                if (MBridgeConstans.DEBUG) {
                    th5.printStackTrace();
                }
            }
            throw th4;
        }
    }

    @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
    public void remove(final String str, final String str2) {
        this.handler.post(new Runnable() { // from class: com.mbridge.msdk.foundation.download.database.DatabaseHelper.6
            @Override // java.lang.Runnable
            public void run() {
                if (Objects.isNull(DatabaseHelper.this.database)) {
                    DatabaseHelper databaseHelper = DatabaseHelper.this;
                    databaseHelper.database = databaseHelper.databaseOpenHelper.getWritableDatabase();
                }
                if (!Objects.isNull(DatabaseHelper.this.database) && DatabaseHelper.this.database.isOpen()) {
                    try {
                        SQLiteDatabase sQLiteDatabase = DatabaseHelper.this.database;
                        sQLiteDatabase.execSQL("DELETE FROM " + DatabaseHelper.this.tableName + " WHERE " + DownloadModel.DOWNLOAD_ID + " = ? AND " + DownloadModel.DIRECTORY_PATH + " = ?", new Object[]{str, str2});
                    } catch (Exception e) {
                        if (MBridgeConstans.DEBUG) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });
    }

    @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
    public void update(final DownloadModel downloadModel, final String str) {
        this.handler.post(new Runnable() { // from class: com.mbridge.msdk.foundation.download.database.DatabaseHelper.4
            @Override // java.lang.Runnable
            public void run() {
                if (Objects.isNull(DatabaseHelper.this.database)) {
                    DatabaseHelper databaseHelper = DatabaseHelper.this;
                    databaseHelper.database = databaseHelper.databaseOpenHelper.getWritableDatabase();
                }
                if (!Objects.isNull(DatabaseHelper.this.database) && DatabaseHelper.this.database.isOpen()) {
                    try {
                        DatabaseHelper.this.database.update(DatabaseHelper.this.tableName, DownloadModel.create(downloadModel), "download_id = ? AND director_path = ?", new String[]{downloadModel.getDownloadId(), str});
                    } catch (Exception e) {
                        if (MBridgeConstans.DEBUG) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });
    }

    @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
    public void updateProgress(final String str, final String str2, final DownloadModel downloadModel) {
        this.handler.post(new Runnable() { // from class: com.mbridge.msdk.foundation.download.database.DatabaseHelper.5
            @Override // java.lang.Runnable
            public void run() {
                if (Objects.isNull(DatabaseHelper.this.database)) {
                    DatabaseHelper databaseHelper = DatabaseHelper.this;
                    databaseHelper.database = databaseHelper.databaseOpenHelper.getWritableDatabase();
                }
                if (!Objects.isNull(DatabaseHelper.this.database) && DatabaseHelper.this.database.isOpen()) {
                    try {
                        DatabaseHelper.this.database.update(DatabaseHelper.this.tableName, DownloadModel.create(downloadModel), "download_id = ? AND director_path = ?", new String[]{str, str2});
                    } catch (Exception e) {
                        if (MBridgeConstans.DEBUG) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });
    }

    @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
    public void updateUnzipResource(final String str, String str2, long j) {
        this.handler.post(new Runnable() { // from class: com.mbridge.msdk.foundation.download.database.DatabaseHelper.8
            @Override // java.lang.Runnable
            public void run() {
                if (Objects.isNull(DatabaseHelper.this.database)) {
                    DatabaseHelper databaseHelper = DatabaseHelper.this;
                    databaseHelper.database = databaseHelper.databaseOpenHelper.getWritableDatabase();
                }
                if (!Objects.isNull(DatabaseHelper.this.database) && DatabaseHelper.this.database.isOpen()) {
                    try {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put(DownloadModel.DOWNLOAD_ID, str);
                        DatabaseHelper.this.database.update(DatabaseHelper.this.tableName, contentValues, "download_id = ?", new String[]{str});
                    } catch (Exception e) {
                        if (MBridgeConstans.DEBUG) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });
    }

    @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
    public void remove(final String str) {
        this.handler.post(new Runnable() { // from class: com.mbridge.msdk.foundation.download.database.DatabaseHelper.7
            @Override // java.lang.Runnable
            public void run() {
                if (Objects.isNull(DatabaseHelper.this.database)) {
                    DatabaseHelper databaseHelper = DatabaseHelper.this;
                    databaseHelper.database = databaseHelper.databaseOpenHelper.getWritableDatabase();
                }
                if (!Objects.isNull(DatabaseHelper.this.database) && DatabaseHelper.this.database.isOpen()) {
                    try {
                        SQLiteDatabase sQLiteDatabase = DatabaseHelper.this.database;
                        sQLiteDatabase.execSQL("DELETE FROM " + DatabaseHelper.this.tableName + " WHERE " + DownloadModel.DOWNLOAD_ID + " = ?", new Object[]{str});
                    } catch (Exception e) {
                        if (MBridgeConstans.DEBUG) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });
    }
}
