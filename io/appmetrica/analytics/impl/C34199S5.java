package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* renamed from: io.appmetrica.analytics.impl.S5 */
/* loaded from: classes9.dex */
public class C34199S5 extends BaseRequestConfig {

    /* renamed from: a */
    public String f93475a;

    /* renamed from: b */
    public String f93476b;

    /* renamed from: c */
    public C34650jl f93477c;

    /* renamed from: b */
    public final String m22293b() {
        return this.f93476b;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig
    public String toString() {
        return "CoreRequestConfig{mAppDebuggable='" + this.f93475a + "', mAppSystem='" + this.f93476b + "', startupState=" + this.f93477c + '}';
    }

    @NonNull
    /* renamed from: a */
    public final String m22295a() {
        return this.f93475a;
    }
}
