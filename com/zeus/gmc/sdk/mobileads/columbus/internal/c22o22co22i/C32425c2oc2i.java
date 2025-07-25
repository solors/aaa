package com.zeus.gmc.sdk.mobileads.columbus.internal.c22o22co22i;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.zeus.gmc.sdk.mobileads.columbus.p626ad.interstitialad.InterstitialAdError;
import com.zeus.gmc.sdk.mobileads.columbus.util.MLog;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.c22o22co22i.c2oc2i */
/* loaded from: classes8.dex */
public class C32425c2oc2i extends AbstractC32442coo2iico {
    private static final String c2oc2o = "BroadcastReceiverForInt";
    private static IntentFilter cco22;
    private final InterfaceC32437cioccoiococ cioccoiococ;

    public C32425c2oc2i(InterfaceC32437cioccoiococ interfaceC32437cioccoiococ, long j) {
        super(j);
        this.cioccoiococ = interfaceC32437cioccoiococ;
        coo2iico();
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.c22o22co22i.AbstractC32442coo2iico
    @NonNull
    public IntentFilter coo2iico() {
        if (cco22 == null) {
            IntentFilter intentFilter = new IntentFilter();
            cco22 = intentFilter;
            intentFilter.addAction(C32433cicc2iiccc.coo2iico);
            cco22.addAction(C32433cicc2iiccc.coi222o222);
            cco22.addAction(C32433cicc2iiccc.c2oc2i);
            cco22.addAction(C32433cicc2iiccc.cioccoiococ);
        }
        return cco22;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (this.cioccoiococ == null || !coo2iico(intent)) {
            return;
        }
        String action = intent.getAction();
        if (C32433cicc2iiccc.coo2iico.equals(action)) {
            this.cioccoiococ.onAdError(InterstitialAdError.NETWORK_ERROR);
        } else if (C32433cicc2iiccc.coi222o222.equals(action)) {
            this.cioccoiococ.onLoggingImpression();
        } else if (C32433cicc2iiccc.c2oc2i.equals(action)) {
            this.cioccoiococ.onAdClosed();
        } else if (C32433cicc2iiccc.cioccoiococ.equals(action)) {
            String stringExtra = intent.getStringExtra("click_url");
            if (TextUtils.isEmpty(stringExtra)) {
                MLog.m25887i(c2oc2o, "The click url has been handled by web view!");
                this.cioccoiococ.onAdClicked();
                return;
            }
            MLog.m25887i(c2oc2o, "The click url will be handled by us!");
            this.cioccoiococ.onAdClicked(stringExtra);
        }
    }
}
