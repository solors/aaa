package com.iab.omid.library.pubnativenet.adsession;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.pubnativenet.publisher.AdSessionStatePublisher;
import com.iab.omid.library.pubnativenet.utils.C18536g;

/* loaded from: classes6.dex */
public abstract class AdSession {
    public static AdSession createAdSession(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        C18536g.m62364a();
        C18536g.m62361a(adSessionConfiguration, "AdSessionConfiguration is null");
        C18536g.m62361a(adSessionContext, "AdSessionContext is null");
        return new C18496a(adSessionConfiguration, adSessionContext);
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
