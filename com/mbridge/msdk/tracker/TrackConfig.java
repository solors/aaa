package com.mbridge.msdk.tracker;

import android.util.Log;

/* renamed from: com.mbridge.msdk.tracker.w */
/* loaded from: classes6.dex */
public final class TrackConfig {

    /* renamed from: a */
    public final int f59919a;

    /* renamed from: b */
    public final int f59920b;

    /* renamed from: c */
    public final int f59921c;

    /* renamed from: d */
    public final int f59922d;

    /* renamed from: e */
    public final int f59923e;

    /* renamed from: f */
    public final int f59924f;

    /* renamed from: g */
    public final NetworkStackConfig f59925g;

    /* renamed from: h */
    public final Decorate f59926h;

    /* renamed from: i */
    public final AbstractC22946v f59927i;

    /* renamed from: j */
    public final EventFilter f59928j;

    /* compiled from: TrackConfig.java */
    /* renamed from: com.mbridge.msdk.tracker.w$a */
    /* loaded from: classes6.dex */
    public static final class C22948a {

        /* renamed from: d */
        private NetworkStackConfig f59932d;

        /* renamed from: h */
        private Decorate f59936h;

        /* renamed from: i */
        private AbstractC22946v f59937i;

        /* renamed from: j */
        private EventFilter f59938j;

        /* renamed from: a */
        private int f59929a = 50;

        /* renamed from: b */
        private int f59930b = 15000;

        /* renamed from: c */
        private int f59931c = 1;

        /* renamed from: e */
        private int f59933e = 2;

        /* renamed from: f */
        private int f59934f = 50;

        /* renamed from: g */
        private int f59935g = 604800000;

        /* renamed from: a */
        public final C22948a m49312a(int i) {
            if (i <= 0) {
                this.f59929a = 50;
            } else {
                this.f59929a = i;
            }
            return this;
        }

        /* renamed from: b */
        public final C22948a m49306b(int i) {
            if (i < 0) {
                this.f59930b = 15000;
            } else {
                this.f59930b = i;
            }
            return this;
        }

        /* renamed from: c */
        public final C22948a m49304c(int i) {
            if (i <= 0) {
                this.f59933e = 2;
            } else {
                this.f59933e = i;
            }
            return this;
        }

        /* renamed from: d */
        public final C22948a m49302d(int i) {
            if (i < 0) {
                this.f59934f = 50;
            } else {
                this.f59934f = i;
            }
            return this;
        }

        /* renamed from: e */
        public final C22948a m49300e(int i) {
            if (i < 0) {
                this.f59935g = 604800000;
            } else {
                this.f59935g = i;
            }
            return this;
        }

        /* renamed from: a */
        public final C22948a m49311a(int i, NetworkStackConfig networkStackConfig) {
            this.f59931c = i;
            this.f59932d = networkStackConfig;
            return this;
        }

        /* renamed from: a */
        public final C22948a m49310a(Decorate decorate) {
            this.f59936h = decorate;
            return this;
        }

        /* renamed from: a */
        public final C22948a m49308a(AbstractC22946v abstractC22946v) {
            this.f59937i = abstractC22946v;
            return this;
        }

        /* renamed from: a */
        public final C22948a m49309a(EventFilter eventFilter) {
            this.f59938j = eventFilter;
            return this;
        }

        /* renamed from: a */
        public final TrackConfig m49313a() {
            if (C22949y.m49289a(this.f59936h) && Common.f59651a) {
                Log.e("TrackManager", "decorate can not be null");
            }
            if (C22949y.m49289a(this.f59937i) && Common.f59651a) {
                Log.e("TrackManager", "responseHandler can not be null");
            }
            if ((C22949y.m49289a(this.f59932d) || C22949y.m49289a(this.f59932d.m49361c())) && Common.f59651a) {
                Log.e("TrackManager", "networkStackConfig or stack can not be null");
            }
            return new TrackConfig(this);
        }
    }

    private TrackConfig(C22948a c22948a) {
        this.f59919a = c22948a.f59929a;
        this.f59920b = c22948a.f59930b;
        this.f59921c = c22948a.f59931c;
        this.f59922d = c22948a.f59933e;
        this.f59923e = c22948a.f59934f;
        this.f59924f = c22948a.f59935g;
        this.f59925g = c22948a.f59932d;
        this.f59926h = c22948a.f59936h;
        this.f59927i = c22948a.f59937i;
        this.f59928j = c22948a.f59938j;
    }
}
