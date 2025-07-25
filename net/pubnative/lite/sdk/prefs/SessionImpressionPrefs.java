package net.pubnative.lite.sdk.prefs;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.pubnative.lite.sdk.p805db.OnDatabaseResetListener;
import net.pubnative.lite.sdk.p805db.SessionImpression;
import net.pubnative.lite.sdk.prefs.HyBidPreferences;
import net.pubnative.lite.sdk.prefs.SessionImpressionPrefs;
import net.pubnative.lite.sdk.utils.HyBidTimeUtils;
import net.pubnative.lite.sdk.utils.Logger;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes10.dex */
public class SessionImpressionPrefs {
    private static final String JSON_EXCEPTION = "JSONException";
    private static final String SESSION_IMPRESSION_LIST_KEY = "session_impression_key";
    private SharedPreferences.Editor editor;
    private Context mContext;
    private SharedPreferences sharedPreferences;

    public SessionImpressionPrefs(Context context) {
        if (context != null) {
            this.mContext = context;
            SharedPreferences sharedPreferences = context.getSharedPreferences("session_prefs_reporting", 0);
            this.sharedPreferences = sharedPreferences;
            if (sharedPreferences != null) {
                this.editor = sharedPreferences.edit();
            }
        }
    }

    private JSONArray convertListToJson(List<SessionImpression> list) {
        JSONArray jSONArray = new JSONArray();
        for (SessionImpression sessionImpression : list) {
            try {
                jSONArray.put(sessionImpression.toJson());
            } catch (Exception e) {
                Logger.m14227e(JSON_EXCEPTION, e.toString());
            }
        }
        return jSONArray;
    }

    private synchronized Long getAgeOfApp() {
        Context context = this.mContext;
        if (context == null) {
            return 0L;
        }
        return Long.valueOf(new HyBidPreferences(context).getSessionTimeStamp());
    }

    private synchronized void increment(SessionImpression sessionImpression) {
        if (this.editor != null) {
            String string = this.sharedPreferences.getString(SESSION_IMPRESSION_LIST_KEY, "");
            ArrayList arrayList = new ArrayList();
            if (!string.isEmpty()) {
                try {
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        arrayList.add(new SessionImpression(jSONArray.getJSONObject(i)));
                    }
                    incrementZoneId(arrayList, sessionImpression);
                } catch (JSONException e) {
                    Logger.m14227e(JSON_EXCEPTION, e.toString());
                }
            } else {
                sessionImpression.setCount(1);
                arrayList.add(sessionImpression);
            }
            this.editor.putString(SESSION_IMPRESSION_LIST_KEY, convertListToJson(arrayList).toString());
            this.editor.apply();
        }
    }

    private synchronized void incrementZoneId(List<SessionImpression> list, SessionImpression sessionImpression) {
        if (list != null && sessionImpression != null) {
            boolean z = false;
            int i = 0;
            while (true) {
                if (i < list.size()) {
                    SessionImpression sessionImpression2 = list.get(i);
                    if (sessionImpression2 != null && !TextUtils.isEmpty(sessionImpression.getZoneId()) && !TextUtils.isEmpty(sessionImpression2.getZoneId()) && sessionImpression.getZoneId().equals(sessionImpression2.getZoneId())) {
                        sessionImpression2.setCount(Integer.valueOf(sessionImpression2.getCount().intValue() + 1));
                        z = true;
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            }
            if (!z) {
                sessionImpression.setCount(1);
                list.add(sessionImpression);
            }
        }
    }

    private synchronized void manageImpressionSession(Long l) {
        Context context = this.mContext;
        if (context == null) {
            return;
        }
        new HyBidPreferences(context).setSessionTimeStamp(l.longValue(), new OnDatabaseResetListener() { // from class: xe.a
            @Override // net.pubnative.lite.sdk.p805db.OnDatabaseResetListener
            public final void onDatabaseReset() {
                SessionImpressionPrefs.this.nukePrefs();
            }
        }, HyBidPreferences.TIMESTAMP.AD_REQUEST);
    }

    public Integer getImpressionDepth(String str) {
        SessionImpression sessionImpression;
        String string = this.sharedPreferences.getString(SESSION_IMPRESSION_LIST_KEY, "");
        ArrayList arrayList = new ArrayList();
        if (!string.isEmpty()) {
            try {
                JSONArray jSONArray = new JSONArray(string);
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(new SessionImpression(jSONArray.getJSONObject(i)));
                }
            } catch (JSONException e) {
                Logger.m14227e(JSON_EXCEPTION, e.toString());
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    sessionImpression = (SessionImpression) it.next();
                    if (!TextUtils.isEmpty(sessionImpression.getZoneId()) && !TextUtils.isEmpty(str) && sessionImpression.getZoneId().equals(str)) {
                        break;
                    }
                } else {
                    sessionImpression = null;
                    break;
                }
            }
            if (sessionImpression != null) {
                return sessionImpression.getCount();
            }
        }
        return 0;
    }

    public synchronized void insert(String str) {
        SessionImpression sessionImpression = new SessionImpression();
        sessionImpression.setTimestamp(Long.valueOf(System.currentTimeMillis()));
        sessionImpression.setZoneId(str);
        Long ageOfApp = getAgeOfApp();
        sessionImpression.setSessionDuration(new HyBidTimeUtils().calculateSessionDuration(sessionImpression.getTimestamp(), ageOfApp));
        sessionImpression.setAgeOfApp(ageOfApp);
        manageImpressionSession(sessionImpression.getTimestamp());
        increment(sessionImpression);
    }

    public synchronized void nukePrefs() {
        SharedPreferences.Editor editor = this.editor;
        if (editor != null) {
            editor.putString(SESSION_IMPRESSION_LIST_KEY, "");
        }
    }
}
