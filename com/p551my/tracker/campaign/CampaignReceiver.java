package com.p551my.tracker.campaign;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.p551my.tracker.obfuscated.C26468z0;

/* renamed from: com.my.tracker.campaign.CampaignReceiver */
/* loaded from: classes7.dex */
public class CampaignReceiver extends BroadcastReceiver {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m42223a(Context context, Intent intent) {
        Bundle extras;
        if (intent == null || (extras = intent.getExtras()) == null) {
            return;
        }
        String string = extras.getString("referrer");
        if (TextUtils.isEmpty(string)) {
            C26468z0.m41528a("CampaignReceiver: referrer is null or empty");
            return;
        }
        C26468z0.m41528a("CampaignReceiver: got referrer " + string);
        try {
            context.startService(new Intent(context, CampaignService.class).putExtra("referrer", string));
        } catch (Throwable th) {
            C26468z0.m41525b("CampaignReceiver error: " + th.toString());
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        m42223a(context, intent);
    }
}
