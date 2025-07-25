package com.meevii.push.notification;

import android.content.Context;

/* renamed from: com.meevii.push.notification.a */
/* loaded from: classes5.dex */
public interface IDisplayPush {
    boolean isForegroundShow(IDisplayPushData iDisplayPushData);

    boolean show(Context context, IDisplayPushData iDisplayPushData);
}
