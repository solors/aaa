package io.bidmachine.analytics.internal;

import android.content.Context;
import android.os.Bundle;
import android.util.Base64;
import java.io.Closeable;
import java.io.Flushable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.PrimitiveIterators;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.PrimitiveRanges;
import kotlin.ranges._Ranges;
import kotlin.sequences.C37653n;
import kotlin.sequences.Sequence;
import kotlin.text.C37690r;
import kotlin.text.Charsets;
import kotlin.text._Strings;
import org.json.JSONArray;
import org.json.JSONObject;
import p804nd.C38508r;
import p804nd.Result;

/* renamed from: io.bidmachine.analytics.internal.l0 */
/* loaded from: classes9.dex */
public abstract class AbstractC35634l0 {
    /* renamed from: a */
    public static final Object m20156a(Closeable closeable) {
        try {
            Result.C38506a c38506a = Result.f101870c;
            closeable.close();
            return Result.m14549b(Unit.f99208a);
        } catch (Throwable th) {
            Result.C38506a c38506a2 = Result.f101870c;
            return Result.m14549b(C38508r.m14540a(th));
        }
    }

    /* renamed from: b */
    public static final String m20145b(String str) {
        return m20153a(m20142d(str));
    }

    /* renamed from: c */
    public static final String m20143c(String str) {
        return Base64.encodeToString(str.getBytes(Charsets.UTF_8), 2);
    }

    /* renamed from: d */
    public static final String m20142d(String str) {
        int m16566e0;
        CharSequence m16533m1;
        CharSequence m16533m12;
        if (str.length() != 0) {
            m16566e0 = C37690r.m16566e0(str, "=", 0, false, 6, null);
            if (m16566e0 == -1) {
                m16533m12 = _Strings.m16533m1(str);
                return m16533m12.toString();
            }
            StringBuilder sb2 = new StringBuilder();
            m16533m1 = _Strings.m16533m1(str.substring(0, m16566e0));
            sb2.append(m16533m1.toString());
            sb2.append(str.substring(m16566e0));
            return sb2.toString();
        }
        return str;
    }

    /* renamed from: a */
    public static final String m20153a(String str) {
        return new String(Base64.decode(str, 2), Charsets.UTF_8);
    }

    /* renamed from: b */
    public static final byte[] m20144b(byte[] bArr, String str) {
        return m20146a(bArr, str.getBytes(Charsets.UTF_8));
    }

    /* renamed from: a */
    public static final Object m20155a(Flushable flushable) {
        try {
            Result.C38506a c38506a = Result.f101870c;
            flushable.flush();
            return Result.m14549b(Unit.f99208a);
        } catch (Throwable th) {
            Result.C38506a c38506a2 = Result.f101870c;
            return Result.m14549b(C38508r.m14540a(th));
        }
    }

    /* renamed from: a */
    public static final boolean m20158a(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    /* renamed from: a */
    public static final JSONArray m20151a(List list) {
        JSONArray jSONArray = new JSONArray();
        for (Object obj : list) {
            if (obj instanceof List) {
                obj = m20151a((List) obj);
            } else if (obj instanceof Map) {
                obj = m20150a((Map) obj);
            }
            jSONArray.put(obj);
        }
        return jSONArray;
    }

    /* renamed from: a */
    public static final JSONObject m20150a(Map map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            try {
                Result.C38506a c38506a = Result.f101870c;
                String valueOf = String.valueOf(key);
                if (valueOf.length() != 0 && value != null) {
                    if (value instanceof List) {
                        value = m20151a((List) value);
                    } else if (value instanceof Map) {
                        value = m20150a((Map) value);
                    }
                    jSONObject.put(valueOf, value);
                }
                Result.m14549b(Unit.f99208a);
            } catch (Throwable th) {
                Result.C38506a c38506a2 = Result.f101870c;
                Result.m14549b(C38508r.m14540a(th));
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    private static final Object m20154a(Object obj) {
        if (Intrinsics.m17075f(obj, JSONObject.NULL)) {
            return null;
        }
        return obj instanceof JSONObject ? m20148a((JSONObject) obj) : obj instanceof JSONArray ? m20149a((JSONArray) obj) : obj;
    }

    /* renamed from: a */
    public static final List m20149a(JSONArray jSONArray) {
        PrimitiveRanges m16900v;
        m16900v = _Ranges.m16900v(0, jSONArray.length());
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = m16900v.iterator();
        while (it.hasNext()) {
            Object m20154a = m20154a(jSONArray.get(((PrimitiveIterators) it).nextInt()));
            if (m20154a != null) {
                arrayList.add(m20154a);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static final Map m20157a(Bundle bundle) {
        short shortValue;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (!(obj instanceof Boolean)) {
                if (obj instanceof Byte) {
                    shortValue = ((Number) obj).byteValue();
                } else if (!(obj instanceof Character) && !(obj instanceof Double) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Long)) {
                    if (obj instanceof Short) {
                        shortValue = ((Number) obj).shortValue();
                    } else if (!(obj instanceof String)) {
                        obj = obj instanceof Bundle ? m20157a((Bundle) obj) : (!(obj instanceof CharSequence) && obj == null) ? null : obj.toString();
                    }
                }
                obj = Integer.valueOf(shortValue);
            }
            if (obj != null) {
                linkedHashMap.put(str, obj);
            }
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    public static final Map m20148a(JSONObject jSONObject) {
        Sequence<String> m16841c;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        m16841c = C37653n.m16841c(jSONObject.keys());
        for (String str : m16841c) {
            Object m20154a = m20154a(jSONObject.get(str));
            if (m20154a != null) {
                linkedHashMap.put(str, m20154a);
            }
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    public static final String m20152a(Throwable th) {
        String message = th.getMessage();
        if (message != null) {
            String str = th.getClass().getName() + ": " + message;
            if (str != null) {
                return str;
            }
        }
        return th.getClass().getName();
    }

    /* renamed from: a */
    public static final byte[] m20147a(byte[] bArr, String str) {
        return m20146a(bArr, str.getBytes(Charsets.UTF_8));
    }

    /* renamed from: a */
    private static final byte[] m20146a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length];
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i % bArr2.length]);
        }
        return bArr3;
    }
}
