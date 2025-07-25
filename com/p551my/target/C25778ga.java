package com.p551my.target;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.my.target.ga */
/* loaded from: classes7.dex */
public class C25778ga {

    /* renamed from: a */
    public final Context f66889a;

    /* renamed from: b */
    public final C26073s f66890b;

    /* renamed from: c */
    public final C25832j f66891c;

    /* renamed from: d */
    public String f66892d;

    /* renamed from: e */
    public boolean f66893e = true;

    /* renamed from: f */
    public int f66894f = 1;

    public C25778ga(C26073s c26073s, C25832j c25832j, Context context) {
        this.f66890b = c26073s;
        this.f66891c = c25832j;
        this.f66889a = context;
    }

    /* renamed from: a */
    public static C25778ga m43846a(C26073s c26073s, C25832j c25832j, Context context) {
        return new C25778ga(c26073s, c25832j, context);
    }

    /* renamed from: b */
    public final C25689ca m43840b(JSONObject jSONObject, String str, float f) {
        String str2;
        int i;
        int optInt = jSONObject.optInt("viewablePercent", -1);
        if (optInt >= 0 && optInt <= 100) {
            String m44232a = AbstractC25631a5.m44232a(jSONObject, "target");
            if (TextUtils.isEmpty(m44232a)) {
                i = this.f66894f;
            } else if ("video".equals(m44232a)) {
                i = 2;
            } else if ("banner".equals(m44232a)) {
                i = 1;
            } else {
                str2 = "unknown viewability stat target value: '" + m44232a + "'";
            }
            if (jSONObject.has("ovv")) {
                C26142u7 m42755a = C26142u7.m42755a(str, optInt, i);
                m42755a.m42753b(jSONObject.optBoolean("ovv", false));
                if (jSONObject.has("pvalue")) {
                    float optDouble = (float) jSONObject.optDouble("pvalue", m42755a.m42752e());
                    if (optDouble >= 0.0f && optDouble <= 100.0f) {
                        if (f > 0.0f) {
                            m42755a.m42754b((optDouble * f) / 100.0f);
                        } else {
                            m42755a.m42756a(optDouble);
                        }
                        return m42755a;
                    }
                }
                if (jSONObject.has("value")) {
                    float optDouble2 = (float) jSONObject.optDouble("value", m42755a.m42751f());
                    if (optDouble2 >= 0.0f) {
                        m42755a.m42754b(optDouble2);
                        return m42755a;
                    }
                }
            }
            float optDouble3 = (float) jSONObject.optDouble("duration", -1.0d);
            if (optDouble3 < 0.0f) {
                str2 = "failed to parse viewabilityStat: no ovv or wrong duration";
            } else {
                return C25632a6.m44230a(str, optDouble3, optInt, jSONObject.optBoolean("mrc", true), i);
            }
        } else {
            str2 = "failed to parse viewabilityStat: invalid viewable percent value";
        }
        m43844a("Bad value", str2);
        return null;
    }

    /* renamed from: a */
    public final C26114t7 m43842a(JSONObject jSONObject, String str) {
        if (jSONObject.has("view")) {
            return C26114t7.m42838b(str, jSONObject.optString("view"));
        }
        return null;
    }

    /* renamed from: a */
    public C25659b8 m43841a(JSONObject jSONObject, String str, float f) {
        C25659b8 m44159a = C25659b8.m44159a(str);
        if (jSONObject.has("pvalue")) {
            float optDouble = (float) jSONObject.optDouble("pvalue", m44159a.m44157d());
            if (optDouble >= 0.0f && optDouble <= 100.0f) {
                if (f > 0.0f) {
                    m44159a.m44158b((optDouble * f) / 100.0f);
                } else {
                    m44159a.m44160a(optDouble);
                }
                return m44159a;
            }
        }
        if (jSONObject.has("value")) {
            float optDouble2 = (float) jSONObject.optDouble("value", m44159a.m44156e());
            if (optDouble2 >= 0.0f) {
                m44159a.m44158b(optDouble2);
                return m44159a;
            }
            return null;
        }
        return null;
    }

    /* renamed from: a */
    public C25689ca mo43843a(JSONObject jSONObject, float f) {
        C25689ca m43842a;
        String str;
        String optString = jSONObject.optString("type");
        String optString2 = jSONObject.optString("url");
        if (!C25895la.m43500e(optString2)) {
            str = "failed to parse stat url: url is empty or broken";
        } else if (!TextUtils.isEmpty(optString)) {
            optString.hashCode();
            char c = 65535;
            switch (optString.hashCode()) {
                case -1439500848:
                    if (optString.equals("orientation")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1669348544:
                    if (optString.equals("playheadViewabilityValue")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1788134515:
                    if (optString.equals("playheadReachedValue")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    m43842a = m43842a(jSONObject, optString2);
                    break;
                case 1:
                    m43842a = m43840b(jSONObject, optString2, f);
                    break;
                case 2:
                    m43842a = m43841a(jSONObject, optString2, f);
                    break;
                default:
                    m43842a = C25689ca.m44066a(optString, optString2);
                    break;
            }
            if (m43842a != null) {
                m43842a.m44065a(jSONObject.optBoolean("needDecodeUrl", m43842a.m44063c()));
            }
            return m43842a;
        } else {
            str = "failed to parse stat: no type";
        }
        m43844a("Required field", str);
        return null;
    }

    /* renamed from: a */
    public void m43847a(C25711da c25711da, JSONObject jSONObject, String str, float f) {
        int length;
        C25689ca mo43843a;
        c25711da.m44005a(this.f66890b.m42956m(), f);
        JSONArray optJSONArray = jSONObject.optJSONArray("statistics");
        if (optJSONArray != null && (length = optJSONArray.length()) > 0) {
            this.f66892d = str;
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null && (mo43843a = mo43843a(optJSONObject, f)) != null) {
                    c25711da.m44006a(mo43843a);
                }
            }
        }
    }

    /* renamed from: a */
    public void m43844a(String str, String str2) {
        if (this.f66893e) {
            String str3 = this.f66890b.f67806a;
            C25656b5 m44175c = C25656b5.m44178a(str).m44173e(str2).m44180a(this.f66891c.getSlotId()).m44175c(this.f66892d);
            if (str3 == null) {
                str3 = this.f66890b.f67807b;
            }
            m44175c.m44176b(str3).m44177b(this.f66889a);
        }
    }

    /* renamed from: a */
    public void m43848a(int i) {
        this.f66894f = i;
    }

    /* renamed from: a */
    public void m43845a(Boolean bool) {
        this.f66893e = bool.booleanValue();
    }
}
