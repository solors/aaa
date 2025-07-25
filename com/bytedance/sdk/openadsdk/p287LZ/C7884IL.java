package com.bytedance.sdk.openadsdk.p287LZ;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.LZ.IL */
/* loaded from: classes3.dex */
public class C7884IL {

    /* renamed from: IL */
    private final Context f17206IL;

    /* renamed from: bX */
    private final String f17207bX;

    /* renamed from: bg */
    private SharedPreferences f17208bg;

    public C7884IL(Context context, String str) {
        this.f17206IL = context;
        this.f17207bX = str;
    }

    /* renamed from: IL */
    private SharedPreferences m87490IL() {
        Context context;
        SharedPreferences sharedPreferences = this.f17208bg;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        if (TextUtils.isEmpty(this.f17207bX) || (context = this.f17206IL) == null) {
            return null;
        }
        try {
            this.f17208bg = context.getSharedPreferences(this.f17207bX, 0);
        } catch (Throwable th) {
            Log.e("SPUnit", th.getMessage());
        }
        return this.f17208bg;
    }

    /* renamed from: bg */
    public void m87483bg(JSONObject jSONObject) {
        try {
            SharedPreferences m87490IL = m87490IL();
            if (m87490IL != null) {
                SharedPreferences.Editor edit = m87490IL.edit();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (!TextUtils.isEmpty(next)) {
                        Object obj = jSONObject.get(next);
                        if (obj instanceof Integer) {
                            edit.putInt(next, ((Integer) obj).intValue());
                        } else if (obj instanceof Long) {
                            edit.putLong(next, ((Long) obj).longValue());
                        } else if (obj instanceof String) {
                            edit.putString(next, (String) obj);
                        } else if (obj instanceof Boolean) {
                            edit.putBoolean(next, ((Boolean) obj).booleanValue());
                        } else if (obj instanceof Float) {
                            edit.putFloat(next, ((Float) obj).floatValue());
                        } else if (obj instanceof Double) {
                            edit.putFloat(next, Double.valueOf(((Double) obj).doubleValue()).floatValue());
                        }
                    }
                }
                edit.apply();
            }
        } catch (Throwable th) {
            Log.e("SPUnit", th.getMessage());
        }
    }

    /* renamed from: IL */
    public long m87489IL(String str, long j) {
        try {
            SharedPreferences m87490IL = m87490IL();
            if (m87490IL != null && m87490IL.contains(str)) {
                return m87490IL.getLong(str, j);
            }
            return j;
        } catch (Throwable th) {
            Log.i("SPUnit", this.f17207bX + th.getMessage());
            return j;
        }
    }

    /* renamed from: bg */
    public void m87486bg(String str, long j) {
        try {
            SharedPreferences m87490IL = m87490IL();
            if (m87490IL != null) {
                SharedPreferences.Editor edit = m87490IL.edit();
                edit.putLong(str, j);
                edit.apply();
            }
        } catch (Throwable th) {
            Log.e("SPUnit", th.getMessage());
        }
    }

    /* renamed from: bg */
    public int m87487bg(String str, int i) {
        try {
            SharedPreferences m87490IL = m87490IL();
            if (m87490IL != null && m87490IL.contains(str)) {
                return m87490IL.getInt(str, i);
            }
            return i;
        } catch (Throwable th) {
            Log.i("SPUnit", this.f17207bX + th.getMessage());
            return i;
        }
    }

    /* renamed from: bg */
    public String m87485bg(String str, String str2) {
        try {
            SharedPreferences m87490IL = m87490IL();
            if (m87490IL != null && m87490IL.contains(str)) {
                return m87490IL.getString(str, str2);
            }
            return str2;
        } catch (Throwable th) {
            Log.i("SPUnit", this.f17207bX + th.getMessage());
            return str2;
        }
    }

    /* renamed from: bg */
    public boolean m87484bg(String str, boolean z) {
        try {
            SharedPreferences m87490IL = m87490IL();
            if (m87490IL != null && m87490IL.contains(str)) {
                return m87490IL.getBoolean(str, z);
            }
            return z;
        } catch (Throwable th) {
            Log.i("SPUnit", this.f17207bX + th.getMessage());
            return z;
        }
    }

    /* renamed from: bg */
    public void m87488bg() {
        SharedPreferences m87490IL = m87490IL();
        if (m87490IL != null) {
            SharedPreferences.Editor edit = m87490IL.edit();
            edit.clear();
            edit.commit();
        }
    }
}
