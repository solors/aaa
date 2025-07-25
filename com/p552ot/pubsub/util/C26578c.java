package com.p552ot.pubsub.util;

import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ot.pubsub.util.c */
/* loaded from: classes7.dex */
public class C26578c {

    /* renamed from: a */
    private static final String f69722a = "DataConvertUtil";

    /* renamed from: a */
    public static String m41107a(Map<String, String> map) {
        if (map != null && !map.isEmpty()) {
            try {
                return new JSONObject(map).toString();
            } catch (Exception e) {
                C26586j.m41074b(f69722a, "map to json error:" + e.getMessage());
            }
        }
        return "";
    }

    /* renamed from: a */
    public static Map<String, String> m41108a(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap();
        }
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.optString(next));
            }
        } catch (Exception e) {
            C26586j.m41074b(f69722a, "json to map error:" + e.getMessage());
        }
        return hashMap;
    }

    /* renamed from: a */
    public static byte[] m41109a(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream;
        ObjectOutputStream objectOutputStream;
        ObjectOutputStream objectOutputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            } catch (IOException e) {
                e = e;
                objectOutputStream = null;
            } catch (Throwable th) {
                th = th;
                C26585i.m41088a((OutputStream) byteArrayOutputStream);
                C26585i.m41088a((OutputStream) objectOutputStream2);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            byteArrayOutputStream = null;
            objectOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream = null;
        }
        try {
            try {
                objectOutputStream.writeObject(obj);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                C26585i.m41088a((OutputStream) byteArrayOutputStream);
                C26585i.m41088a((OutputStream) objectOutputStream);
                return byteArray;
            } catch (Throwable th3) {
                th = th3;
                objectOutputStream2 = objectOutputStream;
                C26585i.m41088a((OutputStream) byteArrayOutputStream);
                C26585i.m41088a((OutputStream) objectOutputStream2);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            C26586j.m41074b(f69722a, "serialize error:" + e.getMessage());
            C26585i.m41088a((OutputStream) byteArrayOutputStream);
            C26585i.m41088a((OutputStream) objectOutputStream);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* renamed from: a */
    public static Object m41106a(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream;
        Exception e;
        ObjectInputStream objectInputStream;
        ?? r0 = 0;
        r0 = 0;
        try {
            try {
                byteArrayInputStream = new ByteArrayInputStream(bArr);
            } catch (Exception e2) {
                e = e2;
                objectInputStream = null;
                byteArrayInputStream = null;
            } catch (Throwable th) {
                th = th;
                byteArrayInputStream = null;
            }
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
            } catch (Exception e3) {
                e = e3;
                objectInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                C26585i.m41091a((InputStream) byteArrayInputStream);
                C26585i.m41091a((InputStream) r0);
                throw th;
            }
            try {
                Object readObject = objectInputStream.readObject();
                C26585i.m41091a((InputStream) byteArrayInputStream);
                C26585i.m41091a((InputStream) objectInputStream);
                return readObject;
            } catch (Exception e4) {
                e = e4;
                C26586j.m41074b(f69722a, "deserialize error:" + e.getMessage());
                C26585i.m41091a((InputStream) byteArrayInputStream);
                C26585i.m41091a((InputStream) objectInputStream);
                return null;
            }
        } catch (Throwable th3) {
            r0 = bArr;
            th = th3;
        }
    }
}
