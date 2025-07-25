package com.bytedance.sdk.openadsdk.core.p316PX;

import android.util.Pair;
import android.view.View;
import com.iab.omid.library.bytedance2.adsession.AdEvents;
import com.iab.omid.library.bytedance2.adsession.AdSession;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.bytedance2.adsession.media.Position;
import com.iab.omid.library.bytedance2.adsession.media.VastProperties;
import java.util.Set;

/* renamed from: com.bytedance.sdk.openadsdk.core.PX.iR */
/* loaded from: classes3.dex */
public class C8656iR {

    /* renamed from: bX */
    protected String f19117bX;
    protected VastProperties eqN;
    private final AdEvents ldr;

    /* renamed from: zx */
    private final AdSession f19120zx;

    /* renamed from: iR */
    private boolean f19119iR = false;

    /* renamed from: bg */
    protected boolean f19118bg = false;

    /* renamed from: IL */
    protected int f19116IL = 0;

    public C8656iR(AdSession adSession, AdEvents adEvents, View view) {
        this.f19120zx = adSession;
        this.ldr = adEvents;
        this.f19117bX = adSession.getAdSessionId();
        m85373bg(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: IL */
    public void mo85378IL(int i) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bX */
    public void m85377bX() {
        m85374bg(4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bg */
    public void mo85375bg(float f, boolean z) {
    }

    public void eqN() {
        m85374bg(3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: IL */
    public void m85379IL() {
        m85374bg(1);
    }

    /* renamed from: bg */
    public void mo85370bg(boolean z) {
    }

    /* renamed from: bg */
    public void mo85369bg(boolean z, float f) {
    }

    /* renamed from: bg */
    void m85373bg(View view) {
        AdSession adSession;
        if (view == null || (adSession = this.f19120zx) == null) {
            return;
        }
        adSession.registerAdView(view);
    }

    /* renamed from: bg */
    public void m85372bg(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        AdSession adSession = this.f19120zx;
        if (adSession != null) {
            adSession.addFriendlyObstruction(view, friendlyObstructionPurpose, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bg */
    public boolean m85376bg() {
        return this.f19118bg;
    }

    /* renamed from: bg */
    public void m85374bg(int i) {
        int i2;
        int i3;
        if (this.f19120zx == null || this.ldr == null) {
            return;
        }
        boolean z = false;
        if (C8668zx.m85337bX()) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4 && (i3 = this.f19116IL) != 0 && i3 != 4) {
                            this.f19120zx.finish();
                            this.f19118bg = false;
                            z = true;
                        }
                    } else if (!this.f19119iR && ((i2 = this.f19116IL) == 1 || i2 == 2)) {
                        this.ldr.impressionOccurred();
                        this.f19119iR = true;
                        z = true;
                    }
                } else if (this.f19116IL == 0) {
                    this.f19120zx.start();
                    if (this.eqN == null) {
                        this.eqN = VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
                    }
                    this.ldr.loaded(this.eqN);
                    this.f19118bg = true;
                    this.eqN = null;
                    z = true;
                }
            } else if (this.f19116IL == 0) {
                this.f19120zx.start();
                this.ldr.loaded();
                this.f19118bg = true;
                z = true;
            }
        }
        if (z) {
            this.f19116IL = i;
        }
    }

    /* renamed from: bg */
    public void m85371bg(Set<Pair<View, FriendlyObstructionPurpose>> set) {
        for (Pair<View, FriendlyObstructionPurpose> pair : set) {
            m85372bg((View) pair.first, (FriendlyObstructionPurpose) pair.second);
        }
    }
}
