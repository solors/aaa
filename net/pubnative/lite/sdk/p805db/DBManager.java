package net.pubnative.lite.sdk.p805db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import net.pubnative.lite.sdk.HyBid;
import net.pubnative.lite.sdk.prefs.HyBidPreferences;
import net.pubnative.lite.sdk.utils.HyBidTimeUtils;
import net.pubnative.lite.sdk.utils.Logger;

/* renamed from: net.pubnative.lite.sdk.db.DBManager */
/* loaded from: classes10.dex */
public class DBManager {
    private static final String TAG = "DBManager";
    private final Context context;
    private SQLiteDatabase database;
    private DatabaseHelper dbHelper;

    public DBManager(Context context) {
        this.context = context;
    }

    private synchronized ArrayList<SessionImpression> fetch(String str) {
        ArrayList<SessionImpression> arrayList;
        String[] strArr = {"timestamp", "age_of_app", "zone_id", "session_duration"};
        String str2 = "zone_id = " + str;
        arrayList = new ArrayList<>();
        try {
            Cursor query = this.database.query(DatabaseHelper.TABLE_NAME, strArr, str2, null, null, null, null);
            if (query != null && query.moveToFirst()) {
                do {
                    SessionImpression sessionImpression = new SessionImpression();
                    sessionImpression.setTimestamp(Long.valueOf(query.getLong(0)));
                    sessionImpression.setAgeOfApp(Long.valueOf(query.getLong(1)));
                    sessionImpression.setZoneId(query.getString(2));
                    sessionImpression.setSessionDuration(Long.valueOf(query.getLong(3)));
                    arrayList.add(sessionImpression);
                } while (query.moveToNext());
                query.close();
            }
        } catch (SQLException e) {
            HyBid.reportException((Exception) e);
            Logger.m14226e(TAG, "Error during DB operation: ", e);
        }
        return arrayList;
    }

    private void insert(SessionImpression sessionImpression) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", sessionImpression.getTimestamp());
        contentValues.put("age_of_app", sessionImpression.getAgeOfApp());
        contentValues.put("zone_id", sessionImpression.getZoneId());
        contentValues.put("session_duration", sessionImpression.getSessionDuration());
        this.database.insert(DatabaseHelper.TABLE_NAME, null, contentValues);
    }

    private void manageImpressionSession(Long l) {
        new HyBidPreferences(this.context).setSessionTimeStamp(l.longValue(), new OnDatabaseResetListener() { // from class: net.pubnative.lite.sdk.db.a
            {
                DBManager.this = this;
            }

            @Override // net.pubnative.lite.sdk.p805db.OnDatabaseResetListener
            public final void onDatabaseReset() {
                DBManager.this.nukeTable();
            }
        }, HyBidPreferences.TIMESTAMP.AD_REQUEST);
    }

    public void close() {
        DatabaseHelper databaseHelper = this.dbHelper;
        if (databaseHelper != null) {
            databaseHelper.close();
        }
    }

    public Long getAgeOfApp() {
        return Long.valueOf(new HyBidPreferences(this.context).getSessionTimeStamp());
    }

    public Integer getImpressionDepth(String str) {
        return Integer.valueOf(fetch(str).size());
    }

    public void nukeTable() {
        SQLiteDatabase sQLiteDatabase = this.database;
        if (sQLiteDatabase != null) {
            sQLiteDatabase.delete(DatabaseHelper.TABLE_NAME, null, null);
        }
    }

    public DBManager open() throws SQLException {
        DatabaseHelper databaseHelper = new DatabaseHelper(this.context);
        this.dbHelper = databaseHelper;
        this.database = databaseHelper.getWritableDatabase();
        return this;
    }

    public void insert(String str) {
        SessionImpression sessionImpression = new SessionImpression();
        sessionImpression.setTimestamp(Long.valueOf(System.currentTimeMillis()));
        sessionImpression.setZoneId(str);
        sessionImpression.setSessionDuration(new HyBidTimeUtils().calculateSessionDuration(sessionImpression.getTimestamp(), getAgeOfApp()));
        manageImpressionSession(sessionImpression.getTimestamp());
        insert(sessionImpression);
    }
}
