package com.applovin.impl.adview;

import android.webkit.WebSettings;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.adview.m */
/* loaded from: classes2.dex */
public final class C4044m {

    /* renamed from: a */
    private final JSONObject f4689a;

    public C4044m(JSONObject jSONObject) {
        this.f4689a = jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public Integer m100830a() {
        String string = JsonUtils.getString(this.f4689a, "mixed_content_mode", null);
        if (StringUtils.isValidString(string)) {
            if ("always_allow".equalsIgnoreCase(string)) {
                return 0;
            }
            if ("never_allow".equalsIgnoreCase(string)) {
                return 1;
            }
            if ("compatibility_mode".equalsIgnoreCase(string)) {
                return 2;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public WebSettings.PluginState m100829b() {
        String string = JsonUtils.getString(this.f4689a, "plugin_state", null);
        if (StringUtils.isValidString(string)) {
            if ("on".equalsIgnoreCase(string)) {
                return WebSettings.PluginState.ON;
            }
            if ("on_demand".equalsIgnoreCase(string)) {
                return WebSettings.PluginState.ON_DEMAND;
            }
            if ("off".equalsIgnoreCase(string)) {
                return WebSettings.PluginState.OFF;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public Boolean m100828c() {
        return JsonUtils.getBoolean(this.f4689a, "geolocation_enabled", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public Boolean m100827d() {
        return JsonUtils.getBoolean(this.f4689a, "allow_content_access", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public Boolean m100826e() {
        return JsonUtils.getBoolean(this.f4689a, "allow_file_access", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public Boolean m100825f() {
        return JsonUtils.getBoolean(this.f4689a, "allow_file_access_from_file_urls", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public Boolean m100824g() {
        return JsonUtils.getBoolean(this.f4689a, "allow_universal_access_from_file_urls", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public Boolean m100823h() {
        return JsonUtils.getBoolean(this.f4689a, "display_zoom_controls", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public Boolean m100822i() {
        return JsonUtils.getBoolean(this.f4689a, "load_with_overview_mode", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public Boolean m100821j() {
        return JsonUtils.getBoolean(this.f4689a, "need_initial_focus", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public Boolean m100820k() {
        return JsonUtils.getBoolean(this.f4689a, "offscreen_pre_raster", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public Boolean m100819l() {
        return JsonUtils.getBoolean(this.f4689a, "save_form_data", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public Boolean m100818m() {
        return JsonUtils.getBoolean(this.f4689a, "algorithmic_darkening_allowed", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public Boolean m100817n() {
        return JsonUtils.getBoolean(this.f4689a, "block_network_image", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public Boolean m100816o() {
        return JsonUtils.getBoolean(this.f4689a, "loads_images_automatically", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public Boolean m100815p() {
        return JsonUtils.getBoolean(this.f4689a, "use_built_in_zoom_controls", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public Boolean m100814q() {
        return JsonUtils.getBoolean(this.f4689a, "use_wide_view_port", null);
    }
}
