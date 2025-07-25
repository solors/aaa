package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveContentController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.util.AbstractC15471s;
import com.fyber.inneractive.sdk.util.IAlog;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.fyber.inneractive.sdk.flow.Q */
/* loaded from: classes4.dex */
public abstract class AbstractC14490Q implements InneractiveUnitController {
    protected WeakReference<InterfaceC14480G> mAdSpot;
    protected Set<InneractiveContentController> mContentControllers = new HashSet();
    protected InneractiveUnitController.EventsListener mEventsListener;
    protected InneractiveContentController mSelectedContentController;

    @Override // com.fyber.inneractive.sdk.external.InneractiveUnitController
    public void addContentController(InneractiveContentController inneractiveContentController) {
        this.mContentControllers.add(inneractiveContentController);
    }

    public boolean canRefreshAd() {
        return supportsRefresh();
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveUnitController
    public void destroy() {
        for (InneractiveContentController inneractiveContentController : this.mContentControllers) {
            inneractiveContentController.destroy();
        }
        this.mContentControllers.clear();
        this.mSelectedContentController = null;
        this.mAdSpot = null;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveUnitController
    public InneractiveAdSpot getAdSpot() {
        return (InterfaceC14480G) AbstractC15471s.m76459a(this.mAdSpot);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveUnitController
    public InneractiveUnitController.EventsListener getEventsListener() {
        return this.mEventsListener;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveUnitController
    public InneractiveContentController getSelectedContentController() {
        return this.mSelectedContentController;
    }

    public String logPrefix() {
        return IAlog.m76531a(this);
    }

    public void selectContentController() {
        InneractiveAdSpot inneractiveAdSpot = (InneractiveAdSpot) AbstractC15471s.m76459a(this.mAdSpot);
        if (inneractiveAdSpot == null) {
            IAlog.m76524f("selectContentController called, but ad spot is null", new Object[0]);
            return;
        }
        for (InneractiveContentController inneractiveContentController : this.mContentControllers) {
            AbstractC14481H abstractC14481H = (AbstractC14481H) inneractiveContentController;
            if (abstractC14481H.canControl(inneractiveAdSpot)) {
                this.mSelectedContentController = inneractiveContentController;
                abstractC14481H.setAdSpot(inneractiveAdSpot);
            }
        }
    }

    public void setAdSpot(InterfaceC14480G interfaceC14480G) {
        this.mAdSpot = new WeakReference<>(interfaceC14480G);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveUnitController
    public void setEventsListener(InneractiveUnitController.EventsListener eventsListener) {
        this.mEventsListener = eventsListener;
    }

    public abstract boolean supports(InneractiveAdSpot inneractiveAdSpot);

    public abstract boolean supportsRefresh();
}
