package com.mbridge.msdk.video.module.p530a.p531a;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.click.CommonClickUtil;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.SameLogTool;

/* renamed from: com.mbridge.msdk.video.module.a.a.a */
/* loaded from: classes6.dex */
public class CommonContainerNotifyListener extends DefaultOnNotifyListener {

    /* renamed from: a */
    private Activity f60799a;

    /* renamed from: b */
    private CampaignEx f60800b;

    public CommonContainerNotifyListener(Activity activity, CampaignEx campaignEx) {
        this.f60799a = activity;
        this.f60800b = campaignEx;
    }

    @Override // com.mbridge.msdk.video.module.p530a.p531a.DefaultOnNotifyListener, com.mbridge.msdk.video.module.p530a.OnNotifyListener
    /* renamed from: a */
    public void mo48633a(int i, Object obj) {
        super.mo48633a(i, obj);
        if (i == 106 && this.f60799a != null && this.f60800b != null) {
            try {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                String m53168a = CommonClickUtil.m53168a(this.f60800b.getClickURL(), "-999", "-999");
                if (!TextUtils.isEmpty(m53168a)) {
                    intent.setData(Uri.parse(m53168a));
                    this.f60799a.startActivity(intent);
                }
            } catch (Throwable th) {
                SameLogTool.m51823b("NotifyListener", th.getMessage(), th);
            }
            this.f60799a.finish();
        }
    }
}
