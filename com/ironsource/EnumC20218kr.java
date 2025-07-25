package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.kr */
/* loaded from: classes6.dex */
public enum EnumC20218kr {
    Off(0),
    CurrentlyLoadedAds(1),
    CurrentlyLoadedAdsAndFullHistory(2);
    
    @NotNull

    /* renamed from: b */
    public static final C20219a f50869b = new C20219a(null);

    /* renamed from: a */
    private final int f50874a;

    @Metadata
    /* renamed from: com.ironsource.kr$a */
    /* loaded from: classes6.dex */
    public static final class C20219a {
        private C20219a() {
        }

        public /* synthetic */ C20219a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final EnumC20218kr m57617a(int i) {
            EnumC20218kr enumC20218kr;
            boolean z;
            EnumC20218kr[] values = EnumC20218kr.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    enumC20218kr = values[i2];
                    if (enumC20218kr.f50874a == i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        break;
                    }
                    i2++;
                } else {
                    enumC20218kr = null;
                    break;
                }
            }
            if (enumC20218kr == null) {
                return EnumC20218kr.CurrentlyLoadedAds;
            }
            return enumC20218kr;
        }
    }

    EnumC20218kr(int i) {
        this.f50874a = i;
    }

    /* renamed from: b */
    public final int m57618b() {
        return this.f50874a;
    }
}
