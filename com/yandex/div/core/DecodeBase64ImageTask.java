package com.yandex.div.core;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.PictureDrawable;
import android.util.Base64;
import androidx.annotation.WorkerThread;
import java.io.ByteArrayInputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.C37690r;
import kotlin.text.StringsJVM;
import org.jetbrains.annotations.NotNull;
import p1059ya.UiThreadHandler;
import p701hb.Severity;
import p848qb.SvgDecoder;
import p879s9.ImageRepresentation;
import sa.KLog;

@Metadata
/* renamed from: com.yandex.div.core.b */
/* loaded from: classes8.dex */
public final class DecodeBase64ImageTask implements Runnable {
    @NotNull

    /* renamed from: b */
    private String f75152b;

    /* renamed from: c */
    private final boolean f75153c;
    @NotNull

    /* renamed from: d */
    private final Function1<ImageRepresentation, Unit> f75154d;

    /* compiled from: DecodeBase64ImageTask.kt */
    @Metadata
    /* renamed from: com.yandex.div.core.b$a */
    /* loaded from: classes8.dex */
    static final class C29584a extends Lambda implements Functions<Unit> {

        /* renamed from: h */
        final /* synthetic */ ImageRepresentation f75156h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C29584a(ImageRepresentation imageRepresentation) {
            super(0);
            this.f75156h = imageRepresentation;
        }

        @Override // kotlin.jvm.functions.Functions
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f99208a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            DecodeBase64ImageTask.this.f75154d.invoke(this.f75156h);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DecodeBase64ImageTask(@NotNull String rawBase64string, boolean z, @NotNull Function1<? super ImageRepresentation, Unit> onDecoded) {
        Intrinsics.checkNotNullParameter(rawBase64string, "rawBase64string");
        Intrinsics.checkNotNullParameter(onDecoded, "onDecoded");
        this.f75152b = rawBase64string;
        this.f75153c = z;
        this.f75154d = onDecoded;
    }

    /* renamed from: b */
    private final PictureDrawable m37441b(PictureDrawable pictureDrawable) {
        return ImageRepresentation.C39631b.m12035b(pictureDrawable);
    }

    /* renamed from: c */
    private final Bitmap m37440c(Bitmap bitmap) {
        return ImageRepresentation.C39630a.m12041b(bitmap);
    }

    /* renamed from: d */
    private final Bitmap m37439d(byte[] bArr) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        try {
            return BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } catch (IllegalArgumentException unused) {
            KLog kLog = KLog.f104133a;
            if (kLog.m11984a(Severity.ERROR)) {
                kLog.m11983b(6, "Div", "Problem with decoding base-64 preview image occurred");
                return null;
            }
            return null;
        }
    }

    /* renamed from: e */
    private final PictureDrawable m37438e(byte[] bArr) {
        return new SvgDecoder(false, 1, null).m12801a(new ByteArrayInputStream(bArr));
    }

    /* renamed from: f */
    private final String m37437f(String str) {
        boolean m16624M;
        int m16568d0;
        m16624M = StringsJVM.m16624M(str, "data:", false, 2, null);
        if (m16624M) {
            m16568d0 = C37690r.m16568d0(str, ',', 0, false, 6, null);
            String substring = str.substring(m16568d0 + 1);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        return str;
    }

    /* renamed from: g */
    private final boolean m37436g(String str) {
        boolean m16624M;
        m16624M = StringsJVM.m16624M(str, "data:image/svg", false, 2, null);
        return m16624M;
    }

    @Override // java.lang.Runnable
    @WorkerThread
    public void run() {
        Bitmap bitmap;
        PictureDrawable pictureDrawable;
        try {
            byte[] bytes = Base64.decode(m37437f(this.f75152b), 0);
            ImageRepresentation imageRepresentation = null;
            if (m37436g(this.f75152b)) {
                Intrinsics.checkNotNullExpressionValue(bytes, "bytes");
                PictureDrawable m37438e = m37438e(bytes);
                if (m37438e != null) {
                    pictureDrawable = m37441b(m37438e);
                } else {
                    pictureDrawable = null;
                }
                if (pictureDrawable != null) {
                    imageRepresentation = ImageRepresentation.C39631b.m12036a(pictureDrawable);
                }
            } else {
                Intrinsics.checkNotNullExpressionValue(bytes, "bytes");
                Bitmap m37439d = m37439d(bytes);
                if (m37439d != null) {
                    bitmap = m37440c(m37439d);
                } else {
                    bitmap = null;
                }
                if (bitmap != null) {
                    imageRepresentation = ImageRepresentation.C39630a.m12042a(bitmap);
                }
            }
            if (this.f75153c) {
                this.f75154d.invoke(imageRepresentation);
            } else {
                UiThreadHandler.f118564a.m975e(new C29584a(imageRepresentation));
            }
        } catch (IllegalArgumentException unused) {
            KLog kLog = KLog.f104133a;
            if (kLog.m11984a(Severity.ERROR)) {
                kLog.m11983b(6, "Div", "Bad base-64 image preview");
            }
        }
    }
}
