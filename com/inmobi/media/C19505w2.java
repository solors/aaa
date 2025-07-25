package com.inmobi.media;

import com.inmobi.commons.core.configs.Config;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.w2 */
/* loaded from: classes6.dex */
public final class C19505w2 {

    /* renamed from: a */
    public final Config f48788a;

    /* renamed from: b */
    public final int f48789b;

    /* renamed from: c */
    public C19421q2 f48790c;

    public C19505w2(JSONObject jSONObject, Config config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f48788a = config;
        int i = -1;
        this.f48789b = -1;
        if (jSONObject != null) {
            try {
                int i2 = jSONObject.getInt("status");
                if (i2 != 200) {
                    if (i2 != 304) {
                        int i3 = 404;
                        if (i2 != 404) {
                            i3 = 500;
                            if (i2 != 500) {
                            }
                        }
                        i = i3;
                    } else {
                        i = 304;
                    }
                } else {
                    i = 200;
                }
                this.f48789b = i;
                if (i == 200) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("content");
                    C19267f2 c19267f2 = Config.Companion;
                    String type = config.getType();
                    Intrinsics.m17074g(jSONObject2);
                    String accountId$media_release = config.getAccountId$media_release();
                    long currentTimeMillis = System.currentTimeMillis();
                    c19267f2.getClass();
                    Config m60362a = C19267f2.m60362a(type, jSONObject2, accountId$media_release, currentTimeMillis);
                    if (m60362a == null) {
                        this.f48790c = new C19421q2((byte) 3, "The received config has failed backend contract.");
                    } else {
                        this.f48788a = m60362a;
                    }
                    Intrinsics.checkNotNullExpressionValue("x2", "access$getTAG$cp(...)");
                    this.f48788a.getType();
                    this.f48788a.isValid();
                    if (!this.f48788a.isValid()) {
                        C19421q2 c19421q2 = new C19421q2((byte) 2, "The received config has failed validation.");
                        Intrinsics.checkNotNullExpressionValue("x2", "access$getTAG$cp(...)");
                        this.f48788a.getType();
                        this.f48790c = c19421q2;
                    }
                } else if (i == 304) {
                    Intrinsics.checkNotNullExpressionValue("x2", "access$getTAG$cp(...)");
                    config.getType();
                } else {
                    C19421q2 c19421q22 = new C19421q2((byte) 1, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR);
                    Intrinsics.checkNotNullExpressionValue("x2", "access$getTAG$cp(...)");
                    config.getType();
                    this.f48790c = c19421q22;
                }
            } catch (JSONException e) {
                String localizedMessage = e.getLocalizedMessage();
                C19421q2 c19421q23 = new C19421q2((byte) 2, localizedMessage == null ? "Exception in config validation" : localizedMessage);
                this.f48788a.getType();
                this.f48790c = c19421q23;
            }
        }
    }
}
