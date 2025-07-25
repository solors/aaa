package com.inmobi.media;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.w4 */
/* loaded from: classes6.dex */
public final class C19507w4 extends AbstractC19504w1 {

    /* renamed from: c */
    public static final C19507w4 f48817c = new C19507w4();

    /* renamed from: d */
    public static final AtomicBoolean f48818d = new AtomicBoolean(true);

    /* renamed from: a */
    public final JSONObject m59624a() {
        JSONObject jSONObject = new JSONObject();
        AtomicBoolean atomicBoolean = f48818d;
        jSONObject.put("a-audioBannerEnabled", String.valueOf(atomicBoolean.get()));
        if (!atomicBoolean.get()) {
            return jSONObject;
        }
        long j = this.f48786a / 1000;
        if (j != 0) {
            jSONObject.put("a-lastAudioBannerPlayedTs", String.valueOf(j));
        }
        int i = this.f48787b;
        if (i > 0) {
            jSONObject.put("a-audioBannerFreq", String.valueOf(i));
        }
        Context m61068d = C18954Ha.m61068d();
        if (m61068d != null) {
            ConcurrentHashMap concurrentHashMap = C19508w5.f48819b;
            C19508w5 m59823a = AbstractC19494v5.m59823a(m61068d, "banner_audio_pref_file");
            Intrinsics.checkNotNullParameter("user_mute_count", "key");
            int i2 = m59823a.f48820a.getInt("user_mute_count", -1);
            if (i2 > 0) {
                jSONObject.put("a-b-umc", String.valueOf(i2));
            }
        }
        return jSONObject;
    }
}
