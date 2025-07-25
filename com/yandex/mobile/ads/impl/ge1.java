package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import android.view.TextureView;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import com.inmobi.commons.core.configs.CrashConfig;
import com.monetization.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.impl.InterfaceC30632jl;
import com.yandex.mobile.ads.impl.ge1;
import com.yandex.mobile.ads.impl.n90;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes8.dex */
public interface ge1 {

    /* renamed from: com.yandex.mobile.ads.impl.ge1$a */
    /* loaded from: classes8.dex */
    public static final class C30380a implements InterfaceC30632jl {

        /* renamed from: c */
        public static final C30380a f79607c = new C30380a(new n90.C30918a().m31641a());

        /* renamed from: b */
        private final n90 f79608b;

        /* renamed from: com.yandex.mobile.ads.impl.ge1$a$a */
        /* loaded from: classes8.dex */
        public static final class C30381a {

            /* renamed from: a */
            private final n90.C30918a f79609a = new n90.C30918a();

            /* renamed from: a */
            public final C30381a m33864a(int i) {
                this.f79609a.m31640a(i);
                return this;
            }

            /* renamed from: a */
            public final C30381a m33863a(C30380a c30380a) {
                this.f79609a.m31639a(c30380a.f79608b);
                return this;
            }

            /* renamed from: a */
            public final C30381a m33861a(int... iArr) {
                n90.C30918a c30918a = this.f79609a;
                c30918a.getClass();
                for (int i : iArr) {
                    c30918a.m31640a(i);
                }
                return this;
            }

            /* renamed from: a */
            public final C30381a m33862a(boolean z, int i) {
                n90.C30918a c30918a = this.f79609a;
                if (z) {
                    c30918a.m31640a(i);
                } else {
                    c30918a.getClass();
                }
                return this;
            }

            /* renamed from: a */
            public final C30380a m33865a() {
                return new C30380a(this.f79609a.m31641a());
            }
        }

        static {
            new InterfaceC30632jl.InterfaceC30633a() { // from class: com.yandex.mobile.ads.impl.ep2
                @Override // com.yandex.mobile.ads.impl.InterfaceC30632jl.InterfaceC30633a
                public final InterfaceC30632jl fromBundle(Bundle bundle) {
                    ge1.C30380a m33868a;
                    m33868a = ge1.C30380a.m33868a(bundle);
                    return m33868a;
                }
            };
        }

        /* renamed from: a */
        public static C30380a m33868a(Bundle bundle) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(Integer.toString(0, 36));
            if (integerArrayList == null) {
                return f79607c;
            }
            n90.C30918a c30918a = new n90.C30918a();
            for (int i = 0; i < integerArrayList.size(); i++) {
                c30918a.m31640a(integerArrayList.get(i).intValue());
            }
            return new C30380a(c30918a.m31641a());
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C30380a)) {
                return false;
            }
            return this.f79608b.equals(((C30380a) obj).f79608b);
        }

        public final int hashCode() {
            return this.f79608b.hashCode();
        }

        private C30380a(n90 n90Var) {
            this.f79608b = n90Var;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ge1$b */
    /* loaded from: classes8.dex */
    public interface InterfaceC30382b {
        /* renamed from: a */
        default void mo29492a(int i) {
        }

        /* renamed from: a */
        default void mo29488a(Metadata metadata) {
        }

        /* renamed from: a */
        default void mo29487a(@Nullable a40 a40Var) {
        }

        /* renamed from: a */
        default void mo29486a(ae1 ae1Var) {
        }

        /* renamed from: a */
        default void mo29483a(C30380a c30380a) {
        }

        /* renamed from: a */
        default void mo29482a(C30383c c30383c, C30383c c30383c2, int i) {
        }

        /* renamed from: a */
        default void mo29479a(ia2 ia2Var) {
        }

        /* renamed from: a */
        default void mo29478a(@Nullable jt0 jt0Var, int i) {
        }

        /* renamed from: a */
        default void mo29477a(mt0 mt0Var) {
        }

        /* renamed from: a */
        default void mo29441a(C31541tz c31541tz) {
        }

        /* renamed from: a */
        default void mo29438a(w12 w12Var) {
        }

        /* renamed from: a */
        default void mo29437a(C32015zt c32015zt) {
        }

        /* renamed from: a */
        default void mo29431a(boolean z, int i) {
        }

        default void onRenderedFirstFrame() {
        }

        /* renamed from: b */
        default void mo28031b(a40 a40Var) {
        }

        @Deprecated
        default void onCues(List<C31840xt> list) {
        }

        default void onIsLoadingChanged(boolean z) {
        }

        default void onIsPlayingChanged(boolean z) {
        }

        default void onPlaybackStateChanged(int i) {
        }

        default void onPlaybackSuppressionReasonChanged(int i) {
        }

        default void onSkipSilenceEnabledChanged(boolean z) {
        }

        default void onVolumeChanged(float f) {
        }

        default void onPlayWhenReadyChanged(boolean z, int i) {
        }

        @Deprecated
        default void onPlayerStateChanged(boolean z, int i) {
        }

        default void onSurfaceSizeChanged(int i, int i2) {
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ge1$c */
    /* loaded from: classes8.dex */
    public static final class C30383c implements InterfaceC30632jl {
        @Nullable

        /* renamed from: b */
        public final Object f79610b;

        /* renamed from: c */
        public final int f79611c;
        @Nullable

        /* renamed from: d */
        public final jt0 f79612d;
        @Nullable

        /* renamed from: e */
        public final Object f79613e;

        /* renamed from: f */
        public final int f79614f;

        /* renamed from: g */
        public final long f79615g;

        /* renamed from: h */
        public final long f79616h;

        /* renamed from: i */
        public final int f79617i;

        /* renamed from: j */
        public final int f79618j;

        static {
            new InterfaceC30632jl.InterfaceC30633a() { // from class: com.yandex.mobile.ads.impl.gp2
                @Override // com.yandex.mobile.ads.impl.InterfaceC30632jl.InterfaceC30633a
                public final InterfaceC30632jl fromBundle(Bundle bundle) {
                    ge1.C30383c m33860a;
                    m33860a = ge1.C30383c.m33860a(bundle);
                    return m33860a;
                }
            };
        }

        public C30383c(@Nullable Object obj, int i, @Nullable jt0 jt0Var, @Nullable Object obj2, int i2, long j, long j2, int i3, int i4) {
            this.f79610b = obj;
            this.f79611c = i;
            this.f79612d = jt0Var;
            this.f79613e = obj2;
            this.f79614f = i2;
            this.f79615g = j;
            this.f79616h = j2;
            this.f79617i = i3;
            this.f79618j = i4;
        }

        /* renamed from: a */
        public static C30383c m33860a(Bundle bundle) {
            jt0 fromBundle;
            int i = bundle.getInt(Integer.toString(0, 36), -1);
            Bundle bundle2 = bundle.getBundle(Integer.toString(1, 36));
            if (bundle2 == null) {
                fromBundle = null;
            } else {
                fromBundle = jt0.f81080h.fromBundle(bundle2);
            }
            return new C30383c(null, i, fromBundle, null, bundle.getInt(Integer.toString(2, 36), -1), bundle.getLong(Integer.toString(3, 36), -9223372036854775807L), bundle.getLong(Integer.toString(4, 36), -9223372036854775807L), bundle.getInt(Integer.toString(5, 36), -1), bundle.getInt(Integer.toString(6, 36), -1));
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C30383c.class != obj.getClass()) {
                return false;
            }
            C30383c c30383c = (C30383c) obj;
            if (this.f79611c == c30383c.f79611c && this.f79614f == c30383c.f79614f && this.f79615g == c30383c.f79615g && this.f79616h == c30383c.f79616h && this.f79617i == c30383c.f79617i && this.f79618j == c30383c.f79618j && da1.m34981a(this.f79610b, c30383c.f79610b) && da1.m34981a(this.f79613e, c30383c.f79613e) && da1.m34981a(this.f79612d, c30383c.f79612d)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f79610b, Integer.valueOf(this.f79611c), this.f79612d, this.f79613e, Integer.valueOf(this.f79614f), Long.valueOf(this.f79615g), Long.valueOf(this.f79616h), Integer.valueOf(this.f79617i), Integer.valueOf(this.f79618j)});
        }
    }

    @Nullable
    /* renamed from: a */
    a40 mo33871a();

    /* renamed from: a */
    void mo33870a(InterfaceC30382b interfaceC30382b);

    /* renamed from: b */
    void mo33869b(InterfaceC30382b interfaceC30382b);

    long getContentPosition();

    int getCurrentAdGroupIndex();

    int getCurrentAdIndexInAdGroup();

    int getCurrentMediaItemIndex();

    int getCurrentPeriodIndex();

    long getCurrentPosition();

    g02 getCurrentTimeline();

    w12 getCurrentTracks();

    long getDuration();

    boolean getPlayWhenReady();

    int getPlaybackState();

    int getPlaybackSuppressionReason();

    long getTotalBufferedDuration();

    @FloatRange(from = 0.0d, m105511to = CrashConfig.DEFAULT_CRASH_SAMPLING_PERCENT)
    float getVolume();

    boolean hasNextMediaItem();

    boolean hasPreviousMediaItem();

    boolean isCurrentMediaItemDynamic();

    boolean isCurrentMediaItemLive();

    boolean isCurrentMediaItemSeekable();

    boolean isPlayingAd();

    void prepare();

    void release();

    void setPlayWhenReady(boolean z);

    void setVideoTextureView(@Nullable TextureView textureView);

    void setVolume(@FloatRange(from = 0.0d, m105511to = 1.0d) float f);

    void stop();
}
