package com.amazon.device.simplesignin.p107a.p117d;

import com.amazon.device.simplesignin.model.Link;
import com.amazon.device.simplesignin.model.Token;
import com.amazon.device.simplesignin.p107a.p108a.C3729a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.amazon.device.simplesignin.a.d.b */
/* loaded from: classes2.dex */
public final class ResponseModelGenerator {

    /* renamed from: a */
    private static final String f3440a = "b";

    private ResponseModelGenerator() {
    }

    /* renamed from: a */
    public static List<Link> m102304a(String str, String str2) {
        try {
            JSONArray jSONArray = new JSONArray(str2);
            if (jSONArray.length() == 0) {
                C3737a.m102308a(f3440a, "No links available, links object received is empty.");
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList(jSONArray.length());
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject jSONObject = (JSONObject) jSONArray.get(i);
                    Link link = new Link();
                    link.setAmazonUserId(str);
                    link.setIdentityProviderName(jSONObject.getString(C3729a.f3376z));
                    link.setLinkId(jSONObject.getString(C3729a.f3375y));
                    link.setPartnerUserId(jSONObject.getString(C3729a.f3339A));
                    link.setLinkedTimestamp(jSONObject.getLong(C3729a.f3340B));
                    Token token = new Token();
                    JSONObject jSONObject2 = new JSONObject(jSONObject.getString(C3729a.f3341C));
                    token.setToken(jSONObject2.getString("token"));
                    token.setSchema(jSONObject2.getString(C3729a.f3343E));
                    link.setSsiToken(token);
                    arrayList.add(link);
                } catch (JSONException e) {
                    String str3 = f3440a;
                    C3737a.m102306b(str3, "Failure generating Link object from response." + e);
                    return null;
                }
            }
            return arrayList;
        } catch (JSONException e2) {
            String str4 = f3440a;
            C3737a.m102306b(str4, "Failure generating Link object from Kiwi response." + e2);
            return null;
        }
    }

    /* renamed from: a */
    public static String m102305a(String str) {
        try {
            return new JSONObject(str).getString(C3729a.f3375y);
        } catch (JSONException e) {
            String str2 = f3440a;
            C3737a.m102306b(str2, "Failure extracting Link ID object from response." + e);
            return null;
        }
    }
}
