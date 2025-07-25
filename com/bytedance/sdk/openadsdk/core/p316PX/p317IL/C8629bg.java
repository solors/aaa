package com.bytedance.sdk.openadsdk.core.p316PX.p317IL;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.p316PX.p317IL.C8622bX;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.PX.IL.bg */
/* loaded from: classes3.dex */
public class C8629bg extends C8622bX implements Comparable<C8629bg> {

    /* renamed from: bg */
    public long f19032bg;

    /* renamed from: com.bytedance.sdk.openadsdk.core.PX.IL.bg$bg */
    /* loaded from: classes3.dex */
    public static class C8630bg {

        /* renamed from: IL */
        private final long f19033IL;

        /* renamed from: bg */
        private final String f19035bg;

        /* renamed from: bX */
        private C8622bX.EnumC8627bX f19034bX = C8622bX.EnumC8627bX.TRACKING_URL;
        private boolean eqN = false;

        public C8630bg(String str, long j) {
            this.f19035bg = str;
            this.f19033IL = j;
        }

        /* renamed from: bg */
        public C8629bg m85501bg() {
            return new C8629bg(this.f19033IL, this.f19035bg, this.f19034bX, Boolean.valueOf(this.eqN));
        }
    }

    protected C8629bg(long j, String str, C8622bX.EnumC8627bX enumC8627bX, Boolean bool) {
        super(str, enumC8627bX, bool);
        this.f19032bg = j;
    }

    /* renamed from: bg */
    public static int m85502bg(String str) {
        if (TextUtils.isEmpty(str)) {
            return Integer.MIN_VALUE;
        }
        String[] split = str.split(":");
        if (split.length == 3) {
            try {
                return (int) ((Integer.parseInt(split[0]) * 60 * 60 * 1000) + (Integer.parseInt(split[1]) * 60 * 1000) + (Float.parseFloat(split[2]) * 1000.0f));
            } catch (Throwable unused) {
            }
        }
        return Integer.MIN_VALUE;
    }

    /* renamed from: bg */
    public boolean m85504bg(long j) {
        return this.f19032bg <= j && !m85508zx();
    }

    @Override // java.lang.Comparable
    /* renamed from: bg */
    public int compareTo(C8629bg c8629bg) {
        if (c8629bg != null) {
            long j = this.f19032bg;
            long j2 = c8629bg.f19032bg;
            if (j > j2) {
                return 1;
            }
            return j < j2 ? -1 : 0;
        }
        return 1;
    }

    /* renamed from: bg */
    public JSONObject m85505bg() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("content", m85520bX());
        jSONObject.put("trackingMilliseconds", this.f19032bg);
        return jSONObject;
    }
}
