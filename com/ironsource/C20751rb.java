package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.ironsource.rb */
/* loaded from: classes6.dex */
public class C20751rb {

    /* renamed from: a */
    static final String f52746a = "ironbeast";

    /* renamed from: b */
    static final String f52747b = "outcome";

    /* renamed from: c */
    static final int f52748c = 3;

    /* renamed from: d */
    static final int f52749d = 2;

    /* renamed from: e */
    static final int f52750e = 0;

    C20751rb() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static AbstractC19795e m55519a(String str, int i) {
        if (f52746a.equals(str)) {
            return new C19997gj(i);
        }
        if (f52747b.equals(str)) {
            return new C20533nn(i);
        }
        if (i == 2) {
            return new C19997gj(i);
        }
        if (i == 3) {
            return new C20533nn(i);
        }
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
        logger.log(ironSourceTag, "EventsFormatterFactory failed to instantiate a formatter (type: " + str + ", adUnit: " + i + ")", 2);
        return null;
    }
}
