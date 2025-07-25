package com.learnings.unity.push;

import com.meevii.push.notification.IDisplayPushData;
import com.meevii.push.notification.RemoteNotification;

/* loaded from: classes6.dex */
public class UnityRemoteNotification extends RemoteNotification {
    public UnityRemoteNotification(int i) {
        super(Integer.valueOf(i));
    }

    @Override // com.meevii.push.notification.RemoteNotification, com.meevii.push.notification.IDisplayPush
    public boolean isForegroundShow(IDisplayPushData iDisplayPushData) {
        return super.isForegroundShow(iDisplayPushData);
    }
}
