package com.applovin.impl;

import androidx.arch.core.util.Function;
import androidx.core.util.Consumer;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.tl */
/* loaded from: classes2.dex */
public class C5567tl {

    /* renamed from: a */
    private final JSONObject f10906a;

    /* renamed from: b */
    private final Object f10907b = new Object();

    public C5567tl(JSONObject jSONObject) {
        this.f10906a = jSONObject;
    }

    /* renamed from: a */
    public Object m94429a(Function function) {
        Object apply;
        synchronized (this.f10907b) {
            apply = function.apply(this);
        }
        return apply;
    }

    /* renamed from: b */
    public List m94411b(String str, List list) {
        List<String> stringList;
        synchronized (this.f10907b) {
            stringList = JsonUtils.getStringList(this.f10906a, str, list);
        }
        return stringList;
    }

    /* renamed from: c */
    public void m94410c(String str) {
        synchronized (this.f10907b) {
            this.f10906a.remove(str);
        }
    }

    public String toString() {
        String jSONObject;
        synchronized (this.f10907b) {
            jSONObject = this.f10906a.toString();
        }
        return jSONObject;
    }

    /* renamed from: a */
    public void m94428a(Consumer consumer) {
        synchronized (this.f10907b) {
            consumer.accept(this);
        }
    }

    /* renamed from: b */
    public Object m94415b(String str) {
        Object opt;
        synchronized (this.f10907b) {
            opt = this.f10906a.opt(str);
        }
        return opt;
    }

    /* renamed from: b */
    public void m94414b(String str, int i) {
        synchronized (this.f10907b) {
            JsonUtils.putInt(this.f10906a, str, i);
        }
    }

    /* renamed from: a */
    public Boolean m94422a(String str, Boolean bool) {
        Boolean bool2;
        synchronized (this.f10907b) {
            bool2 = JsonUtils.getBoolean(this.f10906a, str, bool);
        }
        return bool2;
    }

    /* renamed from: a */
    public double m94426a(String str, double d) {
        double d2;
        synchronized (this.f10907b) {
            d2 = JsonUtils.getDouble(this.f10906a, str, d);
        }
        return d2;
    }

    /* renamed from: b */
    public void m94413b(String str, long j) {
        synchronized (this.f10907b) {
            JsonUtils.putLong(this.f10906a, str, j);
        }
    }

    /* renamed from: a */
    public float m94425a(String str, float f) {
        float f2;
        synchronized (this.f10907b) {
            f2 = JsonUtils.getFloat(this.f10906a, str, f);
        }
        return f2;
    }

    /* renamed from: b */
    public void m94412b(String str, String str2) {
        synchronized (this.f10907b) {
            JsonUtils.putString(this.f10906a, str, str2);
        }
    }

    /* renamed from: a */
    public int m94424a(String str, int i) {
        int i2;
        synchronized (this.f10907b) {
            i2 = JsonUtils.getInt(this.f10906a, str, i);
        }
        return i2;
    }

    /* renamed from: a */
    public List m94419a(String str, List list) {
        List<Integer> integerList;
        synchronized (this.f10907b) {
            integerList = JsonUtils.getIntegerList(this.f10906a, str, list);
        }
        return integerList;
    }

    /* renamed from: a */
    public JSONArray m94418a(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        synchronized (this.f10907b) {
            jSONArray2 = JsonUtils.getJSONArray(this.f10906a, str, jSONArray);
        }
        return jSONArray2;
    }

    /* renamed from: a */
    public JSONObject m94417a(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        synchronized (this.f10907b) {
            jSONObject2 = JsonUtils.getJSONObject(this.f10906a, str, jSONObject);
        }
        return jSONObject2;
    }

    /* renamed from: a */
    public long m94423a(String str, long j) {
        long j2;
        synchronized (this.f10907b) {
            j2 = JsonUtils.getLong(this.f10906a, str, j);
        }
        return j2;
    }

    /* renamed from: a */
    public String m94420a(String str, String str2) {
        String string;
        synchronized (this.f10907b) {
            string = JsonUtils.getString(this.f10906a, str, str2);
        }
        return string;
    }

    /* renamed from: a */
    public boolean m94427a(String str) {
        boolean has;
        synchronized (this.f10907b) {
            has = this.f10906a.has(str);
        }
        return has;
    }

    /* renamed from: a */
    public void m94416a(String str, boolean z) {
        synchronized (this.f10907b) {
            JsonUtils.putBoolean(this.f10906a, str, z);
        }
    }

    /* renamed from: a */
    public void m94421a(String str, Object obj) {
        synchronized (this.f10907b) {
            JsonUtils.putObject(this.f10906a, str, obj);
        }
    }

    /* renamed from: a */
    public JSONObject m94430a() {
        JSONObject deepCopy;
        synchronized (this.f10907b) {
            deepCopy = JsonUtils.deepCopy(this.f10906a);
        }
        return deepCopy;
    }
}
