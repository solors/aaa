package com.mbridge.msdk.thrid.okhttp;

import com.mbridge.msdk.thrid.okio.ByteString;

/* loaded from: classes6.dex */
public abstract class WebSocketListener {
    public void onMessage(WebSocket webSocket, ByteString byteString) {
    }

    public void onMessage(WebSocket webSocket, String str) {
    }

    public void onOpen(WebSocket webSocket, Response response) {
    }

    public void onClosed(WebSocket webSocket, int i, String str) {
    }

    public void onClosing(WebSocket webSocket, int i, String str) {
    }

    public void onFailure(WebSocket webSocket, Throwable th, Response response) {
    }
}
