package com.apm.insight.p119b;

import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import com.apm.insight.Ensure;
import com.apm.insight.runtime.MonitorCrashInner;
import java.lang.reflect.Field;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.apm.insight.b.j */
/* loaded from: classes2.dex */
public final class LooperUtil {

    /* renamed from: a */
    private static MessageQueue f3692a;

    /* renamed from: b */
    private static Field f3693b;

    /* renamed from: c */
    private static Field f3694c;

    /* renamed from: a */
    public static MessageQueue m102056a() {
        if (f3692a == null && Looper.getMainLooper() != null) {
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper == Looper.myLooper()) {
                f3692a = Looper.myQueue();
            } else {
                f3692a = mainLooper.getQueue();
            }
        }
        return f3692a;
    }

    /* renamed from: a */
    public static Message m102052a(MessageQueue messageQueue) {
        Field field = f3693b;
        if (field == null) {
            try {
                Field declaredField = Class.forName("android.os.MessageQueue").getDeclaredField("mMessages");
                f3693b = declaredField;
                declaredField.setAccessible(true);
                return (Message) f3693b.get(messageQueue);
            } catch (Exception unused) {
                return null;
            }
        }
        try {
            return (Message) field.get(messageQueue);
        } catch (Exception unused2) {
            return null;
        }
    }

    /* renamed from: a */
    private static Message m102054a(Message message) {
        Field field = f3694c;
        if (field == null) {
            try {
                Field declaredField = Class.forName("android.os.Message").getDeclaredField("next");
                f3694c = declaredField;
                declaredField.setAccessible(true);
                return (Message) f3694c.get(message);
            } catch (Exception unused) {
                return null;
            }
        }
        try {
            return (Message) field.get(message);
        } catch (Exception unused2) {
            return null;
        }
    }

    /* renamed from: a */
    private static JSONObject m102053a(Message message, long j) {
        JSONObject jSONObject = new JSONObject();
        if (message == null) {
            return jSONObject;
        }
        try {
            jSONObject.put("when", message.getWhen() - j);
            if (message.getCallback() != null) {
                jSONObject.put("callback", String.valueOf(message.getCallback()));
            }
            jSONObject.put("what", message.what);
            if (message.getTarget() != null) {
                jSONObject.put("target", String.valueOf(message.getTarget()));
            } else {
                jSONObject.put("barrier", message.arg1);
            }
            jSONObject.put("arg1", message.arg1);
            jSONObject.put("arg2", message.arg2);
            Object obj = message.obj;
            if (obj != null) {
                jSONObject.put("obj", obj);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static JSONArray m102055a(long j) {
        MessageQueue m102056a = m102056a();
        JSONArray jSONArray = new JSONArray();
        if (m102056a == null) {
            return jSONArray;
        }
        try {
            synchronized (m102056a) {
                Message m102052a = m102052a(m102056a);
                if (m102052a == null) {
                    return jSONArray;
                }
                int i = 0;
                int i2 = 0;
                while (m102052a != null && i < 100) {
                    i++;
                    i2++;
                    JSONObject m102053a = m102053a(m102052a, j);
                    try {
                        m102053a.put("id", i2);
                    } catch (JSONException unused) {
                    }
                    jSONArray.put(m102053a);
                    m102052a = m102054a(m102052a);
                }
                return jSONArray;
            }
        } catch (Throwable th) {
            Ensure.m102051a();
            MonitorCrashInner.m101391a(th, "NPTH_CATCH");
            return jSONArray;
        }
    }
}
