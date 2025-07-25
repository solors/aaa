package com.mbridge.msdk.newreward.player.iview;

import org.json.JSONObject;

/* loaded from: classes6.dex */
public interface IWebTemplateView extends IBaseWebView, IPlayTempleView {
    void changeVideoViewPosition(JSONObject jSONObject);

    void playOrPauseVideo(int i);

    void seekToPlay(int i);

    void setMuteState(int i, int i2);
}
