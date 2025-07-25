package sg.bigo.ads.common.p912f;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;

/* renamed from: sg.bigo.ads.common.f.a */
/* loaded from: classes10.dex */
public final class C43617a {

    /* renamed from: a */
    public static Context f114190a;

    /* renamed from: b */
    private static Context f114191b;

    /* renamed from: a */
    public static Context m5306a() {
        Context createWindowContext;
        if (Build.VERSION.SDK_INT >= 30) {
            if (f114191b == null) {
                createWindowContext = f114190a.createDisplayContext(((DisplayManager) f114190a.getSystemService(DisplayManager.class)).getDisplay(0)).createWindowContext(1001, null);
                f114191b = createWindowContext;
            }
            return f114191b;
        }
        return f114190a;
    }
}
