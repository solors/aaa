package com.smaato.sdk.video.vast.tracking.macro;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.collections.Maps;
import com.smaato.sdk.core.util.p574fi.Function;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.smaato.sdk.video.vast.tracking.macro.c */
/* loaded from: classes7.dex */
public final class ClickInfoMacros {
    @NonNull

    /* renamed from: a */
    private final InterfaceC27959a f72830a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ClickInfoMacros.java */
    /* renamed from: com.smaato.sdk.video.vast.tracking.macro.c$a */
    /* loaded from: classes7.dex */
    public interface InterfaceC27959a extends Function<Float, Integer> {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ClickInfoMacros(@NonNull InterfaceC27959a interfaceC27959a) {
        this.f72830a = (InterfaceC27959a) Objects.requireNonNull(interfaceC27959a);
    }

    /* renamed from: a */
    private String m38719a(@Nullable Float f, @Nullable Float f2) {
        if (f == null || f2 == null || f.floatValue() <= 0.0f || f2.floatValue() <= 0.0f) {
            return "-2";
        }
        return this.f72830a.apply(f) + "," + this.f72830a.apply(f2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    /* renamed from: b */
    public Map<String, String> m38718b(@Nullable Float f, @Nullable Float f2) {
        return Maps.mapOf(Maps.entryOf("[CLICKPOS]", m38719a(f, f2)));
    }
}
