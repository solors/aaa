package p1039x6;

import p1010v6.LocalPushData;

/* renamed from: x6.b */
/* loaded from: classes5.dex */
public class DefaultNotificationChannelProvider implements INotificationChannelProvider {
    @Override // p1039x6.INotificationChannelProvider
    /* renamed from: a */
    public String mo1905a(LocalPushData localPushData) {
        return DefaultDisplayNotification.DEFAULT_CHANNEL_NAME;
    }

    @Override // p1039x6.INotificationChannelProvider
    /* renamed from: b */
    public String mo1904b(LocalPushData localPushData) {
        return DefaultDisplayNotification.DEFAULT_CHANNEL_ID;
    }
}
