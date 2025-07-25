package com.bykv.p135vk.openvk.preload.geckox.p167a;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.appsflyer.AppsFlyerProperties;
import com.bykv.p135vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.p135vk.openvk.preload.geckox.statistic.model.StatisticModel;
import com.bykv.p135vk.openvk.preload.geckox.utils.AppUtils;
import com.bykv.p135vk.openvk.preload.geckox.utils.CloseableUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bykv.vk.openvk.preload.geckox.a.b */
/* loaded from: classes3.dex */
class AbandonChannelSQLiteHelper extends SQLiteOpenHelper {

    /* renamed from: a */
    private static volatile AbandonChannelSQLiteHelper f13962a;

    private AbandonChannelSQLiteHelper(Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
    }

    /* renamed from: a */
    public static AbandonChannelSQLiteHelper m91403a(Context context) {
        if (f13962a == null) {
            synchronized (AbandonChannelSQLiteHelper.class) {
                if (f13962a == null) {
                    Context applicationContext = context.getApplicationContext();
                    f13962a = new AbandonChannelSQLiteHelper(applicationContext, "geckox_clean_statistic" + AppUtils.m91225c(context) + ".db");
                }
            }
        }
        return f13962a;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("create table if not exists geckox_clean_statistic (id integer primary key autoincrement,access_key text,channel text,clean_type integer,status integer,pkg_id integer,err_code integer,clean_strategy integer,clean_duration integer,err_msg text)");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m91404a(int i, int i2, String str, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("access_key", (String) null);
        contentValues.put(AppsFlyerProperties.CHANNEL, (String) null);
        contentValues.put("clean_type", (Integer) 0);
        contentValues.put("status", Integer.valueOf(i));
        contentValues.put("pkg_id", (Long) 0L);
        contentValues.put("err_code", Integer.valueOf(i2));
        contentValues.put("err_msg", str);
        contentValues.put("clean_duration", Long.valueOf(j));
        contentValues.put("clean_strategy", (Integer) 1);
        try {
            getWritableDatabase().insert("geckox_clean_statistic", null, contentValues);
        } catch (Exception e) {
            GeckoLogger.m91260w("clean-channel", "insert failed", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final List<StatisticModel.PackageStatisticModel> m91405a() {
        Cursor cursor;
        ArrayList arrayList = new ArrayList();
        Cursor cursor2 = null;
        try {
            cursor = getWritableDatabase().query("geckox_clean_statistic", null, null, null, null, null, null);
        } catch (Exception e) {
            e = e;
        }
        if (cursor == null) {
            return arrayList;
        }
        while (cursor.moveToNext()) {
            try {
                String string = cursor.getString(cursor.getColumnIndex("access_key"));
                String string2 = cursor.getString(cursor.getColumnIndex(AppsFlyerProperties.CHANNEL));
                int i = cursor.getInt(cursor.getColumnIndex("clean_type"));
                int i2 = cursor.getInt(cursor.getColumnIndex("status"));
                int i3 = cursor.getInt(cursor.getColumnIndex("err_code"));
                String string3 = cursor.getString(cursor.getColumnIndex("err_msg"));
                int i4 = cursor.getInt(cursor.getColumnIndex("clean_strategy"));
                long j = cursor.getLong(cursor.getColumnIndex("clean_duration"));
                StatisticModel.PackageStatisticModel packageStatisticModel = new StatisticModel.PackageStatisticModel();
                packageStatisticModel.accessKey = string;
                packageStatisticModel.channel = string2;
                packageStatisticModel.statsType = Integer.valueOf(i2);
                packageStatisticModel.f14089id = Long.valueOf(cursor.getInt(cursor.getColumnIndex("pkg_id")));
                packageStatisticModel.errCode = i3 == 0 ? null : String.valueOf(i3);
                packageStatisticModel.errMsg = string3;
                packageStatisticModel.cleanType = Integer.valueOf(i);
                packageStatisticModel.cleanDuration = Long.valueOf(j);
                packageStatisticModel.cleanStrategy = Integer.valueOf(i4);
                arrayList.add(packageStatisticModel);
            } catch (Exception e2) {
                e = e2;
                cursor2 = cursor;
                GeckoLogger.m91260w("clean-channel", "get all statistic failed!", e);
                cursor = cursor2;
                CloseableUtils.close(cursor);
                return arrayList;
            }
        }
        getWritableDatabase().delete("geckox_clean_statistic", null, null);
        CloseableUtils.close(cursor);
        return arrayList;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
