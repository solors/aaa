package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.EnumC25053z;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.InterfaceC25403a;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.n */
/* loaded from: classes7.dex */
public interface InterfaceC25054n {

    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.n$a */
    /* loaded from: classes7.dex */
    public static final class C25055a {
        /* renamed from: a */
        public static /* synthetic */ void m45208a(InterfaceC25054n interfaceC25054n, List list, EnumC25053z enumC25053z, Integer num, String str, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    enumC25053z = null;
                }
                if ((i & 4) != 0) {
                    num = null;
                }
                if ((i & 8) != 0) {
                    str = null;
                }
                interfaceC25054n.mo45206a(list, enumC25053z, num, str);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: track");
        }

        /* renamed from: b */
        public static /* synthetic */ void m45207b(InterfaceC25054n interfaceC25054n, List list, EnumC25053z enumC25053z, Integer num, String str, List list2, InterfaceC25403a interfaceC25403a, InterfaceC25403a.AbstractC25404a.C25411f c25411f, int i, Object obj) {
            EnumC25053z enumC25053z2;
            Integer num2;
            String str2;
            if (obj == null) {
                if ((i & 2) != 0) {
                    enumC25053z2 = null;
                } else {
                    enumC25053z2 = enumC25053z;
                }
                if ((i & 4) != 0) {
                    num2 = null;
                } else {
                    num2 = num;
                }
                if ((i & 8) != 0) {
                    str2 = null;
                } else {
                    str2 = str;
                }
                interfaceC25054n.mo45205b(list, enumC25053z2, num2, str2, list2, interfaceC25403a, c25411f);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackClick");
        }
    }

    /* renamed from: a */
    void mo45206a(@NotNull List<String> list, @Nullable EnumC25053z enumC25053z, @Nullable Integer num, @Nullable String str);

    /* renamed from: b */
    void mo45205b(@NotNull List<String> list, @Nullable EnumC25053z enumC25053z, @Nullable Integer num, @Nullable String str, @NotNull List<InterfaceC25403a.AbstractC25404a.C25407c> list2, @NotNull InterfaceC25403a interfaceC25403a, @NotNull InterfaceC25403a.AbstractC25404a.C25411f c25411f);
}
