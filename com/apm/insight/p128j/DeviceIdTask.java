package com.apm.insight.p128j;

import android.os.Handler;
import android.text.TextUtils;
import com.apm.insight.AppDataCenter;
import com.apm.insight.NpthBus;

/* renamed from: com.apm.insight.j.c */
/* loaded from: classes2.dex */
public final class DeviceIdTask extends BaseTask {
    /* JADX INFO: Access modifiers changed from: package-private */
    public DeviceIdTask(Handler handler) {
        super(handler, 15000L);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (NpthBus.m102017c().m101402b()) {
            return;
        }
        String m101534d = NpthBus.m102029a().m101534d();
        if (!TextUtils.isEmpty(m101534d) && !"0".equals(m101534d)) {
            NpthBus.m102017c().m101403a(m101534d);
            AppDataCenter.m102179a((Object) "[DeviceIdTask] did is ".concat(String.valueOf(m101534d)));
            return;
        }
        m101859a(m101858b());
        AppDataCenter.m102179a((Object) "[DeviceIdTask] did is null, continue check.");
    }
}
