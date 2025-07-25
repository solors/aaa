package com.apm.insight.p128j;

import android.content.Context;
import android.os.Handler;
import com.apm.insight.NpthBus;
import com.apm.insight.entity.CustomBody;
import com.apm.insight.nativecrash.NativeFileParser;
import com.apm.insight.runtime.NpthHandlerThread;
import com.apm.insight.runtime.RuntimeContext;
import java.util.Map;

/* renamed from: com.apm.insight.j.b */
/* loaded from: classes2.dex */
public final class CommonParamsTask extends BaseTask {

    /* renamed from: b */
    private static Runnable f3823b = new Runnable() { // from class: com.apm.insight.j.b.1
        @Override // java.lang.Runnable
        public final void run() {
            NpthHandlerThread.m101339a().m101313a().removeCallbacks(this);
            NpthHandlerThread.m101339a().m101309a(new CommonParamsTask(NpthHandlerThread.m101339a().m101313a(), NpthBus.m102011g()));
        }
    };

    /* renamed from: a */
    private Context f3824a;

    public CommonParamsTask(Handler handler, Context context) {
        super(handler, 30000L);
        this.f3824a = context;
    }

    /* renamed from: c */
    public static void m101857c() {
        NpthHandlerThread.m101339a().m101308a(f3823b, 100L);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map<String, Object> map;
        try {
            map = NpthBus.m102029a().m101536c().getCommonParams();
        } catch (Throwable unused) {
            map = null;
        }
        if (map != null) {
            try {
                if (NativeFileParser.m101539a(map)) {
                    m101859a(m101858b());
                    return;
                }
            } catch (Throwable unused2) {
                return;
            }
        }
        RuntimeContext.m101330a().m101326a(map, CustomBody.m101929b());
    }
}
