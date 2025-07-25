package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import com.moloco.sdk.internal.AbstractC24405t;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.EnumC24586k;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.C25060a;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d */
/* loaded from: classes7.dex */
public interface InterfaceC24926d {

    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d$a */
    /* loaded from: classes7.dex */
    public static final class C24927a {
        /* renamed from: a */
        public static /* synthetic */ Object m45489a(InterfaceC24926d interfaceC24926d, String str, String str2, boolean z, Continuation continuation, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    str2 = "UNKNOWN_MTID";
                }
                return interfaceC24926d.mo45486b(str, str2, z, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
        }
    }

    @Nullable
    /* renamed from: a */
    Object mo45487a(@NotNull C25060a c25060a, long j, @NotNull Continuation<? super AbstractC24405t<C25060a, EnumC24586k>> continuation);

    @Nullable
    /* renamed from: b */
    Object mo45486b(@NotNull String str, @NotNull String str2, boolean z, @NotNull Continuation<? super AbstractC24405t<C25060a, EnumC24586k>> continuation);
}
