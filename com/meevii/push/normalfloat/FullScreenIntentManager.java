package com.meevii.push.normalfloat;

import android.content.Context;
import android.content.Intent;
import com.meevii.push.notification.IDisplayPushData;

/* loaded from: classes5.dex */
public class FullScreenIntentManager {
    private FullScreenIntentProvider mFullScreenIntentProvider;

    /* loaded from: classes5.dex */
    private static class Holder {
        private static final FullScreenIntentManager singleton = new FullScreenIntentManager();

        private Holder() {
        }
    }

    public static FullScreenIntentManager get() {
        return Holder.singleton;
    }

    public Intent getIntent(Context context, Intent intent, IDisplayPushData iDisplayPushData) {
        FullScreenIntentProvider fullScreenIntentProvider = this.mFullScreenIntentProvider;
        if (fullScreenIntentProvider != null) {
            return fullScreenIntentProvider.getIntent(context, intent, iDisplayPushData);
        }
        return new Intent();
    }

    public void setIntentProvider(FullScreenIntentProvider fullScreenIntentProvider) {
        this.mFullScreenIntentProvider = fullScreenIntentProvider;
    }

    private FullScreenIntentManager() {
    }
}
