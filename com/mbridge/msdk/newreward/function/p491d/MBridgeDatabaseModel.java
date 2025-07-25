package com.mbridge.msdk.newreward.function.p491d;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.mbridge.msdk.foundation.controller.MBSDKContext;
import com.mbridge.msdk.newreward.function.common.DatabaseUtils;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;

/* renamed from: com.mbridge.msdk.newreward.function.d.c */
/* loaded from: classes6.dex */
public class MBridgeDatabaseModel {

    /* renamed from: a */
    private static volatile MBridgeDatabaseModel f58638a;

    /* renamed from: b */
    private final C22391a f58639b = new C22391a();

    /* renamed from: c */
    private CampaignTable f58640c;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MBridgeDatabaseModel.java */
    /* renamed from: com.mbridge.msdk.newreward.function.d.c$a */
    /* loaded from: classes6.dex */
    public static final class C22391a extends SQLiteOpenHelper {
        public C22391a() {
            super(MBSDKContext.m52746m().m52792c(), MBridgeCommon.Database.DATABASE_NAME, (SQLiteDatabase.CursorFactory) null, 2);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            if (DatabaseUtils.isDatabaseAvailable(sQLiteDatabase)) {
                sQLiteDatabase.execSQL("create table if not exists campaign(_id integer primary key autoincrement,ad_type integer,app_id text,unit_id text,placement_id text,request_id text,local_id text,bid_token text,header_bidding integer,load_start_time integer,state integer,session_id text,system_id text,backup_id text,parent_session_id text,template integer,invalid_time integer,invalid_time_2 integer,invalid_time_backup integer,ecppv integer,show_count integer,token_rule integer,r_index text,s_show_index text,data text)");
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            if (DatabaseUtils.isDatabaseAvailable(sQLiteDatabase)) {
                sQLiteDatabase.execSQL("drop table if exists campaign");
                sQLiteDatabase.execSQL("create table if not exists campaign(_id integer primary key autoincrement,ad_type integer,app_id text,unit_id text,placement_id text,request_id text,local_id text,bid_token text,header_bidding integer,load_start_time integer,state integer,session_id text,system_id text,backup_id text,parent_session_id text,template integer,invalid_time integer,invalid_time_2 integer,invalid_time_backup integer,ecppv integer,show_count integer,token_rule integer,r_index text,s_show_index text,data text)");
            }
        }
    }

    private MBridgeDatabaseModel() {
    }

    /* renamed from: a */
    public static MBridgeDatabaseModel m50350a() {
        if (f58638a == null) {
            synchronized (MBridgeDatabaseModel.class) {
                if (f58638a == null) {
                    f58638a = new MBridgeDatabaseModel();
                }
            }
        }
        return f58638a;
    }

    /* renamed from: c */
    private SQLiteDatabase m50348c() {
        try {
            return this.f58639b.getWritableDatabase();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final CampaignTable m50349b() {
        if (this.f58640c == null) {
            this.f58640c = new CampaignTable(m50348c());
        }
        return this.f58640c;
    }
}
