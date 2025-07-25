package com.mbridge.msdk.dycreator.wrapper;

import com.mbridge.msdk.dycreator.listener.DyCountDownListenerWrapper;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.File;
import java.util.List;

/* loaded from: classes6.dex */
public class DyOption {

    /* renamed from: a */
    private List<String> f55988a;

    /* renamed from: b */
    private File f55989b;

    /* renamed from: c */
    private CampaignEx f55990c;

    /* renamed from: d */
    private DyAdType f55991d;

    /* renamed from: e */
    private String f55992e;

    /* renamed from: f */
    private boolean f55993f;

    /* renamed from: g */
    private boolean f55994g;

    /* renamed from: h */
    private boolean f55995h;

    /* renamed from: i */
    private boolean f55996i;

    /* renamed from: j */
    private boolean f55997j;

    /* renamed from: k */
    private boolean f55998k;

    /* renamed from: l */
    private int f55999l;

    /* renamed from: m */
    private int f56000m;

    /* renamed from: n */
    private int f56001n;

    /* renamed from: o */
    private int f56002o;

    /* renamed from: p */
    private int f56003p;

    /* renamed from: q */
    private int f56004q;

    /* renamed from: r */
    private DyCountDownListenerWrapper f56005r;

    /* loaded from: classes6.dex */
    public static class Builder implements IViewOptionBuilder {

        /* renamed from: a */
        private List<String> f56006a;

        /* renamed from: b */
        private File f56007b;

        /* renamed from: c */
        private CampaignEx f56008c;

        /* renamed from: d */
        private DyAdType f56009d;

        /* renamed from: e */
        private boolean f56010e;

        /* renamed from: f */
        private String f56011f;

        /* renamed from: g */
        private boolean f56012g;

        /* renamed from: h */
        private boolean f56013h;

        /* renamed from: i */
        private boolean f56014i;

        /* renamed from: j */
        private boolean f56015j;

        /* renamed from: k */
        private boolean f56016k;

        /* renamed from: l */
        private int f56017l;

        /* renamed from: m */
        private int f56018m;

        /* renamed from: n */
        private int f56019n;

        /* renamed from: o */
        private int f56020o;

        /* renamed from: p */
        private int f56021p;

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder adChoiceLink(String str) {
            this.f56011f = str;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public DyOption build() {
            return new DyOption(this);
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder campaignEx(CampaignEx campaignEx) {
            this.f56008c = campaignEx;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder canSkip(boolean z) {
            this.f56010e = z;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder countDownTime(int i) {
            this.f56020o = i;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder dyAdType(DyAdType dyAdType) {
            this.f56009d = dyAdType;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder file(File file) {
            this.f56007b = file;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder fileDirs(List<String> list) {
            this.f56006a = list;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isApkInfoVisible(boolean z) {
            this.f56015j = z;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isClickButtonVisible(boolean z) {
            this.f56013h = z;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isLogoVisible(boolean z) {
            this.f56016k = z;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isScreenClick(boolean z) {
            this.f56012g = z;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isShakeVisible(boolean z) {
            this.f56014i = z;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder orientation(int i) {
            this.f56019n = i;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder shakeStrenght(int i) {
            this.f56017l = i;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder shakeTime(int i) {
            this.f56018m = i;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder templateType(int i) {
            this.f56021p = i;
            return this;
        }
    }

    /* loaded from: classes6.dex */
    public interface IViewOptionBuilder {
        IViewOptionBuilder adChoiceLink(String str);

        DyOption build();

        IViewOptionBuilder campaignEx(CampaignEx campaignEx);

        IViewOptionBuilder canSkip(boolean z);

        IViewOptionBuilder countDownTime(int i);

        IViewOptionBuilder dyAdType(DyAdType dyAdType);

        IViewOptionBuilder file(File file);

        IViewOptionBuilder fileDirs(List<String> list);

        IViewOptionBuilder isApkInfoVisible(boolean z);

        IViewOptionBuilder isClickButtonVisible(boolean z);

        IViewOptionBuilder isLogoVisible(boolean z);

        IViewOptionBuilder isScreenClick(boolean z);

        IViewOptionBuilder isShakeVisible(boolean z);

        IViewOptionBuilder orientation(int i);

        IViewOptionBuilder shakeStrenght(int i);

        IViewOptionBuilder shakeTime(int i);

        IViewOptionBuilder templateType(int i);
    }

    public DyOption(Builder builder) {
        this.f55988a = builder.f56006a;
        this.f55989b = builder.f56007b;
        this.f55990c = builder.f56008c;
        this.f55991d = builder.f56009d;
        this.f55994g = builder.f56010e;
        this.f55992e = builder.f56011f;
        this.f55993f = builder.f56012g;
        this.f55995h = builder.f56013h;
        this.f55997j = builder.f56015j;
        this.f55996i = builder.f56014i;
        this.f55998k = builder.f56016k;
        this.f55999l = builder.f56017l;
        this.f56000m = builder.f56018m;
        this.f56001n = builder.f56019n;
        this.f56002o = builder.f56020o;
        this.f56004q = builder.f56021p;
    }

    public String getAdChoiceLink() {
        return this.f55992e;
    }

    public CampaignEx getCampaignEx() {
        return this.f55990c;
    }

    public int getCountDownTime() {
        return this.f56002o;
    }

    public int getCurrentCountDown() {
        return this.f56003p;
    }

    public DyAdType getDyAdType() {
        return this.f55991d;
    }

    public File getFile() {
        return this.f55989b;
    }

    public List<String> getFileDirs() {
        return this.f55988a;
    }

    public int getOrientation() {
        return this.f56001n;
    }

    public int getShakeStrenght() {
        return this.f55999l;
    }

    public int getShakeTime() {
        return this.f56000m;
    }

    public int getTemplateType() {
        return this.f56004q;
    }

    public boolean isApkInfoVisible() {
        return this.f55997j;
    }

    public boolean isCanSkip() {
        return this.f55994g;
    }

    public boolean isClickButtonVisible() {
        return this.f55995h;
    }

    public boolean isClickScreen() {
        return this.f55993f;
    }

    public boolean isLogoVisible() {
        return this.f55998k;
    }

    public boolean isShakeVisible() {
        return this.f55996i;
    }

    public void setDyCountDownListener(int i) {
        DyCountDownListenerWrapper dyCountDownListenerWrapper = this.f56005r;
        if (dyCountDownListenerWrapper != null) {
            dyCountDownListenerWrapper.getCountDownValue(i);
        }
        this.f56003p = i;
    }

    public void setDyCountDownListenerWrapper(DyCountDownListenerWrapper dyCountDownListenerWrapper) {
        this.f56005r = dyCountDownListenerWrapper;
    }
}
