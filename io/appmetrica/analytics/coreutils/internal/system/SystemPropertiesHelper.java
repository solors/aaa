package io.appmetrica.analytics.coreutils.internal.system;

import android.annotation.SuppressLint;
import android.content.Context;
import com.amazon.p047a.p048a.p071o.KiwiConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes9.dex */
public final class SystemPropertiesHelper {
    @NotNull
    public static final SystemPropertiesHelper INSTANCE = new SystemPropertiesHelper();

    private SystemPropertiesHelper() {
    }

    @SuppressLint({"PrivateApi"})
    @NotNull
    public static final String readSystemProperty(@NotNull String str) {
        String str2;
        try {
            Class<?> cls = Class.forName(KiwiConstants.f2713ar, true, Context.class.getClassLoader());
            Object invoke = cls.getMethod(KiwiConstants.f2714as, String.class).invoke(cls, str);
            if (invoke instanceof String) {
                str2 = (String) invoke;
            } else {
                str2 = null;
            }
            if (str2 == null) {
                return "";
            }
            return str2;
        } catch (Exception unused) {
            return "";
        }
    }
}
