package com.p551my.target;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.my.target.i9 */
/* loaded from: classes7.dex */
public final class C25825i9 {

    /* renamed from: a */
    public final Context f67009a;

    /* renamed from: b */
    public final C26073s f67010b;

    /* renamed from: c */
    public final C25832j f67011c;

    public C25825i9(C26073s c26073s, C25832j c25832j, Context context) {
        this.f67010b = c26073s;
        this.f67011c = c25832j;
        this.f67009a = context;
    }

    /* renamed from: a */
    public static C25825i9 m43742a(C26073s c26073s, C25832j c25832j, Context context) {
        return new C25825i9(c26073s, c25832j, context);
    }

    /* renamed from: a */
    public C25802h9 m43740a(JSONObject jSONObject, String str) {
        String str2;
        C25711da m43995c = C25711da.m43995c();
        C25778ga m43846a = C25778ga.m43846a(this.f67010b, this.f67011c, this.f67009a);
        boolean has = jSONObject.has("statistics");
        if (has) {
            m43846a.m43847a(m43995c, jSONObject, str, -1.0f);
        }
        JSONArray optJSONArray = jSONObject.optJSONArray(FirebaseAnalytics.Param.ITEMS);
        if (optJSONArray == null) {
            str2 = "ShoppableAdsDataParser: can't parse – ShoppableAdItems'";
        } else {
            int length = optJSONArray.length();
            if (length == 0) {
                str2 = "ShoppableAdsDataParser: can't parse – shoppableAdItems size is 0";
            } else {
                ArrayList arrayList = new ArrayList();
                int i = 0;
                while (true) {
                    if (i < length) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                        if (optJSONObject == null) {
                            AbstractC25846ja.m43680a("ShoppableAdsDataParser: can't parse – hasn't shoppableItemJson");
                        } else {
                            C25977o3 m43741a = m43741a(optJSONObject, m43846a, str);
                            if (m43741a == null) {
                                str2 = "ShoppableAdsDataParser: can't parse shoppableAdsItem";
                                break;
                            }
                            arrayList.add(m43741a);
                        }
                        i++;
                    } else if (arrayList.size() == 0) {
                        str2 = "ShoppableAdsDataParser: can't parse – no one valid shoppableAdItem";
                    } else if (!has || m43995c.m43997b("shoppableAdsItemShow").size() != 0 || m43995c.m43997b("show").size() != 0) {
                        return C25802h9.m43785a(arrayList, m43995c);
                    } else {
                        str2 = "ShoppableAdsDataParser: hasn't show stat'";
                    }
                }
            }
        }
        AbstractC25846ja.m43680a(str2);
        return null;
    }

    /* renamed from: a */
    public C25977o3 m43741a(JSONObject jSONObject, C25778ga c25778ga, String str) {
        try {
            String string = jSONObject.getString("url");
            if (TextUtils.isEmpty(string)) {
                AbstractC25846ja.m43680a("ShoppableAdsDataParser: can't parse ShoppableAdsItem – hasn't url");
                return null;
            }
            String string2 = jSONObject.getString("id");
            if (TextUtils.isEmpty(string2)) {
                AbstractC25846ja.m43680a("ShoppableAdsDataParser: can't parse ShoppableAdsItem – hasn't id");
                return null;
            }
            String string3 = jSONObject.getString("picture");
            if (TextUtils.isEmpty(string3)) {
                AbstractC25846ja.m43680a("ShoppableAdsDataParser: can't parse ShoppableAdsItem – hasn't picture");
                return null;
            }
            String string4 = jSONObject.getString("text");
            if (TextUtils.isEmpty(string4)) {
                AbstractC25846ja.m43680a("ShoppableAdsDataParser: can't parse ShoppableAdsItem – hasn't text");
                return null;
            }
            String string5 = jSONObject.has("oldPrice") ? jSONObject.getString("oldPrice") : null;
            String string6 = jSONObject.has("price") ? jSONObject.getString("price") : null;
            String string7 = jSONObject.has(SDKConstants.PARAM_TOURNAMENTS_DEEPLINK) ? jSONObject.getString(SDKConstants.PARAM_TOURNAMENTS_DEEPLINK) : null;
            String string8 = jSONObject.has("deeplink_fallback_url") ? jSONObject.getString("deeplink_fallback_url") : null;
            C25711da m43995c = C25711da.m43995c();
            c25778ga.m43847a(m43995c, jSONObject, str, -1.0f);
            return C25977o3.m43266a(string, string2, string3, string4, string6, string5, string7, string8, m43995c);
        } catch (Throwable th) {
            AbstractC25846ja.m43680a("ShoppableAdsDataParser: can't parse ShoppableAdsItem – " + th.getMessage());
            return null;
        }
    }
}
