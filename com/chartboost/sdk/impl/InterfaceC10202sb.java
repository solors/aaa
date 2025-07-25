package com.chartboost.sdk.impl;

import android.content.Context;

/* renamed from: com.chartboost.sdk.impl.sb */
/* loaded from: classes3.dex */
public interface InterfaceC10202sb {

    /* renamed from: com.chartboost.sdk.impl.sb$a */
    /* loaded from: classes3.dex */
    public static final class C10203a {
        /* renamed from: a */
        public static /* synthetic */ void m80593a(InterfaceC10202sb interfaceC10202sb, String str, int i, boolean z, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 1) != 0) {
                    str = null;
                }
                if ((i2 & 2) != 0) {
                    i = 0;
                }
                if ((i2 & 4) != 0) {
                    z = false;
                }
                interfaceC10202sb.mo80379a(str, i, z);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startDownloadIfPossible");
        }
    }

    /* renamed from: a */
    int mo80382a(C9967ib c9967ib);

    /* renamed from: a */
    void mo80383a(Context context);

    /* renamed from: a */
    void mo80379a(String str, int i, boolean z);

    /* renamed from: a */
    void mo80377a(String str, String str2, boolean z, InterfaceC10014l0 interfaceC10014l0);

    /* renamed from: a */
    boolean mo80380a(String str);

    /* renamed from: b */
    C9967ib mo80373b(String str);
}
