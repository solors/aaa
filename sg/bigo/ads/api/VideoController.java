package sg.bigo.ads.api;

import androidx.annotation.Nullable;

/* loaded from: classes10.dex */
public interface VideoController {

    /* loaded from: classes10.dex */
    public interface VideoLifeCallback {
        void onMuteChange(boolean z);

        void onVideoEnd();

        void onVideoPause();

        void onVideoPlay();

        void onVideoStart();
    }

    /* renamed from: sg.bigo.ads.api.VideoController$a */
    /* loaded from: classes10.dex */
    public interface InterfaceC43508a {
        /* renamed from: i */
        void mo5475i(boolean z);
    }

    /* renamed from: sg.bigo.ads.api.VideoController$b */
    /* loaded from: classes10.dex */
    public interface InterfaceC43509b extends VideoLifeCallback {
        /* renamed from: a */
        void mo5474a();

        /* renamed from: b */
        void mo5473b();
    }

    /* renamed from: sg.bigo.ads.api.VideoController$c */
    /* loaded from: classes10.dex */
    public interface InterfaceC43510c {
        /* renamed from: a */
        void mo5472a();
    }

    /* renamed from: sg.bigo.ads.api.VideoController$d */
    /* loaded from: classes10.dex */
    public interface InterfaceC43511d {
        /* renamed from: a */
        void mo5471a(int i, int i2);
    }

    InterfaceC43508a getBackupLoadCallback();

    InterfaceC43510c getLoadHTMLCallback();

    @Nullable
    InterfaceC43511d getProgressChangeListener();

    @Nullable
    VideoLifeCallback getVideoLifeCallback();

    boolean isMuted();

    boolean isPaused();

    boolean isPlaying();

    void mute(boolean z);

    void notifyBackupResourceReady();

    void notifyPlayViewRegister();

    void notifyResourceReady();

    void pause();

    void play();

    void setBackupLoadCallback(InterfaceC43508a interfaceC43508a);

    void setLoadHTMLCallback(InterfaceC43510c interfaceC43510c);

    void setProgressChangeListener(InterfaceC43511d interfaceC43511d);

    void setVideoLifeCallback(VideoLifeCallback videoLifeCallback);
}
