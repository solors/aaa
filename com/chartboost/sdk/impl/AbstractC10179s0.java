package com.chartboost.sdk.impl;

import android.content.Context;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.privacy.model.DataUseConsent;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.chartboost.sdk.impl.s0 */
/* loaded from: classes3.dex */
public abstract class AbstractC10179s0 {

    /* renamed from: a */
    public final Context f23091a;

    public AbstractC10179s0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f23091a = context;
    }

    /* renamed from: a */
    public final boolean m80639a() {
        Object obj;
        try {
            DataUseConsent dataUseConsent = Chartboost.getDataUseConsent(this.f23091a, "coppa");
            Boolean bool = null;
            if (dataUseConsent != null) {
                obj = dataUseConsent.getConsent();
            } else {
                obj = null;
            }
            if (obj instanceof Boolean) {
                bool = (Boolean) obj;
            }
            if (bool != null) {
                return bool.booleanValue();
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
