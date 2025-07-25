package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.InstreamAdBreakType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.j2 */
/* loaded from: classes8.dex */
public final class C30596j2 {
    @NotNull
    /* renamed from: a */
    public static EnumC31013o2 m33077a(@Nullable String str) {
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -318297696) {
                if (hashCode != 757909789) {
                    if (hashCode == 1055572677 && str.equals(InstreamAdBreakType.MIDROLL)) {
                        return EnumC31013o2.f83276c;
                    }
                } else if (str.equals(InstreamAdBreakType.POSTROLL)) {
                    return EnumC31013o2.f83277d;
                }
            } else if (str.equals(InstreamAdBreakType.PREROLL)) {
                return EnumC31013o2.f83275b;
            }
        }
        return EnumC31013o2.f83278e;
    }
}
