package com.fyber.inneractive.sdk.config.remote;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.enums.Vendor;
import com.smaato.sdk.video.vast.model.Verification;
import java.util.LinkedHashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.remote.k */
/* loaded from: classes4.dex */
public final class C14410k {

    /* renamed from: a */
    public Integer f27271a;

    /* renamed from: b */
    public Integer f27272b;

    /* renamed from: c */
    public Set f27273c = null;

    /* renamed from: a */
    public static C14410k m77909a(JSONObject jSONObject) {
        Vendor fromValue;
        if (jSONObject == null) {
            return null;
        }
        int optInt = jSONObject.optInt("pausePct", Integer.MIN_VALUE);
        Integer valueOf = Integer.valueOf(optInt);
        int optInt2 = jSONObject.optInt("playPct", Integer.MIN_VALUE);
        Integer valueOf2 = Integer.valueOf(optInt2);
        C14410k c14410k = new C14410k();
        if (optInt == Integer.MIN_VALUE) {
            valueOf = null;
        }
        c14410k.f27271a = valueOf;
        if (optInt2 == Integer.MIN_VALUE) {
            valueOf2 = null;
        }
        c14410k.f27272b = valueOf2;
        JSONArray optJSONArray = jSONObject.optJSONArray(Verification.VENDOR);
        if (optJSONArray != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i = 0; i < optJSONArray.length(); i++) {
                String optString = optJSONArray.optString(i, null);
                if (!TextUtils.isEmpty(optString) && (fromValue = Vendor.fromValue(optString)) != null) {
                    linkedHashSet.add(fromValue);
                }
            }
            c14410k.f27273c = linkedHashSet;
        }
        return c14410k;
    }
}
