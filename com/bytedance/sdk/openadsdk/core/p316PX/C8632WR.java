package com.bytedance.sdk.openadsdk.core.p316PX;

import android.view.View;
import androidx.annotation.NonNull;
import com.iab.omid.library.bytedance2.adsession.AdEvents;
import com.iab.omid.library.bytedance2.adsession.AdSession;
import com.iab.omid.library.bytedance2.adsession.media.InteractionType;
import com.iab.omid.library.bytedance2.adsession.media.MediaEvents;
import com.iab.omid.library.bytedance2.adsession.media.PlayerState;
import com.iab.omid.library.bytedance2.adsession.media.Position;
import com.iab.omid.library.bytedance2.adsession.media.VastProperties;

/* renamed from: com.bytedance.sdk.openadsdk.core.PX.WR */
/* loaded from: classes3.dex */
public class C8632WR extends C8656iR {
    private boolean ldr;
    @NonNull

    /* renamed from: zx */
    private final MediaEvents f19036zx;

    public C8632WR(@NonNull AdSession adSession, @NonNull AdEvents adEvents, @NonNull View view, @NonNull MediaEvents mediaEvents) {
        super(adSession, adEvents, view);
        this.f19036zx = mediaEvents;
    }

    @Override // com.bytedance.sdk.openadsdk.core.p316PX.C8656iR
    /* renamed from: IL */
    public void mo85378IL(int i) {
        float f;
        if (!m85376bg()) {
            return;
        }
        switch (i) {
            case 0:
                this.f19036zx.pause();
                return;
            case 1:
                this.f19036zx.resume();
                return;
            case 2:
            case 14:
                this.f19036zx.skipped();
                return;
            case 3:
            default:
                return;
            case 4:
                this.f19036zx.bufferStart();
                return;
            case 5:
                this.f19036zx.bufferFinish();
                return;
            case 6:
                this.f19036zx.firstQuartile();
                return;
            case 7:
                this.f19036zx.midpoint();
                return;
            case 8:
                this.f19036zx.thirdQuartile();
                return;
            case 9:
                this.f19036zx.complete();
                return;
            case 10:
                this.f19036zx.playerStateChange(PlayerState.FULLSCREEN);
                return;
            case 11:
                this.f19036zx.playerStateChange(PlayerState.NORMAL);
                return;
            case 12:
                MediaEvents mediaEvents = this.f19036zx;
                if (this.ldr) {
                    f = 0.0f;
                } else {
                    f = 1.0f;
                }
                mediaEvents.volumeChange(f);
                return;
            case 13:
                this.f19036zx.adUserInteraction(InteractionType.CLICK);
                return;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.p316PX.C8656iR
    /* renamed from: bg */
    public void mo85369bg(boolean z, float f) {
        if (z) {
            this.eqN = VastProperties.createVastPropertiesForSkippableMedia(f, true, Position.STANDALONE);
        } else {
            this.eqN = VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
        }
        m85374bg(2);
    }

    @Override // com.bytedance.sdk.openadsdk.core.p316PX.C8656iR
    /* renamed from: bg */
    public void mo85375bg(float f, boolean z) {
        if (m85376bg()) {
            this.f19036zx.start(f, z ? 0.0f : 1.0f);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.p316PX.C8656iR
    /* renamed from: bg */
    public void mo85370bg(boolean z) {
        this.ldr = z;
        mo85378IL(12);
    }
}
