package com.mbridge.msdk.newreward.function.p485c.p487b;

import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.mbridge.msdk.tracker.network.AbstractC22898ad;
import com.mbridge.msdk.tracker.network.AbstractC22930u;
import com.mbridge.msdk.tracker.network.C22913r;
import com.mbridge.msdk.tracker.network.C22937w;
import com.mbridge.msdk.tracker.network.EncodingError;
import com.mbridge.msdk.tracker.network.ResponseError;
import com.mbridge.msdk.tracker.network.UnKnownError;
import com.mbridge.msdk.tracker.network.toolbox.C22921f;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.newreward.function.c.b.h */
/* loaded from: classes6.dex */
public final class RewardSettingRequest extends AbstractC22930u<JSONObject> implements C22937w.InterfaceC22938a {

    /* renamed from: a */
    public static int f58328a = 0;

    /* renamed from: b */
    public static int f58329b = 1;

    /* renamed from: c */
    private JSONObjectRequestListener f58330c;

    /* renamed from: d */
    private HashMap<String, String> f58331d;

    /* renamed from: e */
    private Map<String, String> f58332e;

    public RewardSettingRequest(String str) {
        super(0, str, 0, "setting");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.tracker.network.AbstractC22930u
    /* renamed from: a */
    public final /* synthetic */ void mo49320a(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        JSONObjectRequestListener jSONObjectRequestListener = this.f58330c;
        if (jSONObjectRequestListener == null) {
            return;
        }
        try {
            if (jSONObject2 == null) {
                jSONObjectRequestListener.mo50528a(this, new CommonRequestError(-1));
            } else {
                jSONObjectRequestListener.mo50527a(jSONObject2, this);
            }
        } catch (Exception e) {
            SameLogTool.m51823b("RewardSettingRequest", "onError Exception: ", e);
        }
    }

    @Override // com.mbridge.msdk.tracker.network.AbstractC22930u
    /* renamed from: c */
    public final Map<String, String> mo49317c() {
        Map<String, String> map = this.f58332e;
        if (map == null) {
            HashMap hashMap = new HashMap();
            this.f58332e = hashMap;
            return hashMap;
        }
        map.put("Charset", "UTF-8");
        return this.f58332e;
    }

    @Override // com.mbridge.msdk.tracker.network.AbstractC22930u
    /* renamed from: d */
    public final boolean mo49316d() {
        return true;
    }

    /* renamed from: a */
    public final void m50521a(JSONObjectRequestListener jSONObjectRequestListener) {
        this.f58330c = jSONObjectRequestListener;
    }

    /* renamed from: a */
    public final void m50519a(Map<String, String> map) {
        if (this.f58331d == null) {
            this.f58331d = new HashMap<>();
        }
        if (map == null || map.isEmpty()) {
            return;
        }
        this.f58331d.putAll(map);
    }

    @Override // com.mbridge.msdk.tracker.network.AbstractC22930u
    /* renamed from: a */
    protected final Map<String, String> mo49325a() {
        if (this.f58331d == null) {
            this.f58331d = new HashMap<>();
        }
        return this.f58331d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.tracker.network.AbstractC22930u
    /* renamed from: a */
    public final C22937w<JSONObject> mo49324a(C22913r c22913r) {
        if (c22913r != null) {
            try {
                byte[] bArr = c22913r.f59817b;
                if (bArr != null && bArr.length != 0) {
                    return C22937w.m49373a(new JSONObject(new String(bArr, C22921f.m49441a(c22913r.f59818c))), C22921f.m49444a(c22913r));
                }
            } catch (UnsupportedEncodingException e) {
                SameLogTool.m51823b("RewardSettingRequest", "parseNetworkResponse UnsupportedEncodingException: ", e);
                return C22937w.m49374a(new EncodingError(e));
            } catch (Exception e2) {
                SameLogTool.m51823b("RewardSettingRequest", "parseNetworkResponse Exception: ", e2);
                return C22937w.m49374a(new UnKnownError(e2));
            }
        }
        return C22937w.m49374a(new ResponseError());
    }

    /* renamed from: a */
    public final void m50520a(String str, String str2) {
        if (this.f58332e == null) {
            this.f58332e = new HashMap();
        }
        this.f58332e.put(str, str2);
    }

    @Override // com.mbridge.msdk.tracker.network.C22937w.InterfaceC22938a
    /* renamed from: a */
    public final void mo49372a(AbstractC22898ad abstractC22898ad) {
        this.f58330c.mo50528a(this, new CommonRequestError(-1, abstractC22898ad.getMessage()));
    }
}
