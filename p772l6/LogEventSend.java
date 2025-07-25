package p772l6;

import android.os.Bundle;
import com.ironsource.C21114v8;
import java.util.Set;
import p636d7.PushLogUtil;

/* renamed from: l6.c */
/* loaded from: classes5.dex */
public class LogEventSend implements IEventSend {
    @Override // p772l6.IEventSend
    public void sendEvent(String str, Bundle bundle) {
        Set<String> keySet = bundle.keySet();
        StringBuilder sb2 = new StringBuilder();
        if (keySet.size() > 0) {
            sb2.append(C21114v8.C21123i.f54137d);
            for (String str2 : keySet) {
                Object obj = bundle.get(str2);
                sb2.append(str2);
                sb2.append(":");
                sb2.append(obj);
                sb2.append(",");
            }
            sb2.deleteCharAt(sb2.length() - 1);
            sb2.append(C21114v8.C21123i.f54139e);
        }
        PushLogUtil.m25698a("eventName:" + str + " " + sb2.toString());
    }
}
