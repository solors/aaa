package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.Skip;
import com.fyber.inneractive.sdk.config.enums.TapAction;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.util.AbstractC15438b0;
import com.fyber.inneractive.sdk.util.InterfaceC15436a0;
import com.smaato.sdk.video.vast.model.MediaFile;
import java.util.ArrayList;
import java.util.List;
import net.pubnative.lite.sdk.vpaid.enums.EventConstants;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.V */
/* loaded from: classes4.dex */
public final class C14328V implements InterfaceC15436a0 {

    /* renamed from: a */
    public Boolean f27127a;

    /* renamed from: b */
    public Integer f27128b;

    /* renamed from: c */
    public Integer f27129c;

    /* renamed from: d */
    public Boolean f27130d;

    /* renamed from: e */
    public Orientation f27131e;

    /* renamed from: f */
    public Integer f27132f;

    /* renamed from: g */
    public Integer f27133g;

    /* renamed from: h */
    public Skip f27134h;

    /* renamed from: i */
    public TapAction f27135i;

    /* renamed from: j */
    public UnitDisplayType f27136j;

    /* renamed from: k */
    public List f27137k;

    public C14328V() {
        Boolean bool = Boolean.TRUE;
        this.f27127a = bool;
        this.f27128b = 5000;
        this.f27129c = 0;
        this.f27130d = bool;
        this.f27132f = 0;
        this.f27133g = 2048;
        this.f27134h = Skip.fromValue(0);
        this.f27137k = new ArrayList();
    }

    @Override // com.fyber.inneractive.sdk.util.InterfaceC15436a0
    /* renamed from: a */
    public final JSONObject mo76509a() {
        JSONObject jSONObject = new JSONObject();
        AbstractC15438b0.m76508a(jSONObject, "autoPlay", this.f27127a);
        AbstractC15438b0.m76508a(jSONObject, MediaFile.MAX_BITRATE, this.f27128b);
        AbstractC15438b0.m76508a(jSONObject, MediaFile.MIN_BITRATE, this.f27129c);
        AbstractC15438b0.m76508a(jSONObject, "muted", this.f27130d);
        AbstractC15438b0.m76508a(jSONObject, "orientation", this.f27131e);
        AbstractC15438b0.m76508a(jSONObject, "padding", this.f27132f);
        AbstractC15438b0.m76508a(jSONObject, "pivotBitrate", this.f27133g);
        AbstractC15438b0.m76508a(jSONObject, EventConstants.SKIP, this.f27134h);
        AbstractC15438b0.m76508a(jSONObject, "tapAction", this.f27135i);
        AbstractC15438b0.m76508a(jSONObject, "unitDisplayType", this.f27136j);
        JSONArray jSONArray = new JSONArray();
        List<Integer> list = this.f27137k;
        if (list != null) {
            for (Integer num : list) {
                if (num != null) {
                    jSONArray.put(num);
                }
            }
        }
        AbstractC15438b0.m76508a(jSONObject, "filterApi", jSONArray);
        return jSONObject;
    }
}
