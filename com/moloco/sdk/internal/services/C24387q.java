package com.moloco.sdk.internal.services;

import android.content.Context;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import androidx.core.content.ContextCompat;
import com.moloco.sdk.C24434o;
import java.util.Locale;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.InterfaceC38501j;
import p804nd.LazyJVM;

/* renamed from: com.moloco.sdk.internal.services.q */
/* loaded from: classes7.dex */
public final class C24387q implements InterfaceC24328d0 {
    @NotNull

    /* renamed from: a */
    public final Context f63120a;
    @NotNull

    /* renamed from: b */
    public final InterfaceC38501j f63121b;

    /* renamed from: com.moloco.sdk.internal.services.q$a */
    /* loaded from: classes7.dex */
    public static final class C24388a extends Lambda implements Functions<Boolean> {
        public C24388a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Functions
        @NotNull
        /* renamed from: b */
        public final Boolean invoke() {
            return Boolean.valueOf(C24387q.this.f63120a.getResources().getBoolean(C24434o.isTablet));
        }
    }

    public C24387q(@NotNull Context context) {
        InterfaceC38501j m14554a;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f63120a = context;
        m14554a = LazyJVM.m14554a(new C24388a());
        this.f63121b = m14554a;
    }

    @Override // com.moloco.sdk.internal.services.InterfaceC24328d0
    @NotNull
    /* renamed from: b */
    public C24320c0 mo46507b() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6 = Build.MANUFACTURER;
        if (str6 == null) {
            str = "";
        } else {
            str = str6;
        }
        String str7 = Build.MODEL;
        if (str7 == null) {
            str2 = "";
        } else {
            str2 = str7;
        }
        String str8 = Build.HARDWARE;
        if (str8 == null) {
            str3 = "";
        } else {
            str3 = str8;
        }
        boolean m46504e = m46504e();
        String RELEASE = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
        int i = Build.VERSION.SDK_INT;
        String language = Locale.getDefault().getLanguage();
        Intrinsics.checkNotNullExpressionValue(language, "getDefault().language");
        TelephonyManager telephonyManager = (TelephonyManager) ContextCompat.getSystemService(this.f63120a, TelephonyManager.class);
        if (telephonyManager != null) {
            str4 = telephonyManager.getNetworkOperatorName();
        } else {
            str4 = null;
        }
        if (str4 == null) {
            str5 = "";
        } else {
            str5 = str4;
        }
        return new C24320c0(str, str2, str3, m46504e, "android", RELEASE, i, language, str5, Resources.getSystem().getDisplayMetrics().density, System.currentTimeMillis() - SystemClock.elapsedRealtime());
    }

    @Override // com.moloco.sdk.internal.services.InterfaceC24328d0
    @NotNull
    /* renamed from: c */
    public String mo46506c() {
        String language = Locale.getDefault().getLanguage();
        Intrinsics.checkNotNullExpressionValue(language, "getDefault().language");
        return language;
    }

    @Override // com.moloco.sdk.internal.services.InterfaceC24328d0
    @Nullable
    /* renamed from: d */
    public String mo46505d() {
        Object systemService = this.f63120a.getSystemService("input_method");
        Intrinsics.m17073h(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodSubtype currentInputMethodSubtype = ((InputMethodManager) systemService).getCurrentInputMethodSubtype();
        if (currentInputMethodSubtype != null) {
            return currentInputMethodSubtype.getLocale();
        }
        return null;
    }

    /* renamed from: e */
    public final boolean m46504e() {
        return ((Boolean) this.f63121b.getValue()).booleanValue();
    }

    @Override // com.moloco.sdk.internal.services.InterfaceC24328d0
    @NotNull
    public C24320c0 invoke() {
        return mo46507b();
    }

    @Override // com.moloco.sdk.internal.services.InterfaceC24328d0
    /* renamed from: a */
    public boolean mo46509a() {
        Object systemService = this.f63120a.getSystemService("sensor");
        Intrinsics.m17073h(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        return ((SensorManager) systemService).getDefaultSensor(4) != null;
    }
}
