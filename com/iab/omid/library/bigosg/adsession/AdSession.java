package com.iab.omid.library.bigosg.adsession;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.bigosg.p389d.C17955e;
import com.iab.omid.library.bigosg.publisher.AdSessionStatePublisher;

/* loaded from: classes6.dex */
public abstract class AdSession {
    public static AdSession createAdSession(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        C17955e.m64573a();
        C17955e.m64570a(adSessionConfiguration, "AdSessionConfiguration is null");
        C17955e.m64570a(adSessionContext, "AdSessionContext is null");
        return new C17933a(adSessionConfiguration, adSessionContext);
    }

    public abstract void addFriendlyObstruction(View view);

    public abstract void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str);

    public abstract void error(ErrorType errorType, String str);

    public abstract void finish();

    public abstract String getAdSessionId();

    public abstract AdSessionStatePublisher getAdSessionStatePublisher();

    public abstract void registerAdView(View view);

    public abstract void removeAllFriendlyObstructions();

    public abstract void removeFriendlyObstruction(View view);

    public abstract void start();
}
