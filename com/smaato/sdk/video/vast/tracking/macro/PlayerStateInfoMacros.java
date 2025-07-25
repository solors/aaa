package com.smaato.sdk.video.vast.tracking.macro;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.util.Joiner;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.Size;
import com.smaato.sdk.core.util.TextUtils;
import com.smaato.sdk.core.util.collections.Maps;
import com.smaato.sdk.core.util.p574fi.Supplier;
import com.smaato.sdk.video.utils.DateFormatUtils;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.smaato.sdk.video.vast.tracking.macro.d0 */
/* loaded from: classes7.dex */
public final class PlayerStateInfoMacros {
    @NonNull

    /* renamed from: a */
    private final DateFormatUtils f72835a;
    @NonNull

    /* renamed from: b */
    private final InterfaceC27961a f72836b;
    @Nullable

    /* renamed from: c */
    private final String f72837c;
    @Nullable

    /* renamed from: d */
    private final String f72838d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PlayerStateInfoMacros.java */
    /* renamed from: com.smaato.sdk.video.vast.tracking.macro.d0$a */
    /* loaded from: classes7.dex */
    public interface InterfaceC27961a extends Supplier<Size> {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PlayerStateInfoMacros(@NonNull InterfaceC27961a interfaceC27961a, @NonNull DateFormatUtils dateFormatUtils, @Nullable String str, @Nullable String str2) {
        this.f72836b = (InterfaceC27961a) Objects.requireNonNull(interfaceC27961a);
        this.f72835a = (DateFormatUtils) Objects.requireNonNull(dateFormatUtils);
        this.f72837c = str;
        this.f72838d = str2;
    }

    @NonNull
    /* renamed from: a */
    private String m38714a(@Nullable Long l) {
        if (l == null) {
            return "-2";
        }
        return this.f72835a.offsetFromTimeInterval(l.longValue());
    }

    @NonNull
    /* renamed from: b */
    private String m38713b(@Nullable Boolean bool) {
        if (bool == null) {
            return "-2";
        }
        if (bool.booleanValue()) {
            return "fullscreen,muted";
        }
        return "fullscreen";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    /* renamed from: c */
    public Map<String, String> m38712c(@NonNull PlayerState playerState) {
        String str;
        Size size = this.f72836b.get();
        Map.Entry[] entryArr = new Map.Entry[9];
        entryArr[0] = Maps.entryOf("[PLAYERSTATE]", m38713b(playerState.isMuted));
        entryArr[1] = Maps.entryOf("[INVENTORYSTATE]", "skippable,mautoplayed");
        entryArr[2] = Maps.entryOf("[PLAYERSIZE]", Joiner.join(",", Integer.valueOf(size.width), Integer.valueOf(size.height)));
        entryArr[3] = Maps.entryOf("[ADPLAYHEAD]", m38714a(playerState.offsetMillis));
        String str2 = "-2";
        if (TextUtils.isEmpty(this.f72837c)) {
            str = "-2";
        } else {
            str = this.f72837c;
        }
        entryArr[4] = Maps.entryOf("[ASSETURI]", str);
        entryArr[5] = Maps.entryOf("[CONTENTID]", "-1");
        entryArr[6] = Maps.entryOf("[CONTENTURI]", "-1");
        entryArr[7] = Maps.entryOf("[PODSEQUENCE]", "-1");
        if (!TextUtils.isEmpty(this.f72838d)) {
            str2 = this.f72838d;
        }
        entryArr[8] = Maps.entryOf("[ADSERVINGID]", str2);
        return Maps.mapOf(entryArr);
    }
}
