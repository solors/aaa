package com.apm.insight.runtime.p131a;

import android.content.Context;
import com.apm.insight.CrashType;
import com.apm.insight.entity.CrashBody;
import com.apm.insight.entity.Header;

/* JADX INFO: Access modifiers changed from: package-private */
@Deprecated
/* renamed from: com.apm.insight.runtime.a.g */
/* loaded from: classes2.dex */
public final class CustomJavaCrashAssembly extends BaseAssembly {
    /* JADX INFO: Access modifiers changed from: package-private */
    public CustomJavaCrashAssembly(Context context, ActivityDataManager activityDataManager, BatteryWatcher batteryWatcher) {
        super(CrashType.CUSTOM_JAVA, context, activityDataManager, batteryWatcher);
    }

    @Override // com.apm.insight.runtime.p131a.BaseAssembly
    /* renamed from: a */
    public final CrashBody mo101438a(CrashBody crashBody) {
        CrashBody mo101438a = super.mo101438a(crashBody);
        Header m101982a = Header.m101982a(this.f4024b);
        Header.m101981a(m101982a);
        Header.m101976b(m101982a);
        m101982a.m101974c();
        m101982a.m101972d();
        m101982a.m101970e();
        mo101438a.m101963a(m101982a);
        return mo101438a;
    }
}
