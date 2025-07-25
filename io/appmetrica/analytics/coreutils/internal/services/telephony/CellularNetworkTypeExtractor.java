package io.appmetrica.analytics.coreutils.internal.services.telephony;

import android.annotation.TargetApi;
import android.content.Context;
import android.telephony.TelephonyManager;
import androidx.annotation.RequiresPermission;
import io.appmetrica.analytics.coreapi.internal.annotations.DoNotInline;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes9.dex */
public final class CellularNetworkTypeExtractor {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    public static final String UNKNOWN_NETWORK_TYPE_VALUE = "unknown";

    /* renamed from: a */
    private final Context f92466a;

    /* renamed from: b */
    private final FunctionWithThrowable f92467b;

    @Metadata
    /* loaded from: classes9.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @DoNotInline
    @Metadata
    @TargetApi(24)
    /* renamed from: io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeExtractor$a */
    /* loaded from: classes9.dex */
    public static final class C33729a implements FunctionWithThrowable<TelephonyManager, Integer> {
        @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
        @RequiresPermission("android.permission.READ_PHONE_STATE")
        @NotNull
        /* renamed from: a */
        public Integer apply(@NotNull TelephonyManager telephonyManager) {
            return Integer.valueOf(telephonyManager.getDataNetworkType());
        }
    }

    @DoNotInline
    @Metadata
    /* renamed from: io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeExtractor$b */
    /* loaded from: classes9.dex */
    public static final class C33730b implements FunctionWithThrowable<TelephonyManager, Integer> {
        @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
        @RequiresPermission("android.permission.READ_PHONE_STATE")
        @NotNull
        /* renamed from: a */
        public Integer apply(@NotNull TelephonyManager telephonyManager) {
            return Integer.valueOf(telephonyManager.getNetworkType());
        }
    }

    public CellularNetworkTypeExtractor(@NotNull Context context) {
        FunctionWithThrowable c33730b;
        this.f92466a = context;
        if (AndroidUtils.isApiAchieved(24)) {
            c33730b = new C33729a();
        } else {
            c33730b = new C33730b();
        }
        this.f92467b = c33730b;
    }

    @NotNull
    public final Context getContext() {
        return this.f92466a;
    }

    @RequiresPermission("android.permission.READ_PHONE_STATE")
    @NotNull
    public final String getNetworkType() {
        return CellularNetworkTypeConverter.convert((Integer) SystemServiceUtils.accessSystemServiceByNameSafely(this.f92466a, "phone", "Extracting cellular networkType", "TelephonyManager", this.f92467b));
    }
}
