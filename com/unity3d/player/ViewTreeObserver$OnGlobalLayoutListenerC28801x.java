package com.unity3d.player;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.unity3d.player.x */
/* loaded from: classes7.dex */
public class ViewTreeObserver$OnGlobalLayoutListenerC28801x implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ View f74902a;

    /* renamed from: b */
    final /* synthetic */ DialogC28698B f74903b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewTreeObserver$OnGlobalLayoutListenerC28801x(DialogC28698B dialogC28698B, View view) {
        this.f74903b = dialogC28698B;
        this.f74902a = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        UnityPlayer unityPlayer;
        UnityPlayer unityPlayer2;
        UnityPlayer unityPlayer3;
        UnityPlayer unityPlayer4;
        UnityPlayer unityPlayer5;
        UnityPlayer unityPlayer6;
        UnityPlayer unityPlayer7;
        if (this.f74902a.isShown()) {
            Rect rect = new Rect();
            unityPlayer = this.f74903b.f74513b;
            unityPlayer.getWindowVisibleDisplayFrame(rect);
            int[] iArr = new int[2];
            unityPlayer2 = this.f74903b.f74513b;
            unityPlayer2.getLocationOnScreen(iArr);
            Point point = new Point(rect.left - iArr[0], rect.height() - this.f74902a.getHeight());
            Point point2 = new Point();
            this.f74903b.getWindow().getWindowManager().getDefaultDisplay().getSize(point2);
            unityPlayer3 = this.f74903b.f74513b;
            int height = unityPlayer3.getHeight() - point2.y;
            unityPlayer4 = this.f74903b.f74513b;
            int height2 = unityPlayer4.getHeight() - point.y;
            if (height2 != height + this.f74902a.getHeight()) {
                unityPlayer7 = this.f74903b.f74513b;
                unityPlayer7.reportSoftInputIsVisible(true);
            } else {
                unityPlayer5 = this.f74903b.f74513b;
                unityPlayer5.reportSoftInputIsVisible(false);
            }
            Rect rect2 = new Rect(point.x, point.y, this.f74902a.getWidth(), height2);
            unityPlayer6 = this.f74903b.f74513b;
            unityPlayer6.reportSoftInputArea(rect2);
        }
    }
}
