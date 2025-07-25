package p809o2;

import android.app.PendingIntent;
import android.content.Context;

/* renamed from: o2.c */
/* loaded from: classes5.dex */
public class HSPluginEventBridge {

    /* renamed from: a */
    private static InterfaceC38857a f102273a;

    /* compiled from: HSPluginEventBridge.java */
    /* renamed from: o2.c$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC38857a {
        PendingIntent getPendingIntentForNotification(Context context, PendingIntent pendingIntent);

        boolean shouldCallFirstForegroundEvent();
    }

    /* renamed from: a */
    public static PendingIntent m13991a(Context context, PendingIntent pendingIntent) {
        InterfaceC38857a interfaceC38857a = f102273a;
        if (interfaceC38857a != null) {
            return interfaceC38857a.getPendingIntentForNotification(context, pendingIntent);
        }
        return pendingIntent;
    }

    /* renamed from: b */
    public static void m13990b(InterfaceC38857a interfaceC38857a) {
        f102273a = interfaceC38857a;
    }

    /* renamed from: c */
    public static boolean m13989c() {
        InterfaceC38857a interfaceC38857a = f102273a;
        if (interfaceC38857a != null) {
            return interfaceC38857a.shouldCallFirstForegroundEvent();
        }
        return false;
    }
}
