package com.maticoo.sdk.core;

import androidx.compose.animation.core.C0379a;
import com.maticoo.sdk.utils.log.DeveloperLog;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public class AdStateMachine {
    private final AtomicReference<State> backState;
    private final AtomicReference<State> currentState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public enum State {
        NORMAL,
        LOAD,
        LOADING,
        LOAD_SUCCESS,
        LOAD_FAILED,
        SHOW,
        IMPRESSION,
        SHOWING,
        SHOW_FAILED,
        EXPAND,
        CLOSE_FAKE,
        CLOSE,
        DESTROY
    }

    public AdStateMachine() {
        State state = State.NORMAL;
        this.currentState = new AtomicReference<>(state);
        this.backState = new AtomicReference<>(state);
    }

    private void updateState(State state, State state2, String str) {
        State state3 = this.currentState.get();
        if ((state == null || state3 == state) && C0379a.m105461a(this.currentState, state3, state2)) {
            this.backState.set(state3);
            DeveloperLog.LogD("AdStateMachine " + str);
        }
    }

    public void backState() {
        this.currentState.set(this.backState.get());
    }

    public State getState() {
        return this.currentState.get();
    }

    public boolean isClose() {
        if (getState() == State.CLOSE) {
            return true;
        }
        return false;
    }

    public boolean isCloseFake() {
        if (getState() == State.CLOSE_FAKE) {
            return true;
        }
        return false;
    }

    public boolean isDestroy() {
        if (getState() == State.DESTROY) {
            return true;
        }
        return false;
    }

    public boolean isExpand() {
        if (getState() == State.EXPAND) {
            return true;
        }
        return false;
    }

    public boolean isImpression() {
        if (getState() == State.IMPRESSION) {
            return true;
        }
        return false;
    }

    public boolean isLoad() {
        if (getState() == State.LOAD) {
            return true;
        }
        return false;
    }

    public boolean isLoadSuccess() {
        if (getState() == State.LOAD_SUCCESS) {
            return true;
        }
        return false;
    }

    public boolean isLoading() {
        if (getState() == State.LOADING) {
            return true;
        }
        return false;
    }

    public boolean isShow() {
        if (getState() == State.SHOW) {
            return true;
        }
        return false;
    }

    public boolean isShowAndShowing() {
        State state = getState();
        if (state != State.SHOWING && state != State.SHOW) {
            return false;
        }
        return true;
    }

    public boolean isShowing() {
        if (getState() == State.SHOWING) {
            return true;
        }
        return false;
    }

    public void onClose() {
        State state = State.SHOWING;
        State state2 = State.CLOSE;
        updateState(state, state2, "closed.");
        updateState(State.SHOW_FAILED, state2, "closed.");
        updateState(State.DESTROY, state2, "closed.");
    }

    public void onCloseFake() {
        updateState(null, State.CLOSE_FAKE, "close fake...");
    }

    public void onDestroy() {
        State state = State.CLOSE;
        State state2 = State.DESTROY;
        updateState(state, state2, "destroyed.");
        updateState(State.CLOSE_FAKE, state2, "destroyed.");
    }

    public void onExpand() {
        updateState(State.SHOWING, State.EXPAND, "expand state...");
    }

    public void onImpression() {
        updateState(State.SHOW, State.IMPRESSION, "visibility detection passed...");
    }

    public void onLoad() {
        updateState(null, State.LOAD, "prep load...");
    }

    public void onLoadFailed() {
        State state = State.LOADING;
        State state2 = State.LOAD_FAILED;
        updateState(state, state2, "load failed！");
        updateState(State.LOAD_SUCCESS, state2, "load failed！");
    }

    public void onLoadSuccess() {
        updateState(State.LOADING, State.LOAD_SUCCESS, "load success");
    }

    public void onLoading() {
        updateState(null, State.LOADING, "loading...");
    }

    public void onShow() {
        updateState(State.LOAD_SUCCESS, State.SHOW, "begin show...");
    }

    public void onShowFailed() {
        State state = State.SHOW;
        State state2 = State.SHOW_FAILED;
        updateState(state, state2, "show failed！");
        updateState(State.SHOWING, state2, "show failed！");
    }

    public void onShowing() {
        State state = State.SHOW;
        State state2 = State.SHOWING;
        updateState(state, state2, "showing...");
        updateState(State.IMPRESSION, state2, "showing...");
    }

    public void reset() {
        updateState(null, State.NORMAL, "reset！");
    }
}
