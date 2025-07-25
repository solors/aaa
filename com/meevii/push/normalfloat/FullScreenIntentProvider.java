package com.meevii.push.normalfloat;

import android.content.Context;
import android.content.Intent;
import com.meevii.push.notification.IDisplayPushData;

/* loaded from: classes5.dex */
public abstract class FullScreenIntentProvider {
    public abstract Intent getIntent(Context context, Intent intent, IDisplayPushData iDisplayPushData);
}
