package com.meevii.soniclib.largepush;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.meevii.push.data.NotificationBean;
import com.meevii.push.normalfloat.FullScreenIntentProvider;
import com.meevii.push.notification.IDisplayPushData;
import p1010v6.LocalPushData;

/* loaded from: classes5.dex */
public class LargePushIntentProvider extends FullScreenIntentProvider {
    @Override // com.meevii.push.normalfloat.FullScreenIntentProvider
    public Intent getIntent(Context context, Intent intent, IDisplayPushData iDisplayPushData) {
        String m47978j;
        try {
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (!LargePushManager.isLargePushTest(context)) {
            return new Intent();
        }
        if (iDisplayPushData instanceof LocalPushData) {
            LocalPushData localPushData = (LocalPushData) iDisplayPushData;
            return getLargePushIntent(context, intent, LargePushManager.getLargeLocalPushData(context, localPushData.m2670f(), localPushData.m2673c()));
        }
        if (iDisplayPushData instanceof NotificationBean) {
            NotificationBean notificationBean = (NotificationBean) iDisplayPushData;
            LargePushData largeRemotePushData = LargePushManager.getLargeRemotePushData(context);
            if (largeRemotePushData != null) {
                largeRemotePushData.setPushId(notificationBean.m47976l());
                if (TextUtils.isEmpty(notificationBean.m47978j())) {
                    m47978j = "void";
                } else {
                    m47978j = notificationBean.m47978j();
                }
                largeRemotePushData.setContentId(m47978j);
            }
            return getLargePushIntent(context, intent, largeRemotePushData);
        }
        return new Intent();
    }

    Intent getLargePushIntent(Context context, Intent intent, LargePushData largePushData) {
        if (largePushData == null) {
            return new Intent();
        }
        Intent intent2 = new Intent(context, LargePushActivity.class);
        intent2.putExtra(LargePushActivity.LARGE_PUSH_DATA_KEY, largePushData);
        if (intent != null && intent.getExtras() != null) {
            intent2.putExtras(intent);
        }
        return intent2;
    }
}
