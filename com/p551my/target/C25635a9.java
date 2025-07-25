package com.p551my.target;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: com.my.target.a9 */
/* loaded from: classes7.dex */
public class C25635a9 extends C25778ga {
    public C25635a9(C26073s c26073s, C25832j c25832j, Context context) {
        super(c26073s, c25832j, context);
    }

    /* renamed from: b */
    public static C25635a9 m44207b(C26073s c26073s, C25832j c25832j, Context context) {
        return new C25635a9(c26073s, c25832j, context);
    }

    @Override // com.p551my.target.C25778ga
    /* renamed from: a */
    public C25689ca mo43843a(JSONObject jSONObject, float f) {
        String optString = jSONObject.optString("type");
        String optString2 = jSONObject.optString("url");
        if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
            optString.hashCode();
            char c = 65535;
            switch (optString.hashCode()) {
                case -1053159584:
                    if (optString.equals("playheadTimerValue")) {
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
                    return m44206b(jSONObject, optString2);
                case 1:
                    return m44205c(jSONObject, optString2);
                case 2:
                    C25659b8 m43841a = super.m43841a(jSONObject, optString2, f);
                    if (m43841a == null || m43841a.m44156e() < 0.0f) {
                        return null;
                    }
                    return m43841a;
                default:
                    return super.mo43843a(jSONObject, f);
            }
        }
        m43844a("Required field", "failed to parse stat: no type or url");
        return null;
    }

    /* renamed from: c */
    public final C25689ca m44205c(JSONObject jSONObject, String str) {
        String str2;
        StringBuilder sb2;
        String str3;
        int optInt = jSONObject.optInt("viewablePercent", -1);
        if (optInt >= 0 && optInt <= 100) {
            int optInt2 = jSONObject.optInt("duration", -1);
            if (optInt2 < 0) {
                return null;
            }
            int optInt3 = jSONObject.optInt("startTimer", 0);
            int optInt4 = jSONObject.optInt("endTimer", 0);
            if (optInt3 < 0) {
                sb2 = new StringBuilder();
                str3 = "failed to parse viewabilityStat: wrong start timer ";
            } else if (optInt4 < 0) {
                sb2 = new StringBuilder();
                str3 = "failed to parse viewabilityStat: wrong end timer ";
            } else if (optInt4 != 0 && optInt3 >= optInt4) {
                sb2 = new StringBuilder();
                sb2.append("failed to parse viewabilityStat: start timer (");
                sb2.append(optInt3);
                sb2.append(") cannot be less than end timer (");
                sb2.append(optInt4);
                sb2.append(")");
                str2 = sb2.toString();
            } else {
                C25688c9 m44071a = C25688c9.m44071a(str, optInt2, optInt, jSONObject.optBoolean("mrc", true));
                m44071a.m44070b(optInt3);
                m44071a.m44072a(optInt4);
                return m44071a;
            }
            sb2.append(str3);
            sb2.append(optInt3);
            str2 = sb2.toString();
        } else {
            str2 = "failed to parse viewabilityStat: invalid viewable percent value";
        }
        m43844a("Bad value", str2);
        return null;
    }

    /* renamed from: b */
    public final C25689ca m44206b(JSONObject jSONObject, String str) {
        if (!str.contains("[CONTENTPLAYHEAD]")) {
            m43844a("Required field", "failed to parse researchTimerStat: no [CONTENTPLAYHEAD] macros");
            return null;
        }
        int optInt = jSONObject.optInt("startTimer", 0);
        int optInt2 = jSONObject.optInt("endTimer", 0);
        if (optInt < 0) {
            m43844a("Bad value", "failed to parse researchTimerStat: wrong start timer " + optInt);
            return null;
        } else if (optInt2 < 0) {
            m43844a("Bad value", "failed to parse researchTimerStat: wrong end timer " + optInt);
            return null;
        } else if (optInt2 == 0 || optInt < optInt2) {
            C25660b9 m44154a = C25660b9.m44154a(str);
            m44154a.m44153b(jSONObject.optInt("rate", 1));
            m44154a.m44152c(optInt);
            m44154a.m44155a(optInt2);
            return m44154a;
        } else {
            m43844a("Bad value", "failed to parse researchTimerStat: start timer (" + optInt + ") cannot be less than end timer (" + optInt + ")");
            return null;
        }
    }
}
