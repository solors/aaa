package com.yandex.mobile.ads.impl;

import android.media.AudioAttributes;
import android.os.Bundle;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.yandex.mobile.ads.impl.InterfaceC30632jl;

/* renamed from: com.yandex.mobile.ads.impl.ug */
/* loaded from: classes8.dex */
public final class C31581ug implements InterfaceC30632jl {

    /* renamed from: h */
    public static final C31581ug f86259h = new C31581ug(0, 0, 1, 1, 0);

    /* renamed from: b */
    public final int f86260b;

    /* renamed from: c */
    public final int f86261c;

    /* renamed from: d */
    public final int f86262d;

    /* renamed from: e */
    public final int f86263e;

    /* renamed from: f */
    public final int f86264f;
    @Nullable

    /* renamed from: g */
    private C31584c f86265g;

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(29)
    /* renamed from: com.yandex.mobile.ads.impl.ug$a */
    /* loaded from: classes8.dex */
    public static final class C31582a {
        @DoNotInline
        /* renamed from: a */
        public static void m28786a(AudioAttributes.Builder builder, int i) {
            builder.setAllowedCapturePolicy(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(32)
    /* renamed from: com.yandex.mobile.ads.impl.ug$b */
    /* loaded from: classes8.dex */
    public static final class C31583b {
        @DoNotInline
        /* renamed from: a */
        public static void m28785a(AudioAttributes.Builder builder, int i) {
            builder.setSpatializationBehavior(i);
        }
    }

    @RequiresApi(21)
    /* renamed from: com.yandex.mobile.ads.impl.ug$c */
    /* loaded from: classes8.dex */
    public static final class C31584c {

        /* renamed from: a */
        public final AudioAttributes f86266a;

        private C31584c(C31581ug c31581ug) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(c31581ug.f86260b).setFlags(c31581ug.f86261c).setUsage(c31581ug.f86262d);
            int i = y32.f88010a;
            if (i >= 29) {
                C31582a.m28786a(usage, c31581ug.f86263e);
            }
            if (i >= 32) {
                C31583b.m28785a(usage, c31581ug.f86264f);
            }
            this.f86266a = usage.build();
        }
    }

    static {
        new InterfaceC30632jl.InterfaceC30633a() { // from class: com.yandex.mobile.ads.impl.az2
            @Override // com.yandex.mobile.ads.impl.InterfaceC30632jl.InterfaceC30633a
            public final InterfaceC30632jl fromBundle(Bundle bundle) {
                return C31581ug.m28787b(bundle);
            }
        };
    }

    private C31581ug(int i, int i2, int i3, int i4, int i5) {
        this.f86260b = i;
        this.f86261c = i2;
        this.f86262d = i3;
        this.f86263e = i4;
        this.f86264f = i5;
    }

    /* renamed from: b */
    public static /* synthetic */ C31581ug m28787b(Bundle bundle) {
        return m28788a(bundle);
    }

    @RequiresApi(21)
    /* renamed from: a */
    public final C31584c m28789a() {
        if (this.f86265g == null) {
            this.f86265g = new C31584c();
        }
        return this.f86265g;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C31581ug.class != obj.getClass()) {
            return false;
        }
        C31581ug c31581ug = (C31581ug) obj;
        if (this.f86260b == c31581ug.f86260b && this.f86261c == c31581ug.f86261c && this.f86262d == c31581ug.f86262d && this.f86263e == c31581ug.f86263e && this.f86264f == c31581ug.f86264f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f86260b + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f86261c) * 31) + this.f86262d) * 31) + this.f86263e) * 31) + this.f86264f;
    }

    /* renamed from: a */
    public static C31581ug m28788a(Bundle bundle) {
        return new C31581ug(bundle.containsKey(Integer.toString(0, 36)) ? bundle.getInt(Integer.toString(0, 36)) : 0, bundle.containsKey(Integer.toString(1, 36)) ? bundle.getInt(Integer.toString(1, 36)) : 0, bundle.containsKey(Integer.toString(2, 36)) ? bundle.getInt(Integer.toString(2, 36)) : 1, bundle.containsKey(Integer.toString(3, 36)) ? bundle.getInt(Integer.toString(3, 36)) : 1, bundle.containsKey(Integer.toString(4, 36)) ? bundle.getInt(Integer.toString(4, 36)) : 0);
    }
}
