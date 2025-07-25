package com.mbridge.msdk.newreward.function.p485c.p488c;

import android.text.TextUtils;
import com.mbridge.msdk.newreward.function.p485c.p486a.MBridgeCampaign;
import com.mbridge.msdk.newreward.function.p485c.p486a.MBridgeCampaigns;

/* renamed from: com.mbridge.msdk.newreward.function.c.c.a */
/* loaded from: classes6.dex */
public abstract class BaseCampaignResource<Resource> implements ICampaignResource {

    /* renamed from: b */
    private final MBridgeCampaigns f58334b;

    /* renamed from: c */
    private final MBridgeCampaign f58335c;

    /* renamed from: d */
    private int f58336d = 0;

    /* renamed from: e */
    private boolean f58337e = false;

    /* renamed from: f */
    private boolean f58338f = false;

    /* renamed from: a */
    protected boolean f58333a = false;

    public BaseCampaignResource(MBridgeCampaigns mBridgeCampaigns, MBridgeCampaign mBridgeCampaign) {
        this.f58334b = mBridgeCampaigns;
        this.f58335c = mBridgeCampaign;
    }

    /* renamed from: a */
    public abstract Resource mo50504a();

    /* renamed from: a */
    public final void m50517a(boolean z) {
        this.f58333a = z;
    }

    /* renamed from: b */
    public final MBridgeCampaigns m50516b() {
        return this.f58334b;
    }

    /* renamed from: c */
    public final MBridgeCampaign m50514c() {
        return this.f58335c;
    }

    /* renamed from: d */
    public boolean mo50509d() {
        if (!TextUtils.isEmpty(mo50499j()) && !mo50500h() && !this.f58337e) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public boolean mo50508e() {
        if (!TextUtils.isEmpty(mo50499j()) && !mo50498k() && !this.f58338f) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final int m50513f() {
        return this.f58336d;
    }

    @Override // com.mbridge.msdk.newreward.function.p485c.p488c.ICampaignResource
    /* renamed from: j */
    public abstract /* synthetic */ String mo50499j();

    @Override // com.mbridge.msdk.newreward.function.p485c.p488c.ICampaignResource
    /* renamed from: l */
    public abstract /* synthetic */ MBridgeBaseDownloader mo50497l();

    /* renamed from: a */
    public final void m50518a(int i) {
        this.f58336d = i;
    }

    /* renamed from: b */
    public final void m50515b(boolean z) {
        this.f58337e = z;
    }
}
