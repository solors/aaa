package com.p551my.target;

import android.content.Context;
import android.net.Uri;

/* renamed from: com.my.target.w */
/* loaded from: classes7.dex */
public interface InterfaceC26180w {

    /* renamed from: com.my.target.w$a */
    /* loaded from: classes7.dex */
    public interface InterfaceC26181a {
        /* renamed from: a */
        void mo42476a(float f);

        /* renamed from: a */
        void mo42475a(float f, float f2);

        /* renamed from: a */
        void mo42466a(String str);

        /* renamed from: d */
        void mo42459d();

        /* renamed from: e */
        void mo42457e();

        /* renamed from: f */
        void mo42456f();

        /* renamed from: k */
        void mo42453k();

        /* renamed from: m */
        void mo42451m();

        /* renamed from: o */
        void mo42450o();

        void onVideoCompleted();
    }

    /* renamed from: a */
    void mo42644a();

    /* renamed from: a */
    void mo42643a(Uri uri, Context context);

    /* renamed from: a */
    void mo42642a(Uri uri, C26203x c26203x);

    /* renamed from: a */
    void mo42641a(InterfaceC26181a interfaceC26181a);

    /* renamed from: a */
    void mo42640a(C26203x c26203x);

    /* renamed from: b */
    void mo42639b();

    /* renamed from: c */
    boolean mo42638c();

    /* renamed from: d */
    void mo42637d();

    void destroy();

    /* renamed from: e */
    void mo42636e();

    /* renamed from: f */
    boolean mo42635f();

    /* renamed from: g */
    void mo42634g();

    float getDuration();

    Uri getUri();

    /* renamed from: h */
    boolean mo42633h();

    /* renamed from: i */
    void mo42632i();

    boolean isPlaying();

    /* renamed from: j */
    long mo42631j();

    void pause();

    void seekTo(long j);

    void setVolume(float f);

    void stop();
}
