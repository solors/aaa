package com.p551my.tracker.campaign;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import com.p551my.tracker.obfuscated.C26325g;
import com.p551my.tracker.obfuscated.C26448w;
import com.p551my.tracker.obfuscated.C26468z0;

/* renamed from: com.my.tracker.campaign.CampaignService */
/* loaded from: classes7.dex */
public final class CampaignService extends Service {
    /* renamed from: a */
    public static /* synthetic */ void m42222a(CampaignService campaignService, String str, Runnable runnable) {
        campaignService.m42221a(str, runnable);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        C26468z0.m41528a("CampaignService: onCreate");
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        C26468z0.m41528a("CampaignService: onDestroy");
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        final Runnable runnable = new Runnable() { // from class: com.my.tracker.campaign.a
            @Override // java.lang.Runnable
            public final void run() {
                CampaignService.this.stopSelf();
            }
        };
        if (intent != null) {
            final String stringExtra = intent.getStringExtra("referrer");
            if (!TextUtils.isEmpty(stringExtra)) {
                C26325g.m42073a(new Runnable() { // from class: com.my.tracker.campaign.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        CampaignService.m42222a(CampaignService.this, stringExtra, runnable);
                    }
                });
                return super.onStartCommand(null, i, i2);
            }
        }
        C26325g.m42073a(runnable);
        return 2;
    }

    /* renamed from: a */
    public /* synthetic */ void m42221a(String str, Runnable runnable) {
        C26448w.m41561a(str, this, runnable);
    }
}
