package com.iab.omid.library.mmadbridge.adsession;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.mmadbridge.publisher.AdSessionStatePublisher;
import com.iab.omid.library.mmadbridge.utils.C18326g;

/* loaded from: classes6.dex */
public abstract class AdSession {
    public static AdSession createAdSession(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        C18326g.m63123a();
        C18326g.m63120a(adSessionConfiguration, "AdSessionConfiguration is null");
        C18326g.m63120a(adSessionContext, "AdSessionContext is null");
        return new C18286a(adSessionConfiguration, adSessionContext);
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
