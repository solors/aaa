package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.external.InneractiveContentController;
import com.fyber.inneractive.sdk.external.VideoContentListener;

/* renamed from: com.fyber.inneractive.sdk.flow.T */
/* loaded from: classes4.dex */
public abstract class AbstractC14492T extends AbstractC14481H implements VideoContentListener {
    protected boolean isOverlayOutside = true;

    public boolean isOverlayOutside() {
        return this.isOverlayOutside;
    }

    @Override // com.fyber.inneractive.sdk.external.VideoContentListener
    public void onCompleted() {
        InneractiveContentController.EventsListener eventsListener = this.mEventsListener;
        if (eventsListener != null) {
            ((VideoContentListener) eventsListener).onCompleted();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.VideoContentListener
    public void onPlayerError() {
        InneractiveContentController.EventsListener eventsListener = this.mEventsListener;
        if (eventsListener != null) {
            ((VideoContentListener) eventsListener).onPlayerError();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.VideoContentListener
    public void onProgress(int i, int i2) {
        InneractiveContentController.EventsListener eventsListener = this.mEventsListener;
        if (eventsListener != null) {
            ((VideoContentListener) eventsListener).onProgress(i, i2);
        }
    }

    public AbstractC14492T setOverlayOutside(boolean z) {
        this.isOverlayOutside = z;
        return this;
    }
}
