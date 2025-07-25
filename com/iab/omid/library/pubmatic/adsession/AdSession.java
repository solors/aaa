package com.iab.omid.library.pubmatic.adsession;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.pubmatic.publisher.AdSessionStatePublisher;
import com.iab.omid.library.pubmatic.utils.C18466g;

/* loaded from: classes6.dex */
public abstract class AdSession {
    public static AdSession createAdSession(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        C18466g.m62617a();
        C18466g.m62614a(adSessionConfiguration, "AdSessionConfiguration is null");
        C18466g.m62614a(adSessionContext, "AdSessionContext is null");
        return new C18426a(adSessionConfiguration, adSessionContext);
    }

    public abstract void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str);

    public abstract void error(ErrorType errorType, String str);

    public abstract void finish();

    public abstract String getAdSessionId();

    public abstract AdSessionStatePublisher getAdSessionStatePublisher();

    public abstract void registerAdView(@Nullable View view);

    public abstract void removeAllFriendlyObstructions();

    public abstract void removeFriendlyObstruction(View view);

    public abstract void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener);

    public abstract void start();
}
