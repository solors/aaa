package com.iab.omid.library.unity3d.adsession;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.unity3d.publisher.AdSessionStatePublisher;
import com.iab.omid.library.unity3d.utils.C18715g;

/* loaded from: classes6.dex */
public abstract class AdSession {
    public static AdSession createAdSession(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        C18715g.m61637a();
        C18715g.m61634a(adSessionConfiguration, "AdSessionConfiguration is null");
        C18715g.m61634a(adSessionContext, "AdSessionContext is null");
        return new C18678a(adSessionConfiguration, adSessionContext);
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
