package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.K7 */
/* loaded from: classes9.dex */
public final class C34010K7 {

    /* renamed from: a */
    public final boolean f93101a;

    /* renamed from: b */
    public DeferredDeeplinkListener f93102b;

    /* renamed from: c */
    public DeferredDeeplinkParametersListener f93103c;

    /* renamed from: d */
    public C33962I7 f93104d;

    public C34010K7(boolean z) {
        this.f93101a = z;
    }

    /* renamed from: a */
    public final void m22494a(int i) {
        DeferredDeeplinkParametersListener.Error error;
        DeferredDeeplinkListener.Error error2;
        C33962I7 c33962i7 = this.f93104d;
        String str = c33962i7 == null ? null : c33962i7.f93017c;
        DeferredDeeplinkListener deferredDeeplinkListener = this.f93102b;
        if (deferredDeeplinkListener != null) {
            if (i != 0) {
                int i2 = i - 1;
                if (i2 == 0) {
                    error2 = DeferredDeeplinkListener.Error.NOT_A_FIRST_LAUNCH;
                } else if (i2 == 1) {
                    error2 = DeferredDeeplinkListener.Error.PARSE_ERROR;
                } else if (i2 != 2) {
                    error2 = DeferredDeeplinkListener.Error.UNKNOWN;
                } else {
                    error2 = DeferredDeeplinkListener.Error.NO_REFERRER;
                }
                deferredDeeplinkListener.onError(error2, (String) WrapUtils.getOrDefault(str, ""));
                this.f93102b = null;
            } else {
                throw null;
            }
        }
        DeferredDeeplinkParametersListener deferredDeeplinkParametersListener = this.f93103c;
        if (deferredDeeplinkParametersListener != null) {
            if (i != 0) {
                int i3 = i - 1;
                if (i3 == 0) {
                    error = DeferredDeeplinkParametersListener.Error.NOT_A_FIRST_LAUNCH;
                } else if (i3 == 1) {
                    error = DeferredDeeplinkParametersListener.Error.PARSE_ERROR;
                } else if (i3 != 2) {
                    error = DeferredDeeplinkParametersListener.Error.UNKNOWN;
                } else {
                    error = DeferredDeeplinkParametersListener.Error.NO_REFERRER;
                }
                deferredDeeplinkParametersListener.onError(error, (String) WrapUtils.getOrDefault(str, ""));
                this.f93103c = null;
                return;
            }
            throw null;
        }
    }

    /* renamed from: a */
    public final void m22495a() {
        C33962I7 c33962i7 = this.f93104d;
        if (c33962i7 != null) {
            String str = c33962i7.f93016b;
            if (str != null) {
                DeferredDeeplinkListener deferredDeeplinkListener = this.f93102b;
                if (deferredDeeplinkListener != null) {
                    deferredDeeplinkListener.onDeeplinkLoaded(str);
                    this.f93102b = null;
                }
                if (!AbstractC34679kn.m21469a(this.f93104d.f93015a)) {
                    Map<String, String> map = this.f93104d.f93015a;
                    DeferredDeeplinkParametersListener deferredDeeplinkParametersListener = this.f93103c;
                    if (deferredDeeplinkParametersListener != null) {
                        deferredDeeplinkParametersListener.onParametersLoaded(map);
                        this.f93103c = null;
                        return;
                    }
                    return;
                }
                String str2 = this.f93104d.f93017c;
                DeferredDeeplinkParametersListener deferredDeeplinkParametersListener2 = this.f93103c;
                if (deferredDeeplinkParametersListener2 != null) {
                    deferredDeeplinkParametersListener2.onError(DeferredDeeplinkParametersListener.Error.PARSE_ERROR, (String) WrapUtils.getOrDefault(str2, ""));
                    this.f93103c = null;
                }
            } else if (c33962i7.f93017c != null) {
                m22494a(2);
            } else {
                m22494a(3);
            }
        }
    }
}
