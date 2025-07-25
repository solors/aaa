package com.iab.omid.library.taurusx.adsession;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.taurusx.publisher.AdSessionStatePublisher;
import com.iab.omid.library.taurusx.utils.C18658g;

/* loaded from: classes6.dex */
public abstract class AdSession {
    public static AdSession createAdSession(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        C18658g.m61871a();
        C18658g.m61868a(adSessionConfiguration, "AdSessionConfiguration is null");
        C18658g.m61868a(adSessionContext, "AdSessionContext is null");
        return new C18621a(adSessionConfiguration, adSessionContext);
    }

    public abstract void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str);

    public abstract void error(ErrorType errorType, String str);

    public abstract void finish();

    public abstract String getAdSessionId();

    public abstract AdSessionStatePublisher getAdSessionStatePublisher();

    public abstract void registerAdView(View view);

    public abstract void removeAllFriendlyObstructions();

    public abstract void removeFriendlyObstruction(View view);

    public abstract void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener);

    public abstract void start();
}
