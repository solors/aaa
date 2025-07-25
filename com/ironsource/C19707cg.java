package com.ironsource;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.sdk.utils.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.cg */
/* loaded from: classes6.dex */
public final class C19707cg extends FrameLayout {
    @NotNull

    /* renamed from: a */
    private final String f49452a;
    @Nullable

    /* renamed from: b */
    private InterfaceC19708a f49453b;

    @Metadata
    /* renamed from: com.ironsource.cg$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC19708a {
        /* renamed from: a */
        void mo58361a(@NotNull C19941fu c19941fu);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19707cg(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f49452a = "ISNNativeAdContainer";
    }

    /* renamed from: a */
    private final C19941fu m59161a() {
        boolean z;
        boolean z2 = true;
        if (getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (getWindowVisibility() != 0) {
            z2 = false;
        }
        return new C19941fu(z, z2, isShown());
    }

    @Nullable
    public final InterfaceC19708a getListener$mediationsdk_release() {
        return this.f49453b;
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NotNull View changedView, int i) {
        Intrinsics.checkNotNullParameter(changedView, "changedView");
        String str = this.f49452a;
        Logger.m54970i(str, "onVisibilityChanged: " + i);
        InterfaceC19708a interfaceC19708a = this.f49453b;
        if (interfaceC19708a != null) {
            interfaceC19708a.mo58361a(m59161a());
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        String str = this.f49452a;
        Logger.m54970i(str, "onWindowVisibilityChanged: " + i);
        InterfaceC19708a interfaceC19708a = this.f49453b;
        if (interfaceC19708a != null) {
            interfaceC19708a.mo58361a(m59161a());
        }
    }

    public final void setListener$mediationsdk_release(@Nullable InterfaceC19708a interfaceC19708a) {
        this.f49453b = interfaceC19708a;
    }
}
