package com.yandex.mobile.ads.impl;

import com.facebook.share.internal.ShareConstants;
import com.ironsource.C21114v8;
import com.maticoo.sdk.MaticooAdsConstant;
import com.monetization.ads.nativeads.CustomizableMediaView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.C44401b;

/* loaded from: classes8.dex */
public abstract class hu0 extends bb2<CustomizableMediaView, eu0> {
    @NotNull

    /* renamed from: c */
    private final ou0 f80186c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.yandex.mobile.ads.impl.hu0$a */
    /* loaded from: classes8.dex */
    public static final class EnumC30501a {

        /* renamed from: c */
        public static final EnumC30501a f80187c;

        /* renamed from: d */
        public static final EnumC30501a f80188d;

        /* renamed from: e */
        public static final EnumC30501a f80189e;

        /* renamed from: f */
        public static final EnumC30501a f80190f;

        /* renamed from: g */
        public static final EnumC30501a f80191g;

        /* renamed from: h */
        private static final /* synthetic */ EnumC30501a[] f80192h;
        @NotNull

        /* renamed from: b */
        private final String f80193b;

        static {
            EnumC30501a enumC30501a = new EnumC30501a(0, "WEB_VIEW", C21114v8.C21122h.f54036K);
            f80187c = enumC30501a;
            EnumC30501a enumC30501a2 = new EnumC30501a(1, ShareConstants.VIDEO_URL, "video");
            f80188d = enumC30501a2;
            EnumC30501a enumC30501a3 = new EnumC30501a(2, "MULTIBANNER", "multibanner");
            f80189e = enumC30501a3;
            EnumC30501a enumC30501a4 = new EnumC30501a(3, ShareConstants.IMAGE_URL, "image");
            f80190f = enumC30501a4;
            EnumC30501a enumC30501a5 = new EnumC30501a(4, "MEDIATION", MaticooAdsConstant.KEY_AD_MEDIATION);
            f80191g = enumC30501a5;
            EnumC30501a[] enumC30501aArr = {enumC30501a, enumC30501a2, enumC30501a3, enumC30501a4, enumC30501a5};
            f80192h = enumC30501aArr;
            C44401b.m3113a(enumC30501aArr);
        }

        private EnumC30501a(int i, String str, String str2) {
            this.f80193b = str2;
        }

        public static EnumC30501a valueOf(String str) {
            return (EnumC30501a) Enum.valueOf(EnumC30501a.class, str);
        }

        public static EnumC30501a[] values() {
            return (EnumC30501a[]) f80192h.clone();
        }

        @NotNull
        /* renamed from: a */
        public final String m33466a() {
            return this.f80193b;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hu0(@NotNull CustomizableMediaView mediaView, @NotNull ou0 mediaViewRenderController) {
        super(mediaView);
        Intrinsics.checkNotNullParameter(mediaView, "mediaView");
        Intrinsics.checkNotNullParameter(mediaViewRenderController, "mediaViewRenderController");
        this.f80186c = mediaViewRenderController;
    }

    /* renamed from: a */
    public abstract void mo30577a(@NotNull CustomizableMediaView customizableMediaView);

    @Override // com.yandex.mobile.ads.impl.bb2
    /* renamed from: a */
    public void mo27593b(@NotNull CustomizableMediaView mediaView, @NotNull eu0 value) {
        Intrinsics.checkNotNullParameter(mediaView, "mediaView");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f80186c.m30884a(mediaView, mo30574d());
    }

    /* renamed from: a */
    public abstract void mo30575a(@NotNull eu0 eu0Var);

    @NotNull
    /* renamed from: d */
    public abstract EnumC30501a mo30574d();
}
