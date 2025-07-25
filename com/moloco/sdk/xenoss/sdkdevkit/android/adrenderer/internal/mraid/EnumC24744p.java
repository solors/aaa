package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.p */
/* loaded from: classes7.dex */
public enum EnumC24744p {
    Portrait,
    Landscape,
    None;
    
    @NotNull

    /* renamed from: b */
    public static final C24745a f63873b = new C24745a(null);

    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.p$a */
    /* loaded from: classes7.dex */
    public static final class C24745a {
        public /* synthetic */ C24745a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        /* renamed from: a */
        public final EnumC24744p m45789a(@Nullable String str) {
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != 3387192) {
                    if (hashCode != 729267099) {
                        if (hashCode == 1430647483 && str.equals("landscape")) {
                            return EnumC24744p.Landscape;
                        }
                    } else if (str.equals("portrait")) {
                        return EnumC24744p.Portrait;
                    }
                } else if (str.equals("none")) {
                    return EnumC24744p.None;
                }
            }
            return null;
        }

        public C24745a() {
        }
    }
}
