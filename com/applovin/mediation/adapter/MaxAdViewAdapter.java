package com.applovin.mediation.adapter;

import android.app.Activity;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;

/* loaded from: classes2.dex */
public interface MaxAdViewAdapter {
    void loadAdViewAd(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, Activity activity, MaxAdViewAdapterListener maxAdViewAdapterListener);
}
