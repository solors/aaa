package com.smaato.sdk.nativead.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.nativead.NativeAdAssets;
import com.smaato.sdk.nativead.NativeAdLink;
import com.smaato.sdk.nativead.NativeAdTracker;
import com.smaato.sdk.nativead.model.NativeAdComponents;
import java.util.List;

/* renamed from: com.smaato.sdk.nativead.model.a */
/* loaded from: classes7.dex */
final class AutoValue_NativeAdComponents extends NativeAdComponents {

    /* renamed from: a */
    private final NativeAdAssets f72193a;

    /* renamed from: b */
    private final NativeAdLink f72194b;

    /* renamed from: c */
    private final List<NativeAdTracker> f72195c;

    /* renamed from: d */
    private final String f72196d;

    /* renamed from: e */
    private final String f72197e;

    /* compiled from: AutoValue_NativeAdComponents.java */
    /* renamed from: com.smaato.sdk.nativead.model.a$b */
    /* loaded from: classes7.dex */
    static final class C27462b extends NativeAdComponents.Builder {

        /* renamed from: a */
        private NativeAdAssets f72198a;

        /* renamed from: b */
        private NativeAdLink f72199b;

        /* renamed from: c */
        private List<NativeAdTracker> f72200c;

        /* renamed from: d */
        private String f72201d;

        /* renamed from: e */
        private String f72202e;

        @Override // com.smaato.sdk.nativead.model.NativeAdComponents.Builder
        public NativeAdComponents.Builder assets(NativeAdAssets nativeAdAssets) {
            if (nativeAdAssets != null) {
                this.f72198a = nativeAdAssets;
                return this;
            }
            throw new NullPointerException("Null assets");
        }

        @Override // com.smaato.sdk.nativead.model.NativeAdComponents.Builder
        public NativeAdComponents build() {
            String str = "";
            if (this.f72198a == null) {
                str = " assets";
            }
            if (this.f72199b == null) {
                str = str + " link";
            }
            if (this.f72200c == null) {
                str = str + " trackers";
            }
            if (str.isEmpty()) {
                return new AutoValue_NativeAdComponents(this.f72198a, this.f72199b, this.f72200c, this.f72201d, this.f72202e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.smaato.sdk.nativead.model.NativeAdComponents.Builder
        public NativeAdComponents.Builder link(NativeAdLink nativeAdLink) {
            if (nativeAdLink != null) {
                this.f72199b = nativeAdLink;
                return this;
            }
            throw new NullPointerException("Null link");
        }

        @Override // com.smaato.sdk.nativead.model.NativeAdComponents.Builder
        public NativeAdComponents.Builder mraidWrappedVast(String str) {
            this.f72202e = str;
            return this;
        }

        @Override // com.smaato.sdk.nativead.model.NativeAdComponents.Builder
        public NativeAdComponents.Builder privacyUrl(String str) {
            this.f72201d = str;
            return this;
        }

        @Override // com.smaato.sdk.nativead.model.NativeAdComponents.Builder
        public NativeAdComponents.Builder trackers(List<NativeAdTracker> list) {
            if (list != null) {
                this.f72200c = list;
                return this;
            }
            throw new NullPointerException("Null trackers");
        }
    }

    @Override // com.smaato.sdk.nativead.model.NativeAdComponents
    @NonNull
    public NativeAdAssets assets() {
        return this.f72193a;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NativeAdComponents)) {
            return false;
        }
        NativeAdComponents nativeAdComponents = (NativeAdComponents) obj;
        if (this.f72193a.equals(nativeAdComponents.assets()) && this.f72194b.equals(nativeAdComponents.link()) && this.f72195c.equals(nativeAdComponents.trackers()) && ((str = this.f72196d) != null ? str.equals(nativeAdComponents.privacyUrl()) : nativeAdComponents.privacyUrl() == null)) {
            String str2 = this.f72197e;
            if (str2 == null) {
                if (nativeAdComponents.mraidWrappedVast() == null) {
                    return true;
                }
            } else if (str2.equals(nativeAdComponents.mraidWrappedVast())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (((((this.f72193a.hashCode() ^ 1000003) * 1000003) ^ this.f72194b.hashCode()) * 1000003) ^ this.f72195c.hashCode()) * 1000003;
        String str = this.f72196d;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode2 ^ hashCode) * 1000003;
        String str2 = this.f72197e;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i2 ^ i;
    }

    @Override // com.smaato.sdk.nativead.model.NativeAdComponents
    @NonNull
    public NativeAdLink link() {
        return this.f72194b;
    }

    @Override // com.smaato.sdk.nativead.model.NativeAdComponents
    @Nullable
    public String mraidWrappedVast() {
        return this.f72197e;
    }

    @Override // com.smaato.sdk.nativead.model.NativeAdComponents
    @Nullable
    public String privacyUrl() {
        return this.f72196d;
    }

    public String toString() {
        return "NativeAdComponents{assets=" + this.f72193a + ", link=" + this.f72194b + ", trackers=" + this.f72195c + ", privacyUrl=" + this.f72196d + ", mraidWrappedVast=" + this.f72197e + "}";
    }

    @Override // com.smaato.sdk.nativead.model.NativeAdComponents
    @NonNull
    public List<NativeAdTracker> trackers() {
        return this.f72195c;
    }

    private AutoValue_NativeAdComponents(NativeAdAssets nativeAdAssets, NativeAdLink nativeAdLink, List<NativeAdTracker> list, @Nullable String str, @Nullable String str2) {
        this.f72193a = nativeAdAssets;
        this.f72194b = nativeAdLink;
        this.f72195c = list;
        this.f72196d = str;
        this.f72197e = str2;
    }
}
