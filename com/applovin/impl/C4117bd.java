package com.applovin.impl;

import android.graphics.Color;
import androidx.core.view.ViewCompat;
import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.bd */
/* loaded from: classes2.dex */
public class C4117bd {

    /* renamed from: a */
    private final JSONObject f4993a;

    public C4117bd(JSONObject jSONObject) {
        this.f4993a = jSONObject == null ? new JSONObject() : jSONObject;
    }

    /* renamed from: a */
    public int m100474a() {
        String string = JsonUtils.getString(this.f4993a, "background_color", null);
        if (string != null) {
            return Color.parseColor(string);
        }
        return ViewCompat.MEASURED_STATE_MASK;
    }

    /* renamed from: b */
    public long m100473b() {
        return JsonUtils.getLong(this.f4993a, "close_button_delay_ms", 3000L);
    }

    /* renamed from: c */
    public int m100472c() {
        return JsonUtils.getInt(this.f4993a, "close_button_extended_touch_area_size", 10);
    }

    /* renamed from: d */
    public int m100471d() {
        return JsonUtils.getInt(this.f4993a, "close_button_h_margin", 5);
    }

    /* renamed from: e */
    public int m100470e() {
        return JsonUtils.getInt(this.f4993a, "close_button_size", 30);
    }

    /* renamed from: f */
    public int m100469f() {
        return JsonUtils.getInt(this.f4993a, "close_button_top_margin", 20);
    }
}
