package androidx.compose.p015ui.layout;

import androidx.compose.p015ui.geometry.Size;
import kotlin.Metadata;

/* compiled from: ContentScale.kt */
@Metadata
/* renamed from: androidx.compose.ui.layout.ContentScaleKt */
/* loaded from: classes.dex */
public final class ContentScaleKt {
    /* renamed from: access$computeFillHeight-iLBOSCw  reason: not valid java name */
    public static final /* synthetic */ float m109012access$computeFillHeightiLBOSCw(long j, long j2) {
        return m109016computeFillHeightiLBOSCw(j, j2);
    }

    /* renamed from: access$computeFillMaxDimension-iLBOSCw  reason: not valid java name */
    public static final /* synthetic */ float m109013access$computeFillMaxDimensioniLBOSCw(long j, long j2) {
        return m109017computeFillMaxDimensioniLBOSCw(j, j2);
    }

    /* renamed from: access$computeFillMinDimension-iLBOSCw  reason: not valid java name */
    public static final /* synthetic */ float m109014access$computeFillMinDimensioniLBOSCw(long j, long j2) {
        return m109018computeFillMinDimensioniLBOSCw(j, j2);
    }

    /* renamed from: access$computeFillWidth-iLBOSCw  reason: not valid java name */
    public static final /* synthetic */ float m109015access$computeFillWidthiLBOSCw(long j, long j2) {
        return m109019computeFillWidthiLBOSCw(j, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: computeFillHeight-iLBOSCw  reason: not valid java name */
    public static final float m109016computeFillHeightiLBOSCw(long j, long j2) {
        return Size.m107357getHeightimpl(j2) / Size.m107357getHeightimpl(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: computeFillMaxDimension-iLBOSCw  reason: not valid java name */
    public static final float m109017computeFillMaxDimensioniLBOSCw(long j, long j2) {
        return Math.max(m109019computeFillWidthiLBOSCw(j, j2), m109016computeFillHeightiLBOSCw(j, j2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: computeFillMinDimension-iLBOSCw  reason: not valid java name */
    public static final float m109018computeFillMinDimensioniLBOSCw(long j, long j2) {
        return Math.min(m109019computeFillWidthiLBOSCw(j, j2), m109016computeFillHeightiLBOSCw(j, j2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: computeFillWidth-iLBOSCw  reason: not valid java name */
    public static final float m109019computeFillWidthiLBOSCw(long j, long j2) {
        return Size.m107360getWidthimpl(j2) / Size.m107360getWidthimpl(j);
    }
}
