package com.ironsource.mediationsdk.logger;

/* loaded from: classes6.dex */
public abstract class IronSourceLogger {

    /* renamed from: a */
    int f51650a;

    /* renamed from: b */
    private String f51651b;

    /* loaded from: classes6.dex */
    public class IronSourceLogLevel {
        public static final int ERROR = 3;
        public static final int INFO = 1;
        public static final int VERBOSE = 0;
        public static final int WARNING = 2;

        public IronSourceLogLevel() {
        }
    }

    /* loaded from: classes6.dex */
    public enum IronSourceTag {
        API,
        ADAPTER_API,
        CALLBACK,
        ADAPTER_CALLBACK,
        NETWORK,
        INTERNAL,
        NATIVE,
        EVENT
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public IronSourceLogger(String str) {
        this.f51651b = str;
        this.f51650a = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m56777a() {
        return this.f51650a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public String m56776b() {
        return this.f51651b;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof IronSourceLogger)) {
            return false;
        }
        IronSourceLogger ironSourceLogger = (IronSourceLogger) obj;
        String str = this.f51651b;
        if (str == null || !str.equals(ironSourceLogger.f51651b)) {
            return false;
        }
        return true;
    }

    public abstract void log(IronSourceTag ironSourceTag, String str, int i);

    public abstract void logException(IronSourceTag ironSourceTag, String str, Throwable th);

    public void setDebugLevel(int i) {
        this.f51650a = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public IronSourceLogger(String str, int i) {
        this.f51651b = str;
        this.f51650a = i;
    }
}
