package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebViewClient;
import com.chartboost.sdk.impl.C10210t1;
import com.chartboost.sdk.impl.C10356x9;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.chartboost.sdk.impl.t1 */
/* loaded from: classes3.dex */
public final class C10210t1 extends C10110p2 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10210t1(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: a */
    public static final boolean m80560a(C10356x9 c10356x9, View view, MotionEvent motionEvent) {
        if (c10356x9 != null) {
            Intrinsics.m17074g(motionEvent);
            c10356x9.m80066a(motionEvent);
        }
        if (motionEvent.getAction() == 2) {
            return true;
        }
        return false;
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(@NotNull WebViewClient client) {
        final C10356x9 c10356x9;
        Intrinsics.checkNotNullParameter(client, "client");
        super.setWebViewClient(client);
        if (client instanceof C10238u1) {
            c10356x9 = ((C10238u1) client).m80460a();
        } else {
            c10356x9 = null;
        }
        setOnTouchListener(new View.OnTouchListener() { // from class: o0.p
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return C10210t1.m80560a(C10356x9.this, view, motionEvent);
            }
        });
    }
}
