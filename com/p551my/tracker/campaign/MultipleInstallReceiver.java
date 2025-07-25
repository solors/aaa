package com.p551my.tracker.campaign;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import com.p551my.tracker.obfuscated.C26468z0;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.my.tracker.campaign.MultipleInstallReceiver */
/* loaded from: classes7.dex */
public class MultipleInstallReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private static final String f68448a = CampaignReceiver.class.getName();

    /* renamed from: b */
    private static final String f68449b = MultipleInstallReceiver.class.getName();

    /* renamed from: c */
    private static final AtomicBoolean f68450c = new AtomicBoolean();

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent != null && "com.android.vending.INSTALL_REFERRER".equals(intent.getAction())) {
            if (!f68450c.compareAndSet(false, true)) {
                C26468z0.m41528a("MultipleInstallReceiver: attempt to call, but it was called before");
                return;
            }
            C26468z0.m41528a("MultipleInstallReceiver called");
            CampaignReceiver.m42223a(context, intent);
            for (ResolveInfo resolveInfo : context.getPackageManager().queryBroadcastReceivers(new Intent("com.android.vending.INSTALL_REFERRER").setPackage(context.getPackageName()), 0)) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                if (activityInfo != null) {
                    String str = activityInfo.name;
                    if (!f68448a.equals(str) && !f68449b.equals(str)) {
                        C26468z0.m41528a("MultipleInstallReceiver: trigger onReceive class " + str);
                        try {
                            ((BroadcastReceiver) Class.forName(str).newInstance()).onReceive(context, intent);
                        } catch (Throwable th) {
                            C26468z0.m41528a("MultipleInstallReceiver: error in BroadcastReceiver " + str + " : " + th.getMessage());
                        }
                    }
                }
            }
        }
    }
}
