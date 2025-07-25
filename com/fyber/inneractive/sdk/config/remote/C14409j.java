package com.fyber.inneractive.sdk.config.remote;

import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.Skip;
import com.fyber.inneractive.sdk.config.enums.TapAction;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.smaato.sdk.video.vast.model.MediaFile;
import java.util.ArrayList;
import net.pubnative.lite.sdk.vpaid.enums.EventConstants;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.remote.j */
/* loaded from: classes4.dex */
public final class C14409j {

    /* renamed from: a */
    public Boolean f27260a;

    /* renamed from: b */
    public Integer f27261b;

    /* renamed from: c */
    public Integer f27262c;

    /* renamed from: d */
    public Skip f27263d;

    /* renamed from: e */
    public Boolean f27264e;

    /* renamed from: f */
    public TapAction f27265f;

    /* renamed from: g */
    public Orientation f27266g;

    /* renamed from: h */
    public Integer f27267h;

    /* renamed from: i */
    public Integer f27268i;

    /* renamed from: j */
    public UnitDisplayType f27269j;

    /* renamed from: k */
    public final ArrayList f27270k = new ArrayList();

    /* renamed from: a */
    public static C14409j m77910a(JSONObject jSONObject) {
        Boolean bool;
        Boolean bool2;
        Integer num = null;
        if (jSONObject == null) {
            return null;
        }
        C14409j c14409j = new C14409j();
        int optInt = jSONObject.optInt(MediaFile.MAX_BITRATE, Integer.MIN_VALUE);
        Integer valueOf = Integer.valueOf(optInt);
        int optInt2 = jSONObject.optInt(MediaFile.MIN_BITRATE, Integer.MIN_VALUE);
        Integer valueOf2 = Integer.valueOf(optInt2);
        int optInt3 = jSONObject.optInt("pivotBitrate", Integer.MIN_VALUE);
        Integer valueOf3 = Integer.valueOf(optInt3);
        int optInt4 = jSONObject.optInt("padding", Integer.MIN_VALUE);
        Integer valueOf4 = Integer.valueOf(optInt4);
        if (optInt == Integer.MIN_VALUE) {
            valueOf = null;
        }
        c14409j.f27261b = valueOf;
        if (optInt2 == Integer.MIN_VALUE) {
            valueOf2 = null;
        }
        c14409j.f27262c = valueOf2;
        c14409j.f27263d = Skip.fromValue(Integer.valueOf(jSONObject.optInt(EventConstants.SKIP, Integer.MIN_VALUE)));
        if (jSONObject.has("muted")) {
            bool = Boolean.valueOf(jSONObject.optBoolean("muted", true));
        } else {
            bool = null;
        }
        c14409j.f27264e = bool;
        if (jSONObject.has("autoPlay")) {
            bool2 = Boolean.valueOf(jSONObject.optBoolean("autoPlay", true));
        } else {
            bool2 = null;
        }
        c14409j.f27260a = bool2;
        c14409j.f27266g = Orientation.fromValue(jSONObject.optString("orientation"));
        c14409j.f27265f = TapAction.fromValue(jSONObject.optString("tap"));
        if (optInt3 == Integer.MIN_VALUE) {
            valueOf3 = null;
        }
        c14409j.f27267h = valueOf3;
        if (optInt4 != Integer.MIN_VALUE) {
            num = valueOf4;
        }
        c14409j.f27268i = num;
        c14409j.f27269j = UnitDisplayType.fromValue(jSONObject.optString("unitDisplayType"));
        JSONArray optJSONArray = jSONObject.optJSONArray("filterApi");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                int optInt5 = optJSONArray.optInt(i, Integer.MIN_VALUE);
                if (optInt5 != Integer.MIN_VALUE) {
                    c14409j.f27270k.add(Integer.valueOf(optInt5));
                }
            }
        }
        return c14409j;
    }
}
