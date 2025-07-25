package com.mobilefuse.sdk.video;

import com.learnings.abcenter.util.AbCenterConstant;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C37563v;
import kotlin.collections.CollectionsJVM;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum CTA_AND_VIDEO uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: ClickthroughBehaviour.kt */
@Metadata
/* loaded from: classes7.dex */
public final class ClickthroughBehaviour {
    private static final /* synthetic */ ClickthroughBehaviour[] $VALUES;
    public static final ClickthroughBehaviour CTA_AND_VIDEO;
    public static final ClickthroughBehaviour CTA_ONLY;
    @NotNull
    public static final Companion Companion;
    @NotNull
    private final List<String> acceptableSources;
    @NotNull
    private final String value;

    /* compiled from: ClickthroughBehaviour.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        List m17163p;
        List m17175e;
        m17163p = C37563v.m17163p("ctaBtn", "video");
        ClickthroughBehaviour clickthroughBehaviour = new ClickthroughBehaviour("CTA_AND_VIDEO", 0, AbCenterConstant.OP_TYPE_BOTH, m17163p);
        CTA_AND_VIDEO = clickthroughBehaviour;
        m17175e = CollectionsJVM.m17175e("ctaBtn");
        ClickthroughBehaviour clickthroughBehaviour2 = new ClickthroughBehaviour("CTA_ONLY", 1, "cta", m17175e);
        CTA_ONLY = clickthroughBehaviour2;
        $VALUES = new ClickthroughBehaviour[]{clickthroughBehaviour, clickthroughBehaviour2};
        Companion = new Companion(null);
    }

    private ClickthroughBehaviour(String str, int i, String str2, List list) {
        this.value = str2;
        this.acceptableSources = list;
    }

    public static ClickthroughBehaviour valueOf(String str) {
        return (ClickthroughBehaviour) Enum.valueOf(ClickthroughBehaviour.class, str);
    }

    public static ClickthroughBehaviour[] values() {
        return (ClickthroughBehaviour[]) $VALUES.clone();
    }

    @NotNull
    public final List<String> getAcceptableSources$mobilefuse_sdk_common_release() {
        return this.acceptableSources;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
