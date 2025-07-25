package com.fyber.inneractive.sdk.display;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.display.c */
/* loaded from: classes4.dex */
public final class C14421c extends AbstractC14419a {
    @Override // com.fyber.inneractive.sdk.display.AbstractC14419a
    /* renamed from: a */
    public final void mo77908a(Activity activity, InneractiveAdSpot inneractiveAdSpot, String str) {
        Intent intent = new Intent(activity, InneractiveFullscreenAdActivity.class);
        intent.putExtra("spotId", inneractiveAdSpot.getLocalUniqueId());
        try {
            IAlog.m76529a("%sIAInterstitialUtil: Opening interstitial for spot id: %s", IAlog.m76531a(activity), inneractiveAdSpot.getLocalUniqueId());
            activity.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            IAlog.m76527c("%sIAInterstitialUtil: InneractiveFullscreenAdActivity.class not found. Did you declare InneractiveFullscreenAdActivity in your manifest?", IAlog.m76531a(activity));
        }
    }
}
