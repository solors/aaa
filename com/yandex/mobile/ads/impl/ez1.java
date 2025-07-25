package com.yandex.mobile.ads.impl;

import android.os.Build;
import com.amazon.device.simplesignin.SimpleSignInService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class ez1 implements u32 {
    @Override // com.yandex.mobile.ads.impl.u32
    @NotNull
    /* renamed from: a */
    public final String mo28890a() {
        String str;
        String str2 = null;
        try {
            str = System.getProperty("http.agent");
        } catch (Exception unused) {
            um0.m28727b(new Object[0]);
            str = null;
        }
        if (str == null || str.length() == 0) {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append("Dalvik/");
            try {
                str2 = System.getProperty("java.vm.version");
            } catch (Exception unused2) {
                um0.m28727b(new Object[0]);
            }
            if (str2 == null || str2.length() == 0) {
                str2 = SimpleSignInService.SDK_VERSION;
            }
            sb2.append(str2);
            sb2.append(" (Linux; U; Android ");
            String str3 = Build.VERSION.RELEASE;
            if (str3.length() == 0) {
                str3 = "1.0";
            }
            sb2.append(str3);
            if (Intrinsics.m17075f("REL", Build.VERSION.CODENAME)) {
                String str4 = Build.MODEL;
                Intrinsics.m17074g(str4);
                if (str4.length() > 0) {
                    sb2.append("; ");
                    sb2.append(str4);
                }
            }
            String str5 = Build.ID;
            Intrinsics.m17074g(str5);
            if (str5.length() > 0) {
                sb2.append(" Build/");
                sb2.append(str5);
            }
            sb2.append(")");
            String sb3 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
            return sb3;
        }
        return str;
    }
}
