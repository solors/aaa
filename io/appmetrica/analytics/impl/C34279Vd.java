package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.AndroidUtils;

/* renamed from: io.appmetrica.analytics.impl.Vd */
/* loaded from: classes9.dex */
public final class C34279Vd extends C34803pc {
    public C34279Vd() {
        super(EnumC34351Yd.UNDEFINED);
        m21157a(1, EnumC34351Yd.WIFI);
        m21157a(0, EnumC34351Yd.CELL);
        m21157a(3, EnumC34351Yd.ETHERNET);
        m21157a(2, EnumC34351Yd.BLUETOOTH);
        m21157a(4, EnumC34351Yd.VPN);
        if (AndroidUtils.isApiAchieved(27)) {
            m21157a(6, EnumC34351Yd.LOWPAN);
        }
        if (AndroidUtils.isApiAchieved(26)) {
            m21157a(5, EnumC34351Yd.WIFI_AWARE);
        }
    }
}
