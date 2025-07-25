package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.content.ContextCompat;
import androidx.webkit.ProxyConfig;
import com.amazon.p047a.p048a.p071o.p073b.SignedToken;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
class Store {

    /* renamed from: a */
    final SharedPreferences f43273a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static class Token {

        /* renamed from: d */
        private static final long f43274d = TimeUnit.DAYS.toMillis(7);

        /* renamed from: a */
        final String f43275a;

        /* renamed from: b */
        final String f43276b;

        /* renamed from: c */
        final long f43277c;

        private Token(String str, String str2, long j) {
            this.f43275a = str;
            this.f43276b = str2;
            this.f43277c = j;
        }

        /* renamed from: a */
        static String m66537a(String str, String str2, long j) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str);
                jSONObject.put("appVersion", str2);
                jSONObject.put("timestamp", j);
                return jSONObject.toString();
            } catch (JSONException e) {
                Log.w(Constants.TAG, "Failed to encode token: " + e);
                return null;
            }
        }

        /* renamed from: c */
        static Token m66535c(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (str.startsWith("{")) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    return new Token(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
                } catch (JSONException e) {
                    Log.w(Constants.TAG, "Failed to parse token: " + e);
                    return null;
                }
            }
            return new Token(str, null, 0L);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean m66536b(String str) {
            if (System.currentTimeMillis() <= this.f43277c + f43274d && str.equals(this.f43276b)) {
                return false;
            }
            return true;
        }
    }

    public Store(Context context) {
        this.f43273a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        m66539a(context, "com.google.android.gms.appid-no-backup");
    }

    /* renamed from: a */
    private void m66539a(Context context, String str) {
        File file = new File(ContextCompat.getNoBackupFilesDir(context), str);
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile() && !isEmpty()) {
                Log.i(Constants.TAG, "App restored, clearing state");
                deleteAll();
            }
        } catch (IOException e) {
            if (Log.isLoggable(Constants.TAG, 3)) {
                Log.d(Constants.TAG, "Error creating file in no backup dir: " + e.getMessage());
            }
        }
    }

    /* renamed from: b */
    private String m66538b(String str, String str2) {
        return str + "|T|" + str2 + SignedToken.f2767c + ProxyConfig.MATCH_ALL_SCHEMES;
    }

    public synchronized void deleteAll() {
        this.f43273a.edit().clear().commit();
    }

    public synchronized void deleteToken(String str, String str2) {
        String m66538b = m66538b(str, str2);
        SharedPreferences.Editor edit = this.f43273a.edit();
        edit.remove(m66538b);
        edit.commit();
    }

    public synchronized Token getToken(String str, String str2) {
        return Token.m66535c(this.f43273a.getString(m66538b(str, str2), null));
    }

    public synchronized boolean isEmpty() {
        return this.f43273a.getAll().isEmpty();
    }

    public synchronized void saveToken(String str, String str2, String str3, String str4) {
        String m66537a = Token.m66537a(str3, str4, System.currentTimeMillis());
        if (m66537a == null) {
            return;
        }
        SharedPreferences.Editor edit = this.f43273a.edit();
        edit.putString(m66538b(str, str2), m66537a);
        edit.commit();
    }
}
