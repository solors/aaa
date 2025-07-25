package com.ironsource.mediationsdk.logger;

import com.ironsource.C19777dk;
import com.ironsource.mediationsdk.logger.IronSourceLogger;

/* loaded from: classes6.dex */
public enum IronLog {
    API(IronSourceLogger.IronSourceTag.API),
    CALLBACK(IronSourceLogger.IronSourceTag.CALLBACK),
    ADAPTER_API(IronSourceLogger.IronSourceTag.ADAPTER_API),
    ADAPTER_CALLBACK(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK),
    NETWORK(IronSourceLogger.IronSourceTag.NETWORK),
    INTERNAL(IronSourceLogger.IronSourceTag.INTERNAL),
    NATIVE(IronSourceLogger.IronSourceTag.NATIVE),
    EVENT(IronSourceLogger.IronSourceTag.EVENT);
    

    /* renamed from: a */
    IronSourceLogger.IronSourceTag f51647a;

    IronLog(IronSourceLogger.IronSourceTag ironSourceTag) {
        this.f51647a = ironSourceTag;
    }

    public void error() {
        IronSourceLoggerManager.getLogger().m56774a(this.f51647a, new C19777dk("", 3));
    }

    public void info() {
        IronSourceLoggerManager.getLogger().m56774a(this.f51647a, new C19777dk("", 1));
    }

    public void verbose() {
        IronSourceLoggerManager.getLogger().m56774a(this.f51647a, new C19777dk("", 0));
    }

    public void warning() {
        IronSourceLoggerManager.getLogger().m56774a(this.f51647a, new C19777dk("", 2));
    }

    public void error(String str) {
        IronSourceLoggerManager.getLogger().m56774a(this.f51647a, new C19777dk(str, 3));
    }

    public void info(String str) {
        IronSourceLoggerManager.getLogger().m56774a(this.f51647a, new C19777dk(str, 1));
    }

    public void verbose(String str) {
        IronSourceLoggerManager.getLogger().m56774a(this.f51647a, new C19777dk(str, 0));
    }

    public void warning(String str) {
        IronSourceLoggerManager.getLogger().m56774a(this.f51647a, new C19777dk(str, 2));
    }
}
