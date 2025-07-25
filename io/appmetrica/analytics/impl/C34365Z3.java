package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.internal.CounterConfiguration;

/* renamed from: io.appmetrica.analytics.impl.Z3 */
/* loaded from: classes9.dex */
public class C34365Z3 {

    /* renamed from: a */
    public final C34208Se f93860a;

    /* renamed from: b */
    public final CounterConfiguration f93861b;

    public C34365Z3(C34208Se c34208Se, CounterConfiguration counterConfiguration) {
        this.f93860a = c34208Se;
        this.f93861b = counterConfiguration;
    }

    @Nullable
    /* renamed from: a */
    public static C34365Z3 m22054a(@NonNull Context context, @NonNull Bundle bundle) {
        C34208Se c34208Se;
        CounterConfiguration fromBundle;
        String str = C34208Se.f93494c;
        if (bundle != null) {
            try {
                c34208Se = (C34208Se) bundle.getParcelable("PROCESS_CFG_OBJ");
            } catch (Throwable unused) {
            }
            fromBundle = CounterConfiguration.fromBundle(bundle);
            if (fromBundle == null && c34208Se != null && context.getPackageName().equals(c34208Se.f93495a.getAsString("PROCESS_CFG_PACKAGE_NAME")) && c34208Se.f93495a.getAsInteger("PROCESS_CFG_SDK_API_LEVEL").intValue() == AppMetrica.getLibraryApiLevel()) {
                return new C34365Z3(c34208Se, fromBundle);
            }
            return null;
        }
        c34208Se = null;
        fromBundle = CounterConfiguration.fromBundle(bundle);
        if (fromBundle == null) {
        }
        return null;
    }

    @NonNull
    /* renamed from: b */
    public final CounterConfiguration m22053b() {
        return this.f93861b;
    }

    public final String toString() {
        return "ClientConfiguration{mProcessConfiguration=" + this.f93860a + ", mCounterConfiguration=" + this.f93861b + '}';
    }

    @NonNull
    /* renamed from: a */
    public final C34208Se m22055a() {
        return this.f93860a;
    }
}
