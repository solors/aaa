package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C24567d;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C24625k;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.AbstractC25018a0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.EnumC25036k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p804nd.NoWhenBranchMatchedException;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.q */
/* loaded from: classes7.dex */
public final class C25313q {

    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.q$a */
    /* loaded from: classes7.dex */
    public /* synthetic */ class C25314a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f65731a;

        static {
            int[] iArr = new int[EnumC25036k.values().length];
            try {
                iArr[EnumC25036k.Image.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC25036k.JS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f65731a = iArr;
        }
    }

    /* renamed from: a */
    public static final void m44774a(@NotNull C24567d c24567d, @NotNull AbstractC25018a0 vastResource) {
        String str;
        AbstractC25018a0.C25021c c25021c;
        Intrinsics.checkNotNullParameter(c24567d, "<this>");
        Intrinsics.checkNotNullParameter(vastResource, "vastResource");
        if (vastResource instanceof AbstractC25018a0.C25021c) {
            int i = C25314a.f65731a[((AbstractC25018a0.C25021c) vastResource).m45275a().m45218a().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    str = "<script src=\"" + c25021c.m45275a().m45217b() + "\"></script>";
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                str = "<html><head></head><body style=\"margin:0;padding:0\"><img src=\"" + c25021c.m45275a().m45217b() + "\" width=\"100%\" style=\"max-width:100%;max-height:100%;\" /></body></html>";
            }
        } else if (vastResource instanceof AbstractC25018a0.C25019a) {
            str = ((AbstractC25018a0.C25019a) vastResource).m45277a().m45251a();
        } else if (vastResource instanceof AbstractC25018a0.C25020b) {
            str = "<iframe frameborder=\"0\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\" style=\"border: 0px; margin: 0px;\" width=100% height=100% src=\"" + ((AbstractC25018a0.C25020b) vastResource).m45276a().m45250a() + "\"></iframe>";
        } else {
            throw new NoWhenBranchMatchedException();
        }
        try {
            C24625k.m46027b(c24567d, C24625k.m46028a(str));
        } catch (Exception e) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "BaseWebView", e.toString(), e, false, 8, null);
        }
    }
}
