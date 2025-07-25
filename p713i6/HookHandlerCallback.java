package p713i6;

import android.os.Handler;
import android.os.Message;

/* renamed from: i6.b */
/* loaded from: classes6.dex */
public class HookHandlerCallback implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i != 115) {
            if (i != 116) {
                if (i != 137) {
                    switch (i) {
                        case 101:
                            SpBlockClear.m23104a("PAUSE_ACTIVITY");
                            return false;
                        case 102:
                            SpBlockClear.m23104a("PAUSE_ACTIVITY_FINISHING");
                            return false;
                        case 103:
                            SpBlockClear.m23104a("STOP_ACTIVITY_SHOW");
                            return false;
                        case 104:
                            SpBlockClear.m23104a("STOP_ACTIVITY_HIDE");
                            return false;
                        default:
                            return false;
                    }
                }
                SpBlockClear.m23104a("SLEEPING");
                return false;
            }
            SpBlockClear.m23104a("STOP_SERVICE");
            return false;
        }
        SpBlockClear.m23104a("SERVICE_ARGS");
        return false;
    }
}
