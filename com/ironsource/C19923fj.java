package com.ironsource;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.webkit.WebView;
import com.ironsource.InterfaceC20705qj;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.fj */
/* loaded from: classes6.dex */
public final class C19923fj extends WebView implements InterfaceC20762rj {

    /* renamed from: a */
    private InterfaceC20705qj f50109a;
    @Nullable

    /* renamed from: b */
    private InterfaceC20214kn f50110b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19923fj(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: a */
    public final void m58557a(@Nullable InterfaceC20214kn interfaceC20214kn) {
        this.f50110b = interfaceC20214kn;
    }

    @Override // android.webkit.WebView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, @NotNull KeyEvent event) {
        boolean z;
        Intrinsics.checkNotNullParameter(event, "event");
        if (i == 4) {
            InterfaceC20214kn interfaceC20214kn = this.f50110b;
            if (interfaceC20214kn != null && interfaceC20214kn.onBackButtonPressed()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return super.onKeyDown(i, event);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19923fj(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    @Override // com.ironsource.InterfaceC20762rj
    /* renamed from: a */
    public void mo55474a(@NotNull String script) {
        Intrinsics.checkNotNullParameter(script, "script");
        InterfaceC20705qj interfaceC20705qj = this.f50109a;
        InterfaceC20705qj interfaceC20705qj2 = null;
        if (interfaceC20705qj == null) {
            Intrinsics.m17056y("javascriptEngine");
            interfaceC20705qj = null;
        }
        if (!interfaceC20705qj.mo55614a()) {
            InterfaceC20705qj interfaceC20705qj3 = this.f50109a;
            if (interfaceC20705qj3 == null) {
                Intrinsics.m17056y("javascriptEngine");
                interfaceC20705qj3 = null;
            }
            interfaceC20705qj3.mo55613a(this);
        }
        InterfaceC20705qj interfaceC20705qj4 = this.f50109a;
        if (interfaceC20705qj4 == null) {
            Intrinsics.m17056y("javascriptEngine");
        } else {
            interfaceC20705qj2 = interfaceC20705qj4;
        }
        interfaceC20705qj2.mo55612a(script);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19923fj(@NotNull Context context, @NotNull AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C19923fj(@NotNull Context context, @NotNull InterfaceC20705qj javascriptEngine) {
        this(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(javascriptEngine, "javascriptEngine");
        this.f50109a = javascriptEngine;
    }

    public /* synthetic */ C19923fj(Context context, InterfaceC20705qj interfaceC20705qj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new InterfaceC20705qj.C20706a(0, 1, null) : interfaceC20705qj);
    }
}
