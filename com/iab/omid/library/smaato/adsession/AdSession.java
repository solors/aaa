package com.iab.omid.library.smaato.adsession;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.smaato.publisher.AdSessionStatePublisher;
import com.iab.omid.library.smaato.utils.C18599g;

/* loaded from: classes6.dex */
public abstract class AdSession {
    public static AdSession createAdSession(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        C18599g.m62111a();
        C18599g.m62108a(adSessionConfiguration, "AdSessionConfiguration is null");
        C18599g.m62108a(adSessionContext, "AdSessionContext is null");
        return new C18559a(adSessionConfiguration, adSessionContext);
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
