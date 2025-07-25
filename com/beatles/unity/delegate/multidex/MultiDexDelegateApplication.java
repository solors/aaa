package com.beatles.unity.delegate.multidex;

import android.content.Context;
import androidx.multidex.MultiDex;
import com.beatles.unity.delegate.DelegateApplication;
import com.cantalou.dexoptfix.DexOptFix;

/* loaded from: classes3.dex */
public class MultiDexDelegateApplication extends DelegateApplication {
    @Override // com.beatles.unity.delegate.DelegateApplication
    protected void onAttachBaseContext(Context context) {
        DexOptFix.fix(context);
        MultiDex.install(this);
    }
}
