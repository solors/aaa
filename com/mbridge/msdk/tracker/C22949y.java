package com.mbridge.msdk.tracker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import com.maticoo.sdk.utils.log.p406bi.Constants;
import com.unity3d.services.UnityAdsConstants;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Utils.java */
/* renamed from: com.mbridge.msdk.tracker.y */
/* loaded from: classes6.dex */
public final class C22949y {
    /* renamed from: a */
    public static long m49292a(int i, long j, long j2) {
        if (i <= 0 || j == 0 || i <= 10) {
            return j2;
        }
        if (i <= 20) {
            return 60000L;
        }
        if (i <= 30) {
            return UnityAdsConstants.Timeout.INIT_TIMEOUT_MS;
        }
        if (i <= 40) {
            return 180000L;
        }
        return i <= 50 ? 240000L : 300000L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static boolean m49286b(Object obj) {
        return obj != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m49289a(Object obj) {
        return obj == null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static boolean m49285b(List<EventTable> list) {
        if (m49288a((List<?>) list)) {
            return false;
        }
        for (EventTable eventTable : list) {
            if (!m49289a(eventTable)) {
                C22885e m49572c = eventTable.m49572c();
                if (!m49289a(m49572c) && m49572c.m49596c() == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m49288a(List<?> list) {
        return list == null || list.size() == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m49290a(Cursor cursor) {
        boolean z = false;
        try {
            if (m49286b((Object) cursor)) {
                if (!cursor.isClosed()) {
                    z = true;
                }
            }
        } catch (Exception unused) {
        }
        if (z) {
            try {
                cursor.close();
            } catch (Exception unused2) {
            }
        }
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: a */
    public static boolean m49291a(Context context) {
        ConnectivityManager connectivityManager;
        if (context == null) {
            return true;
        }
        NetworkInfo networkInfo = null;
        try {
            connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        } catch (Exception unused) {
            connectivityManager = null;
        }
        if (connectivityManager == null) {
            return true;
        }
        try {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } catch (Exception unused2) {
        }
        return networkInfo != null && networkInfo.isConnected();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static List<EventTable> m49287b(Cursor cursor) {
        int i;
        int i2;
        C22885e c22885e;
        ArrayList arrayList = new ArrayList();
        try {
            int columnIndex = cursor.getColumnIndex("name");
            int columnIndex2 = cursor.getColumnIndex("type");
            int columnIndex3 = cursor.getColumnIndex("time_stamp");
            int columnIndex4 = cursor.getColumnIndex(Constants.KEY_PROPERTIES);
            int columnIndex5 = cursor.getColumnIndex("priority");
            int columnIndex6 = cursor.getColumnIndex(CommonUrlParts.UUID);
            int columnIndex7 = cursor.getColumnIndex("duration");
            int columnIndex8 = cursor.getColumnIndex("state");
            int columnIndex9 = cursor.getColumnIndex("report_count");
            int columnIndex10 = cursor.getColumnIndex("ignore_max_timeout");
            int columnIndex11 = cursor.getColumnIndex("ignore_max_retry_times");
            int columnIndex12 = cursor.getColumnIndex("invalid_time");
            while (cursor.moveToNext()) {
                try {
                    c22885e = new C22885e(cursor.getString(columnIndex));
                    c22885e.m49605a(cursor.getInt(columnIndex2));
                    i = columnIndex;
                    i2 = columnIndex2;
                } catch (JSONException e) {
                    e = e;
                    i = columnIndex;
                    i2 = columnIndex2;
                }
                try {
                    c22885e.m49604a(cursor.getLong(columnIndex3));
                    c22885e.m49601a(new JSONObject(cursor.getString(columnIndex4)));
                    c22885e.m49598b(cursor.getInt(columnIndex5));
                    c22885e.m49602a(cursor.getString(columnIndex6));
                    c22885e.m49597b(cursor.getLong(columnIndex7));
                    EventTable eventTable = new EventTable(c22885e);
                    eventTable.m49574b(cursor.getInt(columnIndex8));
                    eventTable.m49578a(cursor.getInt(columnIndex9));
                    boolean z = true;
                    eventTable.m49576a(cursor.getInt(columnIndex10) == 0);
                    if (cursor.getInt(columnIndex11) != 0) {
                        z = false;
                    }
                    eventTable.m49573b(z);
                    eventTable.m49577a(cursor.getLong(columnIndex12));
                    arrayList.add(eventTable);
                } catch (JSONException e2) {
                    e = e2;
                    if (Common.f59651a) {
                        Log.e("TrackManager", "create: ", e);
                    }
                    columnIndex = i;
                    columnIndex2 = i2;
                }
                columnIndex = i;
                columnIndex2 = i2;
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }
}
