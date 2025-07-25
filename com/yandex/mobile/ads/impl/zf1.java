package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import androidx.media3.common.C2100C;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p804nd.C38508r;
import p804nd.Result;

/* loaded from: classes8.dex */
public final class zf1 {
    @SuppressLint({"WrongConstant"})
    @NotNull
    /* renamed from: a */
    public static Intent m26242a(@NotNull yf1 preferredPackage) {
        Intrinsics.checkNotNullParameter(preferredPackage, "preferredPackage");
        String m26930d = preferredPackage.m26930d();
        String m26931c = preferredPackage.m26931c();
        Map<String, Object> m26933a = preferredPackage.m26933a();
        Integer m26932b = preferredPackage.m26932b();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(m26930d));
        if (m26932b != null) {
            intent.addFlags(m26932b.intValue());
        } else {
            intent.addFlags(C2100C.ENCODING_PCM_24BIT_BIG_ENDIAN);
        }
        intent.setPackage(m26931c);
        if (m26933a != null) {
            for (Map.Entry<String, Object> entry : m26933a.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof Boolean) {
                    intent.putExtra(key, ((Boolean) value).booleanValue());
                } else if (value instanceof Integer) {
                    intent.putExtra(key, ((Number) value).intValue());
                } else if (value instanceof String) {
                    intent.putExtra(key, (String) value);
                } else if (value instanceof t50) {
                    try {
                        Result.C38506a c38506a = Result.f101870c;
                        ((t50) value).getClass();
                        Result.m14549b(intent.putExtra(key, (Parcelable) null));
                    } catch (Throwable th) {
                        Result.C38506a c38506a2 = Result.f101870c;
                        Result.m14549b(C38508r.m14540a(th));
                    }
                }
            }
        }
        return intent;
    }
}
