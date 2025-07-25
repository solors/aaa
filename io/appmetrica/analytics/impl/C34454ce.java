package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;
import io.appmetrica.analytics.plugins.StackTraceItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.C37566w;

/* renamed from: io.appmetrica.analytics.impl.ce */
/* loaded from: classes9.dex */
public final class C34454ce {

    /* renamed from: a */
    public final C34012K9 f94090a;

    public C34454ce(C34012K9 c34012k9) {
        this.f94090a = c34012k9;
    }

    /* renamed from: a */
    public final C34145Pm m21864a(PluginErrorDetails pluginErrorDetails) {
        ArrayList arrayList;
        int m17154x;
        String exceptionClass = pluginErrorDetails.getExceptionClass();
        String message = pluginErrorDetails.getMessage();
        List<StackTraceItem> stacktrace = pluginErrorDetails.getStacktrace();
        String platform = pluginErrorDetails.getPlatform();
        String virtualMachineVersion = pluginErrorDetails.getVirtualMachineVersion();
        Map<String, String> pluginEnvironment = pluginErrorDetails.getPluginEnvironment();
        String str = (String) this.f94090a.f93125a.m22168a();
        Boolean bool = (Boolean) this.f94090a.f93126b.m22168a();
        if (stacktrace != null) {
            m17154x = C37566w.m17154x(stacktrace, 10);
            arrayList = new ArrayList(m17154x);
            for (StackTraceItem stackTraceItem : stacktrace) {
                arrayList.add(new C33951Hk(stackTraceItem.getClassName(), stackTraceItem.getFileName(), stackTraceItem.getLine(), stackTraceItem.getColumn(), stackTraceItem.getMethodName(), null));
            }
        } else {
            arrayList = null;
        }
        return new C34145Pm(new C33903Fm(exceptionClass, message, arrayList, null, null), null, null, platform, virtualMachineVersion, pluginEnvironment, str, bool);
    }
}
